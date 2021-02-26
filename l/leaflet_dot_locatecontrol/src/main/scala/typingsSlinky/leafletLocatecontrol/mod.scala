package typingsSlinky.leafletLocatecontrol

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.mod.ControlOptions
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.Map_
import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leaflet.mod.PathOptions
import typingsSlinky.leafletLocatecontrol.mod.Control_.Locate
import typingsSlinky.leafletLocatecontrol.mod.Control_.LocateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Locate")
    @js.native
    class Locate ()
      extends typingsSlinky.leaflet.mod.Control_ {
      def this(options: ControlOptions) = this()
      
      @JSName("onAdd")
      def onAdd_MLocate(map: Map_): HTMLElement = js.native
      
      def setView(): Unit = js.native
      
      def start(): Unit = js.native
      
      def stop(): Unit = js.native
    }
    
    @js.native
    trait LocateOptions extends StObject {
      
      var cacheLocation: js.UndefOr[Boolean] = js.native
      
      var circlePadding: js.UndefOr[js.Array[Double]] = js.native
      
      var circleStyle: js.UndefOr[PathOptions] = js.native
      
      var clickBehavior: js.UndefOr[js.Any] = js.native
      
      var drawCircle: js.UndefOr[Boolean] = js.native
      
      var drawMarker: js.UndefOr[Boolean] = js.native
      
      var flyTo: js.UndefOr[Boolean] = js.native
      
      var followCircleStyle: js.UndefOr[PathOptions] = js.native
      
      var followMarkerStyle: js.UndefOr[PathOptions] = js.native
      
      var icon: js.UndefOr[String] = js.native
      
      var iconElementTag: js.UndefOr[String] = js.native
      
      var iconLoading: js.UndefOr[String] = js.native
      
      var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.native
      
      var layer: js.UndefOr[Layer] = js.native
      
      var locateOptions: js.UndefOr[typingsSlinky.leaflet.mod.LocateOptions] = js.native
      
      var markerClass: js.UndefOr[js.Any] = js.native
      
      var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.native
      
      var onLocationError: js.UndefOr[js.Any] = js.native
      
      var onLocationOutsideMapBounds: js.UndefOr[js.Any] = js.native
      
      var position: js.UndefOr[String] = js.native
      
      var returnToPrevBounds: js.UndefOr[Boolean] = js.native
      
      var setView: js.UndefOr[Boolean | String] = js.native
      
      var showPopup: js.UndefOr[Boolean] = js.native
      
      var strings: js.UndefOr[js.Any] = js.native
    }
    object LocateOptions {
      
      @scala.inline
      def apply(): LocateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocateOptions]
      }
      
      @scala.inline
      implicit class LocateOptionsMutableBuilder[Self <: LocateOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCacheLocation(value: Boolean): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
        
        @scala.inline
        def setCirclePadding(value: js.Array[Double]): Self = StObject.set(x, "circlePadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCirclePaddingUndefined: Self = StObject.set(x, "circlePadding", js.undefined)
        
        @scala.inline
        def setCirclePaddingVarargs(value: Double*): Self = StObject.set(x, "circlePadding", js.Array(value :_*))
        
        @scala.inline
        def setCircleStyle(value: PathOptions): Self = StObject.set(x, "circleStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircleStyleUndefined: Self = StObject.set(x, "circleStyle", js.undefined)
        
        @scala.inline
        def setClickBehavior(value: js.Any): Self = StObject.set(x, "clickBehavior", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClickBehaviorUndefined: Self = StObject.set(x, "clickBehavior", js.undefined)
        
        @scala.inline
        def setDrawCircle(value: Boolean): Self = StObject.set(x, "drawCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawCircleUndefined: Self = StObject.set(x, "drawCircle", js.undefined)
        
        @scala.inline
        def setDrawMarker(value: Boolean): Self = StObject.set(x, "drawMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDrawMarkerUndefined: Self = StObject.set(x, "drawMarker", js.undefined)
        
        @scala.inline
        def setFlyTo(value: Boolean): Self = StObject.set(x, "flyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlyToUndefined: Self = StObject.set(x, "flyTo", js.undefined)
        
        @scala.inline
        def setFollowCircleStyle(value: PathOptions): Self = StObject.set(x, "followCircleStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowCircleStyleUndefined: Self = StObject.set(x, "followCircleStyle", js.undefined)
        
        @scala.inline
        def setFollowMarkerStyle(value: PathOptions): Self = StObject.set(x, "followMarkerStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowMarkerStyleUndefined: Self = StObject.set(x, "followMarkerStyle", js.undefined)
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconElementTag(value: String): Self = StObject.set(x, "iconElementTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconElementTagUndefined: Self = StObject.set(x, "iconElementTag", js.undefined)
        
        @scala.inline
        def setIconLoading(value: String): Self = StObject.set(x, "iconLoading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLoadingUndefined: Self = StObject.set(x, "iconLoading", js.undefined)
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setKeepCurrentZoomLevel(value: Boolean): Self = StObject.set(x, "keepCurrentZoomLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepCurrentZoomLevelUndefined: Self = StObject.set(x, "keepCurrentZoomLevel", js.undefined)
        
        @scala.inline
        def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
        
        @scala.inline
        def setLocateOptions(value: typingsSlinky.leaflet.mod.LocateOptions): Self = StObject.set(x, "locateOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocateOptionsUndefined: Self = StObject.set(x, "locateOptions", js.undefined)
        
        @scala.inline
        def setMarkerClass(value: js.Any): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
        
        @scala.inline
        def setMarkerStyle(value: PathOptions | MarkerOptions): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
        
        @scala.inline
        def setOnLocationError(value: js.Any): Self = StObject.set(x, "onLocationError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLocationErrorUndefined: Self = StObject.set(x, "onLocationError", js.undefined)
        
        @scala.inline
        def setOnLocationOutsideMapBounds(value: js.Any): Self = StObject.set(x, "onLocationOutsideMapBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLocationOutsideMapBoundsUndefined: Self = StObject.set(x, "onLocationOutsideMapBounds", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setReturnToPrevBounds(value: Boolean): Self = StObject.set(x, "returnToPrevBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnToPrevBoundsUndefined: Self = StObject.set(x, "returnToPrevBounds", js.undefined)
        
        @scala.inline
        def setSetView(value: Boolean | String): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
        
        @scala.inline
        def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
        
        @scala.inline
        def setStrings(value: js.Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      }
    }
  }
  
  object control {
    
    /**
      * Creates a Leaflet.Locate control
      */
    @JSImport("leaflet", "control.locate")
    @js.native
    def locate(): Locate = js.native
    @JSImport("leaflet", "control.locate")
    @js.native
    def locate(options: LocateOptions): Locate = js.native
  }
}
