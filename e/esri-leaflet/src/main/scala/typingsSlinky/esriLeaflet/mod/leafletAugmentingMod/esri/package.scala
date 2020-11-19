package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esri {
  
  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, scala.Unit]
  
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for Find Task
    */
  type FindOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  type GeoJSONGeometry = typingsSlinky.geojson.mod.Point | typingsSlinky.geojson.mod.Polygon | typingsSlinky.geojson.mod.LineString
  
  type Geometry = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.LeafletGeometry | typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.GeoJSONGeometry
  
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  type LeafletGeometry = typingsSlinky.leaflet.mod.Marker_[js.Any] | typingsSlinky.leaflet.mod.Polygon_[js.Any] | (typingsSlinky.leaflet.mod.Polyline_[
    typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
    js.Any
  ]) | typingsSlinky.leaflet.mod.LatLngExpression | typingsSlinky.leaflet.mod.LatLngBounds_ | typingsSlinky.leaflet.mod.GeoJSON_[js.Any]
  
  /**
    * Options for MapService
    */
  type MapServiceOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for Query
    */
  type QueryOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions
  
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], scala.Unit]
  
  type SpatialReferenceExpression = scala.Double | typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.SpatialReference
  
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  
  /**
    * Options for Task
    */
  type TaskOptions = typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
}
