package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
@js.native
trait ASPxClientDropDownCommandEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  var commandName: String = js.native
}

object ASPxClientDropDownCommandEventArgs {
  @scala.inline
  def apply(cancel: Boolean, commandName: String): ASPxClientDropDownCommandEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDropDownCommandEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDropDownCommandEventArgsOps[Self <: ASPxClientDropDownCommandEventArgs] (val x: Self) extends AnyVal {
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

