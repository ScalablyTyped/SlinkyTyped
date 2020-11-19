package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-schedule", "Invocation")
@js.native
class Invocation protected () extends js.Object {
  def this(job: Job, fireDate: js.Date, recurrenceRule: RecurrenceRule) = this()
  
  var fireDate: js.Date = js.native
  
  var job: Job = js.native
  
  var recurrenceRule: RecurrenceRule = js.native
  
  var timerID: Double = js.native
}
