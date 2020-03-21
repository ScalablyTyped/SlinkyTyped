package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror
*/
trait ErrorEvent extends js.Object

object ErrorEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completeColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror = this.cast("complete:error")
  @scala.inline
  def pollColonerror: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror = this.cast("poll:error")
}

