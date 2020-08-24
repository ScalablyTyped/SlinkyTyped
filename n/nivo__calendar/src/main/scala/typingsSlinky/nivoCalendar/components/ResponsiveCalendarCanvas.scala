package typingsSlinky.nivoCalendar.components

import typingsSlinky.nivoCalendar.mod.CalendarDatum
import typingsSlinky.nivoCalendar.mod.CalendarSvgProps
import typingsSlinky.nivoCalendar.mod.DateOrString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveCalendarCanvas {
  @JSImport("@nivo/calendar", "ResponsiveCalendarCanvas")
  @js.native
  object component extends js.Object
  
  def withProps(p: CalendarSvgProps): SharedBuilder_CalendarSvgProps1063066850[typingsSlinky.nivoCalendar.mod.ResponsiveCalendarCanvas] = new SharedBuilder_CalendarSvgProps1063066850[typingsSlinky.nivoCalendar.mod.ResponsiveCalendarCanvas](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): SharedBuilder_CalendarSvgProps1063066850[typingsSlinky.nivoCalendar.mod.ResponsiveCalendarCanvas] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    new SharedBuilder_CalendarSvgProps1063066850[typingsSlinky.nivoCalendar.mod.ResponsiveCalendarCanvas](js.Array(this.component, __props.asInstanceOf[CalendarSvgProps]))
  }
}

