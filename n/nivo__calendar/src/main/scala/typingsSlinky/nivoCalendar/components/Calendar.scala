package typingsSlinky.nivoCalendar.components

import typingsSlinky.nivoCalendar.mod.CalendarDatum
import typingsSlinky.nivoCalendar.mod.CalendarSvgProps
import typingsSlinky.nivoCalendar.mod.DateOrString
import typingsSlinky.nivoCore.mod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("@nivo/calendar", "Calendar")
  @js.native
  object component extends js.Object
  
  def withProps(p: CalendarSvgProps with Dimensions): SharedBuilder_CalendarSvgPropsDimensions_1359497114[typingsSlinky.nivoCalendar.mod.Calendar] = new SharedBuilder_CalendarSvgPropsDimensions_1359497114[typingsSlinky.nivoCalendar.mod.Calendar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[CalendarDatum], from: DateOrString, height: Double, to: DateOrString, width: Double): SharedBuilder_CalendarSvgPropsDimensions_1359497114[typingsSlinky.nivoCalendar.mod.Calendar] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_CalendarSvgPropsDimensions_1359497114[typingsSlinky.nivoCalendar.mod.Calendar](js.Array(this.component, __props.asInstanceOf[CalendarSvgProps with Dimensions]))
  }
}
