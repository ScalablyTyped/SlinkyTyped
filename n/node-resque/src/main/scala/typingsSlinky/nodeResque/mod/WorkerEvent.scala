package typingsSlinky.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeResque.nodeResqueStrings.start
  - typingsSlinky.nodeResque.nodeResqueStrings.end
  - typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker
  - typingsSlinky.nodeResque.nodeResqueStrings.poll
  - typingsSlinky.nodeResque.nodeResqueStrings.ping
  - typingsSlinky.nodeResque.nodeResqueStrings.job
  - typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue
  - typingsSlinky.nodeResque.nodeResqueStrings.success
  - typingsSlinky.nodeResque.nodeResqueStrings.failure
  - typingsSlinky.nodeResque.nodeResqueStrings.error
  - typingsSlinky.nodeResque.nodeResqueStrings.pause
*/
trait WorkerEvent extends js.Object

object WorkerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleaning_worker: typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker = this.cast("cleaning_worker")
  @scala.inline
  def end: typingsSlinky.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typingsSlinky.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def failure: typingsSlinky.nodeResque.nodeResqueStrings.failure = this.cast("failure")
  @scala.inline
  def job: typingsSlinky.nodeResque.nodeResqueStrings.job = this.cast("job")
  @scala.inline
  def pause: typingsSlinky.nodeResque.nodeResqueStrings.pause = this.cast("pause")
  @scala.inline
  def ping: typingsSlinky.nodeResque.nodeResqueStrings.ping = this.cast("ping")
  @scala.inline
  def poll: typingsSlinky.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def reEnqueue: typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue = this.cast("reEnqueue")
  @scala.inline
  def start: typingsSlinky.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def success: typingsSlinky.nodeResque.nodeResqueStrings.success = this.cast("success")
}

