package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryRenderer
  extends Renderer
     with VisualVariablesMixin {
  
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.Any = js.native
  
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: HashMap[String] = js.native
  
  /**
    * This method will return the symbol for a given graphic using the dictionary renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#getSymbolAsync)
    */
  def getSymbolAsync(graphic: Graphic): js.Promise[CIMSymbol] = js.native
  
  /**
    * A scaling expression can be set to increase or decrease the size of the dictionary symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression)
    */
  var scaleExpression: String = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [scaleExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpressionTitle)
    */
  var scaleExpressionTitle: String = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  @JSName("type")
  var type_DictionaryRenderer: dictionary = js.native
  
  /**
    * The URL to the dictionary style, e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: String = js.native
}
