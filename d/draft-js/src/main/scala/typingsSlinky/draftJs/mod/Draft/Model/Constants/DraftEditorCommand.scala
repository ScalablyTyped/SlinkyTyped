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
  def backspace: typingsSlinky.draftJs.draftJsStrings.backspace = this.cast("backspace")
  @scala.inline
  def `backspace-to-start-of-line`: typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line` = this.cast("backspace-to-start-of-line")
  @scala.inline
  def `backspace-word`: typingsSlinky.draftJs.draftJsStrings.`backspace-word` = this.cast("backspace-word")
  @scala.inline
  def bold: bold_ = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: code_ = this.cast("code")
  @scala.inline
  def delete: typingsSlinky.draftJs.draftJsStrings.delete = this.cast("delete")
  @scala.inline
  def `delete-word`: typingsSlinky.draftJs.draftJsStrings.`delete-word` = this.cast("delete-word")
  @scala.inline
  def italic: italic_ = this.cast("italic")
  @scala.inline
  def `move-selection-to-end-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block` = this.cast("move-selection-to-end-of-block")
  @scala.inline
  def `move-selection-to-start-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block` = this.cast("move-selection-to-start-of-block")
  @scala.inline
  def redo: typingsSlinky.draftJs.draftJsStrings.redo = this.cast("redo")
  @scala.inline
  def `secondary-cut`: typingsSlinky.draftJs.draftJsStrings.`secondary-cut` = this.cast("secondary-cut")
  @scala.inline
  def `secondary-paste`: typingsSlinky.draftJs.draftJsStrings.`secondary-paste` = this.cast("secondary-paste")
  @scala.inline
  def `split-block`: typingsSlinky.draftJs.draftJsStrings.`split-block` = this.cast("split-block")
  @scala.inline
  def strikethrough: strikethrough_ = this.cast("strikethrough")
  @scala.inline
  def `transpose-characters`: typingsSlinky.draftJs.draftJsStrings.`transpose-characters` = this.cast("transpose-characters")
  @scala.inline
  def underline: underline_ = this.cast("underline")
  @scala.inline
  def undo: typingsSlinky.draftJs.draftJsStrings.undo = this.cast("undo")
}

