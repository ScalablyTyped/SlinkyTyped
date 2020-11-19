package typingsSlinky.reactLeafletSidebarv2.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeafletSidebarv2.mod.Icon
import typingsSlinky.reactLeafletSidebarv2.mod.Position
import typingsSlinky.reactLeafletSidebarv2.mod.SidebarProps
import typingsSlinky.reactLeafletSidebarv2.mod.TabType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sidebar {
  
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeafletSidebarv2.mod.Sidebar] {
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Icon): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onOpen(value: /* id */ String => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SidebarProps]))
  }
}
