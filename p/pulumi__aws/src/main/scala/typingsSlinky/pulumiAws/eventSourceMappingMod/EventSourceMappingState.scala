package typingsSlinky.pulumiAws.eventSourceMappingMod

import typingsSlinky.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingState extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
    */
  val batchSize: js.UndefOr[Input[Double]] = js.native
  val bisectBatchOnFunctionError: js.UndefOr[Input[Boolean]] = js.native
  val destinationConfig: js.UndefOr[Input[EventSourceMappingDestinationConfig]] = js.native
  /**
    * Determines if the mapping will be enabled on creation. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
    */
  val eventSourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `functionName` above.)
    */
  val functionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: js.UndefOr[Input[String]] = js.native
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  val lastProcessingResult: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
    */
  val maximumBatchingWindowInSeconds: js.UndefOr[Input[Double]] = js.native
  val maximumRecordAgeInSeconds: js.UndefOr[Input[Double]] = js.native
  val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.native
  val parallelizationFactor: js.UndefOr[Input[Double]] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
    */
  val startingPosition: js.UndefOr[Input[String]] = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
    * * `parallelizationFactor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
    * * `maximumRetryAttempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum of 0, maximum and default of 10000.
    * * `maximumRecordAgeInSeconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Minimum of 60, maximum and default of 604800.
    * * `bisectBatchOnFunctionError`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
    * * `destinationConfig`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
    */
  val startingPositionTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the event source mapping.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The reason the event source mapping is in its current state.
    */
  val stateTransitionReason: js.UndefOr[Input[String]] = js.native
  /**
    * The UUID of the created event source mapping.
    */
  val uuid: js.UndefOr[Input[String]] = js.native
}

object EventSourceMappingState {
  @scala.inline
  def apply(): EventSourceMappingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingState]
  }
  @scala.inline
  implicit class EventSourceMappingStateOps[Self <: EventSourceMappingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBisectBatchOnFunctionError(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bisectBatchOnFunctionError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBisectBatchOnFunctionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bisectBatchOnFunctionError")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLastProcessingResult(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProcessingResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastProcessingResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProcessingResult")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBatchingWindowInSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBatchingWindowInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBatchingWindowInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBatchingWindowInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRecordAgeInSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRecordAgeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRecordAgeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRecordAgeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumRetryAttempts(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumRetryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelizationFactor(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelizationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelizationFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelizationFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingPosition(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingPositionTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPositionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPositionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransitionReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransitionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateTransitionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransitionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

