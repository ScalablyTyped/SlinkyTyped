package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateApprovedOriginRequest extends js.Object {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The domain to add to your allow list.
    */
  var Origin: typingsSlinky.awsSdk.connectMod.Origin = js.native
}
object AssociateApprovedOriginRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, Origin: Origin): AssociateApprovedOriginRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApprovedOriginRequest]
  }
  
  @scala.inline
  implicit class AssociateApprovedOriginRequestOps[Self <: AssociateApprovedOriginRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Origin): Self = this.set("Origin", value.asInstanceOf[js.Any])
  }
}
