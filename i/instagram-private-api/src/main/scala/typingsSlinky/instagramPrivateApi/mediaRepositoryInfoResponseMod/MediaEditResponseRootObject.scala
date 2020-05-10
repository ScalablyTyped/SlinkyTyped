package typingsSlinky.instagramPrivateApi.mediaRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEditResponseRootObject extends js.Object {
  var media: MediaInfoResponseItemsItem = js.native
  var status: String = js.native
}

object MediaEditResponseRootObject {
  @scala.inline
  def apply(media: MediaInfoResponseItemsItem, status: String): MediaEditResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEditResponseRootObject]
  }
  @scala.inline
  implicit class MediaEditResponseRootObjectOps[Self <: MediaEditResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: MediaInfoResponseItemsItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
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

