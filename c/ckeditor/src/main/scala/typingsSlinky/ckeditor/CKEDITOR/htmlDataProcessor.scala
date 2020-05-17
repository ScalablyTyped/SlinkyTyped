package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.htmlParser.basicWriter
import typingsSlinky.ckeditor.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait htmlDataProcessor extends dataProcessor {
  var dataFilter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var htmlFilter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var writer: basicWriter = js.native
  def toDataFormat(html: String): String = js.native
  def toDataFormat(html: String, options: Context): String = js.native
  def toHtml(data: String, options: htmlDataProcessorOptions): String = js.native
}

