package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureSb.anon.Author
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends ExtendedBase {
  var AccessedAt: DateString = js.native
  var CountDetails: StringDictionary[String] = js.native
  var EnableSubscriptionPartitioning: String = js.native
  var FilteringMessagesBeforePublishing: String = js.native
  var IsExpress: String = js.native
  var SubscriptionCount: String = js.native
  var SupportOrdering: String = js.native
  var TopicName: String = js.native
}

object Topic {
  @scala.inline
  def apply(
    AccessedAt: DateString,
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CountDetails: StringDictionary[String],
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EnableSubscriptionPartitioning: String,
    EntityAvailabilityStatus: String,
    FilteringMessagesBeforePublishing: String,
    IsAnonymousAccessible: String,
    IsExpress: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SubscriptionCount: String,
    SupportOrdering: String,
    TopicName: String,
    UpdatedAt: DateString,
    _underscore: Author
  ): Topic = {
    val __obj = js.Dynamic.literal(AccessedAt = AccessedAt.asInstanceOf[js.Any], AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CountDetails = CountDetails.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EnableSubscriptionPartitioning = EnableSubscriptionPartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], FilteringMessagesBeforePublishing = FilteringMessagesBeforePublishing.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], IsExpress = IsExpress.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubscriptionCount = SubscriptionCount.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessedAt(value: DateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountDetails(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSubscriptionPartitioning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSubscriptionPartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteringMessagesBeforePublishing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilteringMessagesBeforePublishing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportOrdering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

