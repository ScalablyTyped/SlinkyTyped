package typingsSlinky.officeUiFabricReact.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsSlinky.officeUiFabricReact.calendarYearMod.ICalendarYearHeaderProps
import typingsSlinky.officeUiFabricReact.calendarYearMod.ICalendarYearProps
import typingsSlinky.officeUiFabricReact.calendarYearMod.ICalendarYearStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarYear {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.calendarYearMod.CalendarYear] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def maxYear(value: Double): this.type = set("maxYear", value.asInstanceOf[js.Any])
    @scala.inline
    def minYear(value: Double): this.type = set("minYear", value.asInstanceOf[js.Any])
    @scala.inline
    def navigatedYear(value: Double): this.type = set("navigatedYear", value.asInstanceOf[js.Any])
    @scala.inline
    def navigationIcons(value: ICalendarIconStrings): this.type = set("navigationIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def onHeaderSelect(value: /* focus */ Boolean => Unit): this.type = set("onHeaderSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onRenderTitle(value: /* props */ ICalendarYearHeaderProps => TagMod[Any]): this.type = set("onRenderTitle", js.Any.fromFunction1(value))
    @scala.inline
    def onRenderYear(value: /* year */ Double => TagMod[Any]): this.type = set("onRenderYear", js.Any.fromFunction1(value))
    @scala.inline
    def onSelectYear(value: /* year */ Double => Unit): this.type = set("onSelectYear", js.Any.fromFunction1(value))
    @scala.inline
    def selectedYear(value: Double): this.type = set("selectedYear", value.asInstanceOf[js.Any])
    @scala.inline
    def strings(value: ICalendarYearStrings): this.type = set("strings", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICalendarYearProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CalendarYear.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

