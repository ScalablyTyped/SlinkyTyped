package typingsSlinky.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotyAnimationOptions extends StObject {
  
  var close: js.UndefOr[js.Any] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Any] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object NotyAnimationOptions {
  
  @scala.inline
  def apply(): NotyAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyAnimationOptions]
  }
  
  @scala.inline
  implicit class NotyAnimationOptionsMutableBuilder[Self <: NotyAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
