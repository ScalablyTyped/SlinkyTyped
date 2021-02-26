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
trait MosaicRule
  extends Accessor
     with JSONSupport {
  
  /**
    * Indicates whether the sort should be ascending.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#ascending)
    */
  var ascending: Boolean = js.native
  
  /**
    * The rendering rule applied on items before mosaicking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#itemRenderingRule)
    */
  var itemRenderingRule: RasterFunction = js.native
  
  /**
    * An array of raster Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#lockRasterIds)
    */
  var lockRasterIds: js.Array[Double] = js.native
  
  /**
    * The mosaic method determines how the selected rasters are ordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method)
    */
  var method: none | center | nadir | viewpoint | attribute | `lock-raster` | northwest | seamline = js.native
  
  /**
    * A multiple dimensional service can have multiple dimensions for one or more variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.Array[DimensionalDefinition] = js.native
  
  /**
    * Defines a selection using a set of ObjectIDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#objectIds)
    */
  var objectIds: js.Array[Double] = js.native
  
  /**
    * Defines the mosaic operation used to resolve overlapping pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#operation)
    */
  var operation: first | last | min | max | mean | blend | sum = js.native
  
  /**
    * The name of the attribute field that is used with a constant sortValue to define the mosaicking order when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortField)
    */
  var sortField: String = js.native
  
  /**
    * A constant value defining a reference or base value for the sort field when the mosaic [method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#method) is set to `attribute`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#sortValue)
    */
  var sortValue: String = js.native
  
  /**
    * Defines the viewpoint location on which the ordering is defined based on the distance from the viewpoint and the nadir of rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#viewpoint)
    */
  var viewpoint: Point = js.native
  
  /**
    * The where clause determines which rasters will participate in the mosaic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where)
    */
  var where: String = js.native
}
