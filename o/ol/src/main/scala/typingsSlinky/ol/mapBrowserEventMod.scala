package typingsSlinky.ol

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEvent", JSImport.Namespace)
@js.native
object mapBrowserEventMod extends js.Object {
  @js.native
  trait MapBrowserEvent
    extends typingsSlinky.ol.mapEventMod.default {
    var coordinate: Coordinate = js.native
    var dragging: Boolean = js.native
    var originalEvent: Event = js.native
    var pixel: Pixel = js.native
  }
  
  @js.native
  class default protected () extends MapBrowserEvent {
    def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, browserEvent: Event) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      browserEvent: Event,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      browserEvent: Event,
      opt_dragging: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typingsSlinky.ol.pluggableMapMod.default,
      browserEvent: Event,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
  }
  
}

