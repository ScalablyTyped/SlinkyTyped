package typingsSlinky.pdfobject.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFObject extends js.Object {
  
  def embed(url: String): HTMLElement = js.native
  def embed(url: String, target: js.UndefOr[scala.Nothing], options: js.Any): HTMLElement = js.native
  def embed(url: String, target: js.Any): HTMLElement = js.native
  def embed(url: String, target: js.Any, options: js.Any): HTMLElement = js.native
  
  var pdfobjectversion: String = js.native
  
  var supportsPDFs: Boolean = js.native
}
