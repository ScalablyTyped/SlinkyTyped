package typingsSlinky.browserImageCompression.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-image-compression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(image: Blob, options: Options): js.Promise[File | Blob] = js.native
  def apply(image: File, options: Options): js.Promise[File | Blob] = js.native
}

