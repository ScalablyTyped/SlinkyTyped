package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.ContainerViewStyle
import typingsSlinky.reactNativeMaterialUi.mod.BottomNavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigation {
  @JSImport("react-native-material-ui", "BottomNavigation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.BottomNavigation] {
    @scala.inline
    def active(value: String): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ContainerViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomNavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BottomNavigation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

