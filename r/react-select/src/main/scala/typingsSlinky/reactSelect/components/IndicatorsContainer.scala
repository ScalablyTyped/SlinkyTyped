package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.containersMod.IndicatorContainerProps
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndicatorsContainer {
  
  @JSImport("react-select", "components.IndicatorsContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IndicatorContainerProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    clearValue: () => Unit,
    cx: (js.UndefOr[ClassNamesState], js.UndefOr[String]) => String,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    isDisabled: Boolean,
    isMulti: Boolean,
    isRtl: Boolean,
    options: OptionsType[js.Any],
    selectOption: js.Any => Unit,
    selectProps: Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder(js.Array(this.component, __props.asInstanceOf[IndicatorContainerProps[js.Any]]))
  }
}
