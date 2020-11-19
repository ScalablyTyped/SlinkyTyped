package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object athenaMod {
  
  type AmazonResourceName = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BoxedBoolean = scala.Boolean
  
  type BytesScannedCutoffValue = scala.Double
  
  type CatalogNameString = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.athenaMod.ClientApiVersions
  
  type ColumnInfoList = js.Array[typingsSlinky.awsSdk.athenaMod.ColumnInfo]
  
  type ColumnList = js.Array[typingsSlinky.awsSdk.athenaMod.Column]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_NULL
    - typingsSlinky.awsSdk.awsSdkStrings.NULLABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ColumnNullable = typingsSlinky.awsSdk.athenaMod._ColumnNullable | java.lang.String
  
  type CommentString = java.lang.String
  
  type DataCatalogSummaryList = js.Array[typingsSlinky.awsSdk.athenaMod.DataCatalogSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA
    - typingsSlinky.awsSdk.awsSdkStrings.GLUE
    - typingsSlinky.awsSdk.awsSdkStrings.HIVE
    - java.lang.String
  */
  type DataCatalogType = typingsSlinky.awsSdk.athenaMod._DataCatalogType | java.lang.String
  
  type DatabaseList = js.Array[typingsSlinky.awsSdk.athenaMod.Database]
  
  type DatabaseString = java.lang.String
  
  type Date = js.Date
  
  type DescriptionString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSE_S3
    - typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS
    - typingsSlinky.awsSdk.awsSdkStrings.CSE_KMS
    - java.lang.String
  */
  type EncryptionOption = typingsSlinky.awsSdk.athenaMod._EncryptionOption | java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type ExpressionString = java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type Integer = scala.Double
  
  type KeyString = java.lang.String
  
  type Long = scala.Double
  
  type MaxDataCatalogsCount = scala.Double
  
  type MaxDatabasesCount = scala.Double
  
  type MaxNamedQueriesCount = scala.Double
  
  type MaxQueryExecutionsCount = scala.Double
  
  type MaxQueryResults = scala.Double
  
  type MaxTableMetadataCount = scala.Double
  
  type MaxTagsCount = scala.Double
  
  type MaxWorkGroupsCount = scala.Double
  
  type NameString = java.lang.String
  
  type NamedQueryId = java.lang.String
  
  type NamedQueryIdList = js.Array[typingsSlinky.awsSdk.athenaMod.NamedQueryId]
  
  type NamedQueryList = js.Array[typingsSlinky.awsSdk.athenaMod.NamedQuery]
  
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.athenaMod.ParametersMapValue]
  
  type ParametersMapValue = java.lang.String
  
  type QueryExecutionId = java.lang.String
  
  type QueryExecutionIdList = js.Array[typingsSlinky.awsSdk.athenaMod.QueryExecutionId]
  
  type QueryExecutionList = js.Array[typingsSlinky.awsSdk.athenaMod.QueryExecution]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type QueryExecutionState = typingsSlinky.awsSdk.athenaMod._QueryExecutionState | java.lang.String
  
  type QueryString = java.lang.String
  
  type RowList = js.Array[typingsSlinky.awsSdk.athenaMod.Row]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DDL
    - typingsSlinky.awsSdk.awsSdkStrings.DML
    - typingsSlinky.awsSdk.awsSdkStrings.UTILITY
    - java.lang.String
  */
  type StatementType = typingsSlinky.awsSdk.athenaMod._StatementType | java.lang.String
  
  type String = java.lang.String
  
  type TableMetadataList = js.Array[typingsSlinky.awsSdk.athenaMod.TableMetadata]
  
  type TableTypeString = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.athenaMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.athenaMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type Token = java.lang.String
  
  type TypeString = java.lang.String
  
  type UnprocessedNamedQueryIdList = js.Array[typingsSlinky.awsSdk.athenaMod.UnprocessedNamedQueryId]
  
  type UnprocessedQueryExecutionIdList = js.Array[typingsSlinky.awsSdk.athenaMod.UnprocessedQueryExecutionId]
  
  type WorkGroupDescriptionString = java.lang.String
  
  type WorkGroupName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type WorkGroupState = typingsSlinky.awsSdk.athenaMod._WorkGroupState | java.lang.String
  
  type WorkGroupsList = js.Array[typingsSlinky.awsSdk.athenaMod.WorkGroupSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-05-18`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.athenaMod._apiVersion | java.lang.String
  
  type datumList = js.Array[typingsSlinky.awsSdk.athenaMod.Datum]
  
  type datumString = java.lang.String
}
