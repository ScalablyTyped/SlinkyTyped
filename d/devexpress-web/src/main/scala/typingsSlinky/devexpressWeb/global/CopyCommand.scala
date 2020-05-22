package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to copy the selected text and place it to the clipboard.
  */
@JSGlobal("CopyCommand")
@js.native
class CopyCommand ()
  extends typingsSlinky.devexpressWeb.CopyCommand {
  /**
    * Executes the CopyCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.SimpleCommandState = js.native
}

