package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypesMod {
  type DurationInput = typingsSlinky.moment.mod.Duration_ | js.Object | java.lang.String | scala.Double
  type EventSourceFunction = js.Function4[
    /* start */ typingsSlinky.moment.mod.Moment, 
    /* end */ typingsSlinky.moment.mod.Moment, 
    /* timezone */ java.lang.String, 
    /* callback */ js.Function1[
      /* events */ js.Array[typingsSlinky.fullcalendar.inputTypesMod.EventObjectInput], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type EventSourceInput = typingsSlinky.fullcalendar.inputTypesMod.EventSourceSimpleInput | typingsSlinky.fullcalendar.inputTypesMod.EventSourceExtendedInput
  type EventSourceSimpleInput = js.Array[typingsSlinky.fullcalendar.inputTypesMod.EventObjectInput] | typingsSlinky.fullcalendar.inputTypesMod.EventSourceFunction | java.lang.String
  type MomentInput = typingsSlinky.moment.mod.Moment | js.Date | js.Object | java.lang.String | scala.Double
}
