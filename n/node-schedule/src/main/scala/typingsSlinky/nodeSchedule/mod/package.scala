package typingsSlinky.nodeSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JobCallback = js.Function1[/* fireDate */ js.Date, scala.Unit]
  
  type Recurrence = scala.Double | typingsSlinky.nodeSchedule.mod.Range | java.lang.String
  
  type RecurrenceSegment = typingsSlinky.nodeSchedule.mod.Recurrence | js.Array[typingsSlinky.nodeSchedule.mod.Recurrence]
  
  type Timezone = java.lang.String
}
