package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeNumbers.`10`
import typingsSlinky.reactNative.reactNativeNumbers.`12`
import typingsSlinky.reactNative.reactNativeNumbers.`15`
import typingsSlinky.reactNative.reactNativeNumbers.`1`
import typingsSlinky.reactNative.reactNativeNumbers.`20`
import typingsSlinky.reactNative.reactNativeNumbers.`2`
import typingsSlinky.reactNative.reactNativeNumbers.`30`
import typingsSlinky.reactNative.reactNativeNumbers.`3`
import typingsSlinky.reactNative.reactNativeNumbers.`4`
import typingsSlinky.reactNative.reactNativeNumbers.`5`
import typingsSlinky.reactNative.reactNativeNumbers.`6`
import typingsSlinky.reactNative.reactNativeStrings.date
import typingsSlinky.reactNative.reactNativeStrings.datetime
import typingsSlinky.reactNative.reactNativeStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerIOSProps extends ViewProps {
  /**
    * The currently selected date.
    */
  var date: js.Date = js.native
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[js.Date] = js.native
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[js.Date] = js.native
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`] = js.native
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr[date | time | datetime] = js.native
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.native
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: js.Date): Unit = js.native
}

object DatePickerIOSProps {
  @scala.inline
  def apply(date: js.Date, onDateChange: js.Date => Unit): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerIOSProps]
  }
  @scala.inline
  implicit class DatePickerIOSPropsOps[Self <: DatePickerIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDateChange(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: date | time | datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneOffsetInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneOffsetInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneOffsetInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneOffsetInMinutes")(js.undefined)
        ret
    }
  }
  
}

