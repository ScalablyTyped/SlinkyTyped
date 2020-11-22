package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.Magnitude
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-ft`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-km`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-kn`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-m`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`beaufort-mi`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`classified-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ocean-current-kn`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ocean-current-m`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-scalar`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`single-arrow`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`wind-speed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorFieldRendererProperties extends js.Object {
  
  /**
    * Attribute field presenting the magnitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#attributeField)
    */
  var attributeField: js.UndefOr[Magnitude] = js.native
  
  /**
    * Defines the flow direction of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#flowRepresentation)
    */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.native
  
  /**
    * Predefined symbol styles used to represent the vector flow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#style)
    */
  var style: js.UndefOr[
    `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-speed`
  ] = js.native
  
  /**
    * Determines the density of the symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#symbolTileSize)
    */
  var symbolTileSize: js.UndefOr[Double] = js.native
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.native
}
object VectorFieldRendererProperties {
  
  @scala.inline
  def apply(): VectorFieldRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorFieldRendererProperties]
  }
  
  @scala.inline
  implicit class VectorFieldRendererPropertiesOps[Self <: VectorFieldRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeField(value: Magnitude): Self = this.set("attributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeField: Self = this.set("attributeField", js.undefined)
    
    @scala.inline
    def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = this.set("flowRepresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowRepresentation: Self = this.set("flowRepresentation", js.undefined)
    
    @scala.inline
    def setStyle(
      value: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-speed`
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSymbolTileSize(value: Double): Self = this.set("symbolTileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolTileSize: Self = this.set("symbolTileSize", js.undefined)
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = this.set("visualVariables", js.Array(value :_*))
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = this.set("visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualVariables: Self = this.set("visualVariables", js.undefined)
  }
}
