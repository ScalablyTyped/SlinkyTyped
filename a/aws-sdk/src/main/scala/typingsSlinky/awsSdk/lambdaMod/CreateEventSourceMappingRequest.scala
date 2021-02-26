package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEventSourceMappingRequest extends StObject {
  
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.    Amazon Managed Streaming for Apache Kafka - Default 100. Max 10,000.  
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
    * If true, the event source mapping is active. Set to false to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Enabled] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.    Amazon Managed Streaming for Apache Kafka - The ARN of the cluster.  
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
    * (Streams) Discard records older than the specified age. The default value is infinite (-1).
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumRecordAgeInSeconds] = js.native
  
  /**
    * (Streams) Discard records after the specified number of retries. The default value is infinite (-1). When set to infinite (-1), failed records will be retried until the record expires.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.native
  
  /**
    * (Streams) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.ParallelizationFactor] = js.native
  
  /**
    *  (MQ) The name of the Amazon MQ broker destination queue to consume. 
    */
  var Queues: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Queues] = js.native
  
  /**
    *  (MQ) The Secrets Manager secret that stores your broker credentials. To store your secret, use the following format:  { "username": "your username", "password": "your password" }  To reference the secret, use the following format: [ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]  The value of Type is always BASIC_AUTH. To encrypt the secret, you can use customer or service managed keys. When using a customer managed KMS key, the Lambda execution role requires kms:Decrypt permissions.
    */
  var SourceAccessConfigurations: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.SourceAccessConfigurations] = js.native
  
  /**
    * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon MSK Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.native
  
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    *  (MSK) The name of the Kafka topic. 
    */
  var Topics: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Topics] = js.native
}
object CreateEventSourceMappingRequest {
  
  @scala.inline
  def apply(EventSourceArn: Arn, FunctionName: FunctionName): CreateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSourceMappingRequest]
  }
  
  @scala.inline
  implicit class CreateEventSourceMappingRequestMutableBuilder[Self <: CreateEventSourceMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    @scala.inline
    def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    @scala.inline
    def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    @scala.inline
    def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value :_*))
    
    @scala.inline
    def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    @scala.inline
    def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setStartingPosition(value: EventSourcePosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionTimestamp(value: js.Date): Self = StObject.set(x, "StartingPositionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionTimestampUndefined: Self = StObject.set(x, "StartingPositionTimestamp", js.undefined)
    
    @scala.inline
    def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    @scala.inline
    def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
