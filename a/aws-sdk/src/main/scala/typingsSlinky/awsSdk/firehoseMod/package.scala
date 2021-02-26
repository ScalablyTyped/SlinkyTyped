package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object firehoseMod {
  
  type AWSKMSKeyARN = java.lang.String
  
  type BlockSizeBytes = scala.Double
  
  type BooleanObject = scala.Boolean
  
  type BucketARN = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.firehoseMod.ClientApiVersions
  
  type ClusterJDBCURL = java.lang.String
  
  type ColumnToJsonKeyMappings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.firehoseMod.NonEmptyString]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - typingsSlinky.awsSdk.awsSdkStrings.ZIP
    - typingsSlinky.awsSdk.awsSdkStrings.Snappy_
    - typingsSlinky.awsSdk.awsSdkStrings.HADOOP_SNAPPY
    - java.lang.String
  */
  type CompressionFormat = typingsSlinky.awsSdk.firehoseMod._CompressionFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - java.lang.String
  */
  type ContentEncoding = typingsSlinky.awsSdk.firehoseMod._ContentEncoding | java.lang.String
  
  type CopyOptions = java.lang.String
  
  type Data = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.firehoseMod.Blob | java.lang.String
  
  type DataTableColumns = java.lang.String
  
  type DataTableName = java.lang.String
  
  type DeliveryStartTimestamp = js.Date
  
  type DeliveryStreamARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING_FAILED
    - java.lang.String
  */
  type DeliveryStreamEncryptionStatus = typingsSlinky.awsSdk.firehoseMod._DeliveryStreamEncryptionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RETIRE_KMS_GRANT_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_KMS_GRANT_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.KMS_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED_KMS_KEY
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_KMS_KEY
    - typingsSlinky.awsSdk.awsSdkStrings.KMS_KEY_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.KMS_OPT_IN_REQUIRED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_ENI_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_ENI_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUP_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.ENI_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUP_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_ERROR
    - java.lang.String
  */
  type DeliveryStreamFailureType = typingsSlinky.awsSdk.firehoseMod._DeliveryStreamFailureType | java.lang.String
  
  type DeliveryStreamName = java.lang.String
  
  type DeliveryStreamNameList = js.Array[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DeliveryStreamStatus = typingsSlinky.awsSdk.firehoseMod._DeliveryStreamStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DirectPut
    - typingsSlinky.awsSdk.awsSdkStrings.KinesisStreamAsSource
    - java.lang.String
  */
  type DeliveryStreamType = typingsSlinky.awsSdk.firehoseMod._DeliveryStreamType | java.lang.String
  
  type DeliveryStreamVersionId = java.lang.String
  
  type DescribeDeliveryStreamInputLimit = scala.Double
  
  type DestinationDescriptionList = js.Array[typingsSlinky.awsSdk.firehoseMod.DestinationDescription]
  
  type DestinationId = java.lang.String
  
  type ElasticsearchBufferingIntervalInSeconds = scala.Double
  
  type ElasticsearchBufferingSizeInMBs = scala.Double
  
  type ElasticsearchClusterEndpoint = java.lang.String
  
  type ElasticsearchDomainARN = java.lang.String
  
  type ElasticsearchIndexName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NoRotation
    - typingsSlinky.awsSdk.awsSdkStrings.OneHour
    - typingsSlinky.awsSdk.awsSdkStrings.OneDay
    - typingsSlinky.awsSdk.awsSdkStrings.OneWeek
    - typingsSlinky.awsSdk.awsSdkStrings.OneMonth
    - java.lang.String
  */
  type ElasticsearchIndexRotationPeriod = typingsSlinky.awsSdk.firehoseMod._ElasticsearchIndexRotationPeriod | java.lang.String
  
  type ElasticsearchRetryDurationInSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FailedDocumentsOnly
    - typingsSlinky.awsSdk.awsSdkStrings.AllDocuments
    - java.lang.String
  */
  type ElasticsearchS3BackupMode = typingsSlinky.awsSdk.firehoseMod._ElasticsearchS3BackupMode | java.lang.String
  
  type ElasticsearchTypeName = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ErrorOutputPrefix = java.lang.String
  
  type HECAcknowledgmentTimeoutInSeconds = scala.Double
  
  type HECEndpoint = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Raw_
    - typingsSlinky.awsSdk.awsSdkStrings.Event_
    - java.lang.String
  */
  type HECEndpointType = typingsSlinky.awsSdk.firehoseMod._HECEndpointType | java.lang.String
  
  type HECToken = java.lang.String
  
  type HttpEndpointAccessKey = java.lang.String
  
  type HttpEndpointAttributeName = java.lang.String
  
  type HttpEndpointAttributeValue = java.lang.String
  
  type HttpEndpointBufferingIntervalInSeconds = scala.Double
  
  type HttpEndpointBufferingSizeInMBs = scala.Double
  
  type HttpEndpointCommonAttributesList = js.Array[typingsSlinky.awsSdk.firehoseMod.HttpEndpointCommonAttribute]
  
  type HttpEndpointName = java.lang.String
  
  type HttpEndpointRetryDurationInSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FailedDataOnly
    - typingsSlinky.awsSdk.awsSdkStrings.AllData
    - java.lang.String
  */
  type HttpEndpointS3BackupMode = typingsSlinky.awsSdk.firehoseMod._HttpEndpointS3BackupMode | java.lang.String
  
  type HttpEndpointUrl = java.lang.String
  
  type IntervalInSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_OWNED_CMK
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK
    - java.lang.String
  */
  type KeyType = typingsSlinky.awsSdk.firehoseMod._KeyType | java.lang.String
  
  type KinesisStreamARN = java.lang.String
  
  type ListDeliveryStreamsInputLimit = scala.Double
  
  type ListOfNonEmptyStrings = js.Array[typingsSlinky.awsSdk.firehoseMod.NonEmptyString]
  
  type ListOfNonEmptyStringsWithoutWhitespace = js.Array[typingsSlinky.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]
  
  type ListTagsForDeliveryStreamInputLimit = scala.Double
  
  type ListTagsForDeliveryStreamOutputTagList = js.Array[typingsSlinky.awsSdk.firehoseMod.Tag]
  
  type LogGroupName = java.lang.String
  
  type LogStreamName = java.lang.String
  
  type NoEncryptionConfig = typingsSlinky.awsSdk.awsSdkStrings.NoEncryption | java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NonEmptyStringWithoutWhitespace = java.lang.String
  
  type NonNegativeIntegerObject = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ZLIB
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPPY
    - java.lang.String
  */
  type OrcCompression = typingsSlinky.awsSdk.firehoseMod._OrcCompression | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.V0_11
    - typingsSlinky.awsSdk.awsSdkStrings.V0_12
    - java.lang.String
  */
  type OrcFormatVersion = typingsSlinky.awsSdk.firehoseMod._OrcFormatVersion | java.lang.String
  
  type OrcRowIndexStride = scala.Double
  
  type OrcStripeSizeBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPPY
    - java.lang.String
  */
  type ParquetCompression = typingsSlinky.awsSdk.firehoseMod._ParquetCompression | java.lang.String
  
  type ParquetPageSizeBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.V1
    - typingsSlinky.awsSdk.awsSdkStrings.V2
    - java.lang.String
  */
  type ParquetWriterVersion = typingsSlinky.awsSdk.firehoseMod._ParquetWriterVersion | java.lang.String
  
  type Password = java.lang.String
  
  type Prefix = java.lang.String
  
  type ProcessorList = js.Array[typingsSlinky.awsSdk.firehoseMod.Processor]
  
  type ProcessorParameterList = js.Array[typingsSlinky.awsSdk.firehoseMod.ProcessorParameter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaArn
    - typingsSlinky.awsSdk.awsSdkStrings.NumberOfRetries
    - typingsSlinky.awsSdk.awsSdkStrings.RoleArn
    - typingsSlinky.awsSdk.awsSdkStrings.BufferSizeInMBs
    - typingsSlinky.awsSdk.awsSdkStrings.BufferIntervalInSeconds
    - java.lang.String
  */
  type ProcessorParameterName = typingsSlinky.awsSdk.firehoseMod._ProcessorParameterName | java.lang.String
  
  type ProcessorParameterValue = java.lang.String
  
  type ProcessorType = typingsSlinky.awsSdk.awsSdkStrings.Lambda_ | java.lang.String
  
  type Proportion = scala.Double
  
  type PutRecordBatchRequestEntryList = js.Array[typingsSlinky.awsSdk.firehoseMod.Record]
  
  type PutRecordBatchResponseEntryList = js.Array[typingsSlinky.awsSdk.firehoseMod.PutRecordBatchResponseEntry]
  
  type PutResponseRecordId = java.lang.String
  
  type RedshiftRetryDurationInSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - java.lang.String
  */
  type RedshiftS3BackupMode = typingsSlinky.awsSdk.firehoseMod._RedshiftS3BackupMode | java.lang.String
  
  type RoleARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - java.lang.String
  */
  type S3BackupMode = typingsSlinky.awsSdk.firehoseMod._S3BackupMode | java.lang.String
  
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]
  
  type SizeInMBs = scala.Double
  
  type SplunkRetryDurationInSeconds = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FailedEventsOnly
    - typingsSlinky.awsSdk.awsSdkStrings.AllEvents
    - java.lang.String
  */
  type SplunkS3BackupMode = typingsSlinky.awsSdk.firehoseMod._SplunkS3BackupMode | java.lang.String
  
  type SubnetIdList = js.Array[typingsSlinky.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]
  
  type TagDeliveryStreamInputTagList = js.Array[typingsSlinky.awsSdk.firehoseMod.Tag]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.firehoseMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type Username = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-08-04`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.firehoseMod._apiVersion | java.lang.String
}
