package typingsSlinky.googleMapsReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import typingsSlinky.googleMapsReact.anon.Typeofgoogle
import typingsSlinky.googleMapsReact.anon.Typeofmaps
import typingsSlinky.googlemaps.google.maps.Animation
import typingsSlinky.googlemaps.google.maps.Icon
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.MapOptions
import typingsSlinky.googlemaps.google.maps.MarkerLabel
import typingsSlinky.googlemaps.google.maps.MarkerShape
import typingsSlinky.googlemaps.google.maps.Point
import typingsSlinky.googlemaps.google.maps.Size
import typingsSlinky.googlemaps.google.maps.StreetViewPanorama
import typingsSlinky.googlemaps.google.maps.Symbol
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-maps-react", "Circle")
  @js.native
  class Circle protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "GoogleApiWrapper")
  @js.native
  def GoogleApiWrapper(opts: GoogleApiOptionsFunc): js.Function1[
    /* ctor */ ReactComponentClass[IProvidedProps], 
    ReactComponentClass[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
  @JSImport("google-maps-react", "GoogleApiWrapper")
  @js.native
  def GoogleApiWrapper(opts: IGoogleApiOptions): js.Function1[
    /* ctor */ ReactComponentClass[IProvidedProps], 
    ReactComponentClass[Omit[IProvidedProps, IProvidedProps]]
  ] = js.native
  
  @JSImport("google-maps-react", "InfoWindow")
  @js.native
  class InfoWindow protected ()
    extends Component[IInfoWindowProps, js.Any, js.Any] {
    def this(props: IInfoWindowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IInfoWindowProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Map")
  @js.native
  class Map protected ()
    extends Component[IMapProps, js.Any, js.Any] {
    def this(props: IMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IMapProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Marker")
  @js.native
  class Marker protected ()
    extends Component[IMarkerProps, js.Any, js.Any] {
    def this(props: IMarkerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IMarkerProps, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Polygon")
  @js.native
  class Polygon protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("google-maps-react", "Polyline")
  @js.native
  class Polyline protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  trait GoogleAPI extends StObject {
    
    val maps: Typeofmaps = js.native
  }
  object GoogleAPI {
    
    @scala.inline
    def apply(maps: Typeofmaps): GoogleAPI = {
      val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleAPI]
    }
    
    @scala.inline
    implicit class GoogleAPIMutableBuilder[Self <: GoogleAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaps(value: Typeofmaps): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    }
  }
  
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, IGoogleApiOptions]
  
  @js.native
  trait IGoogleApiOptions extends StObject {
    
    var LoadingContainer: js.UndefOr[js.Any] = js.native
    
    var apiKey: String = js.native
    
    var client: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var libraries: js.UndefOr[js.Array[String]] = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object IGoogleApiOptions {
    
    @scala.inline
    def apply(apiKey: String): IGoogleApiOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGoogleApiOptions]
    }
    
    @scala.inline
    implicit class IGoogleApiOptionsMutableBuilder[Self <: IGoogleApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
      
      @scala.inline
      def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value :_*))
      
      @scala.inline
      def setLoadingContainer(value: js.Any): Self = StObject.set(x, "LoadingContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingContainerUndefined: Self = StObject.set(x, "LoadingContainer", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<googlemaps.google.maps.InfoWindowOptions> */
  @js.native
  trait IInfoWindowProps extends StObject {
    
    var content: js.UndefOr[String | Node] = js.native
    
    var disableAutoPan: js.UndefOr[Boolean] = js.native
    
    var google: Typeofgoogle = js.native
    
    var map: typingsSlinky.googlemaps.google.maps.Map[Element] = js.native
    
    var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.native
    
    var marker: typingsSlinky.googlemaps.google.maps.Marker = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var pixelOffset: js.UndefOr[Size] = js.native
    
    var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object IInfoWindowProps {
    
    @scala.inline
    def apply(
      google: Typeofgoogle,
      map: typingsSlinky.googlemaps.google.maps.Map[Element],
      marker: typingsSlinky.googlemaps.google.maps.Marker
    ): IInfoWindowProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfoWindowProps]
    }
    
    @scala.inline
    implicit class IInfoWindowPropsMutableBuilder[Self <: IInfoWindowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNode(value: Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
      
      @scala.inline
      def setGoogle(value: Typeofgoogle): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: typingsSlinky.googlemaps.google.maps.Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      @scala.inline
      def setMarker(value: typingsSlinky.googlemaps.google.maps.Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
      
      @scala.inline
      def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait IMapProps extends MapOptions {
    
    var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
    
    var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.native
    
    @JSName("center")
    var center_IMapProps: js.UndefOr[LatLngLiteral] = js.native
    
    var containerStyle: js.UndefOr[Style] = js.native
    
    var google: GoogleAPI = js.native
    
    var initialCenter: js.UndefOr[LatLngLiteral] = js.native
    
    var loaded: js.UndefOr[Boolean] = js.native
    
    var onBoundsChanged: js.UndefOr[mapEventHandler] = js.native
    
    var onCenterChanged: js.UndefOr[mapEventHandler] = js.native
    
    var onClick: js.UndefOr[mapEventHandler] = js.native
    
    var onDblclick: js.UndefOr[mapEventHandler] = js.native
    
    var onDragend: js.UndefOr[mapEventHandler] = js.native
    
    var onDragstart: js.UndefOr[mapEventHandler] = js.native
    
    var onHeadingChange: js.UndefOr[mapEventHandler] = js.native
    
    var onIdle: js.UndefOr[mapEventHandler] = js.native
    
    var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.native
    
    var onMousemove: js.UndefOr[mapEventHandler] = js.native
    
    var onMouseout: js.UndefOr[mapEventHandler] = js.native
    
    var onMouseover: js.UndefOr[mapEventHandler] = js.native
    
    var onProjectionChanged: js.UndefOr[mapEventHandler] = js.native
    
    var onReady: js.UndefOr[mapEventHandler] = js.native
    
    var onRecenter: js.UndefOr[mapEventHandler] = js.native
    
    var onResize: js.UndefOr[mapEventHandler] = js.native
    
    var onRightclick: js.UndefOr[mapEventHandler] = js.native
    
    var onTilesloaded: js.UndefOr[mapEventHandler] = js.native
    
    var onTiltChanged: js.UndefOr[mapEventHandler] = js.native
    
    var onZoomChanged: js.UndefOr[mapEventHandler] = js.native
    
    var style: js.UndefOr[Style] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object IMapProps {
    
    @scala.inline
    def apply(google: GoogleAPI): IMapProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapProps]
    }
    
    @scala.inline
    implicit class IMapPropsMutableBuilder[Self <: IMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCenter(value: LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterAroundCurrentLocation(value: Boolean): Self = StObject.set(x, "centerAroundCurrentLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterAroundCurrentLocationUndefined: Self = StObject.set(x, "centerAroundCurrentLocation", js.undefined)
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: Style): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCenter(value: LatLngLiteral): Self = StObject.set(x, "initialCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCenterUndefined: Self = StObject.set(x, "initialCenter", js.undefined)
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setOnBoundsChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onBoundsChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnBoundsChangedUndefined: Self = StObject.set(x, "onBoundsChanged", js.undefined)
      
      @scala.inline
      def setOnCenterChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onCenterChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCenterChangedUndefined: Self = StObject.set(x, "onCenterChanged", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDblclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDblclick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      @scala.inline
      def setOnDragend(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDragend", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDragendUndefined: Self = StObject.set(x, "onDragend", js.undefined)
      
      @scala.inline
      def setOnDragstart(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onDragstart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDragstartUndefined: Self = StObject.set(x, "onDragstart", js.undefined)
      
      @scala.inline
      def setOnHeadingChange(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onHeadingChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnHeadingChangeUndefined: Self = StObject.set(x, "onHeadingChange", js.undefined)
      
      @scala.inline
      def setOnIdle(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onIdle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnIdleUndefined: Self = StObject.set(x, "onIdle", js.undefined)
      
      @scala.inline
      def setOnMaptypeidChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMaptypeidChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMaptypeidChangedUndefined: Self = StObject.set(x, "onMaptypeidChanged", js.undefined)
      
      @scala.inline
      def setOnMousemove(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMousemove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      @scala.inline
      def setOnMouseout(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseout", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      @scala.inline
      def setOnMouseover(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      @scala.inline
      def setOnProjectionChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onProjectionChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProjectionChangedUndefined: Self = StObject.set(x, "onProjectionChanged", js.undefined)
      
      @scala.inline
      def setOnReady(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnRecenter(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onRecenter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRecenterUndefined: Self = StObject.set(x, "onRecenter", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnRightclick(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onRightclick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRightclickUndefined: Self = StObject.set(x, "onRightclick", js.undefined)
      
      @scala.inline
      def setOnTilesloaded(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onTilesloaded", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTilesloadedUndefined: Self = StObject.set(x, "onTilesloaded", js.undefined)
      
      @scala.inline
      def setOnTiltChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onTiltChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTiltChangedUndefined: Self = StObject.set(x, "onTiltChanged", js.undefined)
      
      @scala.inline
      def setOnZoomChanged(
        value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onZoomChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnZoomChangedUndefined: Self = StObject.set(x, "onZoomChanged", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
  @js.native
  trait IMarkerProps extends StObject {
    
    var anchorPoint: js.UndefOr[Point] = js.native
    
    var animation: js.UndefOr[Animation] = js.native
    
    var clickable: js.UndefOr[Boolean] = js.native
    
    var crossOnDrag: js.UndefOr[Boolean] = js.native
    
    var cursor: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String | Icon | Symbol] = js.native
    
    var label: js.UndefOr[String | MarkerLabel] = js.native
    
    var map: js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.native
    
    var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.native
    
    var onClick: js.UndefOr[markerEventHandler] = js.native
    
    var onMouseover: js.UndefOr[markerEventHandler] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var optimized: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
    
    var shape: js.UndefOr[MarkerShape] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object IMarkerProps {
    
    @scala.inline
    def apply(): IMarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarkerProps]
    }
    
    @scala.inline
    implicit class IMarkerPropsMutableBuilder[Self <: IMarkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
      
      @scala.inline
      def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setCrossOnDrag(value: Boolean): Self = StObject.set(x, "crossOnDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOnDragUndefined: Self = StObject.set(x, "crossOnDrag", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: String | MarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMap(value: typingsSlinky.googlemaps.google.maps.Map[Element] | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "mapCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapCenterUndefined: Self = StObject.set(x, "mapCenter", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseover(
        value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
      ): Self = StObject.set(x, "onMouseover", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
      
      @scala.inline
      def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait IProvidedProps extends StObject {
    
    var google: GoogleAPI = js.native
    
    var loaded: js.UndefOr[Boolean] = js.native
  }
  object IProvidedProps {
    
    @scala.inline
    def apply(google: GoogleAPI): IProvidedProps = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProvidedProps]
    }
    
    @scala.inline
    implicit class IProvidedPropsMutableBuilder[Self <: IProvidedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGoogle(value: GoogleAPI): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    }
  }
  
  type Omit[T1, T2] = Pick[T1, Exclude[/* keyof T1 */ String, /* keyof T2 */ String]]
  
  type Style = js.Object
  
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[IMapProps], 
    /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], 
    /* event */ js.Any, 
    js.Any
  ]
  
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[IMarkerProps], 
    /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], 
    /* event */ js.Any, 
    js.Any
  ]
}
