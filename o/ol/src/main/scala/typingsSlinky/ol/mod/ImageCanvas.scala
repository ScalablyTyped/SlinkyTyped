package typingsSlinky.ol.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olImageCanvasMod.Loader
import typingsSlinky.ol.olImageCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
