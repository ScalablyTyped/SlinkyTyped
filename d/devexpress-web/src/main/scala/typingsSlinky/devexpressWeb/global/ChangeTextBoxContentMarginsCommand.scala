package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' content margins.
  */
@JSGlobal("ChangeTextBoxContentMarginsCommand")
@js.native
class ChangeTextBoxContentMarginsCommand ()
  extends typingsSlinky.devexpressWeb.ChangeTextBoxContentMarginsCommand {
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.Margins): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.Margins] = js.native
}

