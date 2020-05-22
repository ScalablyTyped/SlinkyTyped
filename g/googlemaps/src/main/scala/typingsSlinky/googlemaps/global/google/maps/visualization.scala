package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayerOptions
import typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization")
@js.native
object visualization extends js.Object {
  @js.native
  class HeatmapLayer ()
    extends typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayer {
    def this(opts: HeatmapLayerOptions) = this()
  }
  
  // TODO find source documentation
  @js.native
  class MapsEngineLayer protected ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayer {
    def this(options: MapsEngineLayerOptions) = this()
  }
  
  // TODO find source documentation
  @js.native
  class MapsEventListener ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MapsEventListener
  
  // TODO find source documentation
  @js.native
  class MouseEvent ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MouseEvent {
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  // TODO find source documentation
  @js.native
  object MapsEngineStatus extends js.Object {
    /* "INVALID_LAYER" */ val INVALID_LAYER: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER with String = js.native
    /* "OK" */ val OK: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.OK with String = js.native
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus with String] = js.native
  }
  
}

