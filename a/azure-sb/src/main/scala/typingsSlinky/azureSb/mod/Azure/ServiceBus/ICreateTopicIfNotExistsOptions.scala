package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateTopicIfNotExistsOptions extends ICreateTopicOptions {
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean = js.native
  var EnableDeadLetteringOnMessageExpiration: Boolean = js.native
  var MaxCorrelationFiltersPerTopic: Double = js.native
  var MaxSqlFiltersPerTopic: Double = js.native
  var MaxSubscriptionsPerTopic: Double = js.native
}

object ICreateTopicIfNotExistsOptions {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnableDeadLetteringOnFilterEvaluationExceptions: Boolean,
    EnableDeadLetteringOnMessageExpiration: Boolean,
    EnablePartitioning: Boolean,
    MaxCorrelationFiltersPerTopic: Double,
    MaxSizeInMegabytes: Double,
    MaxSqlFiltersPerTopic: Double,
    MaxSubscriptionsPerTopic: Double,
    RequiresDuplicateDetection: Boolean,
    SizeInBytes: Boolean,
    SupportOrdering: Boolean
  ): ICreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxCorrelationFiltersPerTopic = MaxCorrelationFiltersPerTopic.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MaxSqlFiltersPerTopic = MaxSqlFiltersPerTopic.asInstanceOf[js.Any], MaxSubscriptionsPerTopic = MaxSubscriptionsPerTopic.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateTopicIfNotExistsOptions]
  }
  @scala.inline
  implicit class ICreateTopicIfNotExistsOptionsOps[Self <: ICreateTopicIfNotExistsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCorrelationFiltersPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCorrelationFiltersPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSqlFiltersPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSqlFiltersPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSubscriptionsPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSubscriptionsPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

