package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.ChatSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffChatStickerInstaStick extends js.Object {
  var endBackgroundColor: js.UndefOr[String] = js.native
  var hasStartedChat: js.UndefOr[Boolean] = js.native
  var startBackgroundColor: js.UndefOr[String] = js.native
  var text: String = js.native
}

object DiffChatStickerInstaStick {
  @scala.inline
  def apply(text: String): DiffChatStickerInstaStick = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffChatStickerInstaStick]
  }
  @scala.inline
  implicit class DiffChatStickerInstaStickOps[Self <: DiffChatStickerInstaStick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasStartedChat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStartedChat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasStartedChat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStartedChat")(js.undefined)
        ret
    }
    @scala.inline
    def withStartBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBackgroundColor")(js.undefined)
        ret
    }
  }
  
}

