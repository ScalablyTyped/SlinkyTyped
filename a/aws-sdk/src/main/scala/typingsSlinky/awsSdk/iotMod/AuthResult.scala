package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthResult extends StObject {
  
  /**
    * The policies and statements that allowed the specified action.
    */
  var allowed: js.UndefOr[Allowed] = js.native
  
  /**
    * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
    */
  var authDecision: js.UndefOr[AuthDecision] = js.native
  
  /**
    * Authorization information.
    */
  var authInfo: js.UndefOr[AuthInfo] = js.native
  
  /**
    * The policies and statements that denied the specified action.
    */
  var denied: js.UndefOr[Denied] = js.native
  
  /**
    * Contains any missing context values found while evaluating policy.
    */
  var missingContextValues: js.UndefOr[MissingContextValues] = js.native
}
object AuthResult {
  
  @scala.inline
  def apply(): AuthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthResult]
  }
  
  @scala.inline
  implicit class AuthResultMutableBuilder[Self <: AuthResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: Allowed): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setAuthDecision(value: AuthDecision): Self = StObject.set(x, "authDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthDecisionUndefined: Self = StObject.set(x, "authDecision", js.undefined)
    
    @scala.inline
    def setAuthInfo(value: AuthInfo): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthInfoUndefined: Self = StObject.set(x, "authInfo", js.undefined)
    
    @scala.inline
    def setDenied(value: Denied): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeniedUndefined: Self = StObject.set(x, "denied", js.undefined)
    
    @scala.inline
    def setMissingContextValues(value: MissingContextValues): Self = StObject.set(x, "missingContextValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingContextValuesUndefined: Self = StObject.set(x, "missingContextValues", js.undefined)
    
    @scala.inline
    def setMissingContextValuesVarargs(value: MissingContextValue*): Self = StObject.set(x, "missingContextValues", js.Array(value :_*))
  }
}
