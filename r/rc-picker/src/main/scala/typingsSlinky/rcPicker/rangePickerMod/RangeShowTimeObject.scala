package typingsSlinky.rcPicker.rangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-picker.rc-picker/lib/panels/TimePanel.SharedTimeProps<DateType>, 'defaultValue'> & {  defaultValue ? :std.Array<DateType>} */
@js.native
trait RangeShowTimeObject[DateType] extends js.Object {
  var defaultValue: js.UndefOr[js.Array[DateType]] = js.native
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  var format: js.UndefOr[String] = js.native
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var use12Hours: js.UndefOr[Boolean] = js.native
}

object RangeShowTimeObject {
  @scala.inline
  def apply[DateType](): RangeShowTimeObject[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeShowTimeObject[DateType]]
  }
  @scala.inline
  implicit class RangeShowTimeObjectOps[Self[datetype] <: RangeShowTimeObject[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withDefaultValue(value: js.Array[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledHours(value: () => js.Array[Double]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisabledHours: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledMinutes: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSeconds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisabledSeconds: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDisabledOptions(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabledOptions: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondStep: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHour: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinute: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecond: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withUse12Hours(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse12Hours: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(js.undefined)
        ret
    }
  }
  
}

