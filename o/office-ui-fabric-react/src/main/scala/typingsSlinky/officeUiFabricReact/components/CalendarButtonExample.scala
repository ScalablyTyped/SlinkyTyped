package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.calendarButtonExampleMod.ICalendarButtonExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarButtonExample {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/examples/Calendar.Button.Example", "CalendarButtonExample")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def buttonString(value: String): this.type = set("buttonString", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightCurrentMonth(value: Boolean): this.type = set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightSelectedMonth(value: Boolean): this.type = set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def isDayPickerVisible(value: Boolean): this.type = set("isDayPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isMonthPickerVisible(value: Boolean): this.type = set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def showGoToToday(value: Boolean): this.type = set("showGoToToday", value.asInstanceOf[js.Any])
    @scala.inline
    def showMonthPickerAsOverlay(value: Boolean): this.type = set("showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarButtonExampleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CalendarButtonExample.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

