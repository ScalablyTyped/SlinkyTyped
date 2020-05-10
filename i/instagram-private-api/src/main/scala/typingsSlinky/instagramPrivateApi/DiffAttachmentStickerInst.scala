package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.AttachmentSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffAttachmentStickerInst extends js.Object {
  var mediaId: String = js.native
  var mediaOwnerId: String = js.native
}

object DiffAttachmentStickerInst {
  @scala.inline
  def apply(mediaId: String, mediaOwnerId: String): DiffAttachmentStickerInst = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], mediaOwnerId = mediaOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffAttachmentStickerInst]
  }
  @scala.inline
  implicit class DiffAttachmentStickerInstOps[Self <: DiffAttachmentStickerInst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

