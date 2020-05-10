package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputOptions extends js.Object {
  var clearBtn: js.UndefOr[Boolean] = js.native
  var clearBtnText: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var preventFocusZoom: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object TextInputOptions {
  @scala.inline
  def apply(): TextInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputOptions]
  }
  @scala.inline
  implicit class TextInputOptionsOps[Self <: TextInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withClearBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventFocusZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventFocusZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventFocusZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventFocusZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

