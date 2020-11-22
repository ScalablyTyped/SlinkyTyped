package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.number
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionInfo
  extends Accessor
     with JSONSupport {
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#expression)
    */
  var expression: String = js.native
  
  /**
    * The name of the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name)
    */
  var name: String = js.native
  
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#returnType)
    */
  var returnType: boolean | number | string = js.native
  
  /**
    * The title used to describe the value returned by the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#title)
    */
  var title: String = js.native
}
