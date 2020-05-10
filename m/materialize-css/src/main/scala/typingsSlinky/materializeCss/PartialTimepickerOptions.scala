package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TimepickerOptions> */
@js.native
trait PartialTimepickerOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  var defaultTime: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fromNow: js.UndefOr[Double] = js.native
  var i18n: js.UndefOr[PartialInternationalizati] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onSelect: js.UndefOr[js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]] = js.native
  var showClearBtn: js.UndefOr[Boolean] = js.native
  var twelveHour: js.UndefOr[Boolean] = js.native
  var vibrate: js.UndefOr[Boolean] = js.native
}

object PartialTimepickerOptions {
  @scala.inline
  def apply(): PartialTimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTimepickerOptions]
  }
  @scala.inline
  implicit class PartialTimepickerOptionsOps[Self <: PartialTimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
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
    def withDefaultTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFromNow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromNow")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: PartialInternationalizati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withTwelveHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwelveHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(js.undefined)
        ret
    }
  }
  
}

