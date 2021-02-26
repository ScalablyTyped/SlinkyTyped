package typingsSlinky.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhiteColor extends StObject {
  
  var normal: String = js.native
  
  var normalActive: String = js.native
  
  var normalHover: String = js.native
}
object WhiteColor {
  
  @scala.inline
  def apply(normal: String, normalActive: String, normalHover: String): WhiteColor = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteColor]
  }
  
  @scala.inline
  implicit class WhiteColorMutableBuilder[Self <: WhiteColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}
