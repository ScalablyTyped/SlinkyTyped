package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAuditSuppressionRequest extends js.Object {
  
  var checkName: AuditCheckName = js.native
  
  var resourceIdentifier: ResourceIdentifier = js.native
}
object DeleteAuditSuppressionRequest {
  
  @scala.inline
  def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): DeleteAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit class DeleteAuditSuppressionRequestOps[Self <: DeleteAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
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
    def setCheckName(value: AuditCheckName): Self = this.set("checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
