package typingsSlinky.ol

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.geojson.mod.GeometryCollection
import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.geojson.mod.MultiPoint
import typingsSlinky.geojson.mod.MultiPolygon
import typingsSlinky.geojson.mod.Point
import typingsSlinky.geojson.mod.Polygon
import typingsSlinky.ol.featureMod.ReadOptions
import typingsSlinky.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoJSONMod {
  
  @JSImport("ol/format/GeoJSON", JSImport.Default)
  @js.native
  class default () extends GeoJSON {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GeoJSON
    extends typingsSlinky.ol.jsonfeatureMod.default {
    
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
  }
  
  type GeoJSONFeature = Feature[Geometry, GeoJsonProperties]
  
  type GeoJSONFeatureCollection = FeatureCollection[Geometry, GeoJsonProperties]
  
  type GeoJSONGeometry = Geometry
  
  type GeoJSONGeometryCollection = GeometryCollection
  
  type GeoJSONLineString = LineString
  
  type GeoJSONMultiLineString = MultiLineString
  
  type GeoJSONMultiPoint = MultiPoint
  
  type GeoJSONMultiPolygon = MultiPolygon
  
  type GeoJSONObject = typingsSlinky.geojson.mod.GeoJSON
  
  type GeoJSONPoint = Point
  
  type GeoJSONPolygon = Polygon
  
  @js.native
  trait Options extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.native
    
    var extractGeometryName: js.UndefOr[Boolean] = js.native
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.native
    
    var geometryName: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      @scala.inline
      def setExtractGeometryName(value: Boolean): Self = StObject.set(x, "extractGeometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractGeometryNameUndefined: Self = StObject.set(x, "extractGeometryName", js.undefined)
      
      @scala.inline
      def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      @scala.inline
      def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
