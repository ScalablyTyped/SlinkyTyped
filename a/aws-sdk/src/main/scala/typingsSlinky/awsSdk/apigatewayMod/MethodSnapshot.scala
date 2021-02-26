package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSnapshot extends StObject {
  
  /**
    * Specifies whether the method requires a valid ApiKey.
    */
  var apiKeyRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.native
}
object MethodSnapshot {
  
  @scala.inline
  def apply(): MethodSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSnapshot]
  }
  
  @scala.inline
  implicit class MethodSnapshotMutableBuilder[Self <: MethodSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeyRequired(value: Boolean): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
    
    @scala.inline
    def setAuthorizationType(value: String): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationTypeUndefined: Self = StObject.set(x, "authorizationType", js.undefined)
  }
}
