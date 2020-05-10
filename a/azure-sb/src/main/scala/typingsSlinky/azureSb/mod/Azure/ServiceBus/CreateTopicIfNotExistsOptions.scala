package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicIfNotExistsOptions> */
@js.native
trait CreateTopicIfNotExistsOptions extends js.Object {
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.native
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.native
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  var MaxCorrelationFiltersPerTopic: js.UndefOr[Double] = js.native
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  var MaxSqlFiltersPerTopic: js.UndefOr[Double] = js.native
  var MaxSubscriptionsPerTopic: js.UndefOr[Double] = js.native
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  var SizeInBytes: js.UndefOr[Boolean] = js.native
  var SupportOrdering: js.UndefOr[Boolean] = js.native
}

object CreateTopicIfNotExistsOptions {
  @scala.inline
  def apply(): CreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicIfNotExistsOptions]
  }
  @scala.inline
  implicit class CreateTopicIfNotExistsOptionsOps[Self <: CreateTopicIfNotExistsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessageTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateDetectionHistoryTimeWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateDetectionHistoryTimeWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplicateDetectionHistoryTimeWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBatchedOperations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableBatchedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBatchedOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableBatchedOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeadLetteringOnFilterEvaluationExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeadLetteringOnMessageExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDeadLetteringOnMessageExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePartitioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablePartitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCorrelationFiltersPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCorrelationFiltersPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCorrelationFiltersPerTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCorrelationFiltersPerTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeInMegabytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSizeInMegabytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSqlFiltersPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSqlFiltersPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSqlFiltersPerTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSqlFiltersPerTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSubscriptionsPerTopic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSubscriptionsPerTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSubscriptionsPerTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSubscriptionsPerTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresDuplicateDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresDuplicateDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresDuplicateDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInBytes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportOrdering")(js.undefined)
        ret
    }
  }
  
}

