package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.calendarMonthMod.ICalendarMonth
import typingsSlinky.officeUiFabricReact.calendarMonthMod.ICalendarMonthProps
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarMonth {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.calendarMonthMod.CalendarMonth] {
    @scala.inline
    def componentRefFunction1(value: /* ref */ ICalendarMonth | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[ICalendarMonth]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[ICalendarMonth]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def onHeaderSelect(value: /* focus */ Boolean => Unit): this.type = set("onHeaderSelect", js.Any.fromFunction1(value))
    @scala.inline
    def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def yearPickerHidden(value: Boolean): this.type = set("yearPickerHidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarMonthProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Unit,
    selectedDate: js.Date,
    strings: ICalendarStrings
  ): Builder = {
    val __props = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ICalendarMonthProps]))
  }
}

