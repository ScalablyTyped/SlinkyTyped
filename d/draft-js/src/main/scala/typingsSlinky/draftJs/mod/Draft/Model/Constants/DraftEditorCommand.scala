package typingsSlinky.draftJs.mod.Draft.Model.Constants

import typingsSlinky.draftJs.draftJsStrings.bold_
import typingsSlinky.draftJs.draftJsStrings.code_
import typingsSlinky.draftJs.draftJsStrings.italic_
import typingsSlinky.draftJs.draftJsStrings.strikethrough_
import typingsSlinky.draftJs.draftJsStrings.underline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of editor commands that may be invoked by keyboard commands or UI
  * controls. These commands should map to operations that modify content or
  * selection state and update the editor state accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.undo
  - typingsSlinky.draftJs.draftJsStrings.redo
  - typingsSlinky.draftJs.draftJsStrings.delete
  - typingsSlinky.draftJs.draftJsStrings.`delete-word`
  - typingsSlinky.draftJs.draftJsStrings.backspace
  - typingsSlinky.draftJs.draftJsStrings.`backspace-word`
  - typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line`
  - typingsSlinky.draftJs.draftJsStrings.bold_
  - typingsSlinky.draftJs.draftJsStrings.code_
  - typingsSlinky.draftJs.draftJsStrings.italic_
  - typingsSlinky.draftJs.draftJsStrings.strikethrough_
  - typingsSlinky.draftJs.draftJsStrings.underline_
  - typingsSlinky.draftJs.draftJsStrings.`split-block`
  - typingsSlinky.draftJs.draftJsStrings.`transpose-characters`
  - typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block`
  - typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block`
  - typingsSlinky.draftJs.draftJsStrings.`secondary-cut`
  - typingsSlinky.draftJs.draftJsStrings.`secondary-paste`
*/
trait DraftEditorCommand extends js.Object

object DraftEditorCommand {
  @scala.inline
  def backspace: typingsSlinky.draftJs.draftJsStrings.backspace = "backspace".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.backspace]
  @scala.inline
  def `backspace-to-start-of-line`: typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line`]
  @scala.inline
  def `backspace-word`: typingsSlinky.draftJs.draftJsStrings.`backspace-word` = "backspace-word".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`backspace-word`]
  @scala.inline
  def bold: bold_ = "bold".asInstanceOf[bold_]
  @scala.inline
  def code: code_ = "code".asInstanceOf[code_]
  @scala.inline
  def delete: typingsSlinky.draftJs.draftJsStrings.delete = "delete".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.delete]
  @scala.inline
  def `delete-word`: typingsSlinky.draftJs.draftJsStrings.`delete-word` = "delete-word".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`delete-word`]
  @scala.inline
  def italic: italic_ = "italic".asInstanceOf[italic_]
  @scala.inline
  def `move-selection-to-end-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block`]
  @scala.inline
  def `move-selection-to-start-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block`]
  @scala.inline
  def redo: typingsSlinky.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.redo]
  @scala.inline
  def `secondary-cut`: typingsSlinky.draftJs.draftJsStrings.`secondary-cut` = "secondary-cut".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`secondary-cut`]
  @scala.inline
  def `secondary-paste`: typingsSlinky.draftJs.draftJsStrings.`secondary-paste` = "secondary-paste".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`secondary-paste`]
  @scala.inline
  def `split-block`: typingsSlinky.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`split-block`]
  @scala.inline
  def strikethrough: strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
  @scala.inline
  def `transpose-characters`: typingsSlinky.draftJs.draftJsStrings.`transpose-characters` = "transpose-characters".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`transpose-characters`]
  @scala.inline
  def underline: underline_ = "underline".asInstanceOf[underline_]
  @scala.inline
  def undo: typingsSlinky.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.undo]
}

