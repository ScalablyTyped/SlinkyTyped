package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.collapsed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.expanded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupElementProperties extends ElementMixinProperties {
  
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.UndefOr[js.Array[FieldElementProperties]] = js.native
  
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    */
  var initialState: js.UndefOr[collapsed | expanded] = js.native
  
  /**
    * The type of the [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#type)
    */
  var `type`: js.UndefOr[group] = js.native
}
object GroupElementProperties {
  
  @scala.inline
  def apply(): GroupElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupElementProperties]
  }
  
  @scala.inline
  implicit class GroupElementPropertiesMutableBuilder[Self <: GroupElementProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[FieldElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: FieldElementProperties*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: collapsed | expanded): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
