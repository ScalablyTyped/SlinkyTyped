package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSize(value: BatchSize): Self = this.set("BatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("BatchSize", js.undefined)
    
    @scala.inline
    def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = this.set("BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBisectBatchOnFunctionError: Self = this.set("BisectBatchOnFunctionError", js.undefined)
    
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = this.set("DestinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationConfig: Self = this.set("DestinationConfig", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = this.set("MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBatchingWindowInSeconds: Self = this.set("MaximumBatchingWindowInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = this.set("MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRecordAgeInSeconds: Self = this.set("MaximumRecordAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = this.set("MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("MaximumRetryAttempts", js.undefined)
    
    @scala.inline
    def setParallelizationFactor(value: ParallelizationFactor): Self = this.set("ParallelizationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelizationFactor: Self = this.set("ParallelizationFactor", js.undefined)
    
    @scala.inline
    def setStartingPosition(value: EventSourcePosition): Self = this.set("StartingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPosition: Self = this.set("StartingPosition", js.undefined)
    
    @scala.inline
    def setStartingPositionTimestamp(value: js.Date): Self = this.set("StartingPositionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPositionTimestamp: Self = this.set("StartingPositionTimestamp", js.undefined)
  }
}
