package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.megaMenuMod.MegaMenuProps
import typingsSlinky.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MegaMenu {
  
  @JSImport("primereact/megamenu", "MegaMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactMegamenuMod.MegaMenu] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modelVarargs(value: MenuItem*): this.type = set("model", js.Array(value :_*))
    
    @scala.inline
    def model(value: js.Array[MenuItem]): this.type = set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MegaMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MegaMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
