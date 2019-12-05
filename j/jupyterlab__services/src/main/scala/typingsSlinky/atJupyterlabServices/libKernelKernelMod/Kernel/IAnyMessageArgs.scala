package typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel

import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.recv
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.send
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments interface for the anyMessage signal.
  */
trait IAnyMessageArgs extends js.Object {
  /**
    * The direction of the message.
    */
  var direction: send | recv
  /**
    * The message that is being signaled.
    */
  var msg: IMessage[MessageType]
}

object IAnyMessageArgs {
  @scala.inline
  def apply(direction: send | recv, msg: IMessage[MessageType]): IAnyMessageArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnyMessageArgs]
  }
}

