package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudUniqueValueRendererProperties extends PointCloudRendererProperties {
  
  /**
    * Each element in the array is an object that matches a unique value with a specific color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.UndefOr[js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]] = js.native
  
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudUniqueValueRendererLegendOptions] = js.native
}
object PointCloudUniqueValueRendererProperties {
  
  @scala.inline
  def apply(): PointCloudUniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudUniqueValueRendererProperties]
  }
  
  @scala.inline
  implicit class PointCloudUniqueValueRendererPropertiesMutableBuilder[Self <: PointCloudUniqueValueRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorUniqueValueInfos(value: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]): Self = StObject.set(x, "colorUniqueValueInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUniqueValueInfosUndefined: Self = StObject.set(x, "colorUniqueValueInfos", js.undefined)
    
    @scala.inline
    def setColorUniqueValueInfosVarargs(value: PointCloudUniqueValueRendererColorUniqueValueInfos*): Self = StObject.set(x, "colorUniqueValueInfos", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformType(value: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = StObject.set(x, "fieldTransformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformTypeUndefined: Self = StObject.set(x, "fieldTransformType", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: PointCloudUniqueValueRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
  }
}
