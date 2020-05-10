package typingsSlinky.rmcCalendar.confirmPanelMod

import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPanelPropsType extends js.Object {
  var disableBtn: js.UndefOr[Boolean] = js.native
  var endDateTime: js.UndefOr[js.Date] = js.native
  var formatStr: js.UndefOr[String] = js.native
  var locale: Locale = js.native
  var onlyConfirm: js.UndefOr[Boolean] = js.native
  var startDateTime: js.UndefOr[js.Date] = js.native
  var `type`: js.UndefOr[one | range] = js.native
  def onConfirm(): Unit = js.native
}

object ConfirmPanelPropsType {
  @scala.inline
  def apply(locale: Locale, onConfirm: () => Unit): ConfirmPanelPropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
    __obj.asInstanceOf[ConfirmPanelPropsType]
  }
  @scala.inline
  implicit class ConfirmPanelPropsTypeOps[Self <: ConfirmPanelPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnConfirm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: one | range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

