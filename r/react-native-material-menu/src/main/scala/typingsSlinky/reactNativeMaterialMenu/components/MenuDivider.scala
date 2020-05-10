package typingsSlinky.reactNativeMaterialMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialMenu.mod.MenuDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuDivider {
  @JSImport("react-native-material-menu", "MenuDivider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuDivider] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuDividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuDivider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

