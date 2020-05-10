package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFillColorArgb extends js.Object {
  var fillColorArgb: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var maskColorArgb: js.UndefOr[String] = js.native
  var moreButtonText: js.UndefOr[String] = js.native
  var moreButtonUrl: js.UndefOr[String] = js.native
  var textColorArgb: js.UndefOr[String] = js.native
}

object AnonFillColorArgb {
  @scala.inline
  def apply(): AnonFillColorArgb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFillColorArgb]
  }
  @scala.inline
  implicit class AnonFillColorArgbOps[Self <: AnonFillColorArgb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillColorArgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorArgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColorArgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorArgb")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskColorArgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColorArgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskColorArgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColorArgb")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withMoreButtonUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreButtonUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreButtonUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreButtonUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColorArgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColorArgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColorArgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColorArgb")(js.undefined)
        ret
    }
  }
  
}

