package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kendraMod {
  type AdditionalResultAttributeList = js.Array[typingsSlinky.awsSdk.kendraMod.AdditionalResultAttribute]
  type AdditionalResultAttributeValueType = typingsSlinky.awsSdk.awsSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String
  type AttributeFilterList = js.Array[typingsSlinky.awsSdk.kendraMod.AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[typingsSlinky.awsSdk.kendraMod.BatchDeleteDocumentResponseFailedDocument]
  type BatchPutDocumentResponseFailedDocuments = js.Array[typingsSlinky.awsSdk.kendraMod.BatchPutDocumentResponseFailedDocument]
  type Boolean = scala.Boolean
  type ChangeDetectingColumns = js.Array[typingsSlinky.awsSdk.kendraMod.ColumnName]
  type ClickFeedbackList = js.Array[typingsSlinky.awsSdk.kendraMod.ClickFeedback]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kendraMod.ClientApiVersions
  type ColumnName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PDF
    - typingsSlinky.awsSdk.awsSdkStrings.HTML
    - typingsSlinky.awsSdk.awsSdkStrings.MS_WORD
    - typingsSlinky.awsSdk.awsSdkStrings.PLAIN_TEXT
    - typingsSlinky.awsSdk.awsSdkStrings.PPT
    - java.lang.String
  */
  type ContentType = typingsSlinky.awsSdk.kendraMod._ContentType | java.lang.String
  type DataSourceDateFieldFormat = java.lang.String
  type DataSourceFieldName = java.lang.String
  type DataSourceId = java.lang.String
  type DataSourceInclusionsExclusionsStrings = js.Array[typingsSlinky.awsSdk.kendraMod.DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember = java.lang.String
  type DataSourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DataSourceStatus = typingsSlinky.awsSdk.kendraMod._DataSourceStatus | java.lang.String
  type DataSourceSummaryList = js.Array[typingsSlinky.awsSdk.kendraMod.DataSourceSummary]
  type DataSourceSyncJobHistoryList = js.Array[typingsSlinky.awsSdk.kendraMod.DataSourceSyncJob]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.SYNCING
    - typingsSlinky.awsSdk.awsSdkStrings.INCOMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type DataSourceSyncJobStatus = typingsSlinky.awsSdk.kendraMod._DataSourceSyncJobStatus | java.lang.String
  type DataSourceToIndexFieldMappingList = js.Array[typingsSlinky.awsSdk.kendraMod.DataSourceToIndexFieldMapping]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.SHAREPOINT
    - typingsSlinky.awsSdk.awsSdkStrings.DATABASE
    - java.lang.String
  */
  type DataSourceType = typingsSlinky.awsSdk.kendraMod._DataSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_AURORA_MYSQL
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_AURORA_POSTGRESQL
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_MYSQL
    - typingsSlinky.awsSdk.awsSdkStrings.RDS_POSTGRESQL
    - java.lang.String
  */
  type DatabaseEngineType = typingsSlinky.awsSdk.kendraMod._DatabaseEngineType | java.lang.String
  type DatabaseHost = java.lang.String
  type DatabaseName = java.lang.String
  type DatabasePort = scala.Double
  type Description = java.lang.String
  type DocumentAttributeKey = java.lang.String
  type DocumentAttributeKeyList = js.Array[typingsSlinky.awsSdk.kendraMod.DocumentAttributeKey]
  type DocumentAttributeList = js.Array[typingsSlinky.awsSdk.kendraMod.DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[typingsSlinky.awsSdk.kendraMod.String]
  type DocumentAttributeStringValue = java.lang.String
  type DocumentAttributeValueCountPairList = js.Array[typingsSlinky.awsSdk.kendraMod.DocumentAttributeValueCountPair]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.STRING_LIST_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.LONG_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.DATE_VALUE
    - java.lang.String
  */
  type DocumentAttributeValueType = typingsSlinky.awsSdk.kendraMod._DocumentAttributeValueType | java.lang.String
  type DocumentId = java.lang.String
  type DocumentIdList = js.Array[typingsSlinky.awsSdk.kendraMod.DocumentId]
  type DocumentList = js.Array[typingsSlinky.awsSdk.kendraMod.Document]
  type DocumentMetadataBoolean = scala.Boolean
  type DocumentMetadataConfigurationList = js.Array[typingsSlinky.awsSdk.kendraMod.DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = java.lang.String
  type Duration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InternalError
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequest
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.kendraMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FacetList = js.Array[typingsSlinky.awsSdk.kendraMod.Facet]
  type FacetResultList = js.Array[typingsSlinky.awsSdk.kendraMod.FacetResult]
  type FaqId = java.lang.String
  type FaqName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FaqStatus = typingsSlinky.awsSdk.kendraMod._FaqStatus | java.lang.String
  type FaqSummaryItems = js.Array[typingsSlinky.awsSdk.kendraMod.FaqSummary]
  type HighlightList = js.Array[typingsSlinky.awsSdk.kendraMod.Highlight]
  type Importance = scala.Double
  type IndexConfigurationSummaryList = js.Array[typingsSlinky.awsSdk.kendraMod.IndexConfigurationSummary]
  type IndexFieldName = java.lang.String
  type IndexId = java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_UPDATING
    - java.lang.String
  */
  type IndexStatus = typingsSlinky.awsSdk.kendraMod._IndexStatus | java.lang.String
  type IndexedQuestionAnswersCount = scala.Double
  type IndexedTextDocumentsCount = scala.Double
  type Integer = scala.Double
  type KmsKeyId = java.lang.String
  type Long = scala.Double
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = scala.Double
  type MaxResultsIntegerForListDataSourcesRequest = scala.Double
  type MaxResultsIntegerForListFaqsRequest = scala.Double
  type MaxResultsIntegerForListIndicesRequest = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type Order = typingsSlinky.awsSdk.kendraMod._Order | java.lang.String
  type PrincipalList = js.Array[typingsSlinky.awsSdk.kendraMod.Principal]
  type PrincipalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typingsSlinky.awsSdk.kendraMod._PrincipalType | java.lang.String
  type QueryId = java.lang.String
  type QueryResultItemList = js.Array[typingsSlinky.awsSdk.kendraMod.QueryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT
    - typingsSlinky.awsSdk.awsSdkStrings.QUESTION_ANSWER
    - typingsSlinky.awsSdk.awsSdkStrings.ANSWER
    - java.lang.String
  */
  type QueryResultType = typingsSlinky.awsSdk.kendraMod._QueryResultType | java.lang.String
  type QueryText = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type ReadAccessType = typingsSlinky.awsSdk.kendraMod._ReadAccessType | java.lang.String
  type RelevanceFeedbackList = js.Array[typingsSlinky.awsSdk.kendraMod.RelevanceFeedback]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RELEVANT
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_RELEVANT
    - java.lang.String
  */
  type RelevanceType = typingsSlinky.awsSdk.kendraMod._RelevanceType | java.lang.String
  type ResultId = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type S3ObjectKey = java.lang.String
  type ScanSchedule = java.lang.String
  type SecretArn = java.lang.String
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.kendraMod.VpcSecurityGroupId]
  type SharePointUrlList = js.Array[typingsSlinky.awsSdk.kendraMod.Url]
  type SharePointVersion = typingsSlinky.awsSdk.awsSdkStrings.SHAREPOINT_ONLINE | java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdList = js.Array[typingsSlinky.awsSdk.kendraMod.SubnetId]
  type TableName = java.lang.String
  type Timestamp = js.Date
  type Title = java.lang.String
  type Url = java.lang.String
  type ValueImportanceMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kendraMod.Importance]
  type ValueImportanceMapKey = java.lang.String
  type VpcSecurityGroupId = java.lang.String
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kendraMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-02-03`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kendraMod._apiVersion | java.lang.String
}
