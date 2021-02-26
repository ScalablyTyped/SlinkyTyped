package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueConfiguration extends StObject {
  
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: EventList = js.native
  
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  
  var Id: js.UndefOr[NotificationId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var QueueArn: typingsSlinky.awsSdk.s3Mod.QueueArn = js.native
}
object QueueConfiguration {
  
  @scala.inline
  def apply(Events: EventList, QueueArn: QueueArn): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfiguration]
  }
  
  @scala.inline
  implicit class QueueConfigurationMutableBuilder[Self <: QueueConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setQueueArn(value: QueueArn): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
  }
}
