package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A delegate object that controls a GeoJSON import in order to override
  * default behavior and provide custom style.
  */
@js.native
trait GeoJSONDelegate extends StObject {
  
  /**
    * Completes the GeoJSON import.
    *
    * @param result The mapped item collection.
    * @param geoJSON The original parsed GeoJSON object.
    */
  var geoJSONDidComplete: js.UndefOr[js.Function2[/* result */ ItemCollection, /* geoJSON */ js.Object, Unit]] = js.native
  
  /**
    * Indicates the GeoJSON import failed.
    *
    * @param error An Error instance related to the last blocking error.
    * @param geoJSON The original parsed GeoJSON object.
    */
  var geoJSONDidError: js.UndefOr[js.Function2[/* error */ js.Error, /* geoJSON */ js.Object, Unit]] = js.native
  
  /**
    * Overrides a feature.
    *
    * @param item An item created for the geometry of this feature or null for
    * features with null geometry.
    * @param geoJSON The original GeoJSON object for this feature.
    */
  var itemForFeature: js.UndefOr[
    js.Function2[
      /* item */ Annotation | Overlay | ItemCollection | Null, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a feature collection.
    *
    * @param itemCollection A collection containing associated annotations and
    * overlays.
    * @param geoJSON The original GeoJSON object for this FeatureCollection.
    * This will contain an array of feature types.
    */
  var itemForFeatureCollection: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a line string.
    *
    * @param overlay A PolylineOverlay object.
    * @param geoJSON original GeoJSON object for this LineString object.
    */
  var itemForLineString: js.UndefOr[
    js.Function2[
      /* overlay */ PolylineOverlay, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a multiline string.
    *
    * @param itemCollection An item collection containing associated overlays.
    * @param geoJSON The original GeoJSON object for this MultiLineString. This
    * will contain an array of geometries.
    */
  var itemForMultiLineString: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a multipoint object.
    *
    * @param itemCollection A collection containing associated annotations.
    * @param geoJSON The original GeoJSON object for this MultiPoint. This will
    * contain an array of geometries.
    */
  var itemForMultiPoint: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a multipolygon.
    *
    * @param itemCollection A collection containing associated overlays.
    * @param geoJSON The original GeoJSON object for this MultiPolygon. This
    * will contain an array of geometries.
    */
  var itemForMultiPolygon: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides a point.
    *
    * @param coordinate A GeoJSON Point generates the coordinate. You can use
    * the coordinate to instantiate an item to return.
    * @param geoJSON The original GeoJSON object for this Point. This object could
    * be a simple Point or a Feature with the Point geometry type.
    */
  var itemForPoint: js.UndefOr[
    js.Function2[/* coordinate */ Coordinate, /* geoJSON */ js.Object, js.Array[Annotation | Overlay]]
  ] = js.native
  
  /**
    * Overrides a polygon.
    *
    * @param overlay You can customize the provided overlay before returning it,
    * or you could completely replace the overlay.
    * @param geoJSON The original GeoJSON object for this polygon.
    */
  var itemForPolygon: js.UndefOr[
    js.Function2[
      /* overlay */ PolygonOverlay, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.native
  
  /**
    * Overrides the style of overlays.
    *
    * @param overlay The overlay to style.
    * @param geoJSON The original GeoJSON for this feature or geometry object.
    */
  var styleForOverlay: js.UndefOr[js.Function2[/* overlay */ Overlay, /* geoJSON */ js.Object, Style]] = js.native
}
object GeoJSONDelegate {
  
  @scala.inline
  def apply(): GeoJSONDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONDelegate]
  }
  
  @scala.inline
  implicit class GeoJSONDelegateMutableBuilder[Self <: GeoJSONDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoJSONDidComplete(value: (/* result */ ItemCollection, /* geoJSON */ js.Object) => Unit): Self = StObject.set(x, "geoJSONDidComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeoJSONDidCompleteUndefined: Self = StObject.set(x, "geoJSONDidComplete", js.undefined)
    
    @scala.inline
    def setGeoJSONDidError(value: (/* error */ js.Error, /* geoJSON */ js.Object) => Unit): Self = StObject.set(x, "geoJSONDidError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeoJSONDidErrorUndefined: Self = StObject.set(x, "geoJSONDidError", js.undefined)
    
    @scala.inline
    def setItemForFeature(
      value: (/* item */ Annotation | Overlay | ItemCollection | Null, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForFeature", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForFeatureCollection(
      value: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForFeatureCollection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForFeatureCollectionUndefined: Self = StObject.set(x, "itemForFeatureCollection", js.undefined)
    
    @scala.inline
    def setItemForFeatureUndefined: Self = StObject.set(x, "itemForFeature", js.undefined)
    
    @scala.inline
    def setItemForLineString(
      value: (/* overlay */ PolylineOverlay, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForLineString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForLineStringUndefined: Self = StObject.set(x, "itemForLineString", js.undefined)
    
    @scala.inline
    def setItemForMultiLineString(
      value: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForMultiLineString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForMultiLineStringUndefined: Self = StObject.set(x, "itemForMultiLineString", js.undefined)
    
    @scala.inline
    def setItemForMultiPoint(
      value: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForMultiPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForMultiPointUndefined: Self = StObject.set(x, "itemForMultiPoint", js.undefined)
    
    @scala.inline
    def setItemForMultiPolygon(
      value: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForMultiPolygon", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForMultiPolygonUndefined: Self = StObject.set(x, "itemForMultiPolygon", js.undefined)
    
    @scala.inline
    def setItemForPoint(value: (/* coordinate */ Coordinate, /* geoJSON */ js.Object) => js.Array[Annotation | Overlay]): Self = StObject.set(x, "itemForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForPointUndefined: Self = StObject.set(x, "itemForPoint", js.undefined)
    
    @scala.inline
    def setItemForPolygon(
      value: (/* overlay */ PolygonOverlay, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay])
    ): Self = StObject.set(x, "itemForPolygon", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemForPolygonUndefined: Self = StObject.set(x, "itemForPolygon", js.undefined)
    
    @scala.inline
    def setStyleForOverlay(value: (/* overlay */ Overlay, /* geoJSON */ js.Object) => Style): Self = StObject.set(x, "styleForOverlay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleForOverlayUndefined: Self = StObject.set(x, "styleForOverlay", js.undefined)
  }
}
