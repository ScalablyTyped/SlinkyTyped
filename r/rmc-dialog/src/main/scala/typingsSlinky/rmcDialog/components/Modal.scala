package typingsSlinky.rmcDialog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.rmcDialog.modalMod.IModalPropTypes
import typingsSlinky.rmcDialog.modalMod.default
import typingsSlinky.rmcDialog.rmcDialogStrings.`slide-down`
import typingsSlinky.rmcDialog.rmcDialogStrings.`slide-up`
import typingsSlinky.rmcDialog.rmcDialogStrings.fade
import typingsSlinky.rmcDialog.rmcDialogStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @scala.inline
  def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IModalPropTypes]))
  }
  
  @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animateAppear(value: Boolean): this.type = set("animateAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: ViewStyle): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapStyle(value: ViewStyle): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IModalPropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
