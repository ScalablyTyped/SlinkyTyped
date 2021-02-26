package typingsSlinky.reactSelect.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.menuMod.MenuListComponentProps
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.InnerRef
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuList {
  
  @scala.inline
  def apply(
    clearValue: () => Unit,
    cx: (js.UndefOr[ClassNamesState], js.UndefOr[String]) => String,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    isMulti: Boolean,
    maxHeight: Double,
    options: OptionsType[js.Any],
    selectOption: js.Any => Unit,
    selectProps: Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuListComponentProps[js.Any]]))
  }
  
  @JSImport("react-select", "components.MenuList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRef(value: InnerRef): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ js.Any | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[js.Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuListComponentProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
