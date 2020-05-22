package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's style options.
  */
@JSGlobal("ChangeTableLookCommand")
@js.native
class ChangeTableLookCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTableLookCommand {
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.TableLookSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.TableLookSettings] = js.native
}

