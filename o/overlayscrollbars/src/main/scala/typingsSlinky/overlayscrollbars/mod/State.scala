package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.anon.B
import typingsSlinky.overlayscrollbars.anon.Height
import typingsSlinky.overlayscrollbars.anon.XBoolean
import typingsSlinky.overlayscrollbars.anon.XNumber
import typingsSlinky.overlayscrollbars.anon.Xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var autoUpdate: Boolean = js.native
  
  var contentScrollSize: Height = js.native
  
  var destroyed: Boolean = js.native
  
  var documentMixed: Boolean = js.native
  
  var hasOverflow: XBoolean = js.native
  
  var heightAuto: Boolean = js.native
  
  var hideOverflow: Xs = js.native
  
  var hostSize: Height = js.native
  
  var overflowAmount: XNumber = js.native
  
  var padding: B = js.native
  
  var sleeping: Boolean = js.native
  
  var viewportSize: Height = js.native
  
  var widthAuto: Boolean = js.native
}
object State {
  
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: Height,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: XBoolean,
    heightAuto: Boolean,
    hideOverflow: Xs,
    hostSize: Height,
    overflowAmount: XNumber,
    padding: B,
    sleeping: Boolean,
    viewportSize: Height,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScrollSize(value: Height): Self = StObject.set(x, "contentScrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMixed(value: Boolean): Self = StObject.set(x, "documentMixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOverflow(value: XBoolean): Self = StObject.set(x, "hasOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightAuto(value: Boolean): Self = StObject.set(x, "heightAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOverflow(value: Xs): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostSize(value: Height): Self = StObject.set(x, "hostSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowAmount(value: XNumber): Self = StObject.set(x, "overflowAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: B): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleeping(value: Boolean): Self = StObject.set(x, "sleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportSize(value: Height): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthAuto(value: Boolean): Self = StObject.set(x, "widthAuto", value.asInstanceOf[js.Any])
  }
}
