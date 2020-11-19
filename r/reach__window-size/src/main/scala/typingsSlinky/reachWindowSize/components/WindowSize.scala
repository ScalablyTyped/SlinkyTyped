package typingsSlinky.reachWindowSize.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachWindowSize.anon.Height
import typingsSlinky.reachWindowSize.mod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowSize {
  
  @JSImport("@reach/window-size", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: WindowSizeProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: Height => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[WindowSizeProps]))
  }
}
