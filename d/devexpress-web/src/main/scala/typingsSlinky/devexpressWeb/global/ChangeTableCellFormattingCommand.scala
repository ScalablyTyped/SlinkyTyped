package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the cell formatting of the selected table elements.
  */
@JSGlobal("ChangeTableCellFormattingCommand")
@js.native
class ChangeTableCellFormattingCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTableCellFormattingCommand {
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.TableCellFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.TableCellFormattingSettings] = js.native
}

