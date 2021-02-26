package typingsSlinky.mapboxGl.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONSourceOptions extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var buffer: js.UndefOr[Double] = js.native
  
  var cluster: js.UndefOr[Double | Boolean] = js.native
  
  var clusterMaxZoom: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of points necessary to form a cluster if clustering is enabled. Defaults to `2`.
    */
  var clusterMinPoints: js.UndefOr[Double] = js.native
  
  var clusterProperties: js.UndefOr[js.Object] = js.native
  
  var clusterRadius: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.native
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var generateId: js.UndefOr[Boolean] = js.native
  
  var lineMetrics: js.UndefOr[Boolean] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  
  var tolerance: js.UndefOr[Double] = js.native
}
object GeoJSONSourceOptions {
  
  @scala.inline
  def apply(): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
  
  @scala.inline
  implicit class GeoJSONSourceOptionsMutableBuilder[Self <: GeoJSONSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setCluster(value: Double | Boolean): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMaxZoom(value: Double): Self = StObject.set(x, "clusterMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMaxZoomUndefined: Self = StObject.set(x, "clusterMaxZoom", js.undefined)
    
    @scala.inline
    def setClusterMinPoints(value: Double): Self = StObject.set(x, "clusterMinPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMinPointsUndefined: Self = StObject.set(x, "clusterMinPoints", js.undefined)
    
    @scala.inline
    def setClusterProperties(value: js.Object): Self = StObject.set(x, "clusterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterPropertiesUndefined: Self = StObject.set(x, "clusterProperties", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setData(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGenerateId(value: Boolean): Self = StObject.set(x, "generateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    @scala.inline
    def setLineMetrics(value: Boolean): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineMetricsUndefined: Self = StObject.set(x, "lineMetrics", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
