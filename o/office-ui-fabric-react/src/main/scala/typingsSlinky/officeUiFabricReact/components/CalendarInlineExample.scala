package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.calendarInlineExampleMod.ICalendarInlineExampleProps
import typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarInlineExample {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/examples/Calendar.Inline.Example", "CalendarInlineExample")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def firstDayOfWeek(value: DayOfWeek): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightCurrentMonth(value: Boolean): this.type = set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightSelectedMonth(value: Boolean): this.type = set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def isDayPickerVisible(value: Boolean): this.type = set("isDayPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isMonthPickerVisible(value: Boolean): this.type = set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def restrictedDates(value: js.Array[js.Date]): this.type = set("restrictedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def showMonthPickerAsOverlay(value: Boolean): this.type = set("showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def showNavigateButtons(value: Boolean): this.type = set("showNavigateButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def showSixWeeksByDefault(value: Boolean): this.type = set("showSixWeeksByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def workWeekDays(value: js.Array[DayOfWeek]): this.type = set("workWeekDays", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarInlineExampleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(autoNavigateOnSelection: Boolean, dateRangeType: DateRangeType, showGoToToday: Boolean): Builder = {
    val __props = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], showGoToToday = showGoToToday.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICalendarInlineExampleProps]))
  }
}

