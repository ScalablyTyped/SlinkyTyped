package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.DrawerProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("material-ui", "Drawer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Drawer] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableSwipeToOpen(value: Boolean): this.type = set("disableSwipeToOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): this.type = set("onRequestChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openSecondary(value: Boolean): this.type = set("openSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeAreaWidth(value: Double): this.type = set("swipeAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
