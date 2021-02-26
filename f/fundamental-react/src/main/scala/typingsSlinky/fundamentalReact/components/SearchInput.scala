package typingsSlinky.fundamentalReact.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.Callback
import typingsSlinky.fundamentalReact.anon.Text
import typingsSlinky.fundamentalReact.searchInputMod.SearchInputProps
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchInput {
  
  @JSImport("fundamental-react", "SearchInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.SearchInput] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inShellbar(value: Boolean): this.type = set("inShellbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputGroupAddonProps(value: js.Any): this.type = set("inputGroupAddonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputGroupProps(value: js.Any): this.type = set("inputGroupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: js.Any): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listProps(value: js.Any): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noSearchBtn(value: Boolean): this.type = set("noSearchBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnter(value: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popoverProps(value: js.Any): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchBtnProps(value: js.Any): this.type = set("searchBtnProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchList(value: js.Array[Callback]): this.type = set("searchList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchListVarargs(value: Callback*): this.type = set("searchList", js.Array(value :_*))
    
    @scala.inline
    def validationState(value: Text): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
