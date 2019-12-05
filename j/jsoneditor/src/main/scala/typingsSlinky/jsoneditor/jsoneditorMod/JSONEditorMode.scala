package typingsSlinky.jsoneditor.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.tree
  - typings.jsoneditor.jsoneditorStrings.view
  - typings.jsoneditor.jsoneditorStrings.form
  - typings.jsoneditor.jsoneditorStrings.code
  - typings.jsoneditor.jsoneditorStrings.text
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

