package typingsSlinky.ol.mod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.imageBaseMod.default
import typingsSlinky.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "ImageBase")
@js.native
abstract class ImageBase protected () extends default {
  def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
  def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
}
