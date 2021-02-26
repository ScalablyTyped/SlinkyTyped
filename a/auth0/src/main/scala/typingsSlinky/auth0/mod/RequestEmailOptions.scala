package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEmailOptions extends StObject {
  
  var email: String = js.native
}
object RequestEmailOptions {
  
  @scala.inline
  def apply(email: String): RequestEmailOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEmailOptions]
  }
  
  @scala.inline
  implicit class RequestEmailOptionsMutableBuilder[Self <: RequestEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
