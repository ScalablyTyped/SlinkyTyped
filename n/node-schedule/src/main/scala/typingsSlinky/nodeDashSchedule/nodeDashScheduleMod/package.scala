package typingsSlinky.nodeDashSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashScheduleMod {
  type JobCallback = js.Function1[/* fireDate */ js.Date, Unit]
  type Recurrence = Double | Range | String
  type RecurrenceSegment = Recurrence | js.Array[Recurrence]
}
