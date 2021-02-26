package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`lock-raster`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.attribute
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blend
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.first
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.last
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mean
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.nadir
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.northwest
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seamline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.sum
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.viewpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MosaicRuleProperties extends StObject {
  
  /**
    * Indicates whether the sort should be ascending.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    */
  var ascending: js.UndefOr[Boolean] = js.native
  
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: js.UndefOr[RasterFunctionProperties] = js.native
  
  /**
    * An array of raster Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The mosaic method determines how the selected rasters are ordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: js.UndefOr[
    none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline
  ] = js.native
  
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.native
  
  /**
    * Defines a selection using a set of ObjectIDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: js.UndefOr[first | last | min | max | mean | blend | sum] = js.native
  
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: js.UndefOr[String] = js.native
  
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: js.UndefOr[String] = js.native
  
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: js.UndefOr[PointProperties] = js.native
  
  /**
    * The where clause determines which rasters will participate in the mosaic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: js.UndefOr[String] = js.native
}
object MosaicRuleProperties {
  
  @scala.inline
  def apply(): MosaicRuleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicRuleProperties]
  }
  
  @scala.inline
  implicit class MosaicRulePropertiesMutableBuilder[Self <: MosaicRuleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setItemRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "itemRenderingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRenderingRuleUndefined: Self = StObject.set(x, "itemRenderingRule", js.undefined)
    
    @scala.inline
    def setLockRasterIds(value: js.Array[Double]): Self = StObject.set(x, "lockRasterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockRasterIdsUndefined: Self = StObject.set(x, "lockRasterIds", js.undefined)
    
    @scala.inline
    def setLockRasterIdsVarargs(value: Double*): Self = StObject.set(x, "lockRasterIds", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMultidimensionalDefinition(value: js.Array[DimensionalDefinitionProperties]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    @scala.inline
    def setMultidimensionalDefinitionVarargs(value: DimensionalDefinitionProperties*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    @scala.inline
    def setOperation(value: first | last | min | max | mean | blend | sum): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    @scala.inline
    def setSortValue(value: String): Self = StObject.set(x, "sortValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortValueUndefined: Self = StObject.set(x, "sortValue", js.undefined)
    
    @scala.inline
    def setViewpoint(value: PointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
