package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayerOptions
import typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @JSGlobal("google.maps.visualization.HeatmapLayer")
  @js.native
  class HeatmapLayer ()
    extends typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayer {
    def this(opts: HeatmapLayerOptions) = this()
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineLayer")
  @js.native
  class MapsEngineLayer protected ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayer {
    def this(options: MapsEngineLayerOptions) = this()
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEngineStatus")
  @js.native
  object MapsEngineStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus with String] = js.native
    
    /* "INVALID_LAYER" */ val INVALID_LAYER: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER with String = js.native
    
    /* "OK" */ val OK: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.OK with String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typingsSlinky.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR with String = js.native
  }
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MapsEventListener")
  @js.native
  class MapsEventListener ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MapsEventListener
  
  // TODO find source documentation
  @JSGlobal("google.maps.visualization.MouseEvent")
  @js.native
  class MouseEvent ()
    extends typingsSlinky.googlemaps.google.maps.visualization.MouseEvent
}
