package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveDomainAuthCodeResponse extends StObject {
  
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode = js.native
}
object RetrieveDomainAuthCodeResponse {
  
  @scala.inline
  def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
  
  @scala.inline
  implicit class RetrieveDomainAuthCodeResponseMutableBuilder[Self <: RetrieveDomainAuthCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCode(value: DomainAuthCode): Self = StObject.set(x, "AuthCode", value.asInstanceOf[js.Any])
  }
}
