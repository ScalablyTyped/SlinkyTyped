package typingsSlinky.awsSdk.kinesisMod

import typingsSlinky.awsSdk.anon.DescribeStreamInputwaiter
import typingsSlinky.awsSdk.awsSdkStrings.streamExists
import typingsSlinky.awsSdk.awsSdkStrings.streamNotExists
import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kinesis extends Service {
  
  /**
    * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times. In total, each stream can have up to 50 tags. If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that correspond to the specified tag keys.  AddTagsToStream has a limit of five transactions per second per account.
    */
  def addTagsToStream(): Request[js.Object, AWSError] = js.native
  def addTagsToStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times. In total, each stream can have up to 50 tags. If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that correspond to the specified tag keys.  AddTagsToStream has a limit of five transactions per second per account.
    */
  def addTagsToStream(params: AddTagsToStreamInput): Request[js.Object, AWSError] = js.native
  def addTagsToStream(
    params: AddTagsToStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_Kinesis: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a Kinesis data stream. A stream captures and transports data records that are continuously emitted from different data sources or producers. Scale-out within a stream is explicitly supported by means of shards, which are uniquely identified groups of data records in a stream. You specify and control the number of shards that a stream is composed of. Each shard can support reads up to five transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. If the amount of data input increases or decreases, you can add or remove shards. The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also scoped by AWS Region. That is, two streams in two different accounts can have the same name, and two streams in the same account, but in two different Regions, can have the same name.  CreateStream is an asynchronous operation. Upon receiving a CreateStream request, Kinesis Data Streams immediately returns and sets the stream status to CREATING. After the stream is created, Kinesis Data Streams sets the stream status to ACTIVE. You should perform read and write operations only on an ACTIVE stream.  You receive a LimitExceededException when making a CreateStream request when you try to do one of the following:   Have more than five streams in the CREATING state at any point in time.   Create more shards than are authorized for your account.   For the default shard limit for an AWS account, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. You can use DescribeStream to check the stream status, which is returned in StreamStatus.  CreateStream has a limit of five transactions per second per account.
    */
  def createStream(): Request[js.Object, AWSError] = js.native
  def createStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a Kinesis data stream. A stream captures and transports data records that are continuously emitted from different data sources or producers. Scale-out within a stream is explicitly supported by means of shards, which are uniquely identified groups of data records in a stream. You specify and control the number of shards that a stream is composed of. Each shard can support reads up to five transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. If the amount of data input increases or decreases, you can add or remove shards. The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also scoped by AWS Region. That is, two streams in two different accounts can have the same name, and two streams in the same account, but in two different Regions, can have the same name.  CreateStream is an asynchronous operation. Upon receiving a CreateStream request, Kinesis Data Streams immediately returns and sets the stream status to CREATING. After the stream is created, Kinesis Data Streams sets the stream status to ACTIVE. You should perform read and write operations only on an ACTIVE stream.  You receive a LimitExceededException when making a CreateStream request when you try to do one of the following:   Have more than five streams in the CREATING state at any point in time.   Create more shards than are authorized for your account.   For the default shard limit for an AWS account, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. You can use DescribeStream to check the stream status, which is returned in StreamStatus.  CreateStream has a limit of five transactions per second per account.
    */
  def createStream(params: CreateStreamInput): Request[js.Object, AWSError] = js.native
  def createStream(params: CreateStreamInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The minimum value of a stream's retention period is 24 hours. This operation may result in lost data. For example, if the stream's retention period is 48 hours and is decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.
    */
  def decreaseStreamRetentionPeriod(): Request[js.Object, AWSError] = js.native
  def decreaseStreamRetentionPeriod(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The minimum value of a stream's retention period is 24 hours. This operation may result in lost data. For example, if the stream's retention period is 48 hours and is decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.
    */
  def decreaseStreamRetentionPeriod(params: DecreaseStreamRetentionPeriodInput): Request[js.Object, AWSError] = js.native
  def decreaseStreamRetentionPeriod(
    params: DecreaseStreamRetentionPeriodInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it receives the exception ResourceNotFoundException. If the stream is in the ACTIVE state, you can delete it. After a DeleteStream request, the specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.  Note: Kinesis Data Streams might continue to accept data read and write operations, such as PutRecord, PutRecords, and GetRecords, on a stream in the DELETING state until the stream deletion is complete. When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the stream. You can use the DescribeStream operation to check the state of the stream, which is returned in StreamStatus.  DeleteStream has a limit of five transactions per second per account.
    */
  def deleteStream(): Request[js.Object, AWSError] = js.native
  def deleteStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it receives the exception ResourceNotFoundException. If the stream is in the ACTIVE state, you can delete it. After a DeleteStream request, the specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.  Note: Kinesis Data Streams might continue to accept data read and write operations, such as PutRecord, PutRecords, and GetRecords, on a stream in the DELETING state until the stream deletion is complete. When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the stream. You can use the DescribeStream operation to check the state of the stream, which is returned in StreamStatus.  DeleteStream has a limit of five transactions per second per account.
    */
  def deleteStream(params: DeleteStreamInput): Request[js.Object, AWSError] = js.native
  def deleteStream(params: DeleteStreamInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its name and ARN. This operation has a limit of five transactions per second per account.
    */
  def deregisterStreamConsumer(): Request[js.Object, AWSError] = js.native
  def deregisterStreamConsumer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its name and ARN. This operation has a limit of five transactions per second per account.
    */
  def deregisterStreamConsumer(params: DeregisterStreamConsumerInput): Request[js.Object, AWSError] = js.native
  def deregisterStreamConsumer(
    params: DeregisterStreamConsumerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the shard limits and usage for the account. If you update your account limits, the old limits might be returned for a few minutes. This operation has a limit of one transaction per second per account.
    */
  def describeLimits(): Request[DescribeLimitsOutput, AWSError] = js.native
  def describeLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLimitsOutput, Unit]): Request[DescribeLimitsOutput, AWSError] = js.native
  /**
    * Describes the shard limits and usage for the account. If you update your account limits, the old limits might be returned for a few minutes. This operation has a limit of one transaction per second per account.
    */
  def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput, AWSError] = js.native
  def describeLimits(
    params: DescribeLimitsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLimitsOutput, Unit]
  ): Request[DescribeLimitsOutput, AWSError] = js.native
  
  /**
    * Describes the specified Kinesis data stream. The information returned includes the stream name, Amazon Resource Name (ARN), creation time, enhanced metric configuration, and shard map. The shard map is an array of shard objects. For each shard object, there is the hash key and sequence number ranges that the shard spans, and the IDs of any earlier shards that played in a role in creating the shard. Every record ingested in the stream is identified by a sequence number, which is assigned when the record is put into the stream. You can limit the number of shards returned by each call. For more information, see Retrieving Shards from a Stream in the Amazon Kinesis Data Streams Developer Guide. There are no guarantees about the chronological order shards returned. To process shards in chronological order, use the ID of the parent shard to track the lineage to the oldest shard. This operation has a limit of 10 transactions per second per account.
    */
  def describeStream(): Request[DescribeStreamOutput, AWSError] = js.native
  def describeStream(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]): Request[DescribeStreamOutput, AWSError] = js.native
  /**
    * Describes the specified Kinesis data stream. The information returned includes the stream name, Amazon Resource Name (ARN), creation time, enhanced metric configuration, and shard map. The shard map is an array of shard objects. For each shard object, there is the hash key and sequence number ranges that the shard spans, and the IDs of any earlier shards that played in a role in creating the shard. Every record ingested in the stream is identified by a sequence number, which is assigned when the record is put into the stream. You can limit the number of shards returned by each call. For more information, see Retrieving Shards from a Stream in the Amazon Kinesis Data Streams Developer Guide. There are no guarantees about the chronological order shards returned. To process shards in chronological order, use the ID of the parent shard to track the lineage to the oldest shard. This operation has a limit of 10 transactions per second per account.
    */
  def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput, AWSError] = js.native
  def describeStream(
    params: DescribeStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
  
  /**
    * To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to describe, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. This operation has a limit of 20 transactions per second per account.
    */
  def describeStreamConsumer(): Request[DescribeStreamConsumerOutput, AWSError] = js.native
  def describeStreamConsumer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamConsumerOutput, Unit]): Request[DescribeStreamConsumerOutput, AWSError] = js.native
  /**
    * To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to describe, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. This operation has a limit of 20 transactions per second per account.
    */
  def describeStreamConsumer(params: DescribeStreamConsumerInput): Request[DescribeStreamConsumerOutput, AWSError] = js.native
  def describeStreamConsumer(
    params: DescribeStreamConsumerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamConsumerOutput, Unit]
  ): Request[DescribeStreamConsumerOutput, AWSError] = js.native
  
  /**
    * Provides a summarized description of the specified Kinesis data stream without the shard list. The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period, approximate creation time, monitoring, encryption details, and open shard count. 
    */
  def describeStreamSummary(): Request[DescribeStreamSummaryOutput, AWSError] = js.native
  def describeStreamSummary(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamSummaryOutput, Unit]): Request[DescribeStreamSummaryOutput, AWSError] = js.native
  /**
    * Provides a summarized description of the specified Kinesis data stream without the shard list. The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period, approximate creation time, monitoring, encryption details, and open shard count. 
    */
  def describeStreamSummary(params: DescribeStreamSummaryInput): Request[DescribeStreamSummaryOutput, AWSError] = js.native
  def describeStreamSummary(
    params: DescribeStreamSummaryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamSummaryOutput, Unit]
  ): Request[DescribeStreamSummaryOutput, AWSError] = js.native
  
  /**
    * Disables enhanced monitoring.
    */
  def disableEnhancedMonitoring(): Request[EnhancedMonitoringOutput, AWSError] = js.native
  def disableEnhancedMonitoring(callback: js.Function2[/* err */ AWSError, /* data */ EnhancedMonitoringOutput, Unit]): Request[EnhancedMonitoringOutput, AWSError] = js.native
  /**
    * Disables enhanced monitoring.
    */
  def disableEnhancedMonitoring(params: DisableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput, AWSError] = js.native
  def disableEnhancedMonitoring(
    params: DisableEnhancedMonitoringInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EnhancedMonitoringOutput, Unit]
  ): Request[EnhancedMonitoringOutput, AWSError] = js.native
  
  /**
    * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
    */
  def enableEnhancedMonitoring(): Request[EnhancedMonitoringOutput, AWSError] = js.native
  def enableEnhancedMonitoring(callback: js.Function2[/* err */ AWSError, /* data */ EnhancedMonitoringOutput, Unit]): Request[EnhancedMonitoringOutput, AWSError] = js.native
  /**
    * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
    */
  def enableEnhancedMonitoring(params: EnableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput, AWSError] = js.native
  def enableEnhancedMonitoring(
    params: EnableEnhancedMonitoringInput,
    callback: js.Function2[/* err */ AWSError, /* data */ EnhancedMonitoringOutput, Unit]
  ): Request[EnhancedMonitoringOutput, AWSError] = js.native
  
  /**
    * Gets data records from a Kinesis data stream's shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading data records sequentially. If there are no records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. It might take multiple calls to get to a portion of the shard that contains records. You can scale by provisioning multiple shards per stream while considering service limits (for more information, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide). Your application should have one thread per shard, each reading continuously from its stream. To read from a stream continually, call GetRecords in a loop. Use GetShardIterator to get the shard iterator to specify in the first GetRecords call. GetRecords returns a new shard iterator in NextShardIterator. Specify the shard iterator returned in NextShardIterator in subsequent calls to GetRecords. If the shard has been closed, the shard iterator can't return more data and GetRecords returns null in NextShardIterator. You can terminate the loop when the shard is closed, or when the shard iterator reaches the record with the sequence number or other attribute that marks it as the last record to process. Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that your calls don't exceed the maximum supported size or throughput by using the Limit parameter to specify the maximum number of records that GetRecords can return. Consider your average record size when determining this limit. The maximum number of records that can be returned per call is 10,000. The size of the data returned by GetRecords varies depending on the utilization of the shard. The maximum size of data that GetRecords can return is 10 MiB. If a call returns this amount of data, subsequent calls made within the next 5 seconds throw ProvisionedThroughputExceededException. If there is insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw ProvisionedThroughputExceededException. GetRecords doesn't return any data when it throws an exception. For this reason, we recommend that you wait 1 second between calls to GetRecords. However, it's possible that the application will get exceptions for longer than 1 second. To detect whether the application is falling behind in processing, you can use the MillisBehindLatest response attribute. You can also monitor the stream using CloudWatch metrics and other mechanisms (see Monitoring in the Amazon Kinesis Data Streams Developer Guide). Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that is set when a stream successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is any data source putting data records into a stream, for example with PutRecords). The time stamp has millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always increasing. For example, records in a shard or across a stream might have time stamps that are out of order. This operation has a limit of five transactions per second per account.
    */
  def getRecords(): Request[GetRecordsOutput, AWSError] = js.native
  def getRecords(callback: js.Function2[/* err */ AWSError, /* data */ GetRecordsOutput, Unit]): Request[GetRecordsOutput, AWSError] = js.native
  /**
    * Gets data records from a Kinesis data stream's shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading data records sequentially. If there are no records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. It might take multiple calls to get to a portion of the shard that contains records. You can scale by provisioning multiple shards per stream while considering service limits (for more information, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide). Your application should have one thread per shard, each reading continuously from its stream. To read from a stream continually, call GetRecords in a loop. Use GetShardIterator to get the shard iterator to specify in the first GetRecords call. GetRecords returns a new shard iterator in NextShardIterator. Specify the shard iterator returned in NextShardIterator in subsequent calls to GetRecords. If the shard has been closed, the shard iterator can't return more data and GetRecords returns null in NextShardIterator. You can terminate the loop when the shard is closed, or when the shard iterator reaches the record with the sequence number or other attribute that marks it as the last record to process. Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that your calls don't exceed the maximum supported size or throughput by using the Limit parameter to specify the maximum number of records that GetRecords can return. Consider your average record size when determining this limit. The maximum number of records that can be returned per call is 10,000. The size of the data returned by GetRecords varies depending on the utilization of the shard. The maximum size of data that GetRecords can return is 10 MiB. If a call returns this amount of data, subsequent calls made within the next 5 seconds throw ProvisionedThroughputExceededException. If there is insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw ProvisionedThroughputExceededException. GetRecords doesn't return any data when it throws an exception. For this reason, we recommend that you wait 1 second between calls to GetRecords. However, it's possible that the application will get exceptions for longer than 1 second. To detect whether the application is falling behind in processing, you can use the MillisBehindLatest response attribute. You can also monitor the stream using CloudWatch metrics and other mechanisms (see Monitoring in the Amazon Kinesis Data Streams Developer Guide). Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that is set when a stream successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is any data source putting data records into a stream, for example with PutRecords). The time stamp has millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always increasing. For example, records in a shard or across a stream might have time stamps that are out of order. This operation has a limit of five transactions per second per account.
    */
  def getRecords(params: GetRecordsInput): Request[GetRecordsOutput, AWSError] = js.native
  def getRecords(
    params: GetRecordsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecordsOutput, Unit]
  ): Request[GetRecordsOutput, AWSError] = js.native
  
  /**
    * Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after it is returned to the requester. A shard iterator specifies the shard position from which to start reading data records sequentially. The position is specified using the sequence number of a data record in a shard. A sequence number is the identifier associated with every record ingested in the stream, and is assigned when a record is put into the stream. Each stream has one or more shards. You must specify the shard iterator type. For example, you can set the ShardIteratorType parameter to read exactly from the position denoted by a specific sequence number by using the AT_SEQUENCE_NUMBER shard iterator type. Alternatively, the parameter can read right after the sequence number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using sequence numbers returned by earlier calls to PutRecord, PutRecords, GetRecords, or DescribeStream. In the request, you can specify the shard iterator type AT_TIMESTAMP to read records from an arbitrary point in time, TRIM_HORIZON to cause ShardIterator to point to the last untrimmed record in the shard in the system (the oldest data record in the shard), or LATEST so that you always read the most recent data in the shard.  When you read repeatedly from a stream, use a GetShardIterator request to get the first shard iterator for use in your first GetRecords request and for subsequent reads use the shard iterator returned by the GetRecords request in NextShardIterator. A new shard iterator is returned by every GetRecords request in NextShardIterator, which you use in the ShardIterator parameter of the next GetRecords request.  If a GetShardIterator request is made too often, you receive a ProvisionedThroughputExceededException. For more information about throughput limits, see GetRecords, and Streams Limits in the Amazon Kinesis Data Streams Developer Guide. If the shard is closed, GetShardIterator returns a valid iterator for the last sequence number of the shard. A shard can be closed as a result of using SplitShard or MergeShards.  GetShardIterator has a limit of five transactions per second per account per open shard.
    */
  def getShardIterator(): Request[GetShardIteratorOutput, AWSError] = js.native
  def getShardIterator(callback: js.Function2[/* err */ AWSError, /* data */ GetShardIteratorOutput, Unit]): Request[GetShardIteratorOutput, AWSError] = js.native
  /**
    * Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after it is returned to the requester. A shard iterator specifies the shard position from which to start reading data records sequentially. The position is specified using the sequence number of a data record in a shard. A sequence number is the identifier associated with every record ingested in the stream, and is assigned when a record is put into the stream. Each stream has one or more shards. You must specify the shard iterator type. For example, you can set the ShardIteratorType parameter to read exactly from the position denoted by a specific sequence number by using the AT_SEQUENCE_NUMBER shard iterator type. Alternatively, the parameter can read right after the sequence number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using sequence numbers returned by earlier calls to PutRecord, PutRecords, GetRecords, or DescribeStream. In the request, you can specify the shard iterator type AT_TIMESTAMP to read records from an arbitrary point in time, TRIM_HORIZON to cause ShardIterator to point to the last untrimmed record in the shard in the system (the oldest data record in the shard), or LATEST so that you always read the most recent data in the shard.  When you read repeatedly from a stream, use a GetShardIterator request to get the first shard iterator for use in your first GetRecords request and for subsequent reads use the shard iterator returned by the GetRecords request in NextShardIterator. A new shard iterator is returned by every GetRecords request in NextShardIterator, which you use in the ShardIterator parameter of the next GetRecords request.  If a GetShardIterator request is made too often, you receive a ProvisionedThroughputExceededException. For more information about throughput limits, see GetRecords, and Streams Limits in the Amazon Kinesis Data Streams Developer Guide. If the shard is closed, GetShardIterator returns a valid iterator for the last sequence number of the shard. A shard can be closed as a result of using SplitShard or MergeShards.  GetShardIterator has a limit of five transactions per second per account per open shard.
    */
  def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput, AWSError] = js.native
  def getShardIterator(
    params: GetShardIteratorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetShardIteratorOutput, Unit]
  ): Request[GetShardIteratorOutput, AWSError] = js.native
  
  /**
    * Increases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days). If you choose a longer stream retention period, this operation increases the time period during which records that have not yet expired are accessible. However, it does not make previous, expired data (older than the stream's previous retention period) accessible after the operation has been called. For example, if a stream's retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains inaccessible to consumer applications.
    */
  def increaseStreamRetentionPeriod(): Request[js.Object, AWSError] = js.native
  def increaseStreamRetentionPeriod(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Increases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days). If you choose a longer stream retention period, this operation increases the time period during which records that have not yet expired are accessible. However, it does not make previous, expired data (older than the stream's previous retention period) accessible after the operation has been called. For example, if a stream's retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains inaccessible to consumer applications.
    */
  def increaseStreamRetentionPeriod(params: IncreaseStreamRetentionPeriodInput): Request[js.Object, AWSError] = js.native
  def increaseStreamRetentionPeriod(
    params: IncreaseStreamRetentionPeriodInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Lists the shards in a stream and provides information about each shard. This operation has a limit of 100 transactions per second per data stream.  This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more information, see Controlling Access to Amazon Kinesis Data Streams Resources Using IAM. 
    */
  def listShards(): Request[ListShardsOutput, AWSError] = js.native
  def listShards(callback: js.Function2[/* err */ AWSError, /* data */ ListShardsOutput, Unit]): Request[ListShardsOutput, AWSError] = js.native
  /**
    * Lists the shards in a stream and provides information about each shard. This operation has a limit of 100 transactions per second per data stream.  This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more information, see Controlling Access to Amazon Kinesis Data Streams Resources Using IAM. 
    */
  def listShards(params: ListShardsInput): Request[ListShardsOutput, AWSError] = js.native
  def listShards(
    params: ListShardsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListShardsOutput, Unit]
  ): Request[ListShardsOutput, AWSError] = js.native
  
  /**
    * Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information about each consumer. This operation has a limit of 10 transactions per second per account.
    */
  def listStreamConsumers(): Request[ListStreamConsumersOutput, AWSError] = js.native
  def listStreamConsumers(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamConsumersOutput, Unit]): Request[ListStreamConsumersOutput, AWSError] = js.native
  /**
    * Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information about each consumer. This operation has a limit of 10 transactions per second per account.
    */
  def listStreamConsumers(params: ListStreamConsumersInput): Request[ListStreamConsumersOutput, AWSError] = js.native
  def listStreamConsumers(
    params: ListStreamConsumersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamConsumersOutput, Unit]
  ): Request[ListStreamConsumersOutput, AWSError] = js.native
  
  /**
    * Lists your Kinesis data streams. The number of streams may be too large to return from a single call to ListStreams. You can limit the number of returned streams using the Limit parameter. If you do not specify a value for the Limit parameter, Kinesis Data Streams uses the default limit, which is currently 10. You can detect if there are more streams available to list by using the HasMoreStreams flag from the returned output. If there are more streams available, you can request more streams by using the name of the last stream returned by the ListStreams request in the ExclusiveStartStreamName parameter in a subsequent request to ListStreams. The group of stream names returned by the subsequent request is then added to the list. You can continue this process until all the stream names have been collected in the list.   ListStreams has a limit of five transactions per second per account.
    */
  def listStreams(): Request[ListStreamsOutput, AWSError] = js.native
  def listStreams(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsOutput, Unit]): Request[ListStreamsOutput, AWSError] = js.native
  /**
    * Lists your Kinesis data streams. The number of streams may be too large to return from a single call to ListStreams. You can limit the number of returned streams using the Limit parameter. If you do not specify a value for the Limit parameter, Kinesis Data Streams uses the default limit, which is currently 10. You can detect if there are more streams available to list by using the HasMoreStreams flag from the returned output. If there are more streams available, you can request more streams by using the name of the last stream returned by the ListStreams request in the ExclusiveStartStreamName parameter in a subsequent request to ListStreams. The group of stream names returned by the subsequent request is then added to the list. You can continue this process until all the stream names have been collected in the list.   ListStreams has a limit of five transactions per second per account.
    */
  def listStreams(params: ListStreamsInput): Request[ListStreamsOutput, AWSError] = js.native
  def listStreams(
    params: ListStreamsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsOutput, Unit]
  ): Request[ListStreamsOutput, AWSError] = js.native
  
  /**
    * Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second per account.
    */
  def listTagsForStream(): Request[ListTagsForStreamOutput, AWSError] = js.native
  def listTagsForStream(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForStreamOutput, Unit]): Request[ListTagsForStreamOutput, AWSError] = js.native
  /**
    * Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second per account.
    */
  def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput, AWSError] = js.native
  def listTagsForStream(
    params: ListTagsForStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForStreamOutput, Unit]
  ): Request[ListTagsForStreamOutput, AWSError] = js.native
  
  /**
    * Merges two adjacent shards in a Kinesis data stream and combines them into a single shard to reduce the stream's capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key ranges for the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a hash key range of 276...381 and the other with a hash key range of 382...454, then you could merge these two shards into a single shard that would have a hash key range of 276...454. After the merge, the single child shard receives data for all hash key values covered by the two parent shards.  MergeShards is called when there is a need to reduce the overall capacity of a stream because of excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a stream. For more information about merging shards, see Merge Two Shards in the Amazon Kinesis Data Streams Developer Guide. If the stream is in the ACTIVE state, you can call MergeShards. If a stream is in the CREATING, UPDATING, or DELETING state, MergeShards returns a ResourceInUseException. If the specified stream does not exist, MergeShards returns a ResourceNotFoundException.  You can use DescribeStream to check the state of the stream, which is returned in StreamStatus.  MergeShards is an asynchronous operation. Upon receiving a MergeShards request, Amazon Kinesis Data Streams immediately returns a response and sets the StreamStatus to UPDATING. After the operation is completed, Kinesis Data Streams sets the StreamStatus to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You use DescribeStream to determine the shard IDs that are specified in the MergeShards request.  If you try to operate on too many streams in parallel using CreateStream, DeleteStream, MergeShards, or SplitShard, you receive a LimitExceededException.   MergeShards has a limit of five transactions per second per account.
    */
  def mergeShards(): Request[js.Object, AWSError] = js.native
  def mergeShards(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Merges two adjacent shards in a Kinesis data stream and combines them into a single shard to reduce the stream's capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key ranges for the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a hash key range of 276...381 and the other with a hash key range of 382...454, then you could merge these two shards into a single shard that would have a hash key range of 276...454. After the merge, the single child shard receives data for all hash key values covered by the two parent shards.  MergeShards is called when there is a need to reduce the overall capacity of a stream because of excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a stream. For more information about merging shards, see Merge Two Shards in the Amazon Kinesis Data Streams Developer Guide. If the stream is in the ACTIVE state, you can call MergeShards. If a stream is in the CREATING, UPDATING, or DELETING state, MergeShards returns a ResourceInUseException. If the specified stream does not exist, MergeShards returns a ResourceNotFoundException.  You can use DescribeStream to check the state of the stream, which is returned in StreamStatus.  MergeShards is an asynchronous operation. Upon receiving a MergeShards request, Amazon Kinesis Data Streams immediately returns a response and sets the StreamStatus to UPDATING. After the operation is completed, Kinesis Data Streams sets the StreamStatus to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You use DescribeStream to determine the shard IDs that are specified in the MergeShards request.  If you try to operate on too many streams in parallel using CreateStream, DeleteStream, MergeShards, or SplitShard, you receive a LimitExceededException.   MergeShards has a limit of five transactions per second per account.
    */
  def mergeShards(params: MergeShardsInput): Request[js.Object, AWSError] = js.native
  def mergeShards(params: MergeShardsInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Writes a single data record into an Amazon Kinesis data stream. Call PutRecord to send data into the stream for real-time ingestion and subsequent processing, one record at a time. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; a partition key; and the data blob itself. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams to distribute data across shards. Kinesis Data Streams segregates the data records that belong to a stream into multiple shards, using the partition key associated with each data record to determine the shard to which a given data record belongs. Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by explicitly specifying a hash value using the ExplicitHashKey parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide.  PutRecord returns the shard ID of where the data record was placed and the sequence number that was assigned to the data record. Sequence numbers increase over time and are specific to a shard within a stream, not across all shards within a stream. To guarantee strictly increasing ordering, write serially to a shard and use the SequenceNumberForOrdering parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. If a PutRecord request cannot be processed because of insufficient provisioned throughput on the shard involved in the request, PutRecord throws ProvisionedThroughputExceededException.  By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
    */
  def putRecord(): Request[PutRecordOutput, AWSError] = js.native
  def putRecord(callback: js.Function2[/* err */ AWSError, /* data */ PutRecordOutput, Unit]): Request[PutRecordOutput, AWSError] = js.native
  /**
    * Writes a single data record into an Amazon Kinesis data stream. Call PutRecord to send data into the stream for real-time ingestion and subsequent processing, one record at a time. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; a partition key; and the data blob itself. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams to distribute data across shards. Kinesis Data Streams segregates the data records that belong to a stream into multiple shards, using the partition key associated with each data record to determine the shard to which a given data record belongs. Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by explicitly specifying a hash value using the ExplicitHashKey parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide.  PutRecord returns the shard ID of where the data record was placed and the sequence number that was assigned to the data record. Sequence numbers increase over time and are specific to a shard within a stream, not across all shards within a stream. To guarantee strictly increasing ordering, write serially to a shard and use the SequenceNumberForOrdering parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. If a PutRecord request cannot be processed because of insufficient provisioned throughput on the shard involved in the request, PutRecord throws ProvisionedThroughputExceededException.  By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
    */
  def putRecord(params: PutRecordInput): Request[PutRecordOutput, AWSError] = js.native
  def putRecord(
    params: PutRecordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRecordOutput, Unit]
  ): Request[PutRecordOutput, AWSError] = js.native
  
  /**
    * Writes multiple data records into a Kinesis data stream in a single call (also referred to as a PutRecords request). Use this operation to send data into the stream for data ingestion and processing.  Each PutRecords request can support up to 500 records. Each record in the request can be as large as 1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; and an array of request Records, with each record in the array requiring a partition key and data blob. The record size limit applies to the total size of the partition key and data blob. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. Each record in the Records array may include an optional parameter, ExplicitHashKey, which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly the shard where the record is stored. For more information, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. The PutRecords response includes an array of response Records. Each record in the response array directly correlates with a record in the request array using natural ordering, from the top to the bottom of the request and response. The response Records array always includes the same number of records as the request array. The response Records array includes both successfully and unsuccessfully processed records. Kinesis Data Streams attempts to process all records in each PutRecords request. A single record failure does not stop the processing of subsequent records. A successfully processed record includes ShardId and SequenceNumber values. The ShardId parameter identifies the shard in the stream where the record is stored. The SequenceNumber parameter is an identifier assigned to the put record, unique to all records in the stream. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error and can be one of the following values: ProvisionedThroughputExceededException or InternalFailure. ErrorMessage provides more detailed information about the ProvisionedThroughputExceededException exception including the account ID, stream name, and shard ID of the record that was throttled. For more information about partially successful responses, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
    */
  def putRecords(): Request[PutRecordsOutput, AWSError] = js.native
  def putRecords(callback: js.Function2[/* err */ AWSError, /* data */ PutRecordsOutput, Unit]): Request[PutRecordsOutput, AWSError] = js.native
  /**
    * Writes multiple data records into a Kinesis data stream in a single call (also referred to as a PutRecords request). Use this operation to send data into the stream for data ingestion and processing.  Each PutRecords request can support up to 500 records. Each record in the request can be as large as 1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; and an array of request Records, with each record in the array requiring a partition key and data blob. The record size limit applies to the total size of the partition key and data blob. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. Each record in the Records array may include an optional parameter, ExplicitHashKey, which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly the shard where the record is stored. For more information, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. The PutRecords response includes an array of response Records. Each record in the response array directly correlates with a record in the request array using natural ordering, from the top to the bottom of the request and response. The response Records array always includes the same number of records as the request array. The response Records array includes both successfully and unsuccessfully processed records. Kinesis Data Streams attempts to process all records in each PutRecords request. A single record failure does not stop the processing of subsequent records. A successfully processed record includes ShardId and SequenceNumber values. The ShardId parameter identifies the shard in the stream where the record is stored. The SequenceNumber parameter is an identifier assigned to the put record, unique to all records in the stream. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error and can be one of the following values: ProvisionedThroughputExceededException or InternalFailure. ErrorMessage provides more detailed information about the ProvisionedThroughputExceededException exception including the account ID, stream name, and shard ID of the record that was throttled. For more information about partially successful responses, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
    */
  def putRecords(params: PutRecordsInput): Request[PutRecordsOutput, AWSError] = js.native
  def putRecords(
    params: PutRecordsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRecordsOutput, Unit]
  ): Request[PutRecordsOutput, AWSError] = js.native
  
  /**
    * Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of consumers that read from the same stream. You can register up to 5 consumers per stream. A given consumer can only be registered with one stream. This operation has a limit of five transactions per second per account.
    */
  def registerStreamConsumer(): Request[RegisterStreamConsumerOutput, AWSError] = js.native
  def registerStreamConsumer(callback: js.Function2[/* err */ AWSError, /* data */ RegisterStreamConsumerOutput, Unit]): Request[RegisterStreamConsumerOutput, AWSError] = js.native
  /**
    * Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of consumers that read from the same stream. You can register up to 5 consumers per stream. A given consumer can only be registered with one stream. This operation has a limit of five transactions per second per account.
    */
  def registerStreamConsumer(params: RegisterStreamConsumerInput): Request[RegisterStreamConsumerOutput, AWSError] = js.native
  def registerStreamConsumer(
    params: RegisterStreamConsumerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterStreamConsumerOutput, Unit]
  ): Request[RegisterStreamConsumerOutput, AWSError] = js.native
  
  /**
    * Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this operation successfully completes. If you specify a tag that does not exist, it is ignored.  RemoveTagsFromStream has a limit of five transactions per second per account.
    */
  def removeTagsFromStream(): Request[js.Object, AWSError] = js.native
  def removeTagsFromStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this operation successfully completes. If you specify a tag that does not exist, it is ignored.  RemoveTagsFromStream has a limit of five transactions per second per account.
    */
  def removeTagsFromStream(params: RemoveTagsFromStreamInput): Request[js.Object, AWSError] = js.native
  def removeTagsFromStream(
    params: RemoveTagsFromStreamInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Splits a shard into two new shards in the Kinesis data stream, to increase the stream's capacity to ingest and transport data. SplitShard is called when there is a need to increase the overall capacity of a stream because of an expected increase in the volume of data records being ingested.  You can also use SplitShard when a shard appears to be approaching its maximum utilization; for example, the producers sending data into the specific shard are suddenly sending more than previously anticipated. You can also call SplitShard to increase stream capacity, so that more Kinesis Data Streams applications can simultaneously read data from the stream for real-time processing.  You must specify the shard to be split and the new hash key, which is the position in the shard where the shard gets split in two. In many cases, the new hash key might be the average of the beginning and ending hash key, but it can be any hash key value in the range being mapped into the shard. For more information, see Split a Shard in the Amazon Kinesis Data Streams Developer Guide. You can use DescribeStream to determine the shard ID and hash key values for the ShardToSplit and NewStartingHashKey parameters that are specified in the SplitShard request.  SplitShard is an asynchronous operation. Upon receiving a SplitShard request, Kinesis Data Streams immediately returns a response and sets the stream status to UPDATING. After the operation is completed, Kinesis Data Streams sets the stream status to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You can use DescribeStream to check the status of the stream, which is returned in StreamStatus. If the stream is in the ACTIVE state, you can call SplitShard. If a stream is in CREATING or UPDATING or DELETING states, DescribeStream returns a ResourceInUseException. If the specified stream does not exist, DescribeStream returns a ResourceNotFoundException. If you try to create more shards than are authorized for your account, you receive a LimitExceededException.  For the default shard limit for an AWS account, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. If you try to operate on too many streams simultaneously using CreateStream, DeleteStream, MergeShards, and/or SplitShard, you receive a LimitExceededException.   SplitShard has a limit of five transactions per second per account.
    */
  def splitShard(): Request[js.Object, AWSError] = js.native
  def splitShard(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Splits a shard into two new shards in the Kinesis data stream, to increase the stream's capacity to ingest and transport data. SplitShard is called when there is a need to increase the overall capacity of a stream because of an expected increase in the volume of data records being ingested.  You can also use SplitShard when a shard appears to be approaching its maximum utilization; for example, the producers sending data into the specific shard are suddenly sending more than previously anticipated. You can also call SplitShard to increase stream capacity, so that more Kinesis Data Streams applications can simultaneously read data from the stream for real-time processing.  You must specify the shard to be split and the new hash key, which is the position in the shard where the shard gets split in two. In many cases, the new hash key might be the average of the beginning and ending hash key, but it can be any hash key value in the range being mapped into the shard. For more information, see Split a Shard in the Amazon Kinesis Data Streams Developer Guide. You can use DescribeStream to determine the shard ID and hash key values for the ShardToSplit and NewStartingHashKey parameters that are specified in the SplitShard request.  SplitShard is an asynchronous operation. Upon receiving a SplitShard request, Kinesis Data Streams immediately returns a response and sets the stream status to UPDATING. After the operation is completed, Kinesis Data Streams sets the stream status to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You can use DescribeStream to check the status of the stream, which is returned in StreamStatus. If the stream is in the ACTIVE state, you can call SplitShard. If a stream is in CREATING or UPDATING or DELETING states, DescribeStream returns a ResourceInUseException. If the specified stream does not exist, DescribeStream returns a ResourceNotFoundException. If you try to create more shards than are authorized for your account, you receive a LimitExceededException.  For the default shard limit for an AWS account, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. If you try to operate on too many streams simultaneously using CreateStream, DeleteStream, MergeShards, and/or SplitShard, you receive a LimitExceededException.   SplitShard has a limit of five transactions per second per account.
    */
  def splitShard(params: SplitShardInput): Request[js.Object, AWSError] = js.native
  def splitShard(params: SplitShardInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables or updates server-side encryption using an AWS KMS key for a specified stream.  Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Updating or applying encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, encryption begins for records written to the stream.  API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour period. Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting the API response from PutRecord or PutRecords.
    */
  def startStreamEncryption(): Request[js.Object, AWSError] = js.native
  def startStreamEncryption(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables or updates server-side encryption using an AWS KMS key for a specified stream.  Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Updating or applying encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, encryption begins for records written to the stream.  API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour period. Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting the API response from PutRecord or PutRecords.
    */
  def startStreamEncryption(params: StartStreamEncryptionInput): Request[js.Object, AWSError] = js.native
  def startStreamEncryption(
    params: StartStreamEncryptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disables server-side encryption for a specified stream.  Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Stopping encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, records written to the stream are no longer encrypted by Kinesis Data Streams.  API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.  Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption is not applied by inspecting the API response from PutRecord or PutRecords.
    */
  def stopStreamEncryption(): Request[js.Object, AWSError] = js.native
  def stopStreamEncryption(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables server-side encryption for a specified stream.  Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Stopping encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, records written to the stream are no longer encrypted by Kinesis Data Streams.  API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.  Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption is not applied by inspecting the API response from PutRecord or PutRecords.
    */
  def stopStreamEncryption(params: StopStreamEncryptionInput): Request[js.Object, AWSError] = js.native
  def stopStreamEncryption(
    params: StopStreamEncryptionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the shard count of the specified stream to the specified number of shards. Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Depending on the size of the stream, the scaling action could take a few minutes to complete. You can continue to read and write data to your stream while its status is UPDATING. To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the shard count, as this results in the fewest number of splits or merges. This operation has the following default limits. By default, you cannot do the following:   Scale more than twice per rolling 24-hour period per stream   Scale up to more than double your current shard count for a stream   Scale down below half your current shard count for a stream   Scale up to more than 500 shards in a stream   Scale a stream with more than 500 shards down unless the result is less than 500 shards   Scale up to more than the shard limit for your account   For the default limits for an AWS account, see Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To request an increase in the call rate limit, the shard limit for this API, or your overall shard limit, use the limits form.
    */
  def updateShardCount(): Request[UpdateShardCountOutput, AWSError] = js.native
  def updateShardCount(callback: js.Function2[/* err */ AWSError, /* data */ UpdateShardCountOutput, Unit]): Request[UpdateShardCountOutput, AWSError] = js.native
  /**
    * Updates the shard count of the specified stream to the specified number of shards. Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Depending on the size of the stream, the scaling action could take a few minutes to complete. You can continue to read and write data to your stream while its status is UPDATING. To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the shard count, as this results in the fewest number of splits or merges. This operation has the following default limits. By default, you cannot do the following:   Scale more than twice per rolling 24-hour period per stream   Scale up to more than double your current shard count for a stream   Scale down below half your current shard count for a stream   Scale up to more than 500 shards in a stream   Scale a stream with more than 500 shards down unless the result is less than 500 shards   Scale up to more than the shard limit for your account   For the default limits for an AWS account, see Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To request an increase in the call rate limit, the shard limit for this API, or your overall shard limit, use the limits form.
    */
  def updateShardCount(params: UpdateShardCountInput): Request[UpdateShardCountOutput, AWSError] = js.native
  def updateShardCount(
    params: UpdateShardCountInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateShardCountOutput, Unit]
  ): Request[UpdateShardCountOutput, AWSError] = js.native
  
  /**
    * Waits for the streamExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
    */
  @JSName("waitFor")
  def waitFor_streamExists(state: streamExists): Request[DescribeStreamOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamExists(
    state: streamExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
  /**
    * Waits for the streamExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
    */
  @JSName("waitFor")
  def waitFor_streamExists(state: streamExists, params: DescribeStreamInputwaiter): Request[DescribeStreamOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamExists(
    state: streamExists,
    params: DescribeStreamInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
  /**
    * Waits for the streamNotExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
    */
  @JSName("waitFor")
  def waitFor_streamNotExists(state: streamNotExists): Request[DescribeStreamOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamNotExists(
    state: streamNotExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
  /**
    * Waits for the streamNotExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
    */
  @JSName("waitFor")
  def waitFor_streamNotExists(state: streamNotExists, params: DescribeStreamInputwaiter): Request[DescribeStreamOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamNotExists(
    state: streamNotExists,
    params: DescribeStreamInputwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamOutput, Unit]
  ): Request[DescribeStreamOutput, AWSError] = js.native
}
