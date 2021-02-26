package typingsSlinky.leafletGeocoderMapzen

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.MarkerOptions
import typingsSlinky.leafletGeocoderMapzen.mod.Control_.Geocoder
import typingsSlinky.leafletGeocoderMapzen.mod.Control_.GeocoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object control {
    
    /**
      * Creates a geocoder control.
      */
    @JSImport("leaflet", "control.geocoder")
    @js.native
    def geocoder(api_key: String): Geocoder = js.native
    @JSImport("leaflet", "control.geocoder")
    @js.native
    def geocoder(api_key: String, options: GeocoderOptions): Geocoder = js.native
  }
  
  object Control_ {
    
    // tslint:disable-next-line:no-empty-interface
    type Geocoder = typingsSlinky.leaflet.mod.Control_
    
    @js.native
    trait GeocoderOptions extends StObject {
      
      /**
        * Attribution text to include.
        * Set to blank or null to disable.
        *
        * Default value: 'Geocoding by <a href="https://mapzen.com/projects/search/">Mapzen</a>'
        */
      var attribution: js.UndefOr[String] = js.native
      
      /**
        * If true, suggested results are fetched on each keystroke.
        * If false, this is disabled and users must obtain results
        * by pressing the Enter key after typing in their query.
        *
        * Default value: true
        */
      var autocomplete: js.UndefOr[Boolean] = js.native
      
      /**
        * If true, search is bounded by the current map view.
        * You may also provide a custom bounding box in form of a LatLngBounds object.
        * Note: bounds is not supported by autocomplete.
        *
        * Default value: false.
        */
      var bounds: js.UndefOr[LatLngBounds_ | Boolean] = js.native
      
      /**
        * If true, the search input is always expanded.
        * It does not collapse into a button-only state.
        *
        * Default value: false
        */
      var expanded: js.UndefOr[Boolean] = js.native
      
      /**
        * If true, search and autocomplete prioritizes results near the center
        * of the current view.
        * You may also provide a custom LatLng value
        * (in any of the accepted Leaflet formats) to act as the center bias.
        *
        * Default value: 'true'.
        */
      var focus: js.UndefOr[LatLng_ | Boolean] = js.native
      
      /**
        * If true, the input box will expand to take up the full width of the map container.
        * If an integer breakpoint is provided,
        * the full width applies only if the map container width is below this breakpoint.
        *
        * Default value: 650
        */
      var fullWidth: js.UndefOr[Double | Boolean] = js.native
      
      /**
        * Filters results by layers (documentation).
        * If left blank, results will come from all available layers.
        *
        * Default value: null.
        */
      var layers: js.UndefOr[String | js.Array[_]] = js.native
      
      /**
        * If true, search results drops Leaflet's default blue markers onto the map.
        * You may customize this marker's appearance and
        * behavior using Leaflet marker options.
        *
        * Default value: true
        */
      var markers: js.UndefOr[MarkerOptions | Boolean] = js.native
      
      /**
        * If true, highlighting a search result pans the map to that location.
        *
        * Default value: true
        */
      var panToPoint: js.UndefOr[Boolean] = js.native
      
      /**
        * An object of key-value pairs which will be serialized
        * into query parameters that will be passed to the API.
        * This allows custom queries that are not already supported
        * by the convenience options listed above.
        * For a full list of supported parameters,
        * please read the Mapzen Search documentation.
        *
        * IMPORTANT: some parameters only work with the /search endpoint,
        * and do not apply to /autocomplete requests!
        * All supplied parameters are passed through;
        * this library doesn't know which are valid parameters and which are not.
        * In the event that other options conflict with parameters passed through params,
        * the params option takes precedence.
        *
        * Default value: null.
        */
      var params: js.UndefOr[js.Object] = js.native
      
      /**
        * If true, selected results will make a request to the service /place endpoint.
        * If false, this is disabled.
        * The geocoder does not handle responses to /place,
        * you will need to do handle it yourself in the results event listener (see below).
        *
        * Default value: false
        */
      var place: js.UndefOr[Boolean] = js.native
      
      /**
        * Placeholder text to display in the search input box.
        * Set to blank or null to disable.
        *
        * Default value: 'Search'
        */
      var placeholder: js.UndefOr[String] = js.native
      
      /**
        * If true, an icon is used to indicate a polygonal result,
        * matching any non-"venue" or non-"address" layer type.
        * If false, no icon is displayed.
        * For custom icons, pass a string containing a path to the image.
        *
        * Default value: true
        */
      var polygonIcon: js.UndefOr[Boolean | String] = js.native
      
      /**
        * The position of the control (one of the map corners).
        * Can be 'topleft', 'topright', 'bottomleft', or 'bottomright'.
        *
        * Default value: 'topleft'.
        */
      var position: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionString */ js.Any
          ] = js.native
      
      /**
        * Tooltip text to display on the search icon. Set to blank or null to disable.
        *
        * Default value: 'Search'
        */
      var title: js.UndefOr[String] = js.native
      
      /**
        * Host endpoint for a Pelias-compatible search API.
        *
        * Default value: 'https://search.mapzen.com/v1'.
        */
      var url: js.UndefOr[String] = js.native
    }
    object GeocoderOptions {
      
      @scala.inline
      def apply(): GeocoderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeocoderOptions]
      }
      
      @scala.inline
      implicit class GeocoderOptionsMutableBuilder[Self <: GeocoderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
        
        @scala.inline
        def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
        
        @scala.inline
        def setBounds(value: LatLngBounds_ | Boolean): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        @scala.inline
        def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
        
        @scala.inline
        def setFocus(value: LatLng_ | Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
        
        @scala.inline
        def setFullWidth(value: Double | Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
        
        @scala.inline
        def setLayers(value: String | js.Array[_]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
        
        @scala.inline
        def setLayersVarargs(value: js.Any*): Self = StObject.set(x, "layers", js.Array(value :_*))
        
        @scala.inline
        def setMarkers(value: MarkerOptions | Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
        
        @scala.inline
        def setPanToPoint(value: Boolean): Self = StObject.set(x, "panToPoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanToPointUndefined: Self = StObject.set(x, "panToPoint", js.undefined)
        
        @scala.inline
        def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setPlace(value: Boolean): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setPolygonIcon(value: Boolean | String): Self = StObject.set(x, "polygonIcon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygonIconUndefined: Self = StObject.set(x, "polygonIcon", js.undefined)
        
        @scala.inline
        def setPosition(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionString */ js.Any
        ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassStatic * / any */ @js.native
    trait GeocoderStatic
      extends /**
      * Creates a geocoder control.
      */
    Instantiable0[Geocoder]
         with Instantiable1[/* options */ GeocoderOptions, Geocoder]
  }
}
