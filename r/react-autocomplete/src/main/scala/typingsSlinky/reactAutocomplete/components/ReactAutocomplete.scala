package typingsSlinky.reactAutocomplete.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactAutocomplete.mod.Props
import typingsSlinky.reactAutocomplete.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAutocomplete {
  
  @scala.inline
  def apply(
    getItemValue: js.Any => String,
    items: js.Array[_],
    renderItem: (js.Any, Boolean, js.UndefOr[CSSProperties]) => ReactElement,
    value: js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(getItemValue = js.Any.fromFunction1(getItemValue), items = items.asInstanceOf[js.Any], renderItem = js.Any.fromFunction3(renderItem), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-autocomplete", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def autoHighlight(value: Boolean): this.type = set("autoHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: HTMLProps[HTMLInputElement]): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isItemSelectable(value: /* item */ js.Any => Boolean): this.type = set("isItemSelectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* e */ ChangeEvent[HTMLInputElement], /* value */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMenuVisibilityChange(value: /* isOpen */ Boolean => Unit): this.type = set("onMenuVisibilityChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: (/* value */ String, /* item */ js.Any) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderInput(value: /* props */ HTMLProps[HTMLInputElement] => ReactElement): this.type = set("renderInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderMenu(
      value: (/* items */ js.Array[ReactElement], /* value */ String, /* styles */ CSSProperties) => ReactElement
    ): this.type = set("renderMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def selectOnBlur(value: Boolean): this.type = set("selectOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldItemRender(value: (/* item */ js.Any, /* value */ String) => Boolean): this.type = set("shouldItemRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def sortItems(value: (/* a */ js.Any, /* b */ js.Any, /* value */ String) => Double): this.type = set("sortItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def wrapperProps(value: HTMLProps[HTMLDivElement]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
