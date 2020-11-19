package typingsSlinky.nodeCron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-cron", "schedule")
@js.native
object schedule extends js.Object {
  
  def apply(cronExpression: String, func: js.Function0[Unit]): ScheduledTask = js.native
  def apply(cronExpression: String, func: js.Function0[Unit], options: ScheduleOptions): ScheduledTask = js.native
}
