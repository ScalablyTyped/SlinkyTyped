package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.sidebarMod.SidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sidebar {
  
  @scala.inline
  def apply(onHide: () => Unit): Builder = {
    val __props = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    new Builder(js.Array(this.component, __props.asInstanceOf[SidebarProps]))
  }
  
  @JSImport("primereact/sidebar", "Sidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactSidebarMod.Sidebar] {
    
    @scala.inline
    def ariaCloseLabel(value: String): this.type = set("ariaCloseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockScroll(value: Boolean): this.type = set("blockScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissable(value: Boolean): this.type = set("dismissable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullScreen(value: Boolean): this.type = set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icons(value: /* props */ js.Object => _): this.type = set("icons", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modal(value: Boolean): this.type = set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCloseIcon(value: Boolean): this.type = set("showCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
