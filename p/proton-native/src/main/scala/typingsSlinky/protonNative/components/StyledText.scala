package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.AnonBackgroundColor
import typingsSlinky.protonNative.mod.StyledTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledText {
  @JSImport("proton-native", "StyledText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.StyledText] {
    @scala.inline
    def style(value: AnonBackgroundColor): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def x(value: Double | String): this.type = set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def y(value: Double | String): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyledTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StyledText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

