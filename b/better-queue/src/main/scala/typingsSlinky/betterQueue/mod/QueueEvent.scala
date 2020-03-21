package typingsSlinky.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.betterQueue.betterQueueStrings.task_queued
  - typingsSlinky.betterQueue.betterQueueStrings.task_accepted
  - typingsSlinky.betterQueue.betterQueueStrings.task_started
  - typingsSlinky.betterQueue.betterQueueStrings.task_finish
  - typingsSlinky.betterQueue.betterQueueStrings.task_failed
  - typingsSlinky.betterQueue.betterQueueStrings.task_progress
  - typingsSlinky.betterQueue.betterQueueStrings.batch_finish
  - typingsSlinky.betterQueue.betterQueueStrings.batch_failed
  - typingsSlinky.betterQueue.betterQueueStrings.batch_progress
  - typingsSlinky.betterQueue.betterQueueStrings.drain
  - typingsSlinky.betterQueue.betterQueueStrings.empty
  - typingsSlinky.betterQueue.betterQueueStrings.error
*/
trait QueueEvent extends js.Object

object QueueEvent {
  @scala.inline
  def batch_failed: typingsSlinky.betterQueue.betterQueueStrings.batch_failed = this.cast("batch_failed")
  @scala.inline
  def batch_finish: typingsSlinky.betterQueue.betterQueueStrings.batch_finish = this.cast("batch_finish")
  @scala.inline
  def batch_progress: typingsSlinky.betterQueue.betterQueueStrings.batch_progress = this.cast("batch_progress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def drain: typingsSlinky.betterQueue.betterQueueStrings.drain = this.cast("drain")
  @scala.inline
  def empty: typingsSlinky.betterQueue.betterQueueStrings.empty = this.cast("empty")
  @scala.inline
  def error: typingsSlinky.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def task_accepted: typingsSlinky.betterQueue.betterQueueStrings.task_accepted = this.cast("task_accepted")
  @scala.inline
  def task_failed: typingsSlinky.betterQueue.betterQueueStrings.task_failed = this.cast("task_failed")
  @scala.inline
  def task_finish: typingsSlinky.betterQueue.betterQueueStrings.task_finish = this.cast("task_finish")
  @scala.inline
  def task_progress: typingsSlinky.betterQueue.betterQueueStrings.task_progress = this.cast("task_progress")
  @scala.inline
  def task_queued: typingsSlinky.betterQueue.betterQueueStrings.task_queued = this.cast("task_queued")
  @scala.inline
  def task_started: typingsSlinky.betterQueue.betterQueueStrings.task_started = this.cast("task_started")
}

