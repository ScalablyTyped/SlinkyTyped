package typingsSlinky.reactCloseOnEscape.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactCloseOnEscape.mod.CloseOnEscapeProps
import typingsSlinky.reactCloseOnEscape.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCloseOnEscape {
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CloseOnEscapeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onEscape: () => Unit): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[CloseOnEscapeProps]))
  }
}

