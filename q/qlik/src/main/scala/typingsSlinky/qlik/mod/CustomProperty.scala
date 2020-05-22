package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.qlikStrings.StringExpr
import typingsSlinky.qlik.qlikStrings.StringExpression
import typingsSlinky.qlik.qlikStrings.ValueExpression
import typingsSlinky.qlik.qlikStrings._empty
import typingsSlinky.qlik.qlikStrings.`color-picker`
import typingsSlinky.qlik.qlikStrings.always
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
import typingsSlinky.qlik.qlikStrings.optional
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
  def CustomPropertyInteger(
    `type`: integer,
    component: String = null,
    defaultValue: js.UndefOr[Double] = js.undefined,
    label: String = null,
    max: String = null,
    min: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyItems(
    items: StringDictionary[CustomProperty],
    `type`: items,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButtonGroup(
    component: buttongroup,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]] = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRangeSlider(
    component: slider,
    `type`: array,
    defaultValue: js.UndefOr[Double] = js.undefined,
    label: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    step: js.UndefOr[Double] = js.undefined
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRadio(
    component: radiobuttons,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyNumber(
    `type`: number,
    component: String = null,
    defaultValue: js.UndefOr[Double] = js.undefined,
    label: String = null,
    max: String = null,
    min: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySwitch(
    component: switch,
    `type`: boolean,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    defaultValue: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyString(
    `type`: string,
    defaultValue: String = null,
    expression: always | optional | _empty = null,
    label: String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyArray(
    `type`: array,
    addTranslation: String = null,
    allowAdd: js.UndefOr[Boolean] = js.undefined,
    allowMove: js.UndefOr[Boolean] = js.undefined,
    allowRemove: js.UndefOr[Boolean] = js.undefined,
    itemTitleRef: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addTranslation != null) __obj.updateDynamic("addTranslation")(addTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdd)) __obj.updateDynamic("allowAdd")(allowAdd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMove)) __obj.updateDynamic("allowMove")(allowMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRemove)) __obj.updateDynamic("allowRemove")(allowRemove.get.asInstanceOf[js.Any])
    if (itemTitleRef != null) __obj.updateDynamic("itemTitleRef")(itemTitleRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyText(
    component: text,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButton(
    action: VisualizationOptions => Unit,
    component: button,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyLink(
    component: link,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null,
    url: String = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyDropdown(
    component: dropdown,
    ref: String,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyTextArea(
    component: textarea,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    maxlength: js.UndefOr[Double] = js.undefined,
    ref: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxlength)) __obj.updateDynamic("maxlength")(maxlength.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyColorPicker(
    component: `color-picker`,
    `type`: integer,
    defaultValue: js.UndefOr[Double] = js.undefined,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySlider(
    component: slider,
    `type`: number,
    defaultValue: js.UndefOr[Double] = js.undefined,
    label: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    step: js.UndefOr[Double] = js.undefined
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyCheckbox(
    `type`: boolean,
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomProperyMedia(
    component: media,
    `type`: string,
    label: String = null,
    layoutRef: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layoutRef != null) __obj.updateDynamic("layoutRef")(layoutRef.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
}

