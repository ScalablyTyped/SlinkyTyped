package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to paste the text from the clipboard over the selection.
  */
@JSGlobal("PasteCommand")
@js.native
class PasteCommand ()
  extends typingsSlinky.devexpressWeb.PasteCommand {
  /**
    * Executes the PasteCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.SimpleCommandState = js.native
}

