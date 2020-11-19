package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.collapsed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.expanded
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.FieldElement
  - typingsSlinky.arcgisJsApi.esri.GroupElement
*/
trait elementsElement extends js.Object
object elementsElement {
  
  @scala.inline
  def FieldElement(
    description: String,
    domain: CodedValueDomain | RangeDomain,
    editable: Boolean,
    fieldName: String,
    hint: String,
    input: TextBoxInput | TextAreaInput,
    label: String,
    requiredExpression: String,
    toJSON: () => js.Any,
    `type`: field,
    visibilityExpression: String
  ): elementsElement = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], requiredExpression = requiredExpression.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), visibilityExpression = visibilityExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[elementsElement]
  }
  
  @scala.inline
  def GroupElement(
    description: String,
    elements: js.Array[FieldElement],
    initialState: collapsed | expanded,
    label: String,
    toJSON: () => js.Any,
    `type`: group,
    visibilityExpression: String
  ): elementsElement = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), visibilityExpression = visibilityExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[elementsElement]
  }
}
