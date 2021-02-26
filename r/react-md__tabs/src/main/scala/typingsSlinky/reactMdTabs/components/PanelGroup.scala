package typingsSlinky.reactMdTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdTabs.panelGroupMod.PanelGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelGroup {
  
  @scala.inline
  def apply(disableTransition: Boolean, persistent: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(disableTransition = disableTransition.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PanelGroupProps]))
  }
  
  @JSImport("@react-md/tabs/types/PanelGroup", "PanelGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PanelGroupProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
