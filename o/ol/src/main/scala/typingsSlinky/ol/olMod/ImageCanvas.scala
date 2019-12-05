package typingsSlinky.ol.olMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageCanvasMod.Loader
import typingsSlinky.ol.imageCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageCanvas")
@js.native
class ImageCanvas protected () extends default {
  def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    canvas: HTMLCanvasElement,
    opt_loader: Loader
  ) = this()
}

