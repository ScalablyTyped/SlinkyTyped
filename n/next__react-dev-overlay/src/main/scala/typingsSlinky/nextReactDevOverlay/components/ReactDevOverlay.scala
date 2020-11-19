package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDevOverlay {
  
  @JSImport("@next/react-dev-overlay/lib/client", "ReactDevOverlay")
  @js.native
  object component extends js.Object
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
}
