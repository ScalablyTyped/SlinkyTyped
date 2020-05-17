package typingsSlinky.downscale.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.downscale.anon.DownscaleOptionsreturnBlo
import typingsSlinky.downscale.anon.DownscaleOptionsreturnBloImageType
import typingsSlinky.downscale.anon.DownscaleOptionsreturnCan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downscale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  def apply(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBlo): js.Promise[Blob] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBloImageType): js.Promise[String] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnCan): js.Promise[HTMLCanvasElement] = js.native
}

