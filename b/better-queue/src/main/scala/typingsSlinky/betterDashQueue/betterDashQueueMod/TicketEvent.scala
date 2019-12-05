package typingsSlinky.betterDashQueue.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.betterDashQueue.betterDashQueueStrings.accept
  - typings.betterDashQueue.betterDashQueueStrings.queued
  - typings.betterDashQueue.betterDashQueueStrings.started
  - typings.betterDashQueue.betterDashQueueStrings.progress
  - typings.betterDashQueue.betterDashQueueStrings.finish
  - typings.betterDashQueue.betterDashQueueStrings.failed
  - typings.betterDashQueue.betterDashQueueStrings.error
*/
trait TicketEvent extends js.Object

object TicketEvent {
  @scala.inline
  def accept: typingsSlinky.betterDashQueue.betterDashQueueStrings.accept = this.cast("accept")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.betterDashQueue.betterDashQueueStrings.error = this.cast("error")
  @scala.inline
  def failed: typingsSlinky.betterDashQueue.betterDashQueueStrings.failed = this.cast("failed")
  @scala.inline
  def finish: typingsSlinky.betterDashQueue.betterDashQueueStrings.finish = this.cast("finish")
  @scala.inline
  def progress: typingsSlinky.betterDashQueue.betterDashQueueStrings.progress = this.cast("progress")
  @scala.inline
  def queued: typingsSlinky.betterDashQueue.betterDashQueueStrings.queued = this.cast("queued")
  @scala.inline
  def started: typingsSlinky.betterDashQueue.betterDashQueueStrings.started = this.cast("started")
}

