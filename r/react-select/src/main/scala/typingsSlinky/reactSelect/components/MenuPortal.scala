package typingsSlinky.reactSelect.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.menuMod.MenuPortalProps
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

object MenuPortal {
  @JSImport("react-select/src/components/Menu", "MenuPortal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[OptionType <: OptionTypeBase] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSelect.menuMod.MenuPortal[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[OptionType <: OptionTypeBase](p: MenuPortalProps[OptionType]): Builder[OptionType] = new Builder[OptionType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase](
    appendTo: HTMLElement,
    clearValue: () => Unit,
    controlElement: HTMLElement,
    cx: (js.UndefOr[Null | String], js.UndefOr[ClassNamesState], js.UndefOr[String]) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[OptionType],
    hasValue: Boolean,
    isMulti: Boolean,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    options: OptionsType[OptionType],
    selectOption: OptionType => Unit,
    selectProps: Props[OptionType],
    setValue: (ValueType[OptionType], ActionTypes) => Unit
  ): Builder[OptionType] = {
    val __props = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], clearValue = js.Any.fromFunction0(clearValue), controlElement = controlElement.asInstanceOf[js.Any], cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder[OptionType](js.Array(this.component, __props.asInstanceOf[MenuPortalProps[OptionType]]))
  }
}

