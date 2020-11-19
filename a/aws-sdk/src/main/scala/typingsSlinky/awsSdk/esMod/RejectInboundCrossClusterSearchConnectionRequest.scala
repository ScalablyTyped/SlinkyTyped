package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectInboundCrossClusterSearchConnectionRequest extends js.Object {
  
  /**
    * The id of the inbound connection that you want to reject.
    */
  var CrossClusterSearchConnectionId: typingsSlinky.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}
object RejectInboundCrossClusterSearchConnectionRequest {
  
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): RejectInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionRequest]
  }
  
  @scala.inline
  implicit class RejectInboundCrossClusterSearchConnectionRequestOps[Self <: RejectInboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = this.set("CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}
