package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureSb.anon.Author
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends ExtendedBase {
  
  var CountDetails: StringDictionary[String] = js.native
  
  var DeadLetteringOnFilterEvaluationExceptions: String = js.native
  
  var DeadLetteringOnMessageExpiration: String = js.native
  
  var LockDuration: String = js.native
  
  var MaxDeliveryCount: String = js.native
  
  var MessageCount: String = js.native
  
  var RequiresSession: String = js.native
  
  var SubscriptionName: String = js.native
  
  var TopicName: String = js.native
}
object Subscription {
  
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CountDetails: StringDictionary[String],
    CreatedAt: DateString,
    DeadLetteringOnFilterEvaluationExceptions: String,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    LockDuration: String,
    MaxDeliveryCount: String,
    MaxSizeInMegabytes: String,
    MessageCount: String,
    RequiresDuplicateDetection: String,
    RequiresSession: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SubscriptionName: String,
    TopicName: String,
    UpdatedAt: DateString,
    _underscore: Author
  ): Subscription = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CountDetails = CountDetails.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountDetails(value: StringDictionary[String]): Self = StObject.set(x, "CountDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetteringOnFilterEvaluationExceptions(value: String): Self = StObject.set(x, "DeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeliveryCount(value: String): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCount(value: String): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSession(value: String): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
