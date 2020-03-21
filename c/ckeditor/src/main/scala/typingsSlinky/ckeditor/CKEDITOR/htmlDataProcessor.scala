package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.AnonContext
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.basicWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlDataProcessor")
@js.native
class htmlDataProcessor protected () extends dataProcessor {
  def this(editor: editor) = this()
  var dataFilter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var htmlFilter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var writer: basicWriter = js.native
  def toDataFormat(html: String): String = js.native
  def toDataFormat(html: String, options: AnonContext): String = js.native
  def toHtml(data: String, options: htmlDataProcessorOptions): String = js.native
}

