package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stdin message types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_request
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_reply
*/
trait StdinMessageType extends js.Object

object StdinMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def input_reply: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_reply = this.cast("input_reply")
  @scala.inline
  def input_request: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.input_request = this.cast("input_request")
}

