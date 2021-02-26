package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationResponseDetails extends StObject {
  
  var url: String = js.native
}
object AuthenticationResponseDetails {
  
  @scala.inline
  def apply(url: String): AuthenticationResponseDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResponseDetails]
  }
  
  @scala.inline
  implicit class AuthenticationResponseDetailsMutableBuilder[Self <: AuthenticationResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
