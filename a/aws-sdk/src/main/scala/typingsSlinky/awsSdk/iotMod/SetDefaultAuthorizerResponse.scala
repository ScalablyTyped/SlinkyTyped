package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDefaultAuthorizerResponse extends js.Object {
  
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}
object SetDefaultAuthorizerResponse {
  
  @scala.inline
  def apply(): SetDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDefaultAuthorizerResponse]
  }
  
  @scala.inline
  implicit class SetDefaultAuthorizerResponseOps[Self <: SetDefaultAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizerArn(value: AuthorizerArn): Self = this.set("authorizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerArn: Self = this.set("authorizerArn", js.undefined)
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = this.set("authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerName: Self = this.set("authorizerName", js.undefined)
  }
}
