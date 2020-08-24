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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CustomProperty extends js.Object

object CustomProperty {
  @scala.inline
  def CustomPropertyInteger(`type`: integer): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyItems(items: StringDictionary[CustomProperty], `type`: items): CustomProperty = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButtonGroup(component: buttongroup, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRangeSlider(component: slider, `type`: array): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRadio(component: radiobuttons, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyNumber(`type`: number): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySwitch(component: switch, `type`: boolean): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyString(`type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyArray(`type`: array): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyText(component: text): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButton(action: VisualizationOptions => Unit, component: button): CustomProperty = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyLink(component: link): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyDropdown(component: dropdown, ref: String, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyTextArea(component: textarea, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyColorPicker(component: `color-picker`, `type`: integer): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySlider(component: slider, `type`: number): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyCheckbox(`type`: boolean): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomProperyMedia(component: media, `type`: string): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
}

