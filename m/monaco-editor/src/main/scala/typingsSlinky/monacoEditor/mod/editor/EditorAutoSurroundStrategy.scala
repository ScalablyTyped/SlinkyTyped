package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.monacoEditorStrings.languageDefined
  - typingsSlinky.monacoEditor.monacoEditorStrings.quotes
  - typingsSlinky.monacoEditor.monacoEditorStrings.brackets
  - typingsSlinky.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoSurroundStrategy extends js.Object

object EditorAutoSurroundStrategy {
  @scala.inline
  def brackets: typingsSlinky.monacoEditor.monacoEditorStrings.brackets = this.cast("brackets")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typingsSlinky.monacoEditor.monacoEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typingsSlinky.monacoEditor.monacoEditorStrings.never = this.cast("never")
  @scala.inline
  def quotes: typingsSlinky.monacoEditor.monacoEditorStrings.quotes = this.cast("quotes")
}

