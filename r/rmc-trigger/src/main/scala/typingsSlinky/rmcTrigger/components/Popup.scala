package typingsSlinky.rmcTrigger.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcTrigger.popupMod.IPopupProps
import typingsSlinky.rmcTrigger.popupMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @JSImport("rmc-trigger/lib/Popup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def align(value: js.Any): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getClassNameFromAlign(value: js.Function): this.type = set("getClassNameFromAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getRootDomNode(value: js.Function): this.type = set("getRootDomNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskAnimation(value: String): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String | js.Object): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAlign(value: js.Function): this.type = set("onAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimateLeave(value: js.Function): this.type = set("onAnimateLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String | js.Object): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
