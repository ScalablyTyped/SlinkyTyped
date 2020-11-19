package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiMappingRequest extends js.Object {
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  
  /**
    * The domain name.
    */
  var DomainName: string = js.native
}
object DeleteApiMappingRequest {
  
  @scala.inline
  def apply(ApiMappingId: string, DomainName: string): DeleteApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiMappingRequest]
  }
  
  @scala.inline
  implicit class DeleteApiMappingRequestOps[Self <: DeleteApiMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiMappingId(value: string): Self = this.set("ApiMappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: string): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
}
