package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the repository item's table border style.
  */
@js.native
trait ChangeTableBorderRepositoryItemCommand extends CommandBase {
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  def execute(settings: TableBorderSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBorderSettings] = js.native
}

object ChangeTableBorderRepositoryItemCommand {
  @scala.inline
  def apply(execute: TableBorderSettings => Boolean, getState: () => CommandState[TableBorderSettings]): ChangeTableBorderRepositoryItemCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableBorderRepositoryItemCommand]
  }
  @scala.inline
  implicit class ChangeTableBorderRepositoryItemCommandOps[Self <: ChangeTableBorderRepositoryItemCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: TableBorderSettings => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => CommandState[TableBorderSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

