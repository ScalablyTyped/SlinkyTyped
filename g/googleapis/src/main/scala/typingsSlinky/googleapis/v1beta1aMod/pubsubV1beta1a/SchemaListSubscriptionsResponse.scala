package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSubscriptions method.
  */
@js.native
trait SchemaListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there are more subscriptions that match the
    * request and this value should be passed to the next
    * &lt;code&gt;ListSubscriptionsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The subscriptions that match the request.
    */
  var subscription: js.UndefOr[js.Array[SchemaSubscription]] = js.native
}

object SchemaListSubscriptionsResponse {
  @scala.inline
  def apply(): SchemaListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSubscriptionsResponse]
  }
  @scala.inline
  implicit class SchemaListSubscriptionsResponseOps[Self <: SchemaListSubscriptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: js.Array[SchemaSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

