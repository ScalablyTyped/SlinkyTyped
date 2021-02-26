package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpBoolean extends Boolean {
  
  var alpha: scala.Boolean = js.native
  
  var animation: scala.Boolean = js.native
  
  var lossless: scala.Boolean = js.native
}
object WebpBoolean {
  
  @scala.inline
  def apply(alpha: scala.Boolean, animation: scala.Boolean, lossless: scala.Boolean): WebpBoolean = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], lossless = lossless.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpBoolean]
  }
  
  @scala.inline
  implicit class WebpBooleanMutableBuilder[Self <: WebpBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: scala.Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLossless(value: scala.Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
  }
}
