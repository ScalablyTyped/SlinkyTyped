package typingsSlinky.reactAce.editorOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAce.reactAceStrings.minLines
  - typingsSlinky.reactAce.reactAceStrings.maxLines
  - typingsSlinky.reactAce.reactAceStrings.readOnly
  - typingsSlinky.reactAce.reactAceStrings.highlightActiveLine
  - typingsSlinky.reactAce.reactAceStrings.tabSize
  - typingsSlinky.reactAce.reactAceStrings.enableBasicAutocompletion
  - typingsSlinky.reactAce.reactAceStrings.enableLiveAutocompletion
  - typingsSlinky.reactAce.reactAceStrings.enableSnippets
*/
trait EditorOption extends js.Object

object EditorOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enableBasicAutocompletion: typingsSlinky.reactAce.reactAceStrings.enableBasicAutocompletion = this.cast("enableBasicAutocompletion")
  @scala.inline
  def enableLiveAutocompletion: typingsSlinky.reactAce.reactAceStrings.enableLiveAutocompletion = this.cast("enableLiveAutocompletion")
  @scala.inline
  def enableSnippets: typingsSlinky.reactAce.reactAceStrings.enableSnippets = this.cast("enableSnippets")
  @scala.inline
  def highlightActiveLine: typingsSlinky.reactAce.reactAceStrings.highlightActiveLine = this.cast("highlightActiveLine")
  @scala.inline
  def maxLines: typingsSlinky.reactAce.reactAceStrings.maxLines = this.cast("maxLines")
  @scala.inline
  def minLines: typingsSlinky.reactAce.reactAceStrings.minLines = this.cast("minLines")
  @scala.inline
  def readOnly: typingsSlinky.reactAce.reactAceStrings.readOnly = this.cast("readOnly")
  @scala.inline
  def tabSize: typingsSlinky.reactAce.reactAceStrings.tabSize = this.cast("tabSize")
}

