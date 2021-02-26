package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportFile extends Base {
  
  def downloadFile(format: String, options: js.Object): Unit = js.native
  
  def exportAsBlob(format: String): Blob = js.native
  def exportAsBlob(format: String, options: js.Object): Blob = js.native
  
  def exportAsString(format: String): String = js.native
  def exportAsString(format: String, options: js.Object): String = js.native
}
