package typingsSlinky.browserImageCompression.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browser-image-compression", "canvasToFile")
@js.native
object canvasToFile extends js.Object {
  
  def apply(canvas: HTMLCanvasElement, fileType: String, fileName: String, fileLastModified: Double): js.Promise[File | Blob] = js.native
  def apply(
    canvas: HTMLCanvasElement,
    fileType: String,
    fileName: String,
    fileLastModified: Double,
    quality: Double
  ): js.Promise[File | Blob] = js.native
}
