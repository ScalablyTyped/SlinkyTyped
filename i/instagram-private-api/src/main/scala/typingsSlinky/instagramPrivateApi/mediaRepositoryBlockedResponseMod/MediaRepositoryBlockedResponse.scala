package typingsSlinky.instagramPrivateApi.mediaRepositoryBlockedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryBlockedResponse extends js.Object {
  var media_ids: js.Array[String] = js.native
  var status: String = js.native
}

object MediaRepositoryBlockedResponse {
  @scala.inline
  def apply(media_ids: js.Array[String], status: String): MediaRepositoryBlockedResponse = {
    val __obj = js.Dynamic.literal(media_ids = media_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryBlockedResponse]
  }
  @scala.inline
  implicit class MediaRepositoryBlockedResponseOps[Self <: MediaRepositoryBlockedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

