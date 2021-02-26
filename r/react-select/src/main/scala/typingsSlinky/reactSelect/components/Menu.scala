package typingsSlinky.reactSelect.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSelect.menuMod.MenuProps
import typingsSlinky.reactSelect.menuMod.MenuState
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.InnerRef
import typingsSlinky.reactSelect.typesMod.MenuPlacement
import typingsSlinky.reactSelect.typesMod.MenuPosition
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @scala.inline
  def apply(
    clearValue: () => Unit,
    cx: (js.UndefOr[ClassNamesState], js.UndefOr[String]) => String,
    getPortalPlacement: MenuState => Unit,
    getStyles: (String, js.Any) => js.Object,
    getValue: () => ValueType[js.Any],
    hasValue: Boolean,
    innerProps: js.Object,
    isMulti: Boolean,
    maxMenuHeight: Double,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    menuShouldScrollIntoView: Boolean,
    minMenuHeight: Double,
    options: OptionsType[js.Any],
    selectOption: js.Any => Unit,
    selectProps: Props[js.Any],
    setValue: (ValueType[js.Any], ActionTypes) => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(clearValue = js.Any.fromFunction0(clearValue), cx = js.Any.fromFunction2(cx), getPortalPlacement = js.Any.fromFunction1(getPortalPlacement), getStyles = js.Any.fromFunction2(getStyles), getValue = js.Any.fromFunction0(getValue), hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue))
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuProps[js.Any]]))
  }
  
  @JSImport("react-select", "components.Menu")
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
  
  def withProps(p: MenuProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
