package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's alignment position.
  */
@JSGlobal("ChangeFloatingObjectAlignmentPositionCommand")
@js.native
class ChangeFloatingObjectAlignmentPositionCommand ()
  extends typingsSlinky.devexpressWeb.ChangeFloatingObjectAlignmentPositionCommand {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.FloatingObjectAlignmentPositionSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.FloatingObjectAlignmentPositionSettings] = js.native
}

