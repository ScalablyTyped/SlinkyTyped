package typingsSlinky.blueprintjsDatetime.datePickerCaptionMod

import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.propsMod.CaptionElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerCaptionProps extends CaptionElementProps {
  
  var maxDate: js.Date = js.native
  
  var minDate: js.Date = js.native
  
  /** Callback invoked when the month or year `<select>` is changed. */
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.native
  
  var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
  
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
}
object IDatePickerCaptionProps {
  
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: LocaleUtils,
    maxDate: js.Date,
    minDate: js.Date
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
  
  @scala.inline
  implicit class IDatePickerCaptionPropsOps[Self <: IDatePickerCaptionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDateChange(value: /* date */ js.Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* month */ Double => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* year */ Double => Unit): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    
    @scala.inline
    def setReverseMonthAndYearMenus(value: Boolean): Self = this.set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseMonthAndYearMenus: Self = this.set("reverseMonthAndYearMenus", js.undefined)
  }
}
