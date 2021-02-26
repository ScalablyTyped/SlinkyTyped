package typingsSlinky.amapJsApi.AMap

import typingsSlinky.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typingsSlinky.amapJsApi.amapJsApiStrings.Feature
import typingsSlinky.amapJsApi.amapJsApiStrings.FeatureCollection
import typingsSlinky.amapJsApi.amapJsApiStrings.GeometryCollection
import typingsSlinky.amapJsApi.amapJsApiStrings.LineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiLineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPoint
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPolygon
import typingsSlinky.amapJsApi.amapJsApiStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSON[ExtraData]
  extends OverlayGroup[Overlay[js.Any], ExtraData] {
  
  def importData(obj: js.Array[GeoJSONObject]): Unit = js.native
  /**
    * 加载新的GeoJSON对象，转化为覆盖物，旧的覆盖物将移除
    * @param obj GeoJSON对象
    */
  def importData(obj: GeoJSONObject): Unit = js.native
  
  /**
    * 将当前对象包含的覆盖物转换为GeoJSON对象
    */
  def toGeoJSON(): js.Array[GeoJSONObject] = js.native
}
object GeoJSON {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.anon.Geometry
    - typingsSlinky.amapJsApi.anon.Features
  */
  trait GeoJSONObject extends StObject
  object GeoJSONObject {
    
    @scala.inline
    def Features(
      features: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
        ],
      properties: js.Any,
      `type`: FeatureCollection
    ): typingsSlinky.amapJsApi.anon.Features = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.Features]
    }
    
    @scala.inline
    def Geometry(geometry: typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry, properties: js.Any, `type`: Feature): typingsSlinky.amapJsApi.anon.Geometry = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.Geometry]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.anon.Coordinates
    - typingsSlinky.amapJsApi.anon.CoordinatesType
    - typingsSlinky.amapJsApi.anon.CoordinatesArray
    - typingsSlinky.amapJsApi.anon.Geometries
  */
  trait Geometry extends StObject
  object Geometry {
    
    @scala.inline
    def Coordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): typingsSlinky.amapJsApi.anon.Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.Coordinates]
    }
    
    @scala.inline
    def CoordinatesArray(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): typingsSlinky.amapJsApi.anon.CoordinatesArray = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.CoordinatesArray]
    }
    
    @scala.inline
    def CoordinatesType(
      coordinates: js.Array[js.Tuple2[Double, Double]],
      `type`: MultiPoint | LineString | typingsSlinky.amapJsApi.amapJsApiStrings.Polygon
    ): typingsSlinky.amapJsApi.anon.CoordinatesType = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.CoordinatesType]
    }
    
    @scala.inline
    def Geometries(
      geometries: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
        ],
      `type`: GeometryCollection
    ): typingsSlinky.amapJsApi.anon.Geometries = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.amapJsApi.anon.Geometries]
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var coordsToLatLng: js.UndefOr[js.Function1[/* lnglat */ LngLat, LngLat]] = js.native
    
    // internal
    var coordsToLatLngs: js.UndefOr[js.Function1[/* lnglats */ js.Array[LngLat], js.Array[LngLat]]] = js.native
    
    /**
      * 要加载的标准GeoJSON对象
      */
    var geoJSON: js.UndefOr[GeoJSONObject | js.Array[GeoJSONObject]] = js.native
    
    /**
      * 指定点要素的绘制方式
      * @param obj GeoJSON对象
      * @param lnglat 点的位置
      */
    var getMarker: js.UndefOr[js.Function2[/* obj */ GeoJSONObject, /* lnglat */ LngLat, Marker[_]]] = js.native
    
    /**
      * 指定面要素的绘制方式
      * @param obj GeoJSON对象
      * @param lnglats 面的路径
      */
    var getPolygon: js.UndefOr[
        js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polygon[_]]
      ] = js.native
    
    /**
      * 指定线要素的绘制方式
      * @param obj GeoJSON对象
      * @param lnglats 线的路径
      */
    var getPolyline: js.UndefOr[
        js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polyline[_]]
      ] = js.native
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
      def setCoordsToLatLng(value: /* lnglat */ LngLat => LngLat): Self = StObject.set(x, "coordsToLatLng", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoordsToLatLngUndefined: Self = StObject.set(x, "coordsToLatLng", js.undefined)
      
      @scala.inline
      def setCoordsToLatLngs(value: /* lnglats */ js.Array[LngLat] => js.Array[LngLat]): Self = StObject.set(x, "coordsToLatLngs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoordsToLatLngsUndefined: Self = StObject.set(x, "coordsToLatLngs", js.undefined)
      
      @scala.inline
      def setGeoJSON(value: GeoJSONObject | js.Array[GeoJSONObject]): Self = StObject.set(x, "geoJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoJSONUndefined: Self = StObject.set(x, "geoJSON", js.undefined)
      
      @scala.inline
      def setGeoJSONVarargs(value: GeoJSONObject*): Self = StObject.set(x, "geoJSON", js.Array(value :_*))
      
      @scala.inline
      def setGetMarker(value: (/* obj */ GeoJSONObject, /* lnglat */ LngLat) => Marker[_]): Self = StObject.set(x, "getMarker", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
      
      @scala.inline
      def setGetPolygon(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polygon[_]): Self = StObject.set(x, "getPolygon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPolygonUndefined: Self = StObject.set(x, "getPolygon", js.undefined)
      
      @scala.inline
      def setGetPolyline(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polyline[_]): Self = StObject.set(x, "getPolyline", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPolylineUndefined: Self = StObject.set(x, "getPolyline", js.undefined)
    }
  }
}
