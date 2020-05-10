package typingsSlinky.blueprintjsDatetime.timePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimePickerState extends js.Object {
  var hourText: js.UndefOr[String] = js.native
  var isPm: js.UndefOr[Boolean] = js.native
  var millisecondText: js.UndefOr[String] = js.native
  var minuteText: js.UndefOr[String] = js.native
  var secondText: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Date] = js.native
}

object ITimePickerState {
  @scala.inline
  def apply(): ITimePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimePickerState]
  }
  @scala.inline
  implicit class ITimePickerStateOps[Self <: ITimePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHourText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPm")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecondText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecondText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecondText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecondText")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

