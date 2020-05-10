package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonColor
import typingsSlinky.reactNativeMaterialUi.AnonStrokeContainer
import typingsSlinky.reactNativeMaterialUi.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  @JSImport("react-native-material-ui", "Badge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Badge] {
    @scala.inline
    def accent(value: Boolean): this.type = set("accent", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: String | AnonColor): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def stroke(value: Double): this.type = set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: AnonStrokeContainer): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

