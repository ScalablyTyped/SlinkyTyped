package typingsSlinky.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialColor extends StObject {
  
  var facebook: String = js.native
  
  var facebookActive: String = js.native
  
  var facebookHover: String = js.native
}
object SocialColor {
  
  @scala.inline
  def apply(facebook: String, facebookActive: String, facebookHover: String): SocialColor = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], facebookActive = facebookActive.asInstanceOf[js.Any], facebookHover = facebookHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialColor]
  }
  
  @scala.inline
  implicit class SocialColorMutableBuilder[Self <: SocialColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookActive(value: String): Self = StObject.set(x, "facebookActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookHover(value: String): Self = StObject.set(x, "facebookHover", value.asInstanceOf[js.Any])
  }
}
