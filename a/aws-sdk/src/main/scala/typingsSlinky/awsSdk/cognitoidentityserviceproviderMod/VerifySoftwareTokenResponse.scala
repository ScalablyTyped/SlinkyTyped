package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifySoftwareTokenResponse extends StObject {
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.native
  
  /**
    * The status of the verify software token.
    */
  var Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.native
}
object VerifySoftwareTokenResponse {
  
  @scala.inline
  def apply(): VerifySoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifySoftwareTokenResponse]
  }
  
  @scala.inline
  implicit class VerifySoftwareTokenResponseMutableBuilder[Self <: VerifySoftwareTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    @scala.inline
    def setStatus(value: VerifySoftwareTokenResponseType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
