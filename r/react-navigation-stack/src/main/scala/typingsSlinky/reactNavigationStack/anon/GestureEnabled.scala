package typingsSlinky.reactNavigationStack.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureEnabled extends js.Object {
  
  var gestureEnabled: Boolean = js.native
  
  var gestureVelocityImpact: Double = js.native
  
  def overlay(hasStyle: StyleWithAnimatedValue): ReactElement | Null = js.native
  
  var overlayEnabled: Boolean = js.native
  
  var shadowEnabled: Boolean = js.native
}
object GestureEnabled {
  
  @scala.inline
  def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlay: StyleWithAnimatedValue => ReactElement | Null,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): GestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEnabled]
  }
  
  @scala.inline
  implicit class GestureEnabledOps[Self <: GestureEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = this.set("gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: StyleWithAnimatedValue => ReactElement | Null): Self = this.set("overlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverlayEnabled(value: Boolean): Self = this.set("overlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = this.set("shadowEnabled", value.asInstanceOf[js.Any])
  }
}
