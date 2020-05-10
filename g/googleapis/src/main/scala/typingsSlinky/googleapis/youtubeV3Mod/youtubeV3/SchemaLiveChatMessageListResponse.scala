package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageListResponse extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * A list of live chat messages.
    */
  var items: js.UndefOr[js.Array[SchemaLiveChatMessage]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatMessageListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The date and time when the underlying stream went offline. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var offlineAt: js.UndefOr[String] = js.native
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  /**
    * The amount of time the client should wait before polling again.
    */
  var pollingIntervalMillis: js.UndefOr[Double] = js.native
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.native
}

object SchemaLiveChatMessageListResponse {
  @scala.inline
  def apply(): SchemaLiveChatMessageListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageListResponse]
  }
  @scala.inline
  implicit class SchemaLiveChatMessageListResponseOps[Self <: SchemaLiveChatMessageListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SchemaLiveChatMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
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
    def withOfflineAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPageInfo(value: SchemaPageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingIntervalMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingIntervalMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenPagination(value: SchemaTokenPagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitorId")(js.undefined)
        ret
    }
  }
  
}

