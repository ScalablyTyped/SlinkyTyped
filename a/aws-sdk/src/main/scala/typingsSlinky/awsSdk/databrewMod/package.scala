package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object databrewMod {
  
  type AccountId = java.lang.String
  
  type ActionId = scala.Double
  
  type Arn = java.lang.String
  
  type AssumeControl = scala.Boolean
  
  type Attempt = scala.Double
  
  type Bucket = java.lang.String
  
  type CatalogId = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.databrewMod.ClientApiVersions
  
  type ClientSessionId = java.lang.String
  
  type ColumnName = java.lang.String
  
  type ColumnNameList = js.Array[typingsSlinky.awsSdk.databrewMod.ColumnName]
  
  type ColumnRange = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GZIP
    - typingsSlinky.awsSdk.awsSdkStrings.LZ4
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPPY
    - typingsSlinky.awsSdk.awsSdkStrings.BZIP2
    - typingsSlinky.awsSdk.awsSdkStrings.DEFLATE
    - typingsSlinky.awsSdk.awsSdkStrings.LZO
    - typingsSlinky.awsSdk.awsSdkStrings.BROTLI
    - typingsSlinky.awsSdk.awsSdkStrings.ZSTD
    - typingsSlinky.awsSdk.awsSdkStrings.ZLIB
    - java.lang.String
  */
  type CompressionFormat = typingsSlinky.awsSdk.databrewMod._CompressionFormat | java.lang.String
  
  type Condition = java.lang.String
  
  type ConditionExpressionList = js.Array[typingsSlinky.awsSdk.databrewMod.ConditionExpression]
  
  type ConditionValue = java.lang.String
  
  type CreatedBy = java.lang.String
  
  type CronExpression = java.lang.String
  
  type DatabaseName = java.lang.String
  
  type DatasetList = js.Array[typingsSlinky.awsSdk.databrewMod.Dataset]
  
  type DatasetName = java.lang.String
  
  type Date = js.Date
  
  type EncryptionKeyArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
    - typingsSlinky.awsSdk.awsSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type EncryptionMode = typingsSlinky.awsSdk.databrewMod._EncryptionMode | java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ExecutionTime = scala.Double
  
  type HiddenColumnList = js.Array[typingsSlinky.awsSdk.databrewMod.ColumnName]
  
  type JobList = js.Array[typingsSlinky.awsSdk.databrewMod.Job]
  
  type JobName = java.lang.String
  
  type JobNameList = js.Array[typingsSlinky.awsSdk.databrewMod.JobName]
  
  type JobRunErrorMessage = java.lang.String
  
  type JobRunId = java.lang.String
  
  type JobRunList = js.Array[typingsSlinky.awsSdk.databrewMod.JobRun]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - java.lang.String
  */
  type JobRunState = typingsSlinky.awsSdk.databrewMod._JobRunState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROFILE
    - typingsSlinky.awsSdk.awsSdkStrings.RECIPE
    - java.lang.String
  */
  type JobType = typingsSlinky.awsSdk.databrewMod._JobType | java.lang.String
  
  type Key = java.lang.String
  
  type LastModifiedBy = java.lang.String
  
  type LogGroupName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type LogSubscription = typingsSlinky.awsSdk.databrewMod._LogSubscription | java.lang.String
  
  type MaxCapacity = scala.Double
  
  type MaxResults100 = scala.Double
  
  type MaxRetries = scala.Double
  
  type MultiLine = scala.Boolean
  
  type NextToken = java.lang.String
  
  type OpenedBy = java.lang.String
  
  type Operation = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.PARQUET
    - typingsSlinky.awsSdk.awsSdkStrings.GLUEPARQUET
    - typingsSlinky.awsSdk.awsSdkStrings.AVRO
    - typingsSlinky.awsSdk.awsSdkStrings.ORC
    - typingsSlinky.awsSdk.awsSdkStrings.XML
    - java.lang.String
  */
  type OutputFormat = typingsSlinky.awsSdk.databrewMod._OutputFormat | java.lang.String
  
  type OutputList = js.Array[typingsSlinky.awsSdk.databrewMod.Output]
  
  type OverwriteOutput = scala.Boolean
  
  type ParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.databrewMod.ParameterValue]
  
  type ParameterName = java.lang.String
  
  type ParameterValue = java.lang.String
  
  type Preview = scala.Boolean
  
  type ProjectList = js.Array[typingsSlinky.awsSdk.databrewMod.Project]
  
  type ProjectName = java.lang.String
  
  type PublishedBy = java.lang.String
  
  type RecipeDescription = java.lang.String
  
  type RecipeErrorList = js.Array[typingsSlinky.awsSdk.databrewMod.RecipeVersionErrorDetail]
  
  type RecipeErrorMessage = java.lang.String
  
  type RecipeList = js.Array[typingsSlinky.awsSdk.databrewMod.Recipe]
  
  type RecipeName = java.lang.String
  
  type RecipeStepList = js.Array[typingsSlinky.awsSdk.databrewMod.RecipeStep]
  
  type RecipeVersion = java.lang.String
  
  type RecipeVersionList = js.Array[typingsSlinky.awsSdk.databrewMod.RecipeVersion]
  
  type Result = java.lang.String
  
  type SampleSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FIRST_N
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_N
    - typingsSlinky.awsSdk.awsSdkStrings.RANDOM
    - java.lang.String
  */
  type SampleType = typingsSlinky.awsSdk.databrewMod._SampleType | java.lang.String
  
  type ScheduleList = js.Array[typingsSlinky.awsSdk.databrewMod.Schedule]
  
  type ScheduleName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSIGNED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZING
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.RECYCLING
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SessionStatus = typingsSlinky.awsSdk.databrewMod._SessionStatus | java.lang.String
  
  type SheetIndex = scala.Double
  
  type SheetIndexList = js.Array[typingsSlinky.awsSdk.databrewMod.SheetIndex]
  
  type SheetName = java.lang.String
  
  type SheetNameList = js.Array[typingsSlinky.awsSdk.databrewMod.SheetName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.`DATA-CATALOG`
    - java.lang.String
  */
  type Source = typingsSlinky.awsSdk.databrewMod._Source | java.lang.String
  
  type StartColumnIndex = scala.Double
  
  type StartedBy = java.lang.String
  
  type StepIndex = scala.Double
  
  type TableName = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.databrewMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.databrewMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TargetColumn = java.lang.String
  
  type Timeout = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.databrewMod._apiVersion | java.lang.String
}
