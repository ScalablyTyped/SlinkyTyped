package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror
*/
trait ErrorWithTaskEvent extends js.Object

object ErrorWithTaskEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extendLockColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror = this.cast("extendLock:error")
  @scala.inline
  def handleBpmnErrorColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror = this.cast("handleBpmnError:error")
  @scala.inline
  def handleFailureColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror = this.cast("handleFailure:error")
  @scala.inline
  def unlockColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror = this.cast("unlock:error")
}

