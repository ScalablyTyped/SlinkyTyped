package typingsSlinky.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyStyling extends StylingOptions {
  // reference
  var athing: js.UndefOr[String] = js.native
  // confirm
  var btn: js.UndefOr[String] = js.native
  var btnactive: js.UndefOr[String] = js.native
  var btnfocus: js.UndefOr[String] = js.native
  var btnhover: js.UndefOr[String] = js.native
  // buttons
  var closer: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var error_icon: js.UndefOr[String] = js.native
  var hi_btn: js.UndefOr[String] = js.native
  var hi_btnhov: js.UndefOr[String] = js.native
  var hi_hnd: js.UndefOr[String] = js.native
  // history
  var hi_menu: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var info_icon: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var notice: js.UndefOr[String] = js.native
  var notice_icon: js.UndefOr[String] = js.native
  var pin_down: js.UndefOr[String] = js.native
  var pin_up: js.UndefOr[String] = js.native
  var success: js.UndefOr[String] = js.native
  var success_icon: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PNotifyStyling {
  @scala.inline
  def apply(): PNotifyStyling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStyling]
  }
  @scala.inline
  implicit class PNotifyStylingOps[Self <: PNotifyStyling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAthing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("athing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAthing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("athing")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnactive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnactive")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnfocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnhover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnhover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnhover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnhover")(js.undefined)
        ret
    }
    @scala.inline
    def withCloser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withError_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withHi_btn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHi_btn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_btn")(js.undefined)
        ret
    }
    @scala.inline
    def withHi_btnhov(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_btnhov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHi_btnhov: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_btnhov")(js.undefined)
        ret
    }
    @scala.inline
    def withHi_hnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_hnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHi_hnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_hnd")(js.undefined)
        ret
    }
    @scala.inline
    def withHi_menu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHi_menu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hi_menu")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withNotice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(js.undefined)
        ret
    }
    @scala.inline
    def withNotice_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotice_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withPin_down(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin_down: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_down")(js.undefined)
        ret
    }
    @scala.inline
    def withPin_up(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin_up: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin_up")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess_icon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

