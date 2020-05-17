package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next data record of the bound data source.
  */
@js.native
trait GoToDataRecordCommand extends CommandBase {
  /**
    * Executes the GoToDataRecordCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param activeRecordIndex An integer value specifying index of the next data record.
    */
  def execute(activeRecordIndex: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[DataRecordOptions] = js.native
}

object GoToDataRecordCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[DataRecordOptions]): GoToDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToDataRecordCommand]
  }
  @scala.inline
  implicit class GoToDataRecordCommandOps[Self <: GoToDataRecordCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => CommandState[DataRecordOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

