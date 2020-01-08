package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import typingsSlinky.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  @js.native
  trait ImageWrapper
    extends typingsSlinky.ol.imageBaseMod.default {
    def setImage(image: HTMLCanvasElement): Unit = js.native
    def setImage(image: HTMLImageElement): Unit = js.native
    def setImage(image: HTMLVideoElement): Unit = js.native
  }
  
  @js.native
  class default protected () extends ImageWrapper {
    def this(
      extent: Extent,
      resolution: js.UndefOr[scala.Nothing],
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  type LoadFunction = js.Function2[/* p0 */ ImageWrapper, /* p1 */ String, Unit]
}

