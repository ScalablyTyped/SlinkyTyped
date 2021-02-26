package typingsSlinky.reactBigCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBigCalendar.mod.DayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Day {
  
  @scala.inline
  def apply(date: js.Date): Default[tag.type, typingsSlinky.reactBigCalendar.mod.Day] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactBigCalendar.mod.Day](js.Array(this.component, __props.asInstanceOf[DayProps]))
  }
  
  @JSImport("react-big-calendar", "Day")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DayProps): Default[tag.type, typingsSlinky.reactBigCalendar.mod.Day] = new Default[tag.type, typingsSlinky.reactBigCalendar.mod.Day](js.Array(this.component, p.asInstanceOf[js.Any]))
}
