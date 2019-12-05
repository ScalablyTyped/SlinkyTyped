package typingsSlinky.ol.olMod

import typingsSlinky.ol.mapEventMod.default
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapEvent")
@js.native
class MapEvent protected () extends default {
  def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default) = this()
  def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
}

