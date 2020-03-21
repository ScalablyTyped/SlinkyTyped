package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart
  - typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop
*/
trait PollEvent extends js.Object

object PollEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pollColonstart: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart = this.cast("poll:start")
  @scala.inline
  def pollColonstop: typingsSlinky.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop = this.cast("poll:stop")
}

