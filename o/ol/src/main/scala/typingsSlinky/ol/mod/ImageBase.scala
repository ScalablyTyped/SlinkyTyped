package typingsSlinky.ol.mod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageBaseMod.default
import typingsSlinky.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageBase")
@js.native
abstract class ImageBase protected () extends default {
  def this(extent: Extent, resolution: js.UndefOr[Double], pixelRatio: Double, state: ImageState) = this()
}

