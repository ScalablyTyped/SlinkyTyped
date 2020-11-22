package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`datetime-picker`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`text-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends Accessor
     with JSONSupport {
  
  /**
    * The type of form element input displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-Input.html#type)
    */
  val `type`: `text-area` | `text-box` | `datetime-picker` = js.native
}
