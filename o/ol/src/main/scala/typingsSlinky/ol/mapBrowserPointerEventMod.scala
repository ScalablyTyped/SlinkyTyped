package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserPointerEvent", JSImport.Namespace)
@js.native
object mapBrowserPointerEventMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.mapBrowserEventMod.default {
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
  
  type MapBrowserPointerEvent = typingsSlinky.ol.mapBrowserEventMod.default
}

