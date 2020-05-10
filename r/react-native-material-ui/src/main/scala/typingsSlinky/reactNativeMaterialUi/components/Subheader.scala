package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonText
import typingsSlinky.reactNativeMaterialUi.mod.SubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subheader {
  @JSImport("react-native-material-ui", "Subheader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Subheader] {
    @scala.inline
    def inset(value: Boolean): this.type = set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonText): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SubheaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SubheaderProps]))
  }
}

