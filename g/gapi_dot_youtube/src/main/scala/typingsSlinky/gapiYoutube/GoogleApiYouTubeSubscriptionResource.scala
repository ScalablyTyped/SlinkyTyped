package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeSubscriptionResource extends js.Object {
  /**
    *
    */
  var contentDetails: AnonNewItemCount = js.native
  /**
    * The ETag of the subscription resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For subscription resources, the value will be youtube#subscription.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
    */
  var snippet: AnonChannelIdChannelTitle = js.native
  /**
    *
    */
  var subscriberSnippet: AnonChannelIdDescription = js.native
}

object GoogleApiYouTubeSubscriptionResource {
  @scala.inline
  def apply(
    contentDetails: AnonNewItemCount,
    etag: String,
    id: String,
    kind: String,
    snippet: AnonChannelIdChannelTitle,
    subscriberSnippet: AnonChannelIdDescription
  ): GoogleApiYouTubeSubscriptionResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], subscriberSnippet = subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSubscriptionResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeSubscriptionResourceOps[Self <: GoogleApiYouTubeSubscriptionResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: AnonNewItemCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: AnonChannelIdChannelTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriberSnippet(value: AnonChannelIdDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberSnippet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

