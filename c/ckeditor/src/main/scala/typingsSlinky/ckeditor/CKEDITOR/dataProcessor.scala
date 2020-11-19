package typingsSlinky.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataProcessor extends js.Object {
  
  def toDataFormat(html: String, fixForBody: String): Unit = js.native
  
  def toHtml(data: String): Unit = js.native
  def toHtml(data: String, fixForBody: String): Unit = js.native
}
