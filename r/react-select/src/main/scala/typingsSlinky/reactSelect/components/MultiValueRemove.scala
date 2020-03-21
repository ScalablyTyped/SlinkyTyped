package typingsSlinky.reactSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactSelect.AnonOnTouchEnd
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemoveProps
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValueRemove
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemove[js.Any]
    ] {
  @JSImport("react-select/src/components/MultiValue", "MultiValueRemove")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[OptionType /* <: OptionTypeBase */](
    clearValue: () => Unit,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    innerProps: AnonOnTouchEnd,
    isMulti: Boolean,
    options: OptionsType[OptionType],
    selectOption: OptionType => Unit,
    selectProps: typingsSlinky.reactSelect.selectMod.Props[OptionType] with js.Any,
    setValue: (ValueType[OptionType], ActionTypes) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemove[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemove[js.Any]]]
  }
  type Props = MultiValueRemoveProps[js.Any]
}

