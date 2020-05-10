package typingsSlinky.googleMaps

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

@js.native
trait Typeofvisualization extends js.Object {
  var HeatmapLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.HeatmapLayer] = js.native
  var MapsEngineLayer: Instantiable1[
    /* options */ MapsEngineLayerOptions, 
    typingsSlinky.googlemaps.google.maps.visualization.MapsEngineLayer
  ] = js.native
  var MapsEventListener: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.MapsEventListener] = js.native
  var MouseEvent: Instantiable0[typingsSlinky.googlemaps.google.maps.visualization.MouseEvent] = js.native
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
  @scala.inline
  implicit class TypeofvisualizationOps[Self <: Typeofvisualization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeatmapLayer(value: Instantiable0[HeatmapLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeatmapLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapsEngineLayer(value: Instantiable1[/* options */ MapsEngineLayerOptions, MapsEngineLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapsEngineLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapsEventListener(value: Instantiable0[MapsEventListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapsEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEvent(value: Instantiable0[MouseEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

