package typingsSlinky.reactSidebar.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSidebar.mod.SidebarProps
import typingsSlinky.reactSidebar.mod.SidebarStyles
import typingsSlinky.reactSidebar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSidebar {
  
  @JSImport("react-sidebar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentId(value: String): this.type = set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSidebarWidth(value: Double): this.type = set("defaultSidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragToggleDistance(value: Double): this.type = set("dragToggleDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSetOpen(value: /* open */ Boolean => Unit): this.type = set("onSetOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayId(value: String): this.type = set("overlayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pullRight(value: Boolean): this.type = set("pullRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootId(value: String): this.type = set("rootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarReactElement(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebar(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarClassName(value: String): this.type = set("sidebarClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarId(value: String): this.type = set("sidebarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: SidebarStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchHandleWidth(value: Double): this.type = set("touchHandleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitions(value: Boolean): this.type = set("transitions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactSidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
