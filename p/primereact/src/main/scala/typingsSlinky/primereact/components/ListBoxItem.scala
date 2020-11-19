package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.OptionOriginalEvent
import typingsSlinky.primereact.listBoxItemMod.ListBoxItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBoxItem {
  
  @JSImport("primereact/components/listbox/ListBoxItem", "ListBoxItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.listBoxItemMod.ListBoxItem] {
    
    @scala.inline
    def onClick(value: /* e */ OptionOriginalEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: /* e */ OptionOriginalEvent => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def option(value: js.Any): this.type = set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def template(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("template", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ListBoxItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListBoxItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
