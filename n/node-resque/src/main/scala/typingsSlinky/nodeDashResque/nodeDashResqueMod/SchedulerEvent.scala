package typingsSlinky.nodeDashResque.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashResque.nodeDashResqueStrings.start
  - typings.nodeDashResque.nodeDashResqueStrings.end
  - typings.nodeDashResque.nodeDashResqueStrings.poll
  - typings.nodeDashResque.nodeDashResqueStrings.master
  - typings.nodeDashResque.nodeDashResqueStrings.cleanStuckWorker
  - typings.nodeDashResque.nodeDashResqueStrings.error
  - typings.nodeDashResque.nodeDashResqueStrings.workingTimestamp
  - typings.nodeDashResque.nodeDashResqueStrings.transferredJob
*/
trait SchedulerEvent extends js.Object

object SchedulerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleanStuckWorker: typingsSlinky.nodeDashResque.nodeDashResqueStrings.cleanStuckWorker = this.cast("cleanStuckWorker")
  @scala.inline
  def end: typingsSlinky.nodeDashResque.nodeDashResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typingsSlinky.nodeDashResque.nodeDashResqueStrings.error = this.cast("error")
  @scala.inline
  def master: typingsSlinky.nodeDashResque.nodeDashResqueStrings.master = this.cast("master")
  @scala.inline
  def poll: typingsSlinky.nodeDashResque.nodeDashResqueStrings.poll = this.cast("poll")
  @scala.inline
  def start: typingsSlinky.nodeDashResque.nodeDashResqueStrings.start = this.cast("start")
  @scala.inline
  def transferredJob: typingsSlinky.nodeDashResque.nodeDashResqueStrings.transferredJob = this.cast("transferredJob")
  @scala.inline
  def workingTimestamp: typingsSlinky.nodeDashResque.nodeDashResqueStrings.workingTimestamp = this.cast("workingTimestamp")
}

