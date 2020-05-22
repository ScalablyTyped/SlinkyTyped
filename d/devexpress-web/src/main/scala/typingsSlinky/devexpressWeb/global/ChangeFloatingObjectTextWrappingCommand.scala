package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's text wrapping settings.
  */
@JSGlobal("ChangeFloatingObjectTextWrappingCommand")
@js.native
class ChangeFloatingObjectTextWrappingCommand ()
  extends typingsSlinky.devexpressWeb.ChangeFloatingObjectTextWrappingCommand {
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.FloatingObjectTextWrappingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.FloatingObjectTextWrappingSettings] = js.native
}

