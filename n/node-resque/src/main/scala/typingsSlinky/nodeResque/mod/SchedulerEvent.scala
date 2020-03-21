package typingsSlinky.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeResque.nodeResqueStrings.start
  - typingsSlinky.nodeResque.nodeResqueStrings.end
  - typingsSlinky.nodeResque.nodeResqueStrings.poll
  - typingsSlinky.nodeResque.nodeResqueStrings.master
  - typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker
  - typingsSlinky.nodeResque.nodeResqueStrings.error
  - typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp
  - typingsSlinky.nodeResque.nodeResqueStrings.transferredJob
*/
trait SchedulerEvent extends js.Object

object SchedulerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleanStuckWorker: typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker = this.cast("cleanStuckWorker")
  @scala.inline
  def end: typingsSlinky.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typingsSlinky.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def master: typingsSlinky.nodeResque.nodeResqueStrings.master = this.cast("master")
  @scala.inline
  def poll: typingsSlinky.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def start: typingsSlinky.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def transferredJob: typingsSlinky.nodeResque.nodeResqueStrings.transferredJob = this.cast("transferredJob")
  @scala.inline
  def workingTimestamp: typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp = this.cast("workingTimestamp")
}

