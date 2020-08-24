package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.mod.MenuItemProps
import typingsSlinky.protonNative.protonNativeStrings.About
import typingsSlinky.protonNative.protonNativeStrings.Check
import typingsSlinky.protonNative.protonNativeStrings.Item
import typingsSlinky.protonNative.protonNativeStrings.Preferences
import typingsSlinky.protonNative.protonNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  @JSImport("proton-native", "MenuItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.MenuItem] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* checked */ Boolean => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def `type`(
      value: Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

