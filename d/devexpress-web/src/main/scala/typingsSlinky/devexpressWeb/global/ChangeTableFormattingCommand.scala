package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's formatting.
  */
@JSGlobal("ChangeTableFormattingCommand")
@js.native
class ChangeTableFormattingCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTableFormattingCommand {
  /**
    * Executes the ChangeTableFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object containing the settings to format a table.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.TableFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.TableFormattingSettings] = js.native
}

