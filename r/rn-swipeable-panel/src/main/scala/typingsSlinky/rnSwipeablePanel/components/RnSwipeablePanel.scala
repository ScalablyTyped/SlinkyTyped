package typingsSlinky.rnSwipeablePanel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rnSwipeablePanel.mod.SwipeablePanelProps
import typingsSlinky.rnSwipeablePanel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RnSwipeablePanel {
  
  @JSImport("rn-swipeable-panel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def allowTouchOutside(value: Boolean): this.type = set("allowTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barStyle(value: js.Object): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconStyle(value: js.Object): this.type = set("closeIconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnTouchOutside(value: Boolean): this.type = set("closeOnTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeRootStyle(value: js.Object): this.type = set("closeRootStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noBackgroundOpacity(value: Boolean): this.type = set("noBackgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noBar(value: Boolean): this.type = set("noBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onlyLarge(value: Boolean): this.type = set("onlyLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onlySmall(value: Boolean): this.type = set("onlySmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openLarge(value: Boolean): this.type = set("openLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwipeablePanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isActive: Boolean, onClose: () => Unit): Builder = {
    val __props = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    new Builder(js.Array(this.component, __props.asInstanceOf[SwipeablePanelProps]))
  }
}
