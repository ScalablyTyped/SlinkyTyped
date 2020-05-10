package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.AnonOnTouchEnd
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemoveProps
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValueRemove {
  @JSImport("react-select/src/components/MultiValue", "MultiValueRemove")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[OptionType <: OptionTypeBase] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueRemove[js.Any]
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[OptionType <: OptionTypeBase](p: MultiValueRemoveProps[OptionType]): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase](
    clearValue: () => Unit,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    innerProps: AnonOnTouchEnd,
    isMulti: Boolean,
    options: OptionsType[OptionType],
    selectOption: OptionType => Unit,
    selectProps: Props[OptionType] with js.Any,
    setValue: (ValueType[OptionType], ActionTypes) => Unit
  ): Builder[OptionType] = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder[OptionType](js.Array(this.component, __props.asInstanceOf[MultiValueRemoveProps[OptionType]]))
  }
}

