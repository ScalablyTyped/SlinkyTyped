package typingsSlinky.reactGeosuggest

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayer
import typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayer
import typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayerOptions
import typingsSlinky.googlemaps.google.maps.visualization.MapsEventListener
import typingsSlinky.googlemaps.google.maps.visualization.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofvisualization extends js.Object {
  var HeatmapLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayer]
  var MapsEngineLayer: Instantiable1[
    /* options */ MapsEngineLayerOptions, 
    typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayer
  ]
  var MapsEventListener: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.MapsEventListener]
  var MouseEvent: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.MouseEvent]
}

object Typeofvisualization {
  @scala.inline
  def apply(
    HeatmapLayer: Instantiable0[HeatmapLayer],
    MapsEngineLayer: Instantiable1[/* options */ MapsEngineLayerOptions, MapsEngineLayer],
    MapsEventListener: Instantiable0[MapsEventListener],
    MouseEvent: Instantiable0[MouseEvent]
  ): Typeofvisualization = {
    val __obj = js.Dynamic.literal(HeatmapLayer = HeatmapLayer.asInstanceOf[js.Any], MapsEngineLayer = MapsEngineLayer.asInstanceOf[js.Any], MapsEventListener = MapsEventListener.asInstanceOf[js.Any], MouseEvent = MouseEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofvisualization]
  }
}

