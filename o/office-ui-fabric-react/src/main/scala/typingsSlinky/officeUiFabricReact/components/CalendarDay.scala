package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typingsSlinky.officeUiFabricReact.calendarDayMod.ICalendarDay
import typingsSlinky.officeUiFabricReact.calendarDayMod.ICalendarDayProps
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarDay {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarDay", "CalendarDay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.calendarDayMod.CalendarDay] {
    
    @scala.inline
    def allFocusable(value: Boolean): this.type = set("allFocusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ ICalendarDay | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[ICalendarDay]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[ICalendarDay]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onHeaderSelect(value: /* focus */ Boolean => Unit): this.type = set("onHeaderSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def restrictedDatesVarargs(value: js.Date*): this.type = set("restrictedDates", js.Array(value :_*))
    
    @scala.inline
    def restrictedDates(value: js.Array[js.Date]): this.type = set("restrictedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSixWeeksByDefault(value: Boolean): this.type = set("showSixWeeksByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def workWeekDaysVarargs(value: DayOfWeek*): this.type = set("workWeekDays", js.Array(value :_*))
    
    @scala.inline
    def workWeekDays(value: js.Array[DayOfWeek]): this.type = set("workWeekDays", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarDayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Unit,
    onSelectDate: (js.Date, js.UndefOr[js.Array[js.Date]]) => Unit,
    selectedDate: js.Date,
    strings: ICalendarStrings
  ): Builder = {
    val __props = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), onSelectDate = js.Any.fromFunction2(onSelectDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICalendarDayProps]))
  }
}
