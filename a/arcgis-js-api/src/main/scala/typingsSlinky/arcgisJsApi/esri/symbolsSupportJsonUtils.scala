package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait symbolsSupportJsonUtils extends js.Object {
  
  /**
    * Creates a new instance of an appropriate [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for details and examples of when and how to use this function.  When you create a [MarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html), [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PictureMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html) from a JSON object, you may specify a property angle to rotate the symbol. Be aware that the angle in the JSON is different from [MarkerSymbol.angle](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle). The angle in the JSON follows the traditional ArcGIS specification and is rotated counter-clockwise, whereas the angle in the symbol is rotated clockwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-jsonUtils.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [ArcGIS REST API documentation](https://developers.arcgis.com/documentation/common-data-types/symbol-objects.htm) for examples of the structure of various input JSON objects.
    *
    */
  def fromJSON(json: js.Any): Symbol = js.native
}
object symbolsSupportJsonUtils {
  
  @scala.inline
  def apply(fromJSON: js.Any => Symbol): symbolsSupportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[symbolsSupportJsonUtils]
  }
  
  @scala.inline
  implicit class symbolsSupportJsonUtilsOps[Self <: symbolsSupportJsonUtils] (val x: Self) extends AnyVal {
    
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
    def setFromJSON(value: js.Any => Symbol): Self = this.set("fromJSON", js.Any.fromFunction1(value))
  }
}
