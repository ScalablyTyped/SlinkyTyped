package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kinesisanalyticsMod {
  
  type ApplicationCode = java.lang.String
  
  type ApplicationDescription = java.lang.String
  
  type ApplicationName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = typingsSlinky.awsSdk.kinesisanalyticsMod._ApplicationStatus | java.lang.String
  
  type ApplicationSummaries = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationSummary]
  
  type ApplicationVersionId = scala.Double
  
  type BooleanObject = scala.Boolean
  
  type BucketARN = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisanalyticsMod.ClientApiVersions
  
  type CloudWatchLoggingOptionDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescription]
  
  type CloudWatchLoggingOptionUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdate]
  
  type CloudWatchLoggingOptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOption]
  
  type FileKey = java.lang.String
  
  type Id = java.lang.String
  
  type InAppStreamName = java.lang.String
  
  type InAppStreamNames = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.InAppStreamName]
  
  type InAppTableName = java.lang.String
  
  type InputConfigurations = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.InputConfiguration]
  
  type InputDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.InputDescription]
  
  type InputParallelismCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOW
    - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typingsSlinky.awsSdk.kinesisanalyticsMod._InputStartingPosition | java.lang.String
  
  type InputUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.InputUpdate]
  
  type Inputs = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.Input]
  
  type KinesisAnalyticsARN = java.lang.String
  
  type ListApplicationsInputLimit = scala.Double
  
  type LogStreamARN = java.lang.String
  
  type OutputDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.OutputDescription]
  
  type OutputUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.OutputUpdate]
  
  type Outputs = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.Output]
  
  type ParsedInputRecord = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ParsedInputRecordField]
  
  type ParsedInputRecordField = java.lang.String
  
  type ParsedInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ParsedInputRecord]
  
  type ProcessedInputRecord = java.lang.String
  
  type ProcessedInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ProcessedInputRecord]
  
  type RawInputRecord = java.lang.String
  
  type RawInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.RawInputRecord]
  
  type RecordColumnDelimiter = java.lang.String
  
  type RecordColumnMapping = java.lang.String
  
  type RecordColumnName = java.lang.String
  
  type RecordColumnSqlType = java.lang.String
  
  type RecordColumns = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.RecordColumn]
  
  type RecordEncoding = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typingsSlinky.awsSdk.kinesisanalyticsMod._RecordFormatType | java.lang.String
  
  type RecordRowDelimiter = java.lang.String
  
  type RecordRowPath = java.lang.String
  
  type ReferenceDataSourceDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescription]
  
  type ReferenceDataSourceUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdate]
  
  type ResourceARN = java.lang.String
  
  type RoleARN = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.kinesisanalyticsMod.Tag]
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-08-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisanalyticsMod._apiVersion | java.lang.String
}
