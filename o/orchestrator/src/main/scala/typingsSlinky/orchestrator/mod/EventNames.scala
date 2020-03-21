package typingsSlinky.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.orchestrator.orchestratorStrings.start
  - typingsSlinky.orchestrator.orchestratorStrings.stop
  - typingsSlinky.orchestrator.orchestratorStrings.err
  - typingsSlinky.orchestrator.orchestratorStrings.task_start
  - typingsSlinky.orchestrator.orchestratorStrings.task_stop
  - typingsSlinky.orchestrator.orchestratorStrings.task_err
  - typingsSlinky.orchestrator.orchestratorStrings.task_not_found
  - typingsSlinky.orchestrator.orchestratorStrings.task_recursion
*/
trait EventNames extends js.Object

object EventNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def err: typingsSlinky.orchestrator.orchestratorStrings.err = this.cast("err")
  @scala.inline
  def start: typingsSlinky.orchestrator.orchestratorStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsSlinky.orchestrator.orchestratorStrings.stop = this.cast("stop")
  @scala.inline
  def task_err: typingsSlinky.orchestrator.orchestratorStrings.task_err = this.cast("task_err")
  @scala.inline
  def task_not_found: typingsSlinky.orchestrator.orchestratorStrings.task_not_found = this.cast("task_not_found")
  @scala.inline
  def task_recursion: typingsSlinky.orchestrator.orchestratorStrings.task_recursion = this.cast("task_recursion")
  @scala.inline
  def task_start: typingsSlinky.orchestrator.orchestratorStrings.task_start = this.cast("task_start")
  @scala.inline
  def task_stop: typingsSlinky.orchestrator.orchestratorStrings.task_stop = this.cast("task_stop")
}

