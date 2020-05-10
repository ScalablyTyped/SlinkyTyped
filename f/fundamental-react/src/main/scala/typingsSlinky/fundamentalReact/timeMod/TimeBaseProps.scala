package typingsSlinky.fundamentalReact.timeMod

import typingsSlinky.fundamentalReact.AnonHour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBaseProps extends js.Object {
  var disableStyles: js.UndefOr[Boolean] = js.native
  var format12Hours: js.UndefOr[Boolean] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var spinners: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[AnonHour] = js.native
}

object TimeBaseProps {
  @scala.inline
  def apply(): TimeBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBaseProps]
  }
  @scala.inline
  implicit class TimeBasePropsOps[Self <: TimeBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat12Hours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format12Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat12Hours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format12Hours")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinners")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: AnonHour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

