package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudformationMod {
  type Account = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
    - java.lang.String
  */
  type AccountGateStatus = typingsSlinky.awsSdk.cloudformationMod._AccountGateStatus | java.lang.String
  type AccountGateStatusReason = java.lang.String
  type AccountLimitList = js.Array[typingsSlinky.awsSdk.cloudformationMod.AccountLimit]
  type AccountList = js.Array[typingsSlinky.awsSdk.cloudformationMod.Account]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[typingsSlinky.awsSdk.cloudformationMod.AllowedValue]
  type Arn = java.lang.String
  type AutoDeploymentNullable = scala.Boolean
  type BoxedInteger = scala.Double
  type BoxedMaxResults = scala.Double
  type Capabilities = js.Array[typingsSlinky.awsSdk.cloudformationMod.Capability]
  type CapabilitiesReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CAPABILITY_IAM
    - typingsSlinky.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
    - typingsSlinky.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
    - java.lang.String
  */
  type Capability = typingsSlinky.awsSdk.cloudformationMod._Capability | java.lang.String
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Add_
    - typingsSlinky.awsSdk.awsSdkStrings.Modify_
    - typingsSlinky.awsSdk.awsSdkStrings.Remove_
    - typingsSlinky.awsSdk.awsSdkStrings.Import_
    - java.lang.String
  */
  type ChangeAction = typingsSlinky.awsSdk.cloudformationMod._ChangeAction | java.lang.String
  type ChangeSetId = java.lang.String
  type ChangeSetName = java.lang.String
  type ChangeSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeSetStatus = typingsSlinky.awsSdk.cloudformationMod._ChangeSetStatus | java.lang.String
  type ChangeSetStatusReason = java.lang.String
  type ChangeSetSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.ChangeSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT
    - java.lang.String
  */
  type ChangeSetType = typingsSlinky.awsSdk.cloudformationMod._ChangeSetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceReference
    - typingsSlinky.awsSdk.awsSdkStrings.ParameterReference
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceAttribute
    - typingsSlinky.awsSdk.awsSdkStrings.DirectModification
    - typingsSlinky.awsSdk.awsSdkStrings.Automatic_
    - java.lang.String
  */
  type ChangeSource = typingsSlinky.awsSdk.cloudformationMod._ChangeSource | java.lang.String
  type ChangeType = typingsSlinky.awsSdk.awsSdkStrings.Resource_ | java.lang.String
  type Changes = js.Array[typingsSlinky.awsSdk.cloudformationMod.Change]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudformationMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type CreationTime = js.Date
  type DeletionTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type DeprecatedStatus = typingsSlinky.awsSdk.cloudformationMod._DeprecatedStatus | java.lang.String
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADD
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUAL
    - java.lang.String
  */
  type DifferenceType = typingsSlinky.awsSdk.cloudformationMod._DifferenceType | java.lang.String
  type DisableRollback = scala.Boolean
  type DriftedStackInstancesCount = scala.Double
  type EnableTerminationProtection = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Static_
    - typingsSlinky.awsSdk.awsSdkStrings.Dynamic_
    - java.lang.String
  */
  type EvaluationType = typingsSlinky.awsSdk.cloudformationMod._EvaluationType | java.lang.String
  type EventId = java.lang.String
  type ExecutionRoleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.OBSOLETE
    - java.lang.String
  */
  type ExecutionStatus = typingsSlinky.awsSdk.cloudformationMod._ExecutionStatus | java.lang.String
  type ExportName = java.lang.String
  type ExportValue = java.lang.String
  type Exports = js.Array[typingsSlinky.awsSdk.cloudformationMod.Export]
  type FailedStackInstancesCount = scala.Double
  type FailureToleranceCount = scala.Double
  type FailureTolerancePercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotUpdatable
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequest
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidCredentials
    - typingsSlinky.awsSdk.awsSdkStrings.AlreadyExists
    - typingsSlinky.awsSdk.awsSdkStrings.NotFound
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceConflict
    - typingsSlinky.awsSdk.awsSdkStrings.Throttling_
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceLimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.NotStabilized
    - typingsSlinky.awsSdk.awsSdkStrings.GeneralServiceException
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceInternalError
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkFailure
    - typingsSlinky.awsSdk.awsSdkStrings.InternalFailure
    - java.lang.String
  */
  type HandlerErrorCode = typingsSlinky.awsSdk.cloudformationMod._HandlerErrorCode | java.lang.String
  type Imports = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackName]
  type InProgressStackInstancesCount = scala.Double
  type InSyncStackInstancesCount = scala.Double
  type IsDefaultVersion = scala.Boolean
  type Key = java.lang.String
  type LastUpdatedTime = js.Date
  type LimitName = java.lang.String
  type LimitValue = scala.Double
  type LogGroupName = java.lang.String
  type LogicalResourceId = java.lang.String
  type LogicalResourceIds = js.Array[typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId]
  type MaxConcurrentCount = scala.Double
  type MaxConcurrentPercentage = scala.Double
  type MaxResults = scala.Double
  type Metadata = java.lang.String
  type MonitoringTimeInMinutes = scala.Double
  type NextToken = java.lang.String
  type NoEcho = scala.Boolean
  type NotificationARN = java.lang.String
  type NotificationARNs = js.Array[typingsSlinky.awsSdk.cloudformationMod.NotificationARN]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DO_NOTHING
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type OnFailure = typingsSlinky.awsSdk.cloudformationMod._OnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = typingsSlinky.awsSdk.cloudformationMod._OperationStatus | java.lang.String
  type OptionalSecureUrl = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitIdList = js.Array[typingsSlinky.awsSdk.cloudformationMod.OrganizationalUnitId]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type Outputs = js.Array[typingsSlinky.awsSdk.cloudformationMod.Output]
  type ParameterDeclarations = js.Array[typingsSlinky.awsSdk.cloudformationMod.ParameterDeclaration]
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type Parameters = js.Array[typingsSlinky.awsSdk.cloudformationMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typingsSlinky.awsSdk.awsSdkStrings.SELF_MANAGED
    - java.lang.String
  */
  type PermissionModels = typingsSlinky.awsSdk.cloudformationMod._PermissionModels | java.lang.String
  type PhysicalResourceId = java.lang.String
  type PhysicalResourceIdContext = js.Array[typingsSlinky.awsSdk.cloudformationMod.PhysicalResourceIdContextKeyValuePair]
  type PrivateTypeArn = java.lang.String
  type Properties = java.lang.String
  type PropertyDifferences = js.Array[typingsSlinky.awsSdk.cloudformationMod.PropertyDifference]
  type PropertyName = java.lang.String
  type PropertyPath = java.lang.String
  type PropertyValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NON_PROVISIONABLE
    - typingsSlinky.awsSdk.awsSdkStrings.IMMUTABLE
    - typingsSlinky.awsSdk.awsSdkStrings.FULLY_MUTABLE
    - java.lang.String
  */
  type ProvisioningType = typingsSlinky.awsSdk.cloudformationMod._ProvisioningType | java.lang.String
  type Reason = java.lang.String
  type Region = java.lang.String
  type RegionList = js.Array[typingsSlinky.awsSdk.cloudformationMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RegistrationStatus = typingsSlinky.awsSdk.cloudformationMod._RegistrationStatus | java.lang.String
  type RegistrationToken = java.lang.String
  type RegistrationTokenList = js.Array[typingsSlinky.awsSdk.cloudformationMod.RegistrationToken]
  type RegistryType = typingsSlinky.awsSdk.awsSdkStrings.RESOURCE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.True_
    - typingsSlinky.awsSdk.awsSdkStrings.False_
    - typingsSlinky.awsSdk.awsSdkStrings.Conditional_
    - java.lang.String
  */
  type Replacement = typingsSlinky.awsSdk.cloudformationMod._Replacement | java.lang.String
  type RequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Never_
    - typingsSlinky.awsSdk.awsSdkStrings.Conditionally_
    - typingsSlinky.awsSdk.awsSdkStrings.Always_
    - java.lang.String
  */
  type RequiresRecreation = typingsSlinky.awsSdk.cloudformationMod._RequiresRecreation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Properties_
    - typingsSlinky.awsSdk.awsSdkStrings.Metadata_
    - typingsSlinky.awsSdk.awsSdkStrings.CreationPolicy_
    - typingsSlinky.awsSdk.awsSdkStrings.UpdatePolicy_
    - typingsSlinky.awsSdk.awsSdkStrings.DeletionPolicy_
    - typingsSlinky.awsSdk.awsSdkStrings.Tags_
    - java.lang.String
  */
  type ResourceAttribute = typingsSlinky.awsSdk.cloudformationMod._ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceChangeDetail]
  type ResourceIdentifierProperties = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cloudformationMod.ResourceIdentifierPropertyValue]
  type ResourceIdentifierPropertyKey = java.lang.String
  type ResourceIdentifierPropertyValue = java.lang.String
  type ResourceIdentifierSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceIdentifierSummary]
  type ResourceIdentifiers = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceIdentifierPropertyKey]
  type ResourceModel = java.lang.String
  type ResourceProperties = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ResourceSignalStatus = typingsSlinky.awsSdk.cloudformationMod._ResourceSignalStatus | java.lang.String
  type ResourceSignalUniqueId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SKIPPED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
    - java.lang.String
  */
  type ResourceStatus = typingsSlinky.awsSdk.cloudformationMod._ResourceStatus | java.lang.String
  type ResourceStatusReason = java.lang.String
  type ResourceToSkip = java.lang.String
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceType]
  type ResourcesToImport = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceToImport]
  type ResourcesToSkip = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceToSkip]
  type RetainResources = js.Array[typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId]
  type RetainStacks = scala.Boolean
  type RetainStacksNullable = scala.Boolean
  type RetainStacksOnAccountRemovalNullable = scala.Boolean
  type RoleARN_ = java.lang.String
  type RoleArn = java.lang.String
  type RollbackTriggers = js.Array[typingsSlinky.awsSdk.cloudformationMod.RollbackTrigger]
  type S3Url = java.lang.String
  type Scope = js.Array[typingsSlinky.awsSdk.cloudformationMod.ResourceAttribute]
  type StackDriftDetectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DETECTION_COMPLETE
    - java.lang.String
  */
  type StackDriftDetectionStatus = typingsSlinky.awsSdk.cloudformationMod._StackDriftDetectionStatus | java.lang.String
  type StackDriftDetectionStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DRIFTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackDriftStatus = typingsSlinky.awsSdk.cloudformationMod._StackDriftStatus | java.lang.String
  type StackEvents = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackEvent]
  type StackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceDetailedStatus = typingsSlinky.awsSdk.cloudformationMod._StackInstanceDetailedStatus | java.lang.String
  type StackInstanceFilterName = typingsSlinky.awsSdk.awsSdkStrings.DETAILED_STATUS | java.lang.String
  type StackInstanceFilterValues = java.lang.String
  type StackInstanceFilters = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackInstanceFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURRENT
    - typingsSlinky.awsSdk.awsSdkStrings.OUTDATED
    - typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typingsSlinky.awsSdk.cloudformationMod._StackInstanceStatus | java.lang.String
  type StackInstanceSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackInstanceSummary]
  type StackName = java.lang.String
  type StackNameOrId = java.lang.String
  type StackPolicyBody = java.lang.String
  type StackPolicyDuringUpdateBody = java.lang.String
  type StackPolicyDuringUpdateURL = java.lang.String
  type StackPolicyURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackResourceDriftStatus = typingsSlinky.awsSdk.cloudformationMod._StackResourceDriftStatus | java.lang.String
  type StackResourceDriftStatusFilters = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackResourceDrift]
  type StackResourceSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackResourceSummary]
  type StackResources = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackResource]
  type StackSetARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StackSetDriftDetectionStatus = typingsSlinky.awsSdk.cloudformationMod._StackSetDriftDetectionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DRIFTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_SYNC
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackSetDriftStatus = typingsSlinky.awsSdk.cloudformationMod._StackSetDriftStatus | java.lang.String
  type StackSetId = java.lang.String
  type StackSetName = java.lang.String
  type StackSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.DETECT_DRIFT
    - java.lang.String
  */
  type StackSetOperationAction = typingsSlinky.awsSdk.cloudformationMod._StackSetOperationAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type StackSetOperationResultStatus = typingsSlinky.awsSdk.cloudformationMod._StackSetOperationResultStatus | java.lang.String
  type StackSetOperationResultSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackSetOperationResultSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - java.lang.String
  */
  type StackSetOperationStatus = typingsSlinky.awsSdk.cloudformationMod._StackSetOperationStatus | java.lang.String
  type StackSetOperationSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackSetOperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StackSetStatus = typingsSlinky.awsSdk.cloudformationMod._StackSetStatus | java.lang.String
  type StackSetSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_COMPLETE_CLEANUP_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.REVIEW_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
    - java.lang.String
  */
  type StackStatus = typingsSlinky.awsSdk.cloudformationMod._StackStatus | java.lang.String
  type StackStatusFilter = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackStatus]
  type StackStatusReason = java.lang.String
  type StackSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.StackSummary]
  type Stacks = js.Array[typingsSlinky.awsSdk.cloudformationMod.Stack]
  type StageList = js.Array[typingsSlinky.awsSdk.cloudformationMod.TemplateStage]
  type StatusMessage = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.cloudformationMod.Tag]
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateParameters = js.Array[typingsSlinky.awsSdk.cloudformationMod.TemplateParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Original_
    - typingsSlinky.awsSdk.awsSdkStrings.Processed
    - java.lang.String
  */
  type TemplateStage = typingsSlinky.awsSdk.cloudformationMod._TemplateStage | java.lang.String
  type TemplateURL = java.lang.String
  type TimeoutMinutes = scala.Double
  type Timestamp = js.Date
  type TotalStackInstancesCount = scala.Double
  type TransformName = java.lang.String
  type TransformsList = js.Array[typingsSlinky.awsSdk.cloudformationMod.TransformName]
  type Type = java.lang.String
  type TypeArn = java.lang.String
  type TypeName = java.lang.String
  type TypeSchema = java.lang.String
  type TypeSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.TypeSummary]
  type TypeVersionId = java.lang.String
  type TypeVersionSummaries = js.Array[typingsSlinky.awsSdk.cloudformationMod.TypeVersionSummary]
  type Url = java.lang.String
  type UsePreviousTemplate = scala.Boolean
  type UsePreviousValue = scala.Boolean
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type Visibility = typingsSlinky.awsSdk.cloudformationMod._Visibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2010-05-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudformationMod._apiVersion | java.lang.String
}
