package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.anon.Style
import typingsSlinky.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Placeholder {
  
  @JSImport("react-select", "components.Placeholder")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlaceholderProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    clearValue: () => Unit,
    cx: (js.UndefOr[ClassNamesState], js.UndefOr[String]) => String,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    innerProps: Style,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    options: OptionsType[js.Any],
    selectOption: js.Any => Unit,
    selectProps: Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder(js.Array(this.component, __props.asInstanceOf[PlaceholderProps[js.Any]]))
  }
}
