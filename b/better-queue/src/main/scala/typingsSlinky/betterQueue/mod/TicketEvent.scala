package typingsSlinky.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.betterQueue.betterQueueStrings.accept
  - typingsSlinky.betterQueue.betterQueueStrings.queued
  - typingsSlinky.betterQueue.betterQueueStrings.started
  - typingsSlinky.betterQueue.betterQueueStrings.progress
  - typingsSlinky.betterQueue.betterQueueStrings.finish
  - typingsSlinky.betterQueue.betterQueueStrings.failed
  - typingsSlinky.betterQueue.betterQueueStrings.error
*/
trait TicketEvent extends js.Object

object TicketEvent {
  @scala.inline
  def accept: typingsSlinky.betterQueue.betterQueueStrings.accept = this.cast("accept")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def failed: typingsSlinky.betterQueue.betterQueueStrings.failed = this.cast("failed")
  @scala.inline
  def finish: typingsSlinky.betterQueue.betterQueueStrings.finish = this.cast("finish")
  @scala.inline
  def progress: typingsSlinky.betterQueue.betterQueueStrings.progress = this.cast("progress")
  @scala.inline
  def queued: typingsSlinky.betterQueue.betterQueueStrings.queued = this.cast("queued")
  @scala.inline
  def started: typingsSlinky.betterQueue.betterQueueStrings.started = this.cast("started")
}

