package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Option
import typingsSlinky.primereact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownItem {
  
  @JSImport("primereact/components/dropdown/DropdownItem", "DropdownItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.dropdownItemMod.DropdownItem] {
    
    @scala.inline
    def onClick(value: /* e */ Option => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def option(value: js.Object): this.type = set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def template(value: /* option */ js.Any => js.UndefOr[ReactElement]): this.type = set("template", js.Any.fromFunction1(value))
  }
  
  def withProps(p: DropdownItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DropdownItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
