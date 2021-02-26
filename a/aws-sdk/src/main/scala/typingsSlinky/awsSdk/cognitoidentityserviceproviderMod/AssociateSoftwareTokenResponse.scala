package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSoftwareTokenResponse extends StObject {
  
  /**
    * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
    */
  var SecretCode: js.UndefOr[SecretCodeType] = js.native
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.native
}
object AssociateSoftwareTokenResponse {
  
  @scala.inline
  def apply(): AssociateSoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSoftwareTokenResponse]
  }
  
  @scala.inline
  implicit class AssociateSoftwareTokenResponseMutableBuilder[Self <: AssociateSoftwareTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecretCode(value: SecretCodeType): Self = StObject.set(x, "SecretCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretCodeUndefined: Self = StObject.set(x, "SecretCode", js.undefined)
    
    @scala.inline
    def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
