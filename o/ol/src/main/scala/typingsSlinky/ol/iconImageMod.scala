package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImage", JSImport.Namespace)
@js.native
object iconImageMod extends js.Object {
  @js.native
  trait IconImage
    extends typingsSlinky.ol.targetMod.default {
    def getHitDetectionImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    def getImageState(): ImageState = js.native
    def getSize(): Size = js.native
    def getSrc(): String = js.native
    def load(): Unit = js.native
  }
  
  @js.native
  class default protected () extends IconImage {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  def get(
    image: typingsSlinky.std.HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
  def get(
    image: typingsSlinky.std.HTMLImageElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = js.native
}

