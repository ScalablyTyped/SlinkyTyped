package typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.ui.balloonToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait context extends js.Object {
  var editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  var options: contextDefinition = js.native
  var toolbar: balloonToolbar = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(): Unit = js.native
  def show(pointedElement: element): Unit = js.native
}

