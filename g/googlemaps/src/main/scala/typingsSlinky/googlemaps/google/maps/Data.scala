package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.Data.Feature
import typingsSlinky.googlemaps.google.maps.Data.FeatureOptions
import typingsSlinky.googlemaps.google.maps.Data.GeoJsonOptions
import typingsSlinky.googlemaps.google.maps.Data.StyleOptions
import typingsSlinky.googlemaps.google.maps.Data.StylingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends MVCObject {
  
  def add(feature: Feature): Feature = js.native
  def add(feature: FeatureOptions): Feature = js.native
  
  def addGeoJson(geoJson: js.Object): js.Array[Feature] = js.native
  def addGeoJson(geoJson: js.Object, options: GeoJsonOptions): js.Array[Feature] = js.native
  
  def contains(feature: Feature): Boolean = js.native
  
  def forEach(callback: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  
  def getControlPosition(): ControlPosition = js.native
  
  def getControls(): js.Array[DrawingMode] = js.native
  
  def getDrawingMode(): DrawingMode | Null = js.native
  
  def getFeatureById(id: String): Feature = js.native
  def getFeatureById(id: Double): Feature = js.native
  
  def getMap(): Map[Element] = js.native
  
  def getStyle(): StylingFunction | StyleOptions = js.native
  
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(
    url: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* features */ js.Array[Feature], Unit]
  ): Unit = js.native
  def loadGeoJson(url: String, options: GeoJsonOptions): Unit = js.native
  def loadGeoJson(
    url: String,
    options: GeoJsonOptions,
    callback: js.Function1[/* features */ js.Array[Feature], Unit]
  ): Unit = js.native
  
  def overrideStyle(feature: Feature, style: StyleOptions): Unit = js.native
  
  def remove(feature: Feature): Unit = js.native
  
  def revertStyle(): Unit = js.native
  def revertStyle(feature: Feature): Unit = js.native
  
  def setControlPosition(controlPosition: ControlPosition): Unit = js.native
  
  def setControls(): Unit = js.native
  def setControls(controls: js.Array[DrawingMode]): Unit = js.native
  
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: DrawingMode): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
}
object Data {
  
  @js.native
  trait AddFeatureEvent extends StObject {
    
    var feature: Feature = js.native
  }
  object AddFeatureEvent {
    
    @scala.inline
    def apply(feature: Feature): AddFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddFeatureEvent]
    }
    
    @scala.inline
    implicit class AddFeatureEventMutableBuilder[Self <: AddFeatureEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataOptions extends StObject {
    
    var controlPosition: js.UndefOr[ControlPosition] = js.native
    
    var controls: js.UndefOr[js.Array[DrawingMode] | Null] = js.native
    
    var drawingMode: js.UndefOr[DrawingMode | Null] = js.native
    
    var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.native
    
    var map: js.UndefOr[Map[Element]] = js.native
    
    var style: js.UndefOr[StylingFunction | StyleOptions] = js.native
  }
  object DataOptions {
    
    @scala.inline
    def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit class DataOptionsMutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlPosition(value: ControlPosition): Self = StObject.set(x, "controlPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlPositionUndefined: Self = StObject.set(x, "controlPosition", js.undefined)
      
      @scala.inline
      def setControls(value: js.Array[DrawingMode]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsNull: Self = StObject.set(x, "controls", null)
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setControlsVarargs(value: DrawingMode*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      @scala.inline
      def setDrawingMode(value: DrawingMode): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingModeNull: Self = StObject.set(x, "drawingMode", null)
      
      @scala.inline
      def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      @scala.inline
      def setFeatureFactory(value: /* geometry */ Geometry => Feature): Self = StObject.set(x, "featureFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFeatureFactoryUndefined: Self = StObject.set(x, "featureFactory", js.undefined)
      
      @scala.inline
      def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setStyle(value: StylingFunction | StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction1(value: /* feature */ Feature => StyleOptions): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Feature extends StObject {
    
    def forEachProperty(callback: js.Function2[/* value */ js.Any, /* name */ String, Unit]): Unit = js.native
    
    def getGeometry(): Geometry = js.native
    
    def getId(): Double | String = js.native
    
    def getProperty(name: String): js.Any = js.native
    
    def removeProperty(name: String): Unit = js.native
    
    def setGeometry(newGeometry: Geometry): Unit = js.native
    def setGeometry(newGeometry: LatLng): Unit = js.native
    def setGeometry(newGeometry: LatLngLiteral): Unit = js.native
    
    def setProperty(name: String, newValue: js.Any): Unit = js.native
    
    def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
  }
  
  @js.native
  trait FeatureOptions extends StObject {
    
    var geometry: js.UndefOr[Geometry | LatLng | LatLngLiteral] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    var properties: js.UndefOr[js.Object] = js.native
  }
  object FeatureOptions {
    
    @scala.inline
    def apply(): FeatureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureOptions]
    }
    
    @scala.inline
    implicit class FeatureOptionsMutableBuilder[Self <: FeatureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: Geometry | LatLng | LatLngLiteral): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  @js.native
  trait GeoJsonOptions extends StObject {
    
    var idPropertyName: js.UndefOr[String] = js.native
  }
  object GeoJsonOptions {
    
    @scala.inline
    def apply(): GeoJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoJsonOptions]
    }
    
    @scala.inline
    implicit class GeoJsonOptionsMutableBuilder[Self <: GeoJsonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdPropertyName(value: String): Self = StObject.set(x, "idPropertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropertyNameUndefined: Self = StObject.set(x, "idPropertyName", js.undefined)
    }
  }
  
  @js.native
  trait Geometry extends StObject {
    
    def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit = js.native
    
    def getType(): String = js.native
  }
  object Geometry {
    
    @scala.inline
    def apply(forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[Geometry]
    }
    
    @scala.inline
    implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForEachLatLng(value: js.Function1[/* latLng */ LatLng, Unit] => Unit): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GeometryCollection extends Geometry {
    
    def getArray(): js.Array[Geometry] = js.native
    
    def getAt(n: Double): Geometry = js.native
    
    def getLength(): Double = js.native
  }
  object GeometryCollection {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[Geometry],
      getAt: Double => Geometry,
      getLength: () => Double,
      getType: () => String
    ): GeometryCollection = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[GeometryCollection]
    }
    
    @scala.inline
    implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[Geometry]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => Geometry): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LineString extends Geometry {
    
    def getArray(): js.Array[LatLng] = js.native
    
    def getAt(n: Double): LatLng = js.native
    
    def getLength(): Double = js.native
  }
  object LineString {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LineString]
    }
    
    @scala.inline
    implicit class LineStringMutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LinearRing extends Geometry {
    
    def getArray(): js.Array[LatLng] = js.native
    
    def getAt(n: Double): LatLng = js.native
    
    def getLength(): Double = js.native
  }
  object LinearRing {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LinearRing = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LinearRing]
    }
    
    @scala.inline
    implicit class LinearRingMutableBuilder[Self <: LinearRing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  // tslint:disable-next-line:no-unnecessary-qualifier
  @js.native
  trait MouseEvent
    extends typingsSlinky.googlemaps.google.maps.MouseEvent {
    
    var feature: Feature = js.native
  }
  object MouseEvent {
    
    @scala.inline
    def apply(feature: Feature, latLng: LatLng, stop: () => Unit): typingsSlinky.googlemaps.google.maps.Data.MouseEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[typingsSlinky.googlemaps.google.maps.Data.MouseEvent]
    }
    
    @scala.inline
    implicit class MouseEventMutableBuilder[Self <: typingsSlinky.googlemaps.google.maps.Data.MouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiLineString extends Geometry {
    
    def getArray(): js.Array[LineString] = js.native
    
    def getAt(n: Double): LineString = js.native
    
    def getLength(): Double = js.native
  }
  object MultiLineString {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LineString],
      getAt: Double => LineString,
      getLength: () => Double,
      getType: () => String
    ): MultiLineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiLineString]
    }
    
    @scala.inline
    implicit class MultiLineStringMutableBuilder[Self <: MultiLineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[LineString]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => LineString): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MultiPoint extends Geometry {
    
    def getArray(): js.Array[LatLng] = js.native
    
    def getAt(n: Double): LatLng = js.native
    
    def getLength(): Double = js.native
  }
  object MultiPoint {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): MultiPoint = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPoint]
    }
    
    @scala.inline
    implicit class MultiPointMutableBuilder[Self <: MultiPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MultiPolygon extends Geometry {
    
    def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.Polygon] = js.native
    
    def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.Polygon = js.native
    
    def getLength(): Double = js.native
  }
  object MultiPolygon {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[typingsSlinky.googlemaps.google.maps.Data.Polygon],
      getAt: Double => typingsSlinky.googlemaps.google.maps.Data.Polygon,
      getLength: () => Double,
      getType: () => String
    ): MultiPolygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPolygon]
    }
    
    @scala.inline
    implicit class MultiPolygonMutableBuilder[Self <: MultiPolygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[typingsSlinky.googlemaps.google.maps.Data.Polygon]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => typingsSlinky.googlemaps.google.maps.Data.Polygon): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Point extends Geometry {
    
    def get(): LatLng = js.native
  }
  object Point {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      get: () => LatLng,
      getType: () => String
    ): typingsSlinky.googlemaps.google.maps.Data.Point = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), get = js.Any.fromFunction0(get), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typingsSlinky.googlemaps.google.maps.Data.Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: typingsSlinky.googlemaps.google.maps.Data.Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => LatLng): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Polygon extends Geometry {
    
    def getArray(): js.Array[LinearRing] = js.native
    
    def getAt(n: Double): LinearRing = js.native
    
    def getLength(): Double = js.native
  }
  object Polygon {
    
    @scala.inline
    def apply(
      forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LinearRing],
      getAt: Double => LinearRing,
      getLength: () => Double,
      getType: () => String
    ): typingsSlinky.googlemaps.google.maps.Data.Polygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typingsSlinky.googlemaps.google.maps.Data.Polygon]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: typingsSlinky.googlemaps.google.maps.Data.Polygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetArray(value: () => js.Array[LinearRing]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAt(value: Double => LinearRing): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RemoveFeatureEvent extends StObject {
    
    var feature: Feature = js.native
  }
  object RemoveFeatureEvent {
    
    @scala.inline
    def apply(feature: Feature): RemoveFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveFeatureEvent]
    }
    
    @scala.inline
    implicit class RemoveFeatureEventMutableBuilder[Self <: RemoveFeatureEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemovePropertyEvent extends StObject {
    
    var feature: Feature = js.native
    
    var name: String = js.native
    
    var oldValue: js.Any = js.native
  }
  object RemovePropertyEvent {
    
    @scala.inline
    def apply(feature: Feature, name: String, oldValue: js.Any): RemovePropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePropertyEvent]
    }
    
    @scala.inline
    implicit class RemovePropertyEventMutableBuilder[Self <: RemovePropertyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetGeometryEvent extends StObject {
    
    var feature: Feature = js.native
    
    var newGeometry: Geometry = js.native
    
    var oldGeometry: Geometry = js.native
  }
  object SetGeometryEvent {
    
    @scala.inline
    def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], newGeometry = newGeometry.asInstanceOf[js.Any], oldGeometry = oldGeometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetGeometryEvent]
    }
    
    @scala.inline
    implicit class SetGeometryEventMutableBuilder[Self <: SetGeometryEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewGeometry(value: Geometry): Self = StObject.set(x, "newGeometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldGeometry(value: Geometry): Self = StObject.set(x, "oldGeometry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetPropertyEvent extends StObject {
    
    var feature: Feature = js.native
    
    var name: String = js.native
    
    var newValue: js.Any = js.native
    
    var oldValue: js.Any = js.native
  }
  object SetPropertyEvent {
    
    @scala.inline
    def apply(feature: Feature, name: String, newValue: js.Any, oldValue: js.Any): SetPropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPropertyEvent]
    }
    
    @scala.inline
    implicit class SetPropertyEventMutableBuilder[Self <: SetPropertyEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyleOptions extends StObject {
    
    var clickable: js.UndefOr[Boolean] = js.native
    
    var cursor: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    // tslint:disable-next-line:no-unnecessary-qualifier
    var icon: js.UndefOr[String | Icon | Symbol] = js.native
    
    var shape: js.UndefOr[MarkerShape] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
    
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    var strokeWeight: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object StyleOptions {
    
    @scala.inline
    def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    @scala.inline
    implicit class StyleOptionsMutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
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
  
  type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]
}
