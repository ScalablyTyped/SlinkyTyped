package typingsSlinky.reactFrameComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactFrameComponent.mod.FrameContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FrameContextProvider {
  
  @scala.inline
  def apply(value: FrameContextProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[FrameContextProps]]))
  }
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[FrameContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
