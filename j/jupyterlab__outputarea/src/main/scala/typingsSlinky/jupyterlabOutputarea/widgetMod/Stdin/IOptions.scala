package typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IShellFuture
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options to create a stdin widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The kernel future associated with the request.
    */
  var future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
  /**
    * Whether the input is a password.
    */
  var password: Boolean = js.native
  /**
    * The prompt text.
    */
  var prompt: String = js.native
}

object IOptions {
  @scala.inline
  def apply(
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]],
    password: Boolean,
    prompt: String
  ): IOptions = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFuture(value: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

