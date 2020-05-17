package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.CustomCommand event.
  */
@js.native
trait ASPxClientFileManagerCustomCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
}

object ASPxClientFileManagerCustomCommandEventArgs {
  @scala.inline
  def apply(commandName: String): ASPxClientFileManagerCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCustomCommandEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerCustomCommandEventArgsOps[Self <: ASPxClientFileManagerCustomCommandEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

