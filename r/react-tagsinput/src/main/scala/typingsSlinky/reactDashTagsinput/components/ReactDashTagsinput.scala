package typingsSlinky.reactDashTagsinput.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ReactChild
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.InputProps
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.ReactTagsInputProps
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.RenderInputProps
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.RenderTagProps
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.Tag
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.TagProps
import typingsSlinky.reactDashTagsinput.reactDashTagsinputMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashTagsinput
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit,
    value: js.Array[Tag],
    addKeys: js.Array[Double | String] = null,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    currentValue: String = null,
    focusedClassName: String = null,
    inputProps: InputProps = null,
    inputValue: String = null,
    maxTags: Int | Double = null,
    onChangeInput: /* value */ String => Unit = null,
    onValidationReject: /* tags */ js.Array[String] => Unit = null,
    onlyUnique: js.UndefOr[Boolean] = js.undefined,
    pasteSplit: /* data */ String => js.Array[String] = null,
    preventSubmit: js.UndefOr[Boolean] = js.undefined,
    removeKeys: js.Array[Double] = null,
    renderInput: /* props */ RenderInputProps => TagMod[Any] = null,
    renderLayout: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild = null,
    renderTag: /* props */ RenderTagProps => TagMod[Any] = null,
    tagDisplayProp: String = null,
    tagProps: TagProps = null,
    validationRegex: js.RegExp = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
    if (addKeys != null) __obj.updateDynamic("addKeys")(addKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (focusedClassName != null) __obj.updateDynamic("focusedClassName")(focusedClassName.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (onChangeInput != null) __obj.updateDynamic("onChangeInput")(js.Any.fromFunction1(onChangeInput))
    if (onValidationReject != null) __obj.updateDynamic("onValidationReject")(js.Any.fromFunction1(onValidationReject))
    if (!js.isUndefined(onlyUnique)) __obj.updateDynamic("onlyUnique")(onlyUnique.asInstanceOf[js.Any])
    if (pasteSplit != null) __obj.updateDynamic("pasteSplit")(js.Any.fromFunction1(pasteSplit))
    if (!js.isUndefined(preventSubmit)) __obj.updateDynamic("preventSubmit")(preventSubmit.asInstanceOf[js.Any])
    if (removeKeys != null) __obj.updateDynamic("removeKeys")(removeKeys.asInstanceOf[js.Any])
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1(renderInput))
    if (renderLayout != null) __obj.updateDynamic("renderLayout")(js.Any.fromFunction2(renderLayout))
    if (renderTag != null) __obj.updateDynamic("renderTag")(js.Any.fromFunction1(renderTag))
    if (tagDisplayProp != null) __obj.updateDynamic("tagDisplayProp")(tagDisplayProp.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactTagsInputProps
}

