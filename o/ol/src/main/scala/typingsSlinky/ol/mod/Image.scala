package typingsSlinky.ol.mod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olImageMod.LoadFunction
import typingsSlinky.ol.olImageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
