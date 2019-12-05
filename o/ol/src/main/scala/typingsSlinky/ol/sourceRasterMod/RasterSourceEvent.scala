package typingsSlinky.ol.sourceRasterMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Raster", "RasterSourceEvent")
@js.native
class RasterSourceEvent protected ()
  extends typingsSlinky.ol.eventsEventMod.default {
  def this(`type`: String, frameState: FrameState, data: js.Any) = this()
  var data: js.Any = js.native
  var extent: Extent = js.native
  var resolution: Double = js.native
}

