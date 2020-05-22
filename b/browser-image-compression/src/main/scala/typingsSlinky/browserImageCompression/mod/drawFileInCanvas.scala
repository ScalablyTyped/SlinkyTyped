package typingsSlinky.browserImageCompression.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-image-compression", "drawFileInCanvas")
@js.native
object drawFileInCanvas extends js.Object {
  def apply(file: Blob): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
  def apply(file: File): js.Promise[js.Tuple2[ImageBitmap | HTMLImageElement, HTMLCanvasElement]] = js.native
}

