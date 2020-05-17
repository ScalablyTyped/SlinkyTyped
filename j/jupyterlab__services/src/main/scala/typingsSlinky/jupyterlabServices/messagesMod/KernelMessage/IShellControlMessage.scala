package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message type for shell or control messages.
  *
  * #### Notes
  * This convenience is so we can use it as a generic type constraint.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType]
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType]
*/
trait IShellControlMessage extends js.Object

object IShellControlMessage {
  @scala.inline
  implicit def apply(value: IControlMessage[ControlMessageType]): IShellControlMessage = value.asInstanceOf[IShellControlMessage]
  @scala.inline
  implicit def apply(value: IShellMessage[ShellMessageType]): IShellControlMessage = value.asInstanceOf[IShellControlMessage]
}

