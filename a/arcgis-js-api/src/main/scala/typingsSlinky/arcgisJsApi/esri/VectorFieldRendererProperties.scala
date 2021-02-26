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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorFieldRendererProperties extends StObject {
  
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
  implicit class VectorFieldRendererPropertiesMutableBuilder[Self <: VectorFieldRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeField(value: Magnitude): Self = StObject.set(x, "attributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeFieldUndefined: Self = StObject.set(x, "attributeField", js.undefined)
    
    @scala.inline
    def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    @scala.inline
    def setStyle(
      value: `beaufort-ft` | `beaufort-km` | `beaufort-kn` | `beaufort-m` | `beaufort-mi` | `classified-arrow` | `ocean-current-kn` | `ocean-current-m` | `simple-scalar` | `single-arrow` | `wind-speed`
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSymbolTileSize(value: Double): Self = StObject.set(x, "symbolTileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTileSizeUndefined: Self = StObject.set(x, "symbolTileSize", js.undefined)
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value :_*))
  }
}
