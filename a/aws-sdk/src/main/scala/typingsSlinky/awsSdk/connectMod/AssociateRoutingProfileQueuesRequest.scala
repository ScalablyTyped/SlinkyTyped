package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateRoutingProfileQueuesRequest extends js.Object {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The queues to associate with this routing profile.
    */
  var QueueConfigs: RoutingProfileQueueConfigList = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typingsSlinky.awsSdk.connectMod.RoutingProfileId = js.native
}
object AssociateRoutingProfileQueuesRequest {
  
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    QueueConfigs: RoutingProfileQueueConfigList,
    RoutingProfileId: RoutingProfileId
  ): AssociateRoutingProfileQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueConfigs = QueueConfigs.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRoutingProfileQueuesRequest]
  }
  
  @scala.inline
  implicit class AssociateRoutingProfileQueuesRequestOps[Self <: AssociateRoutingProfileQueuesRequest] (val x: Self) extends AnyVal {
    
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
    def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = this.set("QueueConfigs", js.Array(value :_*))
    
    @scala.inline
    def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = this.set("QueueConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
