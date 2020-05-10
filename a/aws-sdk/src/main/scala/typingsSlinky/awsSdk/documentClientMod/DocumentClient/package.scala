package typingsSlinky.awsSdk.documentClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentClient {
  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADD
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = typingsSlinky.awsSdk.documentClientMod.DocumentClient._AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValueUpdate]
  type AttributeValue = js.Any
  type AttributeValueList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.AutoScalingPolicyDescription
  ]
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
  type BackupStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._BackupStatus | java.lang.String
  type BackupSummaries = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_BACKUP
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = typingsSlinky.awsSdk.documentClientMod.DocumentClient._BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED
    - typingsSlinky.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = typingsSlinky.awsSdk.documentClientMod.DocumentClient._BillingMode | java.lang.String
  type BinaryAttributeValue = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.documentClientMod.DocumentClient.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
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
  type ComparisonOperator = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AND
    - typingsSlinky.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsSummary]
  type Date = js.Date
  type Double = scala.Double
  type Endpoints = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexAutoScalingUpdate
  ]
  type GlobalSecondaryIndexDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexDescription
  ]
  type GlobalSecondaryIndexList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalTableGlobalSecondaryIndexSettingsUpdate
  ]
  type GlobalTableList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetricsMultiple
  ]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemCollectionSizeEstimateBound
  ]
  type ItemCount = scala.Double
  type ItemList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeMap]
  type ItemResponseList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Key]
  type KeySchema = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HASH
    - typingsSlinky.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._KeyType | java.lang.String
  type LastUpdateDateTime = js.Date
  type ListAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexDescription
  ]
  type LocalSecondaryIndexList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingDescription
  ]
  type ReplicaAutoScalingUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingDescription
  ]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingUpdate
  ]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexDescription
  ]
  type ReplicaGlobalSecondaryIndexList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndex
  ]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsDescription
  ]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsUpdate
  ]
  type ReplicaList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Replica]
  type ReplicaSettingsDescriptionList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INDEXES
    - typingsSlinky.awsSdk.awsSdkStrings.TOTAL
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIZE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_NEW
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_OLD
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLING
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLING
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - typingsSlinky.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S
    - typingsSlinky.awsSdk.awsSdkStrings.N
    - typingsSlinky.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Capacity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = typingsSlinky.awsSdk.documentClientMod.DocumentClient._Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = js.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName]
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
  type TableStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._TableStatus | java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Tag]
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
  type TimeToLiveStatus = typingsSlinky.awsSdk.documentClientMod.DocumentClient._TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TransactGetItem]
  type TransactWriteItemList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.WriteRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.Buffer
    - typingsSlinky.awsSdk.documentClientMod.File
    - typingsSlinky.awsSdk.documentClientMod.Blob
    - typingsSlinky.std.ArrayBuffer
    - typingsSlinky.std.DataView
    - typingsSlinky.std.Int8Array
    - typingsSlinky.std.Uint8Array
    - typingsSlinky.std.Uint8ClampedArray
    - typingsSlinky.std.Int16Array
    - typingsSlinky.std.Uint16Array
    - typingsSlinky.std.Int32Array
    - typingsSlinky.std.Uint32Array
    - typingsSlinky.std.Float32Array
    - typingsSlinky.std.Float64Array
    - typingsSlinky.node.streamMod.Stream
  */
  type binaryType = typingsSlinky.awsSdk.documentClientMod.DocumentClient._binaryType | typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | js.typedarray.DataView | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | typingsSlinky.node.streamMod.Stream
}
