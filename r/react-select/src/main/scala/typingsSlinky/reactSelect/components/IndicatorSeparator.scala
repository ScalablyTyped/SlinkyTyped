package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.indicatorsMod.IndicatorProps
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndicatorSeparator {
  
  @scala.inline
  def apply(
    clearValue: () => Unit,
    cx: (js.UndefOr[ClassNamesState], js.UndefOr[String]) => String,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    innerProps: js.Any,
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    isRtl: Boolean,
    options: OptionsType[js.Any],
    selectOption: js.Any => Unit,
    selectProps: Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit
  ): SharedBuilder_IndicatorProps_1609693056 = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new SharedBuilder_IndicatorProps_1609693056(js.Array(this.component, __props.asInstanceOf[IndicatorProps[js.Any]]))
  }
  
  @JSImport("react-select/src/components/indicators", "IndicatorSeparator")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IndicatorProps[js.Any]): SharedBuilder_IndicatorProps_1609693056 = new SharedBuilder_IndicatorProps_1609693056(js.Array(this.component, p.asInstanceOf[js.Any]))
}
