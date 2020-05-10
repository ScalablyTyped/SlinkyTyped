package typingsSlinky.dateformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * dateFormat.i18n
  *
  * Internationalization strings
  *
  * Example:
  *
  * @example ```
  * dateFormat.i18n = {
  *     dayNames: [
  *         'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat',
  *         'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'
  *     ],
  *     monthNames: [
  *         'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec',
  *         'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'
  *     ],
  *     timeNames: [
  *         'a', 'p', 'am', 'pm', 'A', 'P', 'AM', 'PM'
  *     ]
  * };```
  *
  * @see https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L124
  */
@js.native
trait DateFormatI18n extends js.Object {
  var dayNames: js.Array[String] = js.native
  var monthNames: js.Array[String] = js.native
  var timeNames: js.Array[String] = js.native
}

object DateFormatI18n {
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String], timeNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], timeNames = timeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatI18n]
  }
  @scala.inline
  implicit class DateFormatI18nOps[Self <: DateFormatI18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

