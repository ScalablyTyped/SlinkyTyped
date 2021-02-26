package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResultIntermediate extends StObject {
  
  val AttemptIdentifier: String = js.native
  
  val AuthenticationData: INamedValues = js.native
}
object IAuthenticationResultIntermediate {
  
  @scala.inline
  def apply(AttemptIdentifier: String, AuthenticationData: INamedValues): IAuthenticationResultIntermediate = {
    val __obj = js.Dynamic.literal(AttemptIdentifier = AttemptIdentifier.asInstanceOf[js.Any], AuthenticationData = AuthenticationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultIntermediate]
  }
  
  @scala.inline
  implicit class IAuthenticationResultIntermediateMutableBuilder[Self <: IAuthenticationResultIntermediate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptIdentifier(value: String): Self = StObject.set(x, "AttemptIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationData(value: INamedValues): Self = StObject.set(x, "AuthenticationData", value.asInstanceOf[js.Any])
  }
}
