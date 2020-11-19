package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUsagePlanKeyRequest extends js.Object {
  
  /**
    * [Required] The identifier of a UsagePlanKey resource for a plan customer.
    */
  var keyId: String = js.native
  
  /**
    * [Required] The type of a UsagePlanKey resource for a plan customer.
    */
  var keyType: String = js.native
  
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-created UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String = js.native
}
object CreateUsagePlanKeyRequest {
  
  @scala.inline
  def apply(keyId: String, keyType: String, usagePlanId: String): CreateUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanKeyRequest]
  }
  
  @scala.inline
  implicit class CreateUsagePlanKeyRequestOps[Self <: CreateUsagePlanKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePlanId(value: String): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
  }
}
