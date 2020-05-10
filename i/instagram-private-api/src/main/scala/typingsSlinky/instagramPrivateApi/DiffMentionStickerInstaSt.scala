package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.mention_reshare
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.mention_username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.MentionSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffMentionStickerInstaSt extends js.Object {
  var displayType: js.UndefOr[mention_username | mention_reshare] = js.native
  var mediaId: js.UndefOr[String] = js.native
  var userId: String = js.native
}

object DiffMentionStickerInstaSt {
  @scala.inline
  def apply(userId: String): DiffMentionStickerInstaSt = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffMentionStickerInstaSt]
  }
  @scala.inline
  implicit class DiffMentionStickerInstaStOps[Self <: DiffMentionStickerInstaSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayType(value: mention_username | mention_reshare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(js.undefined)
        ret
    }
  }
  
}

