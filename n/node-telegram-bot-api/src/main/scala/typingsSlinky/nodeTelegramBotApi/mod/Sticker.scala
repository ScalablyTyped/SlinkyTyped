package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sticker extends js.Object {
  var emoji: js.UndefOr[String] = js.native
  var file_id: String = js.native
  var file_size: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var mask_position: js.UndefOr[MaskPosition] = js.native
  var set_name: js.UndefOr[String] = js.native
  var thumb: js.UndefOr[PhotoSize] = js.native
  var width: Double = js.native
}

object Sticker {
  @scala.inline
  def apply(file_id: String, height: Double, width: Double): Sticker = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sticker]
  }
  @scala.inline
  implicit class StickerOps[Self <: Sticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(js.undefined)
        ret
    }
    @scala.inline
    def withMask_position(value: MaskPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask_position")(js.undefined)
        ret
    }
    @scala.inline
    def withSet_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb(value: PhotoSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(js.undefined)
        ret
    }
  }
  
}

