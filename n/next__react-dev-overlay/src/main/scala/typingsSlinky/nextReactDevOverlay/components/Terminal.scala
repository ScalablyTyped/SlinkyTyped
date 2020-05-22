package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.terminalTerminalMod.TerminalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Terminal {
  @JSImport("@next/react-dev-overlay/lib/internal/components/Terminal", "Terminal")
  @js.native
  object component extends js.Object
  
  def withProps(p: TerminalProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TerminalProps]))
  }
}

