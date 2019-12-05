package typingsSlinky.ol.olMod

import typingsSlinky.ol.mapBrowserPointerEventMod.default
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserPointerEvent")
@js.native
class MapBrowserPointerEvent protected () extends default {
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    pointerEvent: typingsSlinky.ol.pointerPointerEventMod.default
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    pointerEvent: typingsSlinky.ol.pointerPointerEventMod.default,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    pointerEvent: typingsSlinky.ol.pointerPointerEventMod.default,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

