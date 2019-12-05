package typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.imagebase.progressReporter")
@js.native
class progressReporter () extends js.Object {
  def this(wrapperHtml: String) = this()
  var wrapper: element = js.native
  def aborted(): Unit = js.native
  def bindLoader(loader: fileLoader): Unit = js.native
  def done(): Unit = js.native
  def failed(): Unit = js.native
  def remove(): Unit = js.native
  def updated(progress: Double): Unit = js.native
}

