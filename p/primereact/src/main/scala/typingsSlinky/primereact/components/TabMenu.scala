package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonValue
import typingsSlinky.primereact.menuItemMod.MenuItem
import typingsSlinky.primereact.tabMenuMod.TabMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabMenu {
  @JSImport("primereact/tabmenu", "TabMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTabmenuMod.TabMenu] {
    @scala.inline
    def activeItem(value: js.Any): this.type = set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def model(value: js.Array[MenuItem]): this.type = set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def onTabChange(value: /* e */ AnonValue => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

