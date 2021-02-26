package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConnectResponseOptions extends StObject {
  
  /**
    * Indicates whether client connect options are enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
    */
  var LambdaFunctionArn: js.UndefOr[String] = js.native
  
  /**
    * The status of any updates to the client connect options.
    */
  var Status: js.UndefOr[ClientVpnEndpointAttributeStatus] = js.native
}
object ClientConnectResponseOptions {
  
  @scala.inline
  def apply(): ClientConnectResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConnectResponseOptions]
  }
  
  @scala.inline
  implicit class ClientConnectResponseOptionsMutableBuilder[Self <: ClientConnectResponseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnEndpointAttributeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
