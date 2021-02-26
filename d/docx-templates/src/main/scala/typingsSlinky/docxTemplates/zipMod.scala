package typingsSlinky.docxTemplates

import typingsSlinky.jszip.mod.JSZip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipMod {
  
  @JSImport("docx-templates/lib/zip", "zipGetText")
  @js.native
  def zipGetText(zip: JSZip, filename: String): js.Promise[String] | Null = js.native
  
  @JSImport("docx-templates/lib/zip", "zipLoad")
  @js.native
  def zipLoad(inputFile: js.typedarray.ArrayBuffer): js.Promise[JSZip] = js.native
  
  @JSImport("docx-templates/lib/zip", "zipSave")
  @js.native
  def zipSave(zip: JSZip): js.Promise[js.typedarray.Uint8Array] = js.native
  
  @JSImport("docx-templates/lib/zip", "zipSetBase64")
  @js.native
  def zipSetBase64(zip: JSZip, filename: String, data: String): JSZip = js.native
  
  @JSImport("docx-templates/lib/zip", "zipSetBinary")
  @js.native
  def zipSetBinary(zip: JSZip, filename: String, data: js.typedarray.ArrayBuffer): JSZip = js.native
  
  @JSImport("docx-templates/lib/zip", "zipSetText")
  @js.native
  def zipSetText(zip: JSZip, filename: String, data: String): JSZip = js.native
}
