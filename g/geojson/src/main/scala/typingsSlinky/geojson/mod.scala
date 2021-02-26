package typingsSlinky.geojson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BBox = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple6[Double, Double, Double, Double, Double, Double])
  
  @js.native
  trait Feature[G /* <: Geometry | Null */, P] extends GeoJsonObject {
    
    /**
      * The feature's geometry
      */
    var geometry: G = js.native
    
    /**
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
      */
    var id: js.UndefOr[String | Double] = js.native
    
    /**
      * Properties associated with this feature.
      */
    var properties: P = js.native
    
    @JSName("type")
    var type_Feature: typingsSlinky.geojson.geojsonStrings.Feature = js.native
  }
  object Feature {
    
    @scala.inline
    def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P, `type`: typingsSlinky.geojson.geojsonStrings.Feature): Feature[G, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature[G, P]]
    }
    
    @scala.inline
    implicit class FeatureMutableBuilder[Self <: Feature[_, _], G /* <: Geometry | Null */, P] (val x: Self with (Feature[G, P])) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: G): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureCollection[G /* <: Geometry | Null */, P] extends GeoJsonObject {
    
    var features: js.Array[Feature[G, P]] = js.native
    
    @JSName("type")
    var type_FeatureCollection: typingsSlinky.geojson.geojsonStrings.FeatureCollection = js.native
  }
  object FeatureCollection {
    
    @scala.inline
    def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]], `type`: typingsSlinky.geojson.geojsonStrings.FeatureCollection): FeatureCollection[G, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCollection[G, P]]
    }
    
    @scala.inline
    implicit class FeatureCollectionMutableBuilder[Self <: FeatureCollection[_, _], G /* <: Geometry | Null */, P] (val x: Self with (FeatureCollection[G, P])) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: js.Array[Feature[G, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: (Feature[G, P])*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  /* Inlined geojson.geojson.Geometry['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geojson.geojsonStrings.MultiPolygon
    - typingsSlinky.geojson.geojsonStrings.GeometryCollection
    - typingsSlinky.geojson.geojsonStrings.MultiLineString
    - typingsSlinky.geojson.geojsonStrings.LineString
    - typingsSlinky.geojson.geojsonStrings.Point
    - typingsSlinky.geojson.geojsonStrings.Polygon
    - typingsSlinky.geojson.geojsonStrings.MultiPoint
  */
  trait GeoJsonGeometryTypes extends StObject
  object GeoJsonGeometryTypes {
    
    @scala.inline
    def GeometryCollection: typingsSlinky.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsSlinky.geojson.geojsonStrings.GeometryCollection]
    
    @scala.inline
    def LineString: typingsSlinky.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typingsSlinky.geojson.geojsonStrings.LineString]
    
    @scala.inline
    def MultiLineString: typingsSlinky.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiLineString]
    
    @scala.inline
    def MultiPoint: typingsSlinky.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiPoint]
    
    @scala.inline
    def MultiPolygon: typingsSlinky.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiPolygon]
    
    @scala.inline
    def Point: typingsSlinky.geojson.geojsonStrings.Point = "Point".asInstanceOf[typingsSlinky.geojson.geojsonStrings.Point]
    
    @scala.inline
    def Polygon: typingsSlinky.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typingsSlinky.geojson.geojsonStrings.Polygon]
  }
  
  @js.native
  trait GeoJsonObject extends StObject {
    
    /**
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * The value of the bbox member is an array of length 2*n where n is the number of dimensions
      * represented in the contained geometries, with all axes of the most southwesterly point
      * followed by all axes of the more northeasterly point.
      * The axes order of a bbox follows the axes order of geometries.
      * https://tools.ietf.org/html/rfc7946#section-5
      */
    var bbox: js.UndefOr[BBox] = js.native
    
    // Don't include foreign members directly into this type def.
    // in order to preserve type safety.
    // [key: string]: any;
    /**
      * Specifies the type of GeoJSON object.
      */
    var `type`: GeoJsonTypes = js.native
  }
  object GeoJsonObject {
    
    @scala.inline
    def apply(`type`: GeoJsonTypes): GeoJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonObject]
    }
    
    @scala.inline
    implicit class GeoJsonObjectMutableBuilder[Self <: GeoJsonObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJsonProperties = StringDictionary[js.Any] | Null
  
  /* Inlined geojson.geojson.GeoJSON['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geojson.geojsonStrings.MultiPolygon
    - typingsSlinky.geojson.geojsonStrings.GeometryCollection
    - typingsSlinky.geojson.geojsonStrings.MultiLineString
    - typingsSlinky.geojson.geojsonStrings.LineString
    - typingsSlinky.geojson.geojsonStrings.Point
    - typingsSlinky.geojson.geojsonStrings.FeatureCollection
    - typingsSlinky.geojson.geojsonStrings.Polygon
    - typingsSlinky.geojson.geojsonStrings.MultiPoint
    - typingsSlinky.geojson.geojsonStrings.Feature
  */
  trait GeoJsonTypes extends StObject
  object GeoJsonTypes {
    
    @scala.inline
    def Feature: typingsSlinky.geojson.geojsonStrings.Feature = "Feature".asInstanceOf[typingsSlinky.geojson.geojsonStrings.Feature]
    
    @scala.inline
    def FeatureCollection: typingsSlinky.geojson.geojsonStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typingsSlinky.geojson.geojsonStrings.FeatureCollection]
    
    @scala.inline
    def GeometryCollection: typingsSlinky.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsSlinky.geojson.geojsonStrings.GeometryCollection]
    
    @scala.inline
    def LineString: typingsSlinky.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typingsSlinky.geojson.geojsonStrings.LineString]
    
    @scala.inline
    def MultiLineString: typingsSlinky.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiLineString]
    
    @scala.inline
    def MultiPoint: typingsSlinky.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiPoint]
    
    @scala.inline
    def MultiPolygon: typingsSlinky.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsSlinky.geojson.geojsonStrings.MultiPolygon]
    
    @scala.inline
    def Point: typingsSlinky.geojson.geojsonStrings.Point = "Point".asInstanceOf[typingsSlinky.geojson.geojsonStrings.Point]
    
    @scala.inline
    def Polygon: typingsSlinky.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typingsSlinky.geojson.geojsonStrings.Polygon]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geojson.mod.Point
    - typingsSlinky.geojson.mod.MultiPoint
    - typingsSlinky.geojson.mod.LineString
    - typingsSlinky.geojson.mod.MultiLineString
    - typingsSlinky.geojson.mod.Polygon
    - typingsSlinky.geojson.mod.MultiPolygon
    - typingsSlinky.geojson.mod.GeometryCollection
  */
  trait Geometry extends StObject
  object Geometry {
    
    @scala.inline
    def GeometryCollection(geometries: js.Array[Geometry], `type`: typingsSlinky.geojson.geojsonStrings.GeometryCollection): typingsSlinky.geojson.mod.GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.GeometryCollection]
    }
    
    @scala.inline
    def LineString(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.LineString): typingsSlinky.geojson.mod.LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.LineString]
    }
    
    @scala.inline
    def MultiLineString(
      coordinates: js.Array[js.Array[Position]],
      `type`: typingsSlinky.geojson.geojsonStrings.MultiLineString
    ): typingsSlinky.geojson.mod.MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.MultiLineString]
    }
    
    @scala.inline
    def MultiPoint(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.MultiPoint): typingsSlinky.geojson.mod.MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.MultiPoint]
    }
    
    @scala.inline
    def MultiPolygon(
      coordinates: js.Array[js.Array[js.Array[Position]]],
      `type`: typingsSlinky.geojson.geojsonStrings.MultiPolygon
    ): typingsSlinky.geojson.mod.MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.MultiPolygon]
    }
    
    @scala.inline
    def Point(coordinates: Position, `type`: typingsSlinky.geojson.geojsonStrings.Point): typingsSlinky.geojson.mod.Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.Point]
    }
    
    @scala.inline
    def Polygon(coordinates: js.Array[js.Array[Position]], `type`: typingsSlinky.geojson.geojsonStrings.Polygon): typingsSlinky.geojson.mod.Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geojson.mod.Polygon]
    }
  }
  
  @js.native
  trait GeometryCollection
    extends GeoJsonObject
       with Geometry {
    
    var geometries: js.Array[Geometry] = js.native
    
    @JSName("type")
    var type_GeometryCollection: typingsSlinky.geojson.geojsonStrings.GeometryCollection = js.native
  }
  object GeometryCollection {
    
    @scala.inline
    def apply(geometries: js.Array[Geometry], `type`: typingsSlinky.geojson.geojsonStrings.GeometryCollection): GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryCollection]
    }
    
    @scala.inline
    implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeometryObject = Geometry
  
  @js.native
  trait LineString
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position] = js.native
    
    @JSName("type")
    var type_LineString: typingsSlinky.geojson.geojsonStrings.LineString = js.native
  }
  object LineString {
    
    @scala.inline
    def apply(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.LineString): LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineString]
    }
    
    @scala.inline
    implicit class LineStringMutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiLineString
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]] = js.native
    
    @JSName("type")
    var type_MultiLineString: typingsSlinky.geojson.geojsonStrings.MultiLineString = js.native
  }
  object MultiLineString {
    
    @scala.inline
    def apply(
      coordinates: js.Array[js.Array[Position]],
      `type`: typingsSlinky.geojson.geojsonStrings.MultiLineString
    ): MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiLineString]
    }
    
    @scala.inline
    implicit class MultiLineStringMutableBuilder[Self <: MultiLineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiPoint
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position] = js.native
    
    @JSName("type")
    var type_MultiPoint: typingsSlinky.geojson.geojsonStrings.MultiPoint = js.native
  }
  object MultiPoint {
    
    @scala.inline
    def apply(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.MultiPoint): MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPoint]
    }
    
    @scala.inline
    implicit class MultiPointMutableBuilder[Self <: MultiPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiPolygon
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]] = js.native
    
    @JSName("type")
    var type_MultiPolygon: typingsSlinky.geojson.geojsonStrings.MultiPolygon = js.native
  }
  object MultiPolygon {
    
    @scala.inline
    def apply(
      coordinates: js.Array[js.Array[js.Array[Position]]],
      `type`: typingsSlinky.geojson.geojsonStrings.MultiPolygon
    ): MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPolygon]
    }
    
    @scala.inline
    implicit class MultiPolygonMutableBuilder[Self <: MultiPolygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Point
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: Position = js.native
    
    @JSName("type")
    var type_Point: typingsSlinky.geojson.geojsonStrings.Point = js.native
  }
  object Point {
    
    @scala.inline
    def apply(coordinates: Position, `type`: typingsSlinky.geojson.geojsonStrings.Point): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polygon
    extends GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]] = js.native
    
    @JSName("type")
    var type_Polygon: typingsSlinky.geojson.geojsonStrings.Polygon = js.native
  }
  object Polygon {
    
    @scala.inline
    def apply(coordinates: js.Array[js.Array[Position]], `type`: typingsSlinky.geojson.geojsonStrings.Polygon): Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.geojson.geojsonStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
}
