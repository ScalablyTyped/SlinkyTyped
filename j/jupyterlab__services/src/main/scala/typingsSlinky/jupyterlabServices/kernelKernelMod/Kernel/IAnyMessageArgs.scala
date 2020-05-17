package typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel

import typingsSlinky.jupyterlabServices.anon.ReadonlyIMessageMessageTy
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.recv
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments interface for the anyMessage signal.
  */
@js.native
trait IAnyMessageArgs extends js.Object {
  /**
    * The direction of the message.
    */
  var direction: send | recv = js.native
  /**
    * The message that is being signaled.
    */
  var msg: ReadonlyIMessageMessageTy = js.native
}

object IAnyMessageArgs {
  @scala.inline
  def apply(direction: send | recv, msg: ReadonlyIMessageMessageTy): IAnyMessageArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnyMessageArgs]
  }
  @scala.inline
  implicit class IAnyMessageArgsOps[Self <: IAnyMessageArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: send | recv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: ReadonlyIMessageMessageTy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

