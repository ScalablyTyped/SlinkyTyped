package typingsSlinky.reactSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactSelect.AnonOnClick
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsSlinky.reactSelect.componentsMultiValueMod.default
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValue
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-select/src/components/MultiValue", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[OptionType /* <: OptionTypeBase */](
    clearValue: () => Unit,
    components: js.Any,
    cropWithEllipsis: Boolean,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    data: OptionType,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    innerProps: js.Any,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    options: OptionsType[OptionType],
    removeProps: AnonOnClick,
    selectOption: OptionType => Unit,
    selectProps: typingsSlinky.reactSelect.selectMod.Props[OptionType],
    setValue: (ValueType[OptionType], ActionTypes) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), components = components.asInstanceOf[js.Any], cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any], cx = js.Any.fromFunction3(cx), data = data.asInstanceOf[js.Any], getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeProps = removeProps.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactSelect.componentsMultiValueMod.default[js.Any]]]
  }
  type Props = MultiValueProps[js.Any]
}

