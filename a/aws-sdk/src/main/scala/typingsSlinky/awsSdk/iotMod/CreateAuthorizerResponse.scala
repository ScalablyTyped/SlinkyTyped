package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAuthorizerResponse extends StObject {
  
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  
  /**
    * The authorizer's name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}
object CreateAuthorizerResponse {
  
  @scala.inline
  def apply(): CreateAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAuthorizerResponse]
  }
  
  @scala.inline
  implicit class CreateAuthorizerResponseMutableBuilder[Self <: CreateAuthorizerResponse] (val x: Self) extends AnyVal {
    
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
