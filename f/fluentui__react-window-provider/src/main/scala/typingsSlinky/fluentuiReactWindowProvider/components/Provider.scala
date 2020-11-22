package typingsSlinky.fluentuiReactWindowProvider.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "WindowContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[WindowProviderProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: WindowProviderProps): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[WindowProviderProps]]))
  }
}
