package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.mod.RippleFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RippleFeedback {
  @JSImport("react-native-material-ui", "RippleFeedback")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.RippleFeedback] {
    @scala.inline
    def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RippleFeedbackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RippleFeedback.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

