package typingsSlinky.reactTypingAnimation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTypingAnimation.mod.Typing.BackspaceProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Backspace {
  @JSImport("react-typing-animation", "default.Backspace")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Backspace] {
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BackspaceProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Backspace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

