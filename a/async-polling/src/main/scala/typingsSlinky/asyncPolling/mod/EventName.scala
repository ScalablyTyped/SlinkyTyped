package typingsSlinky.asyncPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.asyncPolling.asyncPollingStrings.run
  - typingsSlinky.asyncPolling.asyncPollingStrings.start
  - typingsSlinky.asyncPolling.asyncPollingStrings.error
  - typingsSlinky.asyncPolling.asyncPollingStrings.result
  - typingsSlinky.asyncPolling.asyncPollingStrings.end
  - typingsSlinky.asyncPolling.asyncPollingStrings.schedule
  - typingsSlinky.asyncPolling.asyncPollingStrings.stop
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsSlinky.asyncPolling.asyncPollingStrings.end = this.cast("end")
  @scala.inline
  def error: typingsSlinky.asyncPolling.asyncPollingStrings.error = this.cast("error")
  @scala.inline
  def result: typingsSlinky.asyncPolling.asyncPollingStrings.result = this.cast("result")
  @scala.inline
  def run: typingsSlinky.asyncPolling.asyncPollingStrings.run = this.cast("run")
  @scala.inline
  def schedule: typingsSlinky.asyncPolling.asyncPollingStrings.schedule = this.cast("schedule")
  @scala.inline
  def start: typingsSlinky.asyncPolling.asyncPollingStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsSlinky.asyncPolling.asyncPollingStrings.stop = this.cast("stop")
}

