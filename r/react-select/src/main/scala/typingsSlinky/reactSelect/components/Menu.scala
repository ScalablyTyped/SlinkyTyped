package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.menuMod.MenuProps
import typingsSlinky.reactSelect.menuMod.MenuState
import typingsSlinky.reactSelect.menuMod.default
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.MenuPlacement
import typingsSlinky.reactSelect.typesMod.MenuPosition
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("react-select/src/components/Menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[OptionType <: OptionTypeBase] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[OptionType <: OptionTypeBase](p: MenuProps[OptionType]): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase](
    clearValue: () => Unit,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    getPortalPlacement: MenuState => Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    innerProps: js.Object,
    isMulti: Boolean,
    maxMenuHeight: Double,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    menuShouldScrollIntoView: Boolean,
    minMenuHeight: Double,
    options: OptionsType[OptionType],
    selectOption: OptionType => Unit,
    selectProps: Props[OptionType],
    setValue: (ValueType[OptionType], ActionTypes) => Unit
  ): Builder[OptionType] = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction3(cx), getPortalPlacement = js.Any.fromFunction1(getPortalPlacement), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder[OptionType](js.Array(this.component, __props.asInstanceOf[MenuProps[OptionType]]))
  }
}

