package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ItemAny
import typingsSlinky.baseui.sideNavigationMod.Item
import typingsSlinky.baseui.sideNavigationMod.NavItemOverrides
import typingsSlinky.baseui.sideNavigationMod.NavItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavItem {
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.sideNavigationMod.NavItem] {
    @scala.inline
    def $active(value: Boolean): this.type = set("$active", value.asInstanceOf[js.Any])
    @scala.inline
    def $level(value: Double): this.type = set("$level", value.asInstanceOf[js.Any])
    @scala.inline
    def $selectable(value: Boolean): this.type = set("$selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: /* args */ ItemAny => _): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: NavItemOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(item: Item): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavItemProps]))
  }
}

