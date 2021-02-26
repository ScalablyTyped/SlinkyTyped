package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAuthorizerResponse extends StObject {
  
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}
object UpdateAuthorizerResponse {
  
  @scala.inline
  def apply(): UpdateAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAuthorizerResponse]
  }
  
  @scala.inline
  implicit class UpdateAuthorizerResponseMutableBuilder[Self <: UpdateAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerArn(value: AuthorizerArn): Self = StObject.set(x, "authorizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerArnUndefined: Self = StObject.set(x, "authorizerArn", js.undefined)
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerNameUndefined: Self = StObject.set(x, "authorizerName", js.undefined)
  }
}
