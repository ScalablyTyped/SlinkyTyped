package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingConfiguration extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.
    */
  var BatchSize: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.BatchSize] = js.native
  /**
    * (Streams) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.BisectBatchOnFunctionError] = js.native
  /**
    * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the event source.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.FunctionArn] = js.native
  /**
    * The date that the event source mapping was last updated, or its state changed.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  var LastProcessingResult: js.UndefOr[String] = js.native
  /**
    * The maximum amount of time to gather records before invoking the function, in seconds.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumBatchingWindowInSeconds] = js.native
  /**
    * (Streams) The maximum age of a record that Lambda sends to a function for processing.
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumRecordAgeInSeconds] = js.native
  /**
    * (Streams) The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.native
  /**
    * (Streams) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.ParallelizationFactor] = js.native
  /**
    * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
  /**
    * The identifier of the event source mapping.
    */
  var UUID: js.UndefOr[String] = js.native
}

object EventSourceMappingConfiguration {
  @scala.inline
  def apply(): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
  @scala.inline
  implicit class EventSourceMappingConfigurationOps[Self <: EventSourceMappingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: BatchSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BisectBatchOnFunctionError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBisectBatchOnFunctionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BisectBatchOnFunctionError")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationConfig(value: DestinationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionArn(value: FunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLastProcessingResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastProcessingResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastProcessingResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastProcessingResult")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBatchingWindowInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBatchingWindowInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBatchingWindowInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRecordAgeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRecordAgeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRecordAgeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumRetryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelizationFactor(value: ParallelizationFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelizationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelizationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParallelizationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransitionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateTransitionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateTransitionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UUID")(js.undefined)
        ret
    }
  }
  
}

