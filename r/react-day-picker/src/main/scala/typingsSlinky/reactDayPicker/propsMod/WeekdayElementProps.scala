package typingsSlinky.reactDayPicker.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekdayElementProps extends js.Object {
  var className: String = js.native
  var locale: String = js.native
  var localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
  var weekday: Double = js.native
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object WeekdayElementProps {
  @scala.inline
  def apply(
    className: String,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    weekday: Double
  ): WeekdayElementProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekdayElementProps]
  }
  @scala.inline
  implicit class WeekdayElementPropsOps[Self <: WeekdayElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysLong(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysLong")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(js.undefined)
        ret
    }
  }
  
}

