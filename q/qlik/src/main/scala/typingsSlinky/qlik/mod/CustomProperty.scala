package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.qlikStrings.StringExpr
import typingsSlinky.qlik.qlikStrings.StringExpression
import typingsSlinky.qlik.qlikStrings.ValueExpression
import typingsSlinky.qlik.qlikStrings.`color-picker`
import typingsSlinky.qlik.qlikStrings.array
import typingsSlinky.qlik.qlikStrings.boolean
import typingsSlinky.qlik.qlikStrings.button
import typingsSlinky.qlik.qlikStrings.buttongroup
import typingsSlinky.qlik.qlikStrings.dimension
import typingsSlinky.qlik.qlikStrings.dropdown
import typingsSlinky.qlik.qlikStrings.expression
import typingsSlinky.qlik.qlikStrings.integer
import typingsSlinky.qlik.qlikStrings.items
import typingsSlinky.qlik.qlikStrings.link
import typingsSlinky.qlik.qlikStrings.measure
import typingsSlinky.qlik.qlikStrings.media
import typingsSlinky.qlik.qlikStrings.number
import typingsSlinky.qlik.qlikStrings.radiobuttons
import typingsSlinky.qlik.qlikStrings.slider
import typingsSlinky.qlik.qlikStrings.string
import typingsSlinky.qlik.qlikStrings.switch
import typingsSlinky.qlik.qlikStrings.text
import typingsSlinky.qlik.qlikStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlik.mod.CustomPropertyString
  - typingsSlinky.qlik.mod.CustomPropertyInteger
  - typingsSlinky.qlik.mod.CustomPropertyNumber
  - typingsSlinky.qlik.mod.CustomPropertyArray
  - typingsSlinky.qlik.mod.CustomPropertyButton
  - typingsSlinky.qlik.mod.CustomPropertyButtonGroup
  - typingsSlinky.qlik.mod.CustomPropertyCheckbox
  - typingsSlinky.qlik.mod.CustomPropertyColorPicker
  - typingsSlinky.qlik.mod.CustomPropertyDropdown
  - typingsSlinky.qlik.mod.CustomPropertyLink
  - typingsSlinky.qlik.mod.CustomProperyMedia
  - typingsSlinky.qlik.mod.CustomPropertyRadio
  - typingsSlinky.qlik.mod.CustomPropertySlider
  - typingsSlinky.qlik.mod.CustomPropertyRangeSlider
  - typingsSlinky.qlik.mod.CustomPropertySwitch
  - typingsSlinky.qlik.mod.CustomPropertyText
  - typingsSlinky.qlik.mod.CustomPropertyTextArea
  - typingsSlinky.qlik.mod.CustomPropertyExpression
  - typingsSlinky.qlik.mod.CustomPropertyItems
*/
trait CustomProperty extends StObject
object CustomProperty {
  
  @scala.inline
  def CustomPropertyArray(`type`: array): typingsSlinky.qlik.mod.CustomPropertyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyArray]
  }
  
  @scala.inline
  def CustomPropertyButton(action: VisualizationOptions => Unit, component: button): typingsSlinky.qlik.mod.CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyButton]
  }
  
  @scala.inline
  def CustomPropertyButtonGroup(component: buttongroup, `type`: string): typingsSlinky.qlik.mod.CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyButtonGroup]
  }
  
  @scala.inline
  def CustomPropertyCheckbox(`type`: boolean): typingsSlinky.qlik.mod.CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyCheckbox]
  }
  
  @scala.inline
  def CustomPropertyColorPicker(component: `color-picker`, `type`: integer): typingsSlinky.qlik.mod.CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyColorPicker]
  }
  
  @scala.inline
  def CustomPropertyDropdown(component: dropdown, ref: String, `type`: string): typingsSlinky.qlik.mod.CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyDropdown]
  }
  
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): typingsSlinky.qlik.mod.CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyExpression]
  }
  
  @scala.inline
  def CustomPropertyInteger(`type`: integer): typingsSlinky.qlik.mod.CustomPropertyInteger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyInteger]
  }
  
  @scala.inline
  def CustomPropertyItems(items: StringDictionary[CustomProperty], `type`: items): typingsSlinky.qlik.mod.CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyItems]
  }
  
  @scala.inline
  def CustomPropertyLink(component: link): typingsSlinky.qlik.mod.CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyLink]
  }
  
  @scala.inline
  def CustomPropertyNumber(`type`: number): typingsSlinky.qlik.mod.CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyNumber]
  }
  
  @scala.inline
  def CustomPropertyRadio(component: radiobuttons, `type`: string): typingsSlinky.qlik.mod.CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyRadio]
  }
  
  @scala.inline
  def CustomPropertyRangeSlider(component: slider, `type`: array): typingsSlinky.qlik.mod.CustomPropertyRangeSlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyRangeSlider]
  }
  
  @scala.inline
  def CustomPropertySlider(component: slider, `type`: number): typingsSlinky.qlik.mod.CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertySlider]
  }
  
  @scala.inline
  def CustomPropertyString(`type`: string): typingsSlinky.qlik.mod.CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyString]
  }
  
  @scala.inline
  def CustomPropertySwitch(component: switch, `type`: boolean): typingsSlinky.qlik.mod.CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertySwitch]
  }
  
  @scala.inline
  def CustomPropertyText(component: text): typingsSlinky.qlik.mod.CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyText]
  }
  
  @scala.inline
  def CustomPropertyTextArea(component: textarea, `type`: string): typingsSlinky.qlik.mod.CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomPropertyTextArea]
  }
  
  @scala.inline
  def CustomProperyMedia(component: media, `type`: string): typingsSlinky.qlik.mod.CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.qlik.mod.CustomProperyMedia]
  }
}
