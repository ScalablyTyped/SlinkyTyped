package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
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
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Enabled] = js.native
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
    */
  var EventSourceArn: Arn = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: typingsSlinky.awsSdk.lambdaMod.FunctionName = js.native
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
    * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.native
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[js.Date] = js.native
}

object CreateEventSourceMappingRequest {
  @scala.inline
  def apply(EventSourceArn: Arn, FunctionName: FunctionName): CreateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSourceMappingRequest]
  }
  @scala.inline
  implicit class CreateEventSourceMappingRequestOps[Self <: CreateEventSourceMappingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
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
    def withStartingPosition(value: EventSourcePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingPositionTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingPositionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPositionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingPositionTimestamp")(js.undefined)
        ret
    }
  }
  
}

