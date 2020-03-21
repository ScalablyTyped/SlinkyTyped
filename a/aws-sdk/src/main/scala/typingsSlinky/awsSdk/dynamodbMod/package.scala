package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamodbMod {
  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADD
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = typingsSlinky.awsSdk.dynamodbMod._AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[typingsSlinky.awsSdk.dynamodbMod.AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.dynamodbMod.AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValueUpdate]
  type AttributeValueList = js.Array[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = scala.Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = js.Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = typingsSlinky.awsSdk.dynamodbMod._BackupStatus | java.lang.String
  type BackupSummaries = js.Array[typingsSlinky.awsSdk.dynamodbMod.BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typingsSlinky.awsSdk.dynamodbMod._BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = typingsSlinky.awsSdk.dynamodbMod._BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED
    - typingsSlinky.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = typingsSlinky.awsSdk.dynamodbMod._BillingMode | java.lang.String
  type BinaryAttributeValue = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.dynamodbMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbMod.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.dynamodbMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.LE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_NULL
    - typingsSlinky.awsSdk.awsSdkStrings.NULL
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.dynamodbMod._ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AND
    - typingsSlinky.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = typingsSlinky.awsSdk.dynamodbMod._ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typingsSlinky.awsSdk.dynamodbMod.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = typingsSlinky.awsSdk.dynamodbMod._ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = typingsSlinky.awsSdk.dynamodbMod._ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = typingsSlinky.awsSdk.dynamodbMod._ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[typingsSlinky.awsSdk.dynamodbMod.ContributorInsightsSummary]
  type Date = js.Date
  type Double = scala.Double
  type Endpoints = js.Array[typingsSlinky.awsSdk.dynamodbMod.Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalSecondaryIndexAutoScalingUpdate]
  type GlobalSecondaryIndexDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[typingsSlinky.awsSdk.dynamodbMod.GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = typingsSlinky.awsSdk.dynamodbMod._GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = typingsSlinky.awsSdk.dynamodbMod._IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[typingsSlinky.awsSdk.dynamodbMod.ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[typingsSlinky.awsSdk.dynamodbMod.ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[typingsSlinky.awsSdk.dynamodbMod.AttributeMap]
  type ItemResponseList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[typingsSlinky.awsSdk.dynamodbMod.Key]
  type KeySchema = js.Array[typingsSlinky.awsSdk.dynamodbMod.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HASH
    - typingsSlinky.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsSlinky.awsSdk.dynamodbMod._KeyType | java.lang.String
  type LastUpdateDateTime = js.Date
  type ListAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[typingsSlinky.awsSdk.dynamodbMod.LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[typingsSlinky.awsSdk.dynamodbMod.LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[typingsSlinky.awsSdk.dynamodbMod.NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbMod.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = typingsSlinky.awsSdk.dynamodbMod._PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = typingsSlinky.awsSdk.dynamodbMod._ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaAutoScalingDescription]
  type ReplicaAutoScalingUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[
    typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingDescription
  ]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexDescription]
  type ReplicaGlobalSecondaryIndexList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndex]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[typingsSlinky.awsSdk.dynamodbMod.Replica]
  type ReplicaSettingsDescriptionList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = typingsSlinky.awsSdk.dynamodbMod._ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typingsSlinky.awsSdk.dynamodbMod.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INDEXES
    - typingsSlinky.awsSdk.awsSdkStrings.TOTAL
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = typingsSlinky.awsSdk.dynamodbMod._ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIZE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = typingsSlinky.awsSdk.dynamodbMod._ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_NEW
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = typingsSlinky.awsSdk.dynamodbMod._ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = typingsSlinky.awsSdk.dynamodbMod._ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = typingsSlinky.awsSdk.dynamodbMod._SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - typingsSlinky.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = typingsSlinky.awsSdk.dynamodbMod._SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S
    - typingsSlinky.awsSdk.awsSdkStrings.N
    - typingsSlinky.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = typingsSlinky.awsSdk.dynamodbMod._ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.dynamodbMod.Capacity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = typingsSlinky.awsSdk.dynamodbMod._Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsSlinky.awsSdk.dynamodbMod._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsSlinky.awsSdk.dynamodbMod.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = js.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typingsSlinky.awsSdk.dynamodbMod.TableName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVING
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type TableStatus = typingsSlinky.awsSdk.dynamodbMod._TableStatus | java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.dynamodbMod.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.dynamodbMod.Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = js.Date
  type TimeRangeUpperBound = js.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = typingsSlinky.awsSdk.dynamodbMod._TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[typingsSlinky.awsSdk.dynamodbMod.TransactGetItem]
  type TransactWriteItemList = js.Array[typingsSlinky.awsSdk.dynamodbMod.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typingsSlinky.awsSdk.dynamodbMod.WriteRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2011-12-05`
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-08-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.dynamodbMod._apiVersion | java.lang.String
}
