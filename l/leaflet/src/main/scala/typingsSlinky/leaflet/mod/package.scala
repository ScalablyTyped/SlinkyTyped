package typingsSlinky.leaflet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoundsExpression = typingsSlinky.leaflet.mod.Bounds_ | typingsSlinky.leaflet.mod.BoundsLiteral
  
  type BoundsLiteral = js.Tuple2[typingsSlinky.leaflet.mod.PointTuple, typingsSlinky.leaflet.mod.PointTuple]
  
  type Content = java.lang.String | org.scalajs.dom.raw.HTMLElement
  
  type CrossOrigin = scala.Boolean | java.lang.String
  
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* tile */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type DragEndEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.DragEndEvent, scala.Unit]
  
  type ErrorEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ErrorEvent, scala.Unit]
  
  type InternalTiles = org.scalablytyped.runtime.StringDictionary[typingsSlinky.leaflet.anon.Active]
  
  type LatLngBoundsExpression = typingsSlinky.leaflet.mod.LatLngBounds_ | typingsSlinky.leaflet.mod.LatLngBoundsLiteral
  
  type LatLngBoundsLiteral = js.Array[typingsSlinky.leaflet.mod.LatLngTuple]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.leaflet.mod.LatLng_
    - typingsSlinky.leaflet.mod.LatLngLiteral
    - typingsSlinky.leaflet.mod.LatLngTuple
  */
  type LatLngExpression = typingsSlinky.leaflet.mod._LatLngExpression | typingsSlinky.leaflet.mod.LatLngTuple
  
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  
  type LayerEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LayerEvent, scala.Unit]
  
  type LayersControlEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LayersControlEvent, scala.Unit]
  
  type LeafletEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletEvent, scala.Unit]
  
  type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletKeyboardEvent, scala.Unit]
  
  type LeafletMouseEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletMouseEvent, scala.Unit]
  
  type LocationEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LocationEvent, scala.Unit]
  
  type PointExpression = typingsSlinky.leaflet.mod.Point_ | typingsSlinky.leaflet.mod.PointTuple
  
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  
  type PopupEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.PopupEvent, scala.Unit]
  
  type ResizeEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ResizeEvent, scala.Unit]
  
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.GeometryObject, P]], 
    typingsSlinky.leaflet.mod.PathOptions
  ]
  
  type TileErrorEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TileErrorEvent, scala.Unit]
  
  type TileEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TileEvent, scala.Unit]
  
  type TooltipEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TooltipEvent, scala.Unit]
  
  type Zoom = scala.Boolean | typingsSlinky.leaflet.leafletStrings.center
  
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ZoomAnimEvent, scala.Unit]
  
  @scala.inline
  def bounds(points: js.Array[typingsSlinky.leaflet.mod.Point_]): typingsSlinky.leaflet.mod.Bounds_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Bounds_]
  @scala.inline
  def bounds(points: typingsSlinky.leaflet.mod.BoundsLiteral): typingsSlinky.leaflet.mod.Bounds_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Bounds_]
  @scala.inline
  def bounds(
    topLeft: typingsSlinky.leaflet.mod.PointExpression,
    bottomRight: typingsSlinky.leaflet.mod.PointExpression
  ): typingsSlinky.leaflet.mod.Bounds_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Bounds_]
  
  @scala.inline
  def canvas(): typingsSlinky.leaflet.mod.Canvas_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[typingsSlinky.leaflet.mod.Canvas_]
  @scala.inline
  def canvas(options: typingsSlinky.leaflet.mod.RendererOptions): typingsSlinky.leaflet.mod.Canvas_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Canvas_]
  
  @scala.inline
  def circle(latlng: typingsSlinky.leaflet.mod.LatLngExpression): typingsSlinky.leaflet.mod.Circle_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(
    latlng: typingsSlinky.leaflet.mod.LatLngExpression,
    options: typingsSlinky.leaflet.mod.CircleMarkerOptions
  ): typingsSlinky.leaflet.mod.Circle_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(latlng: typingsSlinky.leaflet.mod.LatLngExpression, radius: scala.Double): typingsSlinky.leaflet.mod.Circle_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(
    latlng: typingsSlinky.leaflet.mod.LatLngExpression,
    radius: scala.Double,
    options: typingsSlinky.leaflet.mod.CircleMarkerOptions
  ): typingsSlinky.leaflet.mod.Circle_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Circle_[_]]
  
  @scala.inline
  def circleMarker(latlng: typingsSlinky.leaflet.mod.LatLngExpression): typingsSlinky.leaflet.mod.CircleMarker_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.CircleMarker_[_]]
  @scala.inline
  def circleMarker(
    latlng: typingsSlinky.leaflet.mod.LatLngExpression,
    options: typingsSlinky.leaflet.mod.CircleMarkerOptions
  ): typingsSlinky.leaflet.mod.CircleMarker_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.CircleMarker_[_]]
  
  @scala.inline
  def divIcon(): typingsSlinky.leaflet.mod.DivIcon_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[typingsSlinky.leaflet.mod.DivIcon_]
  @scala.inline
  def divIcon(options: typingsSlinky.leaflet.mod.DivIconOptions): typingsSlinky.leaflet.mod.DivIcon_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.DivIcon_]
  
  @scala.inline
  def featureGroup(): typingsSlinky.leaflet.mod.FeatureGroup_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[typingsSlinky.leaflet.mod.FeatureGroup_[_]]
  @scala.inline
  def featureGroup(layers: js.Array[typingsSlinky.leaflet.mod.Layer]): typingsSlinky.leaflet.mod.FeatureGroup_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.FeatureGroup_[_]]
  
  @scala.inline
  def geoJSON[P](): typingsSlinky.leaflet.mod.GeoJSON_[P] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[typingsSlinky.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](geojson: js.UndefOr[scala.Nothing], options: typingsSlinky.leaflet.mod.GeoJSONOptions[P]): typingsSlinky.leaflet.mod.GeoJSON_[P] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](geojson: typingsSlinky.geojson.mod.GeoJsonObject): typingsSlinky.leaflet.mod.GeoJSON_[P] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](
    geojson: typingsSlinky.geojson.mod.GeoJsonObject,
    options: typingsSlinky.leaflet.mod.GeoJSONOptions[P]
  ): typingsSlinky.leaflet.mod.GeoJSON_[P] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.GeoJSON_[P]]
  
  @scala.inline
  def gridLayer(): typingsSlinky.leaflet.mod.GridLayer_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[typingsSlinky.leaflet.mod.GridLayer_]
  @scala.inline
  def gridLayer(options: typingsSlinky.leaflet.mod.GridLayerOptions): typingsSlinky.leaflet.mod.GridLayer_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.GridLayer_]
  
  @scala.inline
  def icon(options: typingsSlinky.leaflet.mod.IconOptions): typingsSlinky.leaflet.mod.Icon_[typingsSlinky.leaflet.mod.IconOptions] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Icon_[typingsSlinky.leaflet.mod.IconOptions]]
  
  @scala.inline
  def imageOverlay(imageUrl: java.lang.String, bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.ImageOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.ImageOverlay_]
  @scala.inline
  def imageOverlay(
    imageUrl: java.lang.String,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.ImageOverlayOptions
  ): typingsSlinky.leaflet.mod.ImageOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.ImageOverlay_]
  
  @scala.inline
  def latLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): typingsSlinky.leaflet.mod.LatLng_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typingsSlinky.leaflet.anon.Alt): typingsSlinky.leaflet.mod.LatLng_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typingsSlinky.leaflet.mod.LatLngLiteral): typingsSlinky.leaflet.mod.LatLng_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typingsSlinky.leaflet.mod.LatLngTuple): typingsSlinky.leaflet.mod.LatLng_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(latitude: scala.Double, longitude: scala.Double): typingsSlinky.leaflet.mod.LatLng_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): typingsSlinky.leaflet.mod.LatLng_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.LatLng_]
  
  @scala.inline
  def latLngBounds(latlngs: js.Array[typingsSlinky.leaflet.mod.LatLngExpression]): typingsSlinky.leaflet.mod.LatLngBounds_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LatLngBounds_]
  @scala.inline
  def latLngBounds(
    southWest: typingsSlinky.leaflet.mod.LatLngExpression,
    northEast: typingsSlinky.leaflet.mod.LatLngExpression
  ): typingsSlinky.leaflet.mod.LatLngBounds_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.LatLngBounds_]
  
  @scala.inline
  def layerGroup(): typingsSlinky.leaflet.mod.LayerGroup_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[typingsSlinky.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.UndefOr[scala.Nothing], options: typingsSlinky.leaflet.mod.LayerOptions): typingsSlinky.leaflet.mod.LayerGroup_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.Array[typingsSlinky.leaflet.mod.Layer]): typingsSlinky.leaflet.mod.LayerGroup_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.Array[typingsSlinky.leaflet.mod.Layer], options: typingsSlinky.leaflet.mod.LayerOptions): typingsSlinky.leaflet.mod.LayerGroup_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.LayerGroup_[_]]
  
  @scala.inline
  def map(element: java.lang.String): typingsSlinky.leaflet.mod.Map_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Map_]
  @scala.inline
  def map(element: java.lang.String, options: typingsSlinky.leaflet.mod.MapOptions): typingsSlinky.leaflet.mod.Map_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Map_]
  @scala.inline
  def map(element: org.scalajs.dom.raw.HTMLElement): typingsSlinky.leaflet.mod.Map_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Map_]
  @scala.inline
  def map(element: org.scalajs.dom.raw.HTMLElement, options: typingsSlinky.leaflet.mod.MapOptions): typingsSlinky.leaflet.mod.Map_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Map_]
  
  @scala.inline
  def marker(latlng: typingsSlinky.leaflet.mod.LatLngExpression): typingsSlinky.leaflet.mod.Marker_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Marker_[_]]
  @scala.inline
  def marker(
    latlng: typingsSlinky.leaflet.mod.LatLngExpression,
    options: typingsSlinky.leaflet.mod.MarkerOptions
  ): typingsSlinky.leaflet.mod.Marker_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Marker_[_]]
  
  @scala.inline
  def point(coords: typingsSlinky.leaflet.anon.X): typingsSlinky.leaflet.mod.Point_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Point_]
  @scala.inline
  def point(coords: typingsSlinky.leaflet.mod.PointTuple): typingsSlinky.leaflet.mod.Point_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Point_]
  @scala.inline
  def point(x: scala.Double, y: scala.Double): typingsSlinky.leaflet.mod.Point_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Point_]
  @scala.inline
  def point(x: scala.Double, y: scala.Double, round: scala.Boolean): typingsSlinky.leaflet.mod.Point_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Point_]
  
  @scala.inline
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[typingsSlinky.leaflet.mod.LatLngExpression] | typingsSlinky.leaflet.mod.LatLngExpression
      ]) | typingsSlinky.leaflet.mod.LatLngExpression
    ]
  ): typingsSlinky.leaflet.mod.Polygon_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Polygon_[_]]
  @scala.inline
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[typingsSlinky.leaflet.mod.LatLngExpression] | typingsSlinky.leaflet.mod.LatLngExpression
      ]) | typingsSlinky.leaflet.mod.LatLngExpression
    ],
    options: typingsSlinky.leaflet.mod.PolylineOptions
  ): typingsSlinky.leaflet.mod.Polygon_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Polygon_[_]]
  
  @scala.inline
  def polyline(
    latlngs: js.Array[
      js.Array[typingsSlinky.leaflet.mod.LatLngExpression] | typingsSlinky.leaflet.mod.LatLngExpression
    ]
  ): typingsSlinky.leaflet.mod.Polyline_[
    typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
    _
  ] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Polyline_[
    typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
    _
  ]]
  @scala.inline
  def polyline(
    latlngs: js.Array[
      js.Array[typingsSlinky.leaflet.mod.LatLngExpression] | typingsSlinky.leaflet.mod.LatLngExpression
    ],
    options: typingsSlinky.leaflet.mod.PolylineOptions
  ): typingsSlinky.leaflet.mod.Polyline_[
    typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
    _
  ] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Polyline_[
    typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
    _
  ]]
  
  @scala.inline
  def popup(): typingsSlinky.leaflet.mod.Popup_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[typingsSlinky.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: js.UndefOr[scala.Nothing], source: typingsSlinky.leaflet.mod.Layer): typingsSlinky.leaflet.mod.Popup_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: typingsSlinky.leaflet.mod.PopupOptions): typingsSlinky.leaflet.mod.Popup_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: typingsSlinky.leaflet.mod.PopupOptions, source: typingsSlinky.leaflet.mod.Layer): typingsSlinky.leaflet.mod.Popup_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Popup_]
  
  @scala.inline
  def rectangle(latLngBounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.Rectangle_[_] = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Rectangle_[_]]
  @scala.inline
  def rectangle(
    latLngBounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.PolylineOptions
  ): typingsSlinky.leaflet.mod.Rectangle_[_] = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Rectangle_[_]]
  
  @scala.inline
  def svg(): typingsSlinky.leaflet.mod.SVG_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[typingsSlinky.leaflet.mod.SVG_]
  @scala.inline
  def svg(options: typingsSlinky.leaflet.mod.RendererOptions): typingsSlinky.leaflet.mod.SVG_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.SVG_]
  
  @scala.inline
  def svgOverlay(svgImage: java.lang.String, bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.SVGOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(
    svgImage: java.lang.String,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.ImageOverlayOptions
  ): typingsSlinky.leaflet.mod.SVGOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(svgImage: org.scalajs.dom.raw.SVGElement, bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.SVGOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(
    svgImage: org.scalajs.dom.raw.SVGElement,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.ImageOverlayOptions
  ): typingsSlinky.leaflet.mod.SVGOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.SVGOverlay_]
  
  @scala.inline
  def tooltip(): typingsSlinky.leaflet.mod.Tooltip_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[typingsSlinky.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: js.UndefOr[scala.Nothing], source: typingsSlinky.leaflet.mod.Layer): typingsSlinky.leaflet.mod.Tooltip_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: typingsSlinky.leaflet.mod.TooltipOptions): typingsSlinky.leaflet.mod.Tooltip_ = typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: typingsSlinky.leaflet.mod.TooltipOptions, source: typingsSlinky.leaflet.mod.Layer): typingsSlinky.leaflet.mod.Tooltip_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.Tooltip_]
  
  @scala.inline
  def videoOverlay(video: java.lang.String, bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: java.lang.String,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.VideoOverlayOptions
  ): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(video: js.Array[java.lang.String], bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: js.Array[java.lang.String],
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.VideoOverlayOptions
  ): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: org.scalajs.dom.raw.HTMLVideoElement,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression
  ): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: org.scalajs.dom.raw.HTMLVideoElement,
    bounds: typingsSlinky.leaflet.mod.LatLngBoundsExpression,
    options: typingsSlinky.leaflet.mod.VideoOverlayOptions
  ): typingsSlinky.leaflet.mod.VideoOverlay_ = (typingsSlinky.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leaflet.mod.VideoOverlay_]
}
