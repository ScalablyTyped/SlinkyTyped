package typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.googlemaps.google.maps.BicyclingLayer
import typingsSlinky.googlemaps.google.maps.Circle
import typingsSlinky.googlemaps.google.maps.Data
import typingsSlinky.googlemaps.google.maps.DirectionsRenderer
import typingsSlinky.googlemaps.google.maps.DirectionsService
import typingsSlinky.googlemaps.google.maps.DistanceMatrixService
import typingsSlinky.googlemaps.google.maps.ElevationService
import typingsSlinky.googlemaps.google.maps.FusionTablesLayer
import typingsSlinky.googlemaps.google.maps.FusionTablesLayerOptions
import typingsSlinky.googlemaps.google.maps.Geocoder
import typingsSlinky.googlemaps.google.maps.GroundOverlay
import typingsSlinky.googlemaps.google.maps.ImageMapType
import typingsSlinky.googlemaps.google.maps.ImageMapTypeOptions
import typingsSlinky.googlemaps.google.maps.InfoWindow
import typingsSlinky.googlemaps.google.maps.KmlLayer
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.MVCArray
import typingsSlinky.googlemaps.google.maps.MVCObject
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.MapCanvasProjection
import typingsSlinky.googlemaps.google.maps.MapTypeRegistry
import typingsSlinky.googlemaps.google.maps.MapTypeStyle
import typingsSlinky.googlemaps.google.maps.MaxZoomService
import typingsSlinky.googlemaps.google.maps.Point
import typingsSlinky.googlemaps.google.maps.Polygon
import typingsSlinky.googlemaps.google.maps.Polyline
import typingsSlinky.googlemaps.google.maps.Rectangle
import typingsSlinky.googlemaps.google.maps.SaveWidget
import typingsSlinky.googlemaps.google.maps.Size
import typingsSlinky.googlemaps.google.maps.StreetViewCoverageLayer
import typingsSlinky.googlemaps.google.maps.StreetViewPanorama
import typingsSlinky.googlemaps.google.maps.StreetViewService
import typingsSlinky.googlemaps.google.maps.StyledMapType
import typingsSlinky.googlemaps.google.maps.TrafficLayer
import typingsSlinky.googlemaps.google.maps.TransitLayer
import typingsSlinky.reactGoogleMapsLoader.TypeofData
import typingsSlinky.reactGoogleMapsLoader.TypeofMarker
import typingsSlinky.reactGoogleMapsLoader.TypeofOverlayView
import typingsSlinky.reactGoogleMapsLoader.Typeofadsense
import typingsSlinky.reactGoogleMapsLoader.Typeofdrawing
import typingsSlinky.reactGoogleMapsLoader.Typeofevent
import typingsSlinky.reactGoogleMapsLoader.Typeofgeometry
import typingsSlinky.reactGoogleMapsLoader.Typeofplaces
import typingsSlinky.reactGoogleMapsLoader.Typeofvisualization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMaps extends js.Object {
  /***** Layers *****/
  var BicyclingLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.BicyclingLayer] = js.native
  /** A circle on the Earth's surface; also known as a "spherical cap". */
  var Circle: Instantiable0[typingsSlinky.googlemaps.google.maps.Circle] = js.native
  /***** Data *****/
  var Data: Instantiable0[typingsSlinky.googlemaps.google.maps.Data] with TypeofData = js.native
  var DirectionsRenderer: Instantiable0[typingsSlinky.googlemaps.google.maps.DirectionsRenderer] = js.native
  var DirectionsService: Instantiable0[typingsSlinky.googlemaps.google.maps.DirectionsService] = js.native
  var DistanceMatrixService: Instantiable0[typingsSlinky.googlemaps.google.maps.DistanceMatrixService] = js.native
  var ElevationService: Instantiable0[typingsSlinky.googlemaps.google.maps.ElevationService] = js.native
  var FusionTablesLayer: Instantiable1[
    /* options */ FusionTablesLayerOptions, 
    typingsSlinky.googlemaps.google.maps.FusionTablesLayer
  ] = js.native
  /***** Services *****/
  var Geocoder: Instantiable0[typingsSlinky.googlemaps.google.maps.Geocoder] = js.native
  var GroundOverlay: Instantiable2[
    /* url */ String, 
    /* bounds */ LatLngBounds, 
    typingsSlinky.googlemaps.google.maps.GroundOverlay
  ] = js.native
  var ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, typingsSlinky.googlemaps.google.maps.ImageMapType] = js.native
  /**
    * An overlay that looks like a bubble and is often connected to a marker.
    * This class extends MVCObject.
    */
  var InfoWindow: Instantiable0[typingsSlinky.googlemaps.google.maps.InfoWindow] = js.native
  var KmlLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.KmlLayer] = js.native
  /* **** Base **** */
  /**
    * A LatLng is a point in geographical coordinates: latitude and longitude.
    *
    * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
    *   below this range will be clamped to the range [-90, 90]. This means
    *   that if the value specified is less than -90, it will be set to -90.
    *   And if the value is greater than 90, it will be set to 90.
    * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
    *   or below this range will be wrapped so that they fall within the
    *   range. For example, a value of -190 will be converted to 170. A value
    *   of 190 will be converted to -170. This reflects the fact that
    *   longitudes wrap around the globe.
    *
    * Although the default map projection associates longitude with the
    * x-coordinate of the map, and latitude with the y-coordinate, the
    * latitude coordinate is always written first, followed by the longitude.
    * Notice that you cannot modify the coordinates of a LatLng. If you want
    * to compute another point, you have to create a new one.
    */
  var LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, typingsSlinky.googlemaps.google.maps.LatLng] = js.native
  /**
    * A LatLngBounds instance represents a rectangle in geographical coordinates,
    * including one that crosses the 180 degrees longitudinal meridian.
    */
  var LatLngBounds: Instantiable0[typingsSlinky.googlemaps.google.maps.LatLngBounds] = js.native
  /** This class extends MVCObject. */
  var MVCArray: Instantiable0[typingsSlinky.googlemaps.google.maps.MVCArray[js.Object]] = js.native
  /***** MVC *****/
  /** Base class implementing KVO. */
  var MVCObject: Instantiable0[typingsSlinky.googlemaps.google.maps.MVCObject] = js.native
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map Maps JavaScript API} */
  var Map: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
    typingsSlinky.googlemaps.google.maps.Map[Element]
  ] = js.native
  var MapCanvasProjection: Instantiable0[typingsSlinky.googlemaps.google.maps.MapCanvasProjection] = js.native
  var MapTypeRegistry: Instantiable0[typingsSlinky.googlemaps.google.maps.MapTypeRegistry] = js.native
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
    */
  var Marker: TypeofMarker = js.native
  var MaxZoomService: Instantiable0[typingsSlinky.googlemaps.google.maps.MaxZoomService] = js.native
  var OverlayView: TypeofOverlayView = js.native
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typingsSlinky.googlemaps.google.maps.Point] = js.native
  var Polygon: Instantiable0[typingsSlinky.googlemaps.google.maps.Polygon] = js.native
  var Polyline: Instantiable0[typingsSlinky.googlemaps.google.maps.Polyline] = js.native
  var Rectangle: Instantiable0[typingsSlinky.googlemaps.google.maps.Rectangle] = js.native
  var SaveWidget: Instantiable1[/* container */ Node, typingsSlinky.googlemaps.google.maps.SaveWidget] = js.native
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typingsSlinky.googlemaps.google.maps.Size] = js.native
  var StreetViewCoverageLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.StreetViewCoverageLayer] = js.native
  /***** Street View *****/
  var StreetViewPanorama: Instantiable1[/* container */ Element, typingsSlinky.googlemaps.google.maps.StreetViewPanorama] = js.native
  var StreetViewService: Instantiable0[typingsSlinky.googlemaps.google.maps.StreetViewService] = js.native
  var StyledMapType: Instantiable1[
    /* styles */ js.Array[MapTypeStyle], 
    typingsSlinky.googlemaps.google.maps.StyledMapType
  ] = js.native
  var TrafficLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.TrafficLayer] = js.native
  var TransitLayer: Instantiable0[typingsSlinky.googlemaps.google.maps.TransitLayer] = js.native
  /***** AdSense Library *****/
  val adsense: Typeofadsense = js.native
  /***** Drawing Library *****/
  val drawing: Typeofdrawing = js.native
  val event: Typeofevent = js.native
  /***** Geometry Library *****/
  val geometry: Typeofgeometry = js.native
  /***** Places Library *****/
  val places: Typeofplaces = js.native
  /**
    * Version of the Google Maps JavaScript API that the browser has loaded.
    * Like '3.38.11'.
    * @see {@link https://developers.google.com/maps/documentation/javascript/versions#version-checks Maps JavaScript API}
    */
  val version: String = js.native
  /***** Visualization Library *****/
  val visualization: Typeofvisualization = js.native
}

object GoogleMaps {
  @scala.inline
  def apply(
    BicyclingLayer: Instantiable0[BicyclingLayer],
    Circle: Instantiable0[Circle],
    Data: Instantiable0[Data] with TypeofData,
    DirectionsRenderer: Instantiable0[DirectionsRenderer],
    DirectionsService: Instantiable0[DirectionsService],
    DistanceMatrixService: Instantiable0[DistanceMatrixService],
    ElevationService: Instantiable0[ElevationService],
    FusionTablesLayer: Instantiable1[/* options */ FusionTablesLayerOptions, FusionTablesLayer],
    Geocoder: Instantiable0[Geocoder],
    GroundOverlay: Instantiable2[/* url */ String, /* bounds */ LatLngBounds, GroundOverlay],
    ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, ImageMapType],
    InfoWindow: Instantiable0[InfoWindow],
    KmlLayer: Instantiable0[KmlLayer],
    LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, LatLng],
    LatLngBounds: Instantiable0[LatLngBounds],
    MVCArray: Instantiable0[MVCArray[js.Object]],
    MVCObject: Instantiable0[MVCObject],
    Map: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
      Map[Element]
    ],
    MapCanvasProjection: Instantiable0[MapCanvasProjection],
    MapTypeRegistry: Instantiable0[MapTypeRegistry],
    Marker: TypeofMarker,
    MaxZoomService: Instantiable0[MaxZoomService],
    OverlayView: TypeofOverlayView,
    Point: Instantiable2[/* x */ Double, /* y */ Double, Point],
    Polygon: Instantiable0[Polygon],
    Polyline: Instantiable0[Polyline],
    Rectangle: Instantiable0[Rectangle],
    SaveWidget: Instantiable1[/* container */ Node, SaveWidget],
    Size: Instantiable2[/* width */ Double, /* height */ Double, Size],
    StreetViewCoverageLayer: Instantiable0[StreetViewCoverageLayer],
    StreetViewPanorama: Instantiable1[/* container */ Element, StreetViewPanorama],
    StreetViewService: Instantiable0[StreetViewService],
    StyledMapType: Instantiable1[/* styles */ js.Array[MapTypeStyle], StyledMapType],
    TrafficLayer: Instantiable0[TrafficLayer],
    TransitLayer: Instantiable0[TransitLayer],
    adsense: Typeofadsense,
    drawing: Typeofdrawing,
    event: Typeofevent,
    geometry: Typeofgeometry,
    places: Typeofplaces,
    version: String,
    visualization: Typeofvisualization
  ): GoogleMaps = {
    val __obj = js.Dynamic.literal(BicyclingLayer = BicyclingLayer.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DirectionsRenderer = DirectionsRenderer.asInstanceOf[js.Any], DirectionsService = DirectionsService.asInstanceOf[js.Any], DistanceMatrixService = DistanceMatrixService.asInstanceOf[js.Any], ElevationService = ElevationService.asInstanceOf[js.Any], FusionTablesLayer = FusionTablesLayer.asInstanceOf[js.Any], Geocoder = Geocoder.asInstanceOf[js.Any], GroundOverlay = GroundOverlay.asInstanceOf[js.Any], ImageMapType = ImageMapType.asInstanceOf[js.Any], InfoWindow = InfoWindow.asInstanceOf[js.Any], KmlLayer = KmlLayer.asInstanceOf[js.Any], LatLng = LatLng.asInstanceOf[js.Any], LatLngBounds = LatLngBounds.asInstanceOf[js.Any], MVCArray = MVCArray.asInstanceOf[js.Any], MVCObject = MVCObject.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], MapCanvasProjection = MapCanvasProjection.asInstanceOf[js.Any], MapTypeRegistry = MapTypeRegistry.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxZoomService = MaxZoomService.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Polyline = Polyline.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], SaveWidget = SaveWidget.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StreetViewCoverageLayer = StreetViewCoverageLayer.asInstanceOf[js.Any], StreetViewPanorama = StreetViewPanorama.asInstanceOf[js.Any], StreetViewService = StreetViewService.asInstanceOf[js.Any], StyledMapType = StyledMapType.asInstanceOf[js.Any], TrafficLayer = TrafficLayer.asInstanceOf[js.Any], TransitLayer = TransitLayer.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleMaps]
  }
  @scala.inline
  implicit class GoogleMapsOps[Self <: GoogleMaps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBicyclingLayer(value: Instantiable0[BicyclingLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BicyclingLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircle(value: Instantiable0[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Instantiable0[Data] with TypeofData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionsRenderer(value: Instantiable0[DirectionsRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionsRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionsService(value: Instantiable0[DirectionsService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionsService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceMatrixService(value: Instantiable0[DistanceMatrixService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceMatrixService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevationService(value: Instantiable0[ElevationService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElevationService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFusionTablesLayer(value: Instantiable1[/* options */ FusionTablesLayerOptions, FusionTablesLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FusionTablesLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeocoder(value: Instantiable0[Geocoder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geocoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroundOverlay(value: Instantiable2[/* url */ String, /* bounds */ LatLngBounds, GroundOverlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroundOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageMapType(value: Instantiable1[/* opts */ ImageMapTypeOptions, ImageMapType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageMapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoWindow(value: Instantiable0[InfoWindow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmlLayer(value: Instantiable0[KmlLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmlLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatLng(value: Instantiable2[/* lat */ Double, /* lng */ Double, LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatLngBounds(value: Instantiable0[LatLngBounds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatLngBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMVCArray(value: Instantiable0[MVCArray[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MVCArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMVCObject(value: Instantiable0[MVCObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MVCObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
          Map[Element]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapCanvasProjection(value: Instantiable0[MapCanvasProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapCanvasProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapTypeRegistry(value: Instantiable0[MapTypeRegistry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapTypeRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: TypeofMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoomService(value: Instantiable0[MaxZoomService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxZoomService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayView(value: TypeofOverlayView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverlayView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Instantiable2[/* x */ Double, /* y */ Double, Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(value: Instantiable0[Polygon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: Instantiable0[Polyline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(value: Instantiable0[Rectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveWidget(value: Instantiable1[/* container */ Node, SaveWidget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Instantiable2[/* width */ Double, /* height */ Double, Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetViewCoverageLayer(value: Instantiable0[StreetViewCoverageLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreetViewCoverageLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetViewPanorama(value: Instantiable1[/* container */ Element, StreetViewPanorama]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreetViewPanorama")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetViewService(value: Instantiable0[StreetViewService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreetViewService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyledMapType(value: Instantiable1[/* styles */ js.Array[MapTypeStyle], StyledMapType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyledMapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficLayer(value: Instantiable0[TrafficLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitLayer(value: Instantiable0[TransitLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdsense(value: Typeofadsense): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawing(value: Typeofdrawing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Typeofevent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: Typeofgeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaces(value: Typeofplaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualization(value: Typeofvisualization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

