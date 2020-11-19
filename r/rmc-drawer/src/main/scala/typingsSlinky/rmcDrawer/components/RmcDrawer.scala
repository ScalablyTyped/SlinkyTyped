package typingsSlinky.rmcDrawer.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcDrawer.anon.OverlayClicked
import typingsSlinky.rmcDrawer.anon.PartialDrawerProps
import typingsSlinky.rmcDrawer.mod.^
import typingsSlinky.rmcDrawer.rmcDrawerStrings.bottom
import typingsSlinky.rmcDrawer.rmcDrawerStrings.left
import typingsSlinky.rmcDrawer.rmcDrawerStrings.right
import typingsSlinky.rmcDrawer.rmcDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcDrawer {
  
  @JSImport("rmc-drawer", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragHandleStyle(value: CSSProperties): this.type = set("dragHandleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragToggleDistance(value: Double): this.type = set("dragToggleDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableDragHandle(value: Boolean): this.type = set("enableDragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOpenChange(value: (/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked]) => Unit): this.type = set("onOpenChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: left | right | top | bottom): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarReactElement(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebar(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarStyle(value: CSSProperties): this.type = set("sidebarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitions(value: Boolean): this.type = set("transitions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialDrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RmcDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
