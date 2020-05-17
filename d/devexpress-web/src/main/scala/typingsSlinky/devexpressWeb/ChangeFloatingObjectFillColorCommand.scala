package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's background fill color.
  */
@js.native
trait ChangeFloatingObjectFillColorCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectFillColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}

object ChangeFloatingObjectFillColorCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFloatingObjectFillColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectFillColorCommand]
  }
  @scala.inline
  implicit class ChangeFloatingObjectFillColorCommandOps[Self <: ChangeFloatingObjectFillColorCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => CommandState[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

