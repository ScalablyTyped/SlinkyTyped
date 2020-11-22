package typingsSlinky.fundamentalReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.li.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.State
import typingsSlinky.fundamentalReact.selectMod.Option
import typingsSlinky.fundamentalReact.selectMod.SelectProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("fundamental-react", "Select")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyAriaLabel(value: String): this.type = set("emptyAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formMessageProps(value: Record[String, _]): this.type = set("formMessageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def includeEmptyOption(value: Boolean): this.type = set("includeEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefClassName(value: String): this.type = set("innerRefClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listItemClassName(value: String): this.type = set("listItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listItemTextClassName(value: String): this.type = set("listItemTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* event */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(
      value: (/* event */ SyntheticMouseEvent[HTMLLIElement] | SyntheticKeyboardEvent[HTMLLIElement], /* selectedOption */ Option) => Unit
    ): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def optionsVarargs(value: Option*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: js.Array[Option]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperClassName(value: String): this.type = set("popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def referenceClassName(value: String): this.type = set("referenceClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textContentClassName(value: String): this.type = set("textContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerClassName(value: String): this.type = set("triggerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperProps(value: Record[String, _]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[SelectProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Select.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
