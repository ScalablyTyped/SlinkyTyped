package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonContainerViewStyle
import typingsSlinky.reactNativeMaterialUi.mod.DividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Divider {
  @JSImport("react-native-material-ui", "Divider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Divider] {
    @scala.inline
    def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonContainerViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Divider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

