package typingsSlinky.browserImageCompression.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", "getFilefromDataUrl")
@js.native
object getFilefromDataUrl extends js.Object {
  
  def apply(dataUrl: String, filename: String): js.Promise[File | Blob] = js.native
  def apply(dataUrl: String, filename: String, lastModified: Double): js.Promise[File | Blob] = js.native
}
