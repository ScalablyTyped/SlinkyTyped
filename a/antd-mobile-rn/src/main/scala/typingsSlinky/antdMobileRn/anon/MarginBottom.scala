package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginBottom extends StObject {
  
  var marginBottom: Double = js.native
  
  var marginRight: Double = js.native
  
  var overflow: String = js.native
}
object MarginBottom {
  
  @scala.inline
  def apply(marginBottom: Double, marginRight: Double, overflow: String): MarginBottom = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginBottom]
  }
  
  @scala.inline
  implicit class MarginBottomMutableBuilder[Self <: MarginBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
