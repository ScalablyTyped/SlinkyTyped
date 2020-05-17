package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientObjectContainer.FlashScriptCommand client event.
  */
@js.native
trait ASPxClientFlashScriptCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    */
  var args: String = js.native
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    */
  var command: String = js.native
}

object ASPxClientFlashScriptCommandEventArgs {
  @scala.inline
  def apply(args: String, command: String): ASPxClientFlashScriptCommandEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFlashScriptCommandEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFlashScriptCommandEventArgsOps[Self <: ASPxClientFlashScriptCommandEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

