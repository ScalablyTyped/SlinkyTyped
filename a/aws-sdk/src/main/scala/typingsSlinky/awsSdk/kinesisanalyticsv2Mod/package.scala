package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kinesisanalyticsv2Mod {
  
  type ApplicationDescription = java.lang.String
  
  type ApplicationName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
    - java.lang.String
  */
  type ApplicationRestoreType = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._ApplicationRestoreType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOSCALING
    - typingsSlinky.awsSdk.awsSdkStrings.FORCE_STOPPING
    - java.lang.String
  */
  type ApplicationStatus = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._ApplicationStatus | java.lang.String
  
  type ApplicationSummaries = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSummary]
  
  type ApplicationVersionId = scala.Double
  
  type AuthorizedUrl = java.lang.String
  
  type BooleanObject = scala.Boolean
  
  type BucketARN = java.lang.String
  
  type CheckpointInterval = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ClientApiVersions
  
  type CloudWatchLoggingOptionDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescription]
  
  type CloudWatchLoggingOptionUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdate]
  
  type CloudWatchLoggingOptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOption]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT
    - typingsSlinky.awsSdk.awsSdkStrings.ZIPFILE
    - java.lang.String
  */
  type CodeContentType = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._CodeContentType | java.lang.String
  
  type CodeMD5 = java.lang.String
  
  type CodeSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConfigurationType = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._ConfigurationType | java.lang.String
  
  type FileKey = java.lang.String
  
  type Id = java.lang.String
  
  type InAppStreamName = java.lang.String
  
  type InAppStreamNames = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InAppStreamName]
  
  type InAppTableName = java.lang.String
  
  type InputDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputDescription]
  
  type InputParallelismCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOW
    - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._InputStartingPosition | java.lang.String
  
  type InputUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputUpdate]
  
  type Inputs = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Input]
  
  type JobPlanDescription = java.lang.String
  
  type KinesisAnalyticsARN = java.lang.String
  
  type ListApplicationsInputLimit = scala.Double
  
  type ListSnapshotsInputLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LogLevel = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._LogLevel | java.lang.String
  
  type LogStreamARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION
    - typingsSlinky.awsSdk.awsSdkStrings.TASK
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATOR
    - typingsSlinky.awsSdk.awsSdkStrings.PARALLELISM
    - java.lang.String
  */
  type MetricsLevel = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._MetricsLevel | java.lang.String
  
  type MinPauseBetweenCheckpoints = scala.Double
  
  type NextToken = java.lang.String
  
  type ObjectVersion = java.lang.String
  
  type OutputDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.OutputDescription]
  
  type OutputUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.OutputUpdate]
  
  type Outputs = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Output]
  
  type Parallelism = scala.Double
  
  type ParallelismPerKPU = scala.Double
  
  type ParsedInputRecord = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecordField]
  
  type ParsedInputRecordField = java.lang.String
  
  type ParsedInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecord]
  
  type ProcessedInputRecord = java.lang.String
  
  type ProcessedInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ProcessedInputRecord]
  
  type PropertyGroups = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.PropertyGroup]
  
  type PropertyKey = java.lang.String
  
  type PropertyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.PropertyValue]
  
  type PropertyValue = java.lang.String
  
  type RawInputRecord = java.lang.String
  
  type RawInputRecords = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RawInputRecord]
  
  type RecordColumnDelimiter = java.lang.String
  
  type RecordColumnMapping = java.lang.String
  
  type RecordColumnName = java.lang.String
  
  type RecordColumnSqlType = java.lang.String
  
  type RecordColumns = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordColumn]
  
  type RecordEncoding = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._RecordFormatType | java.lang.String
  
  type RecordRowDelimiter = java.lang.String
  
  type RecordRowPath = java.lang.String
  
  type ReferenceDataSourceDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescription]
  
  type ReferenceDataSourceUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdate]
  
  type ReferenceDataSources = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSource]
  
  type ResourceARN = java.lang.String
  
  type RoleARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`SQL-1_0`
    - typingsSlinky.awsSdk.awsSdkStrings.`FLINK-1_6`
    - typingsSlinky.awsSdk.awsSdkStrings.`FLINK-1_8`
    - typingsSlinky.awsSdk.awsSdkStrings.`FLINK-1_11`
    - java.lang.String
  */
  type RuntimeEnvironment = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._RuntimeEnvironment | java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SecurityGroupId]
  
  type SessionExpirationDurationInSeconds = scala.Double
  
  type SnapshotName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type SnapshotStatus = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._SnapshotStatus | java.lang.String
  
  type SnapshotSummaries = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotDetails]
  
  type SqlRunConfigurations = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlRunConfiguration]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Tag]
  
  type TextContent = java.lang.String
  
  type Timestamp = js.Date
  
  type UrlType = typingsSlinky.awsSdk.awsSdkStrings.FLINK_DASHBOARD_URL | java.lang.String
  
  type VpcConfigurationDescriptions = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription]
  
  type VpcConfigurationUpdates = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdate]
  
  type VpcConfigurations = js.Array[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfiguration]
  
  type VpcId = java.lang.String
  
  type ZipFileContent = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-05-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisanalyticsv2Mod._apiVersion | java.lang.String
}
