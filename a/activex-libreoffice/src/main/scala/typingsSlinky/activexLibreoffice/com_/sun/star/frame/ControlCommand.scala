package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command which can be send to a generic toolbar control.
  * @since OOo 2.0.3
  */
@js.native
trait ControlCommand extends js.Object {
  /**
    * specifies a sequence of named values which are used as argument for the command. The number and type of arguments depend on the the command and
    * control.
    */
  var Arguments: SafeArray[NamedValue] = js.native
  /** specifies the command which should be processed by the toolbar control. */
  var Command: String = js.native
}

object ControlCommand {
  @scala.inline
  def apply(Arguments: SafeArray[NamedValue], Command: String): ControlCommand = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlCommand]
  }
  @scala.inline
  implicit class ControlCommandOps[Self <: ControlCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: SafeArray[NamedValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

