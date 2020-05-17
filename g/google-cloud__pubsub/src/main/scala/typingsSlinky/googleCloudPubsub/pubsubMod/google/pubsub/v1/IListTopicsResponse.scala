package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicsResponse. */
@js.native
trait IListTopicsResponse extends js.Object {
  /** ListTopicsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  /** ListTopicsResponse topics */
  var topics: js.UndefOr[js.Array[ITopic] | Null] = js.native
}

object IListTopicsResponse {
  @scala.inline
  def apply(): IListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicsResponse]
  }
  @scala.inline
  implicit class IListTopicsResponseOps[Self <: IListTopicsResponse] (val x: Self) extends AnyVal {
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
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[ITopic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(null)
        ret
    }
  }
  
}

