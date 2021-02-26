package typingsSlinky.reactDates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDates.mod.CalendarMonthGridCls
import typingsSlinky.reactDates.mod.CalendarMonthGridShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CalendarMonthGrid {
  
  def apply(p: CalendarMonthGridShape): Default[tag.type, CalendarMonthGridCls] = new Default[tag.type, CalendarMonthGridCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates", "CalendarMonthGrid")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalendarMonthGrid.type): Default[tag.type, CalendarMonthGridCls] = new Default[tag.type, CalendarMonthGridCls](js.Array(this.component, js.Dictionary.empty))()
}
