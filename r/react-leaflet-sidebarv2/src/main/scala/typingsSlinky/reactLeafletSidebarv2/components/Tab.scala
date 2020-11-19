package typingsSlinky.reactLeafletSidebarv2.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeafletSidebarv2.mod.Anchor
import typingsSlinky.reactLeafletSidebarv2.mod.Icon
import typingsSlinky.reactLeafletSidebarv2.mod.Position
import typingsSlinky.reactLeafletSidebarv2.mod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeafletSidebarv2.mod.Tab] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchor(value: Anchor): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Icon): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(header: String, icon: Icon, id: String): Builder = {
    val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabProps]))
  }
}
