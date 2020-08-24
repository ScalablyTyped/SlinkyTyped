package typingsSlinky.reactMdTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdTabs.panelGroupMod.PanelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelGroup {
  @JSImport("@react-md/tabs/types/PanelGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PanelGroupProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(disableTransition: Boolean, persistent: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(disableTransition = disableTransition.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PanelGroupProps]))
  }
}

