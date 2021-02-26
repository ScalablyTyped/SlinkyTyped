package typingsSlinky.reactCloseOnEscape.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactCloseOnEscape.mod.CloseOnEscapeProps
import typingsSlinky.reactCloseOnEscape.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCloseOnEscape {
  
  @scala.inline
  def apply(onEscape: () => Unit): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[CloseOnEscapeProps]))
  }
  
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CloseOnEscapeProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
