package typingsSlinky.clockpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClockPickerOptions extends js.Object {
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.native
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.native
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.native
  var align: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.native
  var default: js.UndefOr[String] = js.native
  var donetext: js.UndefOr[String] = js.native
  var fromnow: js.UndefOr[Double] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var twelvehour: js.UndefOr[Boolean] = js.native
  var vibrate: js.UndefOr[Boolean] = js.native
}

object ClockPickerOptions {
  @scala.inline
  def apply(): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockPickerOptions]
  }
  @scala.inline
  implicit class ClockPickerOptionsOps[Self <: ClockPickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDone")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterHourSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHourSelect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterHourSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHourSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDone")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHourSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHourSelect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeHourSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHourSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDonetext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donetext")(js.undefined)
        ret
    }
    @scala.inline
    def withFromnow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromnow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromnow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromnow")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTwelvehour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelvehour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwelvehour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelvehour")(js.undefined)
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

