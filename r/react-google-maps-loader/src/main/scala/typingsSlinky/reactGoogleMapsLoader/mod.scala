package typingsSlinky.reactGoogleMapsLoader

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactGoogleMapsLoader.anon.Typeofgeometry
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  object ReactGoogleMapsLoader {
    
    @js.native
    trait GoogleMaps extends StObject {
      
      val Data: js.Any = js.native
      
      val Marker: js.Any = js.native
      
      val OverlayView: js.Any = js.native
      
      // TODO find source documentation
      val adsense: js.Any = js.native
      
      val drawing: js.Any = js.native
      
      val event: js.Any = js.native
      
      val geometry: Typeofgeometry = js.native
      
      val places: js.Any = js.native
      
      val visualization: js.Any = js.native
    }
    object GoogleMaps {
      
      @scala.inline
      def apply(
        Data: js.Any,
        Marker: js.Any,
        OverlayView: js.Any,
        adsense: js.Any,
        drawing: js.Any,
        event: js.Any,
        geometry: Typeofgeometry,
        places: js.Any,
        visualization: js.Any
      ): GoogleMaps = {
        val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
        __obj.asInstanceOf[GoogleMaps]
      }
      
      @scala.inline
      implicit class GoogleMapsMutableBuilder[Self <: GoogleMaps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdsense(value: js.Any): Self = StObject.set(x, "adsense", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawing(value: js.Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarker(value: js.Any): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlayView(value: js.Any): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaces(value: js.Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisualization(value: js.Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Params extends StObject {
      
      var key: String = js.native
      
      var libraries: js.UndefOr[String] = js.native
    }
    object Params {
      
      @scala.inline
      def apply(key: String): Params = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Params]
      }
      
      @scala.inline
      implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLibraries(value: String): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      var params: Params = js.native
      
      def render(googleMaps: GoogleMaps): ReactElement = js.native
      def render(googleMaps: GoogleMaps, error: String): ReactElement = js.native
    }
  }
  type ReactGoogleMapsLoader = ReactComponentClass[Props]
}
