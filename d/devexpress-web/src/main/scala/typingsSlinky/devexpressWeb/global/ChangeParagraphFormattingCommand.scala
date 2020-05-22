package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
@JSGlobal("ChangeParagraphFormattingCommand")
@js.native
class ChangeParagraphFormattingCommand ()
  extends typingsSlinky.devexpressWeb.ChangeParagraphFormattingCommand {
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  /* CompleteClass */
  override def execute(settings: typingsSlinky.devexpressWeb.ParagraphFormattingSettings): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsSlinky.devexpressWeb.CommandState[typingsSlinky.devexpressWeb.ParagraphFormattingSettings] = js.native
}

