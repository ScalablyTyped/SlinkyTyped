package typingsSlinky.awsSdk.documentClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentClient {
  type ArchivalReason = java.lang.String
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
  type BackupSummaries = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupSummary]
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.WriteRequests]
  type BinarySetAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientRequestToken = java.lang.String
  type ConditionExpression = java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRule]
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
  type IndexName = java.lang.String
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
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
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
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  type SSEEnabled = scala.Boolean
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Capacity]
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = js.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName]
  type TagKeyList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = js.Date
  type TimeRangeUpperBound = js.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  type TransactGetItemList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TransactGetItem]
  type TransactWriteItemList = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typingsSlinky.awsSdk.documentClientMod.DocumentClient.WriteRequest]
}
