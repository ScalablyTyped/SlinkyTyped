package typingsSlinky.reactTypingAnimation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTypingAnimation.mod.Typing.ResetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reset {
  @JSImport("react-typing-animation", "default.Reset")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Reset] {
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResetProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Reset.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

