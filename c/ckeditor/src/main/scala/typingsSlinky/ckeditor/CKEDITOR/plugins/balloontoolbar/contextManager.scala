package typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar

import typingsSlinky.ckeditor.CKEDITOR.dom.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait contextManager extends js.Object {
  var editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  def add(context: context): Unit = js.native
  def check(): Unit = js.native
  def check(selection: selection): Unit = js.native
  def create(options: contextDefinition): context = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
}

