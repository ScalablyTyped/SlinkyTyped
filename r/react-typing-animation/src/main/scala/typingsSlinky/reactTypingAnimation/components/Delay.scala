package typingsSlinky.reactTypingAnimation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTypingAnimation.mod.Typing.DelayProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Delay {
  @JSImport("react-typing-animation", "default.Delay")
  @js.native
  object component extends js.Object
  
  def withProps(p: DelayProperties): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay] = new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(ms: Double): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay] = {
    val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Delay](js.Array(this.component, __props.asInstanceOf[DelayProperties]))
  }
}

