package typingsSlinky.ckeditor.CKEDITOR.fileTools

import org.scalajs.dom.raw.Blob
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools.uploadRepository")
@js.native
class uploadRepository protected () extends event {
  def this(editor: editor) = this()
  val loaders: js.Array[fileLoader] = js.native
  def create(fileOrData: String, fileName: String): fileLoader = js.native
  def create(fileOrData: String, fileName: String, loaderType: js.Any): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String, loaderType: js.Any): fileLoader = js.native
  def isFinished(): Boolean = js.native
}

