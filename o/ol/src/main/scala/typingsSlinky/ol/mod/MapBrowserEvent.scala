package typingsSlinky.ol.mod

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.mapBrowserEventMod.default
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "MapBrowserEvent")
@js.native
class MapBrowserEvent[EVENT /* <: UIEvent */] protected () extends default[EVENT] {
  def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, originalEvent: EVENT) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    originalEvent: EVENT,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    originalEvent: EVENT,
    opt_dragging: js.UndefOr[scala.Nothing],
    opt_frameState: FrameState
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    originalEvent: EVENT,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}
