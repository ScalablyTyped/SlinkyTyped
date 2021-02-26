package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateRoutingProfileQueuesRequest extends StObject {
  
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
  implicit class AssociateRoutingProfileQueuesRequestMutableBuilder[Self <: AssociateRoutingProfileQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = StObject.set(x, "QueueConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = StObject.set(x, "QueueConfigs", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
