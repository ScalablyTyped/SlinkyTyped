package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "rescheduleJob")
@js.native
object rescheduleJob extends js.Object {
  def apply(job: String, spec: String): Job = js.native
  def apply(job: String, spec: RecurrenceRule): Job = js.native
  def apply(job: String, spec: RecurrenceSpecDateRange): Job = js.native
  def apply(job: String, spec: RecurrenceSpecObjLit): Job = js.native
  def apply(job: String, spec: js.Date): Job = js.native
  def apply(job: Job, spec: String): Job = js.native
  def apply(job: Job, spec: RecurrenceRule): Job = js.native
  def apply(job: Job, spec: RecurrenceSpecDateRange): Job = js.native
  def apply(job: Job, spec: RecurrenceSpecObjLit): Job = js.native
  def apply(job: Job, spec: js.Date): Job = js.native
}

