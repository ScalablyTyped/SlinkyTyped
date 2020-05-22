package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's preferred row height.
  */
@JSGlobal("ChangeTableRowPreferredHeightCommand")
@js.native
class ChangeTableRowPreferredHeightCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTableRowPreferredHeightCommand {
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  /* CompleteClass */
  override def execute(preferredHeight: typingsSlinky.devexpressWeb.TableHeightUnit): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.TableHeightUnit] = js.native
}

