package typingsSlinky.ol.olMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageMod.LoadFunction
import typingsSlinky.ol.imageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Image")
@js.native
class Image protected () extends default {
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

