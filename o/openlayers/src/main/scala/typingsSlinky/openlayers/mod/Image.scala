package typingsSlinky.openlayers.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "Image")
@js.native
class Image protected () extends ImageBase {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param attributions Attributions.
    * @param src Image source URI.
    * @param crossOrigin Cross origin.
    * @param imageLoadFunction Image load function.
    */
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[Attribution],
    src: String
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[Attribution],
    src: String,
    crossOrigin: String
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[Attribution],
    src: String,
    crossOrigin: js.UndefOr[scala.Nothing],
    imageLoadFunction: ImageLoadFunctionType
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[Attribution],
    src: String,
    crossOrigin: String,
    imageLoadFunction: ImageLoadFunctionType
  ) = this()
  
  /**
    * Get the HTML image element (may be a Canvas, Image, or Video).
    * @param opt_context Object.
    * @return Image.
    * @api
    */
  def getImage(): HTMLCanvasElement | Image | HTMLVideoElement = js.native
  def getImage(opt_context: GlobalObject): HTMLCanvasElement | Image | HTMLVideoElement = js.native
  
  /**
    * Load the image or retry if loading previously failed.
    * Loading is taken care of by the tile queue, and calling this method is
    * only needed for preloading or for reloading in case of an error.
    * @api
    */
  def load(): Unit = js.native
}
