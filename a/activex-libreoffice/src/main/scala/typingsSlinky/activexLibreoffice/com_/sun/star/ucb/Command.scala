package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a command.
  * @see XCommandProcessor
  */
@js.native
trait Command extends js.Object {
  /** contains the argument of the command */
  var Argument: js.Any = js.native
  /**
    * contains an implementation specific handle for the command.
    *
    * It must be `-1` if the implementation has no handle. `0` is a valid command handle.
    */
  var Handle: Double = js.native
  /** contains the name of the command. */
  var Name: String = js.native
}

object Command {
  @scala.inline
  def apply(Argument: js.Any, Handle: Double, Name: String): Command = {
    val __obj = js.Dynamic.literal(Argument = Argument.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

