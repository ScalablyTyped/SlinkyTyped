package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.collapsed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.expanded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupElement extends Element {
  
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.Array[FieldElement] = js.native
  
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    */
  var initialState: collapsed | expanded = js.native
  
  /**
    * The type of the [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#type)
    */
  @JSName("type")
  var type_GroupElement: group = js.native
}
