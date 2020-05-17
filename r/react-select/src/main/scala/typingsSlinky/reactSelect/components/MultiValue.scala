package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.anon.OnClick
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsSlinky.reactSelect.componentsMultiValueMod.default
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValue {
  @JSImport("react-select/src/components/MultiValue", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[OptionType <: OptionTypeBase] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[OptionType <: OptionTypeBase](p: MultiValueProps[OptionType]): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase](
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
    removeProps: OnClick,
    selectOption: OptionType => Unit,
    selectProps: Props[OptionType],
    setValue: (ValueType[OptionType], ActionTypes) => Unit
  ): Builder[OptionType] = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), components = components.asInstanceOf[js.Any], cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any], cx = js.Any.fromFunction3(cx), data = data.asInstanceOf[js.Any], getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeProps = removeProps.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder[OptionType](js.Array(this.component, __props.asInstanceOf[MultiValueProps[OptionType]]))
  }
}

