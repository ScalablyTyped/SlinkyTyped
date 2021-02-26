package typingsSlinky.reactMdTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactMdTabs.useTabIndicatorStyleMod.UpdateIndicatorStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UpdateIndicatorStylesProvider {
  
  @scala.inline
  def apply(value: () => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = js.Any.fromFunction0(value))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[UpdateIndicatorStyles]]))
  }
  
  @JSImport("@react-md/tabs/types/useTabIndicatorStyle", "UpdateIndicatorStylesProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[UpdateIndicatorStyles]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
