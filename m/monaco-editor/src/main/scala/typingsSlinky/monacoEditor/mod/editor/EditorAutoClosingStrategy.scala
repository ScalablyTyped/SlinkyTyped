package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.monacoEditorStrings.always
  - typingsSlinky.monacoEditor.monacoEditorStrings.languageDefined
  - typingsSlinky.monacoEditor.monacoEditorStrings.beforeWhitespace
  - typingsSlinky.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoClosingStrategy extends js.Object

object EditorAutoClosingStrategy {
  @scala.inline
  def always: typingsSlinky.monacoEditor.monacoEditorStrings.always = this.cast("always")
  @scala.inline
  def beforeWhitespace: typingsSlinky.monacoEditor.monacoEditorStrings.beforeWhitespace = this.cast("beforeWhitespace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typingsSlinky.monacoEditor.monacoEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typingsSlinky.monacoEditor.monacoEditorStrings.never = this.cast("never")
}

