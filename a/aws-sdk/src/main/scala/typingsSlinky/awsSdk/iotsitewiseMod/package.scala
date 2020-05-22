package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotsitewiseMod {
  type ARN = java.lang.String
  type AccessPolicySummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AccessPolicySummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVERAGE
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - typingsSlinky.awsSdk.awsSdkStrings.MAXIMUM
    - typingsSlinky.awsSdk.awsSdkStrings.MINIMUM
    - typingsSlinky.awsSdk.awsSdkStrings.SUM
    - java.lang.String
  */
  type AggregateType = typingsSlinky.awsSdk.iotsitewiseMod._AggregateType | java.lang.String
  type AggregateTypes = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AggregateType]
  type AggregatedDoubleValue = scala.Double
  type AggregatedValues = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AggregatedValue]
  type AmazonResourceName = java.lang.String
  type AssetErrorCode = typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  type AssetErrorMessage = java.lang.String
  type AssetHierarchies = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetHierarchy]
  type AssetIDs = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.ID]
  type AssetModelHierarchies = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetModelHierarchy]
  type AssetModelHierarchyDefinitions = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetModelHierarchyDefinition]
  type AssetModelProperties = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetModelProperty]
  type AssetModelPropertyDefinitions = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetModelPropertyDefinition]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.PROPAGATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AssetModelState = typingsSlinky.awsSdk.iotsitewiseMod._AssetModelState | java.lang.String
  type AssetModelSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetModelSummary]
  type AssetProperties = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetProperty]
  type AssetPropertyAlias = java.lang.String
  type AssetPropertyValueHistory = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetPropertyValue]
  type AssetPropertyValues = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetPropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AssetState = typingsSlinky.awsSdk.iotsitewiseMod._AssetState | java.lang.String
  type AssetSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetSummary]
  type AssociatedAssetsSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssociatedAssetsSummary]
  type BatchAssociateProjectAssetsErrors = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetErrorDetails]
  type BatchDisassociateProjectAssetsErrors = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.AssetErrorDetails]
  type BatchPutAssetPropertyErrorEntries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.BatchPutAssetPropertyErrorEntry]
  type BatchPutAssetPropertyErrors = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.BatchPutAssetPropertyError]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequestException
    - typingsSlinky.awsSdk.awsSdkStrings.InternalFailureException
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailableException
    - typingsSlinky.awsSdk.awsSdkStrings.ThrottlingException
    - typingsSlinky.awsSdk.awsSdkStrings.LimitExceededException
    - typingsSlinky.awsSdk.awsSdkStrings.ConflictingOperationException
    - typingsSlinky.awsSdk.awsSdkStrings.TimestampOutOfRangeException
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDeniedException
    - java.lang.String
  */
  type BatchPutAssetPropertyValueErrorCode = typingsSlinky.awsSdk.iotsitewiseMod._BatchPutAssetPropertyValueErrorCode | java.lang.String
  type CapabilityConfiguration = java.lang.String
  type CapabilityNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - typingsSlinky.awsSdk.awsSdkStrings.OUT_OF_SYNC
    - typingsSlinky.awsSdk.awsSdkStrings.SYNC_FAILED
    - java.lang.String
  */
  type CapabilitySyncStatus = typingsSlinky.awsSdk.iotsitewiseMod._CapabilitySyncStatus | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotsitewiseMod.ClientApiVersions
  type ClientToken = java.lang.String
  type DashboardDefinition = java.lang.String
  type DashboardSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.DashboardSummary]
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type Email = java.lang.String
  type EntryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.iotsitewiseMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type Expression = java.lang.String
  type ExpressionVariables = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.ExpressionVariable]
  type GatewayCapabilitySummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.GatewayCapabilitySummary]
  type GatewaySummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.GatewaySummary]
  type ID = java.lang.String
  type IDs = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.ID]
  type IdentityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type IdentityType = typingsSlinky.awsSdk.iotsitewiseMod._IdentityType | java.lang.String
  type ImageFileData = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iotsitewiseMod.Blob | java.lang.String
  type ImageFileType = typingsSlinky.awsSdk.awsSdkStrings.PNG | java.lang.String
  type Interval = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.TOP_LEVEL
    - java.lang.String
  */
  type ListAssetsFilter = typingsSlinky.awsSdk.iotsitewiseMod._ListAssetsFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LoggingLevel = typingsSlinky.awsSdk.iotsitewiseMod._LoggingLevel | java.lang.String
  type Macro = java.lang.String
  type MaxResults = scala.Double
  type MonitorErrorCode = typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  type MonitorErrorMessage = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OffsetInNanos = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADMINISTRATOR
    - typingsSlinky.awsSdk.awsSdkStrings.VIEWER
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.iotsitewiseMod._Permission | java.lang.String
  type PortalClientId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type PortalState = typingsSlinky.awsSdk.iotsitewiseMod._PortalState | java.lang.String
  type PortalSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.PortalSummary]
  type ProjectSummaries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.ProjectSummary]
  type PropertyAlias = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type PropertyDataType = typingsSlinky.awsSdk.iotsitewiseMod._PropertyDataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PropertyNotificationState = typingsSlinky.awsSdk.iotsitewiseMod._PropertyNotificationState | java.lang.String
  type PropertyNotificationTopic = java.lang.String
  type PropertyUnit = java.lang.String
  type PropertyValueBooleanValue = scala.Boolean
  type PropertyValueDoubleValue = scala.Double
  type PropertyValueIntegerValue = scala.Double
  type PropertyValueStringValue = java.lang.String
  type PutAssetPropertyValueEntries = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.PutAssetPropertyValueEntry]
  type Qualities = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.Quality]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GOOD
    - typingsSlinky.awsSdk.awsSdkStrings.BAD
    - typingsSlinky.awsSdk.awsSdkStrings.UNCERTAIN
    - java.lang.String
  */
  type Quality = typingsSlinky.awsSdk.iotsitewiseMod._Quality | java.lang.String
  type Resolution = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PORTAL
    - typingsSlinky.awsSdk.awsSdkStrings.PROJECT
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.iotsitewiseMod._ResourceType | java.lang.String
  type SSOApplicationId = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iotsitewiseMod.TagValue]
  type TagValue = java.lang.String
  type TimeInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type TimeOrdering = typingsSlinky.awsSdk.iotsitewiseMod._TimeOrdering | java.lang.String
  type Timestamp = js.Date
  type Timestamps = js.Array[typingsSlinky.awsSdk.iotsitewiseMod.TimeInNanos]
  type Url = java.lang.String
  type VariableName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotsitewiseMod._apiVersion | java.lang.String
}
