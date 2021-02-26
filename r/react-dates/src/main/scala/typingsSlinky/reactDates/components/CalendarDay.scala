package typingsSlinky.reactDates.components

import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.td.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDates.mod.CalendarDayCls
import typingsSlinky.reactDates.mod.CalendarDayPhrases
import typingsSlinky.reactDates.mod.CalendarDayShape
import typingsSlinky.reactDates.mod.ModifiersShape
import typingsSlinky.reactDates.reactDatesNumbers.`-1`
import typingsSlinky.reactDates.reactDatesNumbers.`0`
import typingsSlinky.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarDay {
  
  @JSImport("react-dates", "CalendarDay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, CalendarDayCls] {
    
    @scala.inline
    def ariaLabelFormat(value: String): this.type = set("ariaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def day(value: Moment): this.type = set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayNull: this.type = set("day", null)
    
    @scala.inline
    def daySize(value: Double): this.type = set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOutsideDay(value: Boolean): this.type = set("isOutsideDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifiers(value: ModifiersShape): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDayClick(value: (/* day */ Moment, /* event */ SyntheticMouseEvent[HTMLTableDataCellElement]) => Unit): this.type = set("onDayClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDayMouseEnter(value: (/* day */ Moment, /* event */ SyntheticMouseEvent[HTMLTableDataCellElement]) => Unit): this.type = set("onDayMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDayMouseLeave(value: (/* day */ Moment, /* event */ SyntheticMouseEvent[HTMLTableDataCellElement]) => Unit): this.type = set("onDayMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def phrases(value: CalendarDayPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderDayContents(value: (/* day */ Moment, /* modifiers */ ModifiersShape) => ReactElement): this.type = set("renderDayContents", js.Any.fromFunction2(value))
    
    @scala.inline
    def renderDayContentsNull: this.type = set("renderDayContents", null)
    
    @scala.inline
    def tabIndex(value: `0` | `-1`): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CalendarDay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarDayShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
