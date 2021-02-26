package typingsSlinky.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorize extends StObject {
  
  var Authorize: String = js.native
  
  var Decline: String = js.native
  
  var Fail: String = js.native
}
object Authorize {
  
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize.asInstanceOf[js.Any], Decline = Decline.asInstanceOf[js.Any], Fail = Fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorize]
  }
  
  @scala.inline
  implicit class AuthorizeMutableBuilder[Self <: Authorize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorize(value: String): Self = StObject.set(x, "Authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecline(value: String): Self = StObject.set(x, "Decline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: String): Self = StObject.set(x, "Fail", value.asInstanceOf[js.Any])
  }
}
