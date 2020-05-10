package typingsSlinky.reactTypingAnimation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactTypingAnimation.mod.Typing.SpeedProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Speed {
  @JSImport("react-typing-animation", "default.Speed")
  @js.native
  object component extends js.Object
  
  def withProps(p: SpeedProperties): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] = new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(ms: Double): Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed] = {
    val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactTypingAnimation.mod.default.Speed](js.Array(this.component, __props.asInstanceOf[SpeedProperties]))
  }
}

