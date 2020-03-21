package typingsSlinky.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsoneditor.jsoneditorStrings.tree
  - typingsSlinky.jsoneditor.jsoneditorStrings.view
  - typingsSlinky.jsoneditor.jsoneditorStrings.form
  - typingsSlinky.jsoneditor.jsoneditorStrings.code
  - typingsSlinky.jsoneditor.jsoneditorStrings.text
*/
trait JSONEditorMode extends js.Object

object JSONEditorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsSlinky.jsoneditor.jsoneditorStrings.code = this.cast("code")
  @scala.inline
  def form: typingsSlinky.jsoneditor.jsoneditorStrings.form = this.cast("form")
  @scala.inline
  def text: typingsSlinky.jsoneditor.jsoneditorStrings.text = this.cast("text")
  @scala.inline
  def tree: typingsSlinky.jsoneditor.jsoneditorStrings.tree = this.cast("tree")
  @scala.inline
  def view: typingsSlinky.jsoneditor.jsoneditorStrings.view = this.cast("view")
}

