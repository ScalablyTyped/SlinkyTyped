package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfileQueueReference extends StObject {
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var Channel: typingsSlinky.awsSdk.connectMod.Channel = js.native
  
  /**
    * The identifier of the queue.
    */
  var QueueId: typingsSlinky.awsSdk.connectMod.QueueId = js.native
}
object RoutingProfileQueueReference {
  
  @scala.inline
  def apply(Channel: Channel, QueueId: QueueId): RoutingProfileQueueReference = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueReference]
  }
  
  @scala.inline
  implicit class RoutingProfileQueueReferenceMutableBuilder[Self <: RoutingProfileQueueReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
