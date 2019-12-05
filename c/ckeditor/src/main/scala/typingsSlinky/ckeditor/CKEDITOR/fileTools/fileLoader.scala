package typingsSlinky.ckeditor.CKEDITOR.fileTools

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FileReader
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools.fileLoader")
@js.native
class fileLoader protected () extends event {
  def this(editor: editor, fileOrData: String) = this()
  def this(editor: editor, fileOrData: Blob) = this()
  def this(editor: editor, fileOrData: String, fileName: String) = this()
  def this(editor: editor, fileOrData: Blob, fileName: String) = this()
  val data: String = js.native
  val file: Blob = js.native
  val fileName: String = js.native
  val id: Double = js.native
  val loaded: Double = js.native
  val message: String = js.native
  val reader: FileReader = js.native
  val responseData: js.Any = js.native
  var status: String = js.native
  val total: Double = js.native
  val uploadTotal: Double = js.native
  val uploadUrl: String = js.native
  val uploaded: String = js.native
  val url: String = js.native
  val xhr: XMLHttpRequest = js.native
  def abort(): Unit = js.native
  def isFinished(): Boolean = js.native
  def load(): Unit = js.native
  def loadAndUpload(url: String): Unit = js.native
  def loadAndUpload(url: String, additionalRequestParameters: js.Any): Unit = js.native
  def update(): Unit = js.native
  def upload(url: String): Unit = js.native
  def upload(url: String, additionalRequestParameters: js.Any): Unit = js.native
}

