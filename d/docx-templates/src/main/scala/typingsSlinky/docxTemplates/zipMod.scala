package typingsSlinky.docxTemplates

import typingsSlinky.jszip.mod.JSZip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docx-templates/lib/zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  
  def zipGetText(zip: JSZip, filename: String): js.Promise[String] | Null = js.native
  
  def zipLoad(inputFile: js.typedarray.ArrayBuffer): js.Promise[JSZip] = js.native
  
  def zipSave(zip: JSZip): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def zipSetBase64(zip: JSZip, filename: String, data: String): JSZip = js.native
  
  def zipSetBinary(zip: JSZip, filename: String, data: js.typedarray.ArrayBuffer): JSZip = js.native
  
  def zipSetText(zip: JSZip, filename: String, data: String): JSZip = js.native
}
