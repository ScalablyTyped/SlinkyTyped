package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.ContainerViewStyle
import typingsSlinky.reactNativeMaterialUi.mod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  @JSImport("react-native-material-ui", "Drawer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Drawer] {
    @scala.inline
    def style(value: ContainerViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

