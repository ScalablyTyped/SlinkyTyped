package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's outline width.
  */
@JSGlobal("ChangeFloatingObjectOutlineWidthCommand")
@js.native
class ChangeFloatingObjectOutlineWidthCommand ()
  extends typingsSlinky.devexpressWeb.ChangeFloatingObjectOutlineWidthCommand {
  /**
    * Executes the ChangeFloatingObjectOutlineWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param width An integer value specifying the outline width.
    */
  /* CompleteClass */
  override def execute(width: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[Double] = js.native
}

