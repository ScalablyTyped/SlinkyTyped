package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesInputDashTypesMod {
  import typingsSlinky.moment.momentMod.Duration
  import typingsSlinky.moment.momentMod.Moment

  type DurationInput = Duration | js.Object | String | Double
  type EventSourceFunction = js.Function4[
    /* start */ Moment, 
    /* end */ Moment, 
    /* timezone */ String, 
    /* callback */ js.Function1[/* events */ js.Array[EventObjectInput], Unit], 
    Unit
  ]
  type EventSourceInput = EventSourceSimpleInput | EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[EventObjectInput] | EventSourceFunction | String
  type MomentInput = Moment | js.Date | js.Object | String | Double
}
