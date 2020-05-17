package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Image
import typingsSlinky.reactNativeMaterialUi.anon.ContainerContentContainer
import typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeader {
  @JSImport("react-native-material-ui", "Drawer.Header")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Header] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def image(value: js.Array[Image]): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ContainerContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DrawerHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

