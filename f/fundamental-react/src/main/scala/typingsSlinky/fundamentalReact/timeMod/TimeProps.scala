package typingsSlinky.fundamentalReact.timeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fundamentalReact.anon.Hour
import typingsSlinky.fundamentalReact.anon.MeridiemAM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  disabled ? :boolean,   hoursDownButtonProps ? :any,   hoursInputProps ? :any,   hoursUpButtonProps ? :any,   id ? :string,   localizedText ? :{  meridiemAM ? :string,   meridiemPM ? :string},   meridiemDownButtonProps ? :any,   meridiemInputProps ? :any,   meridiemUpButtonProps ? :any,   minutesDownButtonProps ? :any,   minutesInputProps ? :any,   minutesUpButtonProps ? :any,   secondsDownButtonProps ? :any,   secondsInputProps ? :any,   secondsUpButtonProps ? :any, onChange ? (time : {  hour  :string,   minute  :string,   second  :string,   meridiem  :0 | 1}): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
@js.native
trait TimeProps
  extends /* x */ StringDictionary[js.Any] {
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var format12Hours: js.UndefOr[Boolean] = js.native
  var hoursDownButtonProps: js.UndefOr[js.Any] = js.native
  var hoursInputProps: js.UndefOr[js.Any] = js.native
  var hoursUpButtonProps: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var localizedText: js.UndefOr[MeridiemAM] = js.native
  var meridiemDownButtonProps: js.UndefOr[js.Any] = js.native
  var meridiemInputProps: js.UndefOr[js.Any] = js.native
  var meridiemUpButtonProps: js.UndefOr[js.Any] = js.native
  var minutesDownButtonProps: js.UndefOr[js.Any] = js.native
  var minutesInputProps: js.UndefOr[js.Any] = js.native
  var minutesUpButtonProps: js.UndefOr[js.Any] = js.native
  var onChange: js.UndefOr[js.Function1[/* time */ Hour, Unit]] = js.native
  var secondsDownButtonProps: js.UndefOr[js.Any] = js.native
  var secondsInputProps: js.UndefOr[js.Any] = js.native
  var secondsUpButtonProps: js.UndefOr[js.Any] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var spinners: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Hour] = js.native
}

object TimeProps {
  @scala.inline
  def apply(): TimeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeProps]
  }
  @scala.inline
  implicit class TimePropsOps[Self <: TimeProps] (val x: Self) extends AnyVal {
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
    def withHoursDownButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursDownButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursDownButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursDownButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHoursInputProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHoursUpButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursUpButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursUpButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursUpButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedText(value: MeridiemAM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemDownButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemDownButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemDownButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemDownButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemInputProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemUpButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemUpButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemUpButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemUpButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesDownButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDownButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesDownButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDownButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesInputProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesUpButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesUpButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesUpButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesUpButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* time */ Hour => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsDownButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsDownButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsDownButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsDownButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsInputProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsUpButtonProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsUpButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsUpButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsUpButtonProps")(js.undefined)
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
    def withTime(value: Hour): Self = {
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

