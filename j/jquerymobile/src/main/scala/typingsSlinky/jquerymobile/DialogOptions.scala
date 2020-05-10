package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogOptions extends js.Object {
  var closeBtn: js.UndefOr[String] = js.native
  var closeBtnText: js.UndefOr[String] = js.native
  var corners: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var overlayTheme: js.UndefOr[String] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayTheme")(js.undefined)
        ret
    }
  }
  
}

