package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object elasticbeanstalkMod {
  
  type ARN = java.lang.String
  
  type AbortableOperationInProgress = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionHistoryStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._ActionHistoryStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Scheduled_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Running_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._ActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceRefresh
    - typingsSlinky.awsSdk.awsSdkStrings.PlatformUpdate
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.elasticbeanstalkMod._ActionType | java.lang.String
  
  type ApplicationArn = java.lang.String
  
  type ApplicationDescriptionList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationDescription]
  
  type ApplicationName = java.lang.String
  
  type ApplicationNamesList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName]
  
  type ApplicationVersionArn = java.lang.String
  
  type ApplicationVersionDescriptionList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationVersionDescription]
  
  type ApplicationVersionProccess = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Processed
    - typingsSlinky.awsSdk.awsSdkStrings.Unprocessed
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Processing_
    - typingsSlinky.awsSdk.awsSdkStrings.Building_
    - java.lang.String
  */
  type ApplicationVersionStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._ApplicationVersionStatus | java.lang.String
  
  type AutoCreateApplication = scala.Boolean
  
  type AutoScalingGroupList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.AutoScalingGroup]
  
  type AvailableSolutionStackDetailsList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackDescription]
  
  type AvailableSolutionStackNamesList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName]
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedInt = scala.Double
  
  type BranchName = java.lang.String
  
  type BranchOrder = scala.Double
  
  type Cause = java.lang.String
  
  type Causes = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Cause]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.elasticbeanstalkMod.ClientApiVersions
  
  type CnameAvailability = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = typingsSlinky.awsSdk.elasticbeanstalkMod._ComputeType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.deployed_
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type ConfigurationDeploymentStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._ConfigurationDeploymentStatus | java.lang.String
  
  type ConfigurationOptionDefaultValue = java.lang.String
  
  type ConfigurationOptionDescriptionsList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ConfigurationOptionDescription]
  
  type ConfigurationOptionName = java.lang.String
  
  type ConfigurationOptionPossibleValue = java.lang.String
  
  type ConfigurationOptionPossibleValues = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ConfigurationOptionPossibleValue]
  
  type ConfigurationOptionSettingsList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ConfigurationOptionSetting]
  
  type ConfigurationOptionSeverity = java.lang.String
  
  type ConfigurationOptionValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Scalar
    - typingsSlinky.awsSdk.awsSdkStrings.List
    - java.lang.String
  */
  type ConfigurationOptionValueType = typingsSlinky.awsSdk.elasticbeanstalkMod._ConfigurationOptionValueType | java.lang.String
  
  type ConfigurationSettingsDescriptionList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ConfigurationSettingsDescription]
  
  type ConfigurationTemplateName = java.lang.String
  
  type ConfigurationTemplateNamesList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ConfigurationTemplateName]
  
  type CreationDate = js.Date
  
  type CustomAmiList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.CustomAmi]
  
  type DNSCname = java.lang.String
  
  type DNSCnamePrefix = java.lang.String
  
  type DeleteSourceBundle = scala.Boolean
  
  type DeploymentTimestamp = js.Date
  
  type Description = java.lang.String
  
  type Ec2InstanceId = java.lang.String
  
  type EndpointURL = java.lang.String
  
  type EnvironmentArn = java.lang.String
  
  type EnvironmentDescriptionsList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Green_
    - typingsSlinky.awsSdk.awsSdkStrings.Yellow_
    - typingsSlinky.awsSdk.awsSdkStrings.Red_
    - typingsSlinky.awsSdk.awsSdkStrings.Grey
    - java.lang.String
  */
  type EnvironmentHealth = typingsSlinky.awsSdk.elasticbeanstalkMod._EnvironmentHealth | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Status_
    - typingsSlinky.awsSdk.awsSdkStrings.Color_
    - typingsSlinky.awsSdk.awsSdkStrings.Causes
    - typingsSlinky.awsSdk.awsSdkStrings.ApplicationMetrics
    - typingsSlinky.awsSdk.awsSdkStrings.InstancesHealth
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.HealthStatus
    - typingsSlinky.awsSdk.awsSdkStrings.RefreshedAt
    - java.lang.String
  */
  type EnvironmentHealthAttribute = typingsSlinky.awsSdk.elasticbeanstalkMod._EnvironmentHealthAttribute | java.lang.String
  
  type EnvironmentHealthAttributes = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentHealthAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NoData
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Ok_
    - typingsSlinky.awsSdk.awsSdkStrings.Info_
    - typingsSlinky.awsSdk.awsSdkStrings.Warning_
    - typingsSlinky.awsSdk.awsSdkStrings.Degraded_
    - typingsSlinky.awsSdk.awsSdkStrings.Severe
    - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type EnvironmentHealthStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._EnvironmentHealthStatus | java.lang.String
  
  type EnvironmentId = java.lang.String
  
  type EnvironmentIdList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId]
  
  type EnvironmentInfoDescriptionList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentInfoDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.tail_
    - typingsSlinky.awsSdk.awsSdkStrings.bundle
    - java.lang.String
  */
  type EnvironmentInfoType = typingsSlinky.awsSdk.elasticbeanstalkMod._EnvironmentInfoType | java.lang.String
  
  type EnvironmentLinks = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentLink]
  
  type EnvironmentName = java.lang.String
  
  type EnvironmentNamesList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Launching_
    - typingsSlinky.awsSdk.awsSdkStrings.Updating_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - typingsSlinky.awsSdk.awsSdkStrings.Terminating_
    - typingsSlinky.awsSdk.awsSdkStrings.Terminated_
    - java.lang.String
  */
  type EnvironmentStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._EnvironmentStatus | java.lang.String
  
  type EventDate = js.Date
  
  type EventDescriptionList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.EventDescription]
  
  type EventMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRACE
    - typingsSlinky.awsSdk.awsSdkStrings.DEBUG
    - typingsSlinky.awsSdk.awsSdkStrings.INFO
    - typingsSlinky.awsSdk.awsSdkStrings.WARN
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type EventSeverity = typingsSlinky.awsSdk.elasticbeanstalkMod._EventSeverity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateCancelled
    - typingsSlinky.awsSdk.awsSdkStrings.CancellationFailed
    - typingsSlinky.awsSdk.awsSdkStrings.RollbackFailed
    - typingsSlinky.awsSdk.awsSdkStrings.RollbackSuccessful
    - typingsSlinky.awsSdk.awsSdkStrings.InternalFailure
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidEnvironmentState
    - typingsSlinky.awsSdk.awsSdkStrings.PermissionsError
    - java.lang.String
  */
  type FailureType = typingsSlinky.awsSdk.elasticbeanstalkMod._FailureType | java.lang.String
  
  type FileTypeExtension = java.lang.String
  
  type ForceTerminate = scala.Boolean
  
  type GroupName = java.lang.String
  
  type ImageId = java.lang.String
  
  type IncludeDeleted = scala.Boolean
  
  type IncludeDeletedBackTo = js.Date
  
  type InstanceHealthList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SingleInstanceHealth]
  
  type InstanceId = java.lang.String
  
  type InstanceList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Instance]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HealthStatus
    - typingsSlinky.awsSdk.awsSdkStrings.Color_
    - typingsSlinky.awsSdk.awsSdkStrings.Causes
    - typingsSlinky.awsSdk.awsSdkStrings.ApplicationMetrics
    - typingsSlinky.awsSdk.awsSdkStrings.RefreshedAt
    - typingsSlinky.awsSdk.awsSdkStrings.LaunchedAt
    - typingsSlinky.awsSdk.awsSdkStrings.System_
    - typingsSlinky.awsSdk.awsSdkStrings.Deployment
    - typingsSlinky.awsSdk.awsSdkStrings.AvailabilityZone
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceType
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type InstancesHealthAttribute = typingsSlinky.awsSdk.elasticbeanstalkMod._InstancesHealthAttribute | java.lang.String
  
  type InstancesHealthAttributes = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.InstancesHealthAttribute]
  
  type Integer = scala.Double
  
  type LaunchConfigurationList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.LaunchConfiguration]
  
  type LaunchTemplateList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.LaunchTemplate]
  
  type LaunchedAt = js.Date
  
  type LoadAverage = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.LoadAverageValue]
  
  type LoadAverageValue = scala.Double
  
  type LoadBalancerList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.LoadBalancer]
  
  type LoadBalancerListenersDescription = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Listener]
  
  type Maintainer = java.lang.String
  
  type ManagedActionHistoryItems = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItem]
  
  type ManagedActions = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ManagedAction]
  
  type MaxRecords = scala.Double
  
  type Message = java.lang.String
  
  type NextToken = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NullableDouble = scala.Double
  
  type NullableInteger = scala.Double
  
  type NullableLong = scala.Double
  
  type OperatingSystemName = java.lang.String
  
  type OperatingSystemVersion = java.lang.String
  
  type OperationsRole = java.lang.String
  
  type OptionNamespace = java.lang.String
  
  type OptionRestrictionMaxLength = scala.Double
  
  type OptionRestrictionMaxValue = scala.Double
  
  type OptionRestrictionMinValue = scala.Double
  
  type OptionsSpecifierList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.OptionSpecification]
  
  type PlatformArn = java.lang.String
  
  type PlatformBranchLifecycleState = java.lang.String
  
  type PlatformBranchMaxRecords = scala.Double
  
  type PlatformBranchSummaryList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformBranchSummary]
  
  type PlatformCategory = java.lang.String
  
  type PlatformFilterOperator = java.lang.String
  
  type PlatformFilterType = java.lang.String
  
  type PlatformFilterValue = java.lang.String
  
  type PlatformFilterValueList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformFilterValue]
  
  type PlatformFilters = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformFilter]
  
  type PlatformFrameworks = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformFramework]
  
  type PlatformLifecycleState = java.lang.String
  
  type PlatformMaxRecords = scala.Double
  
  type PlatformName = java.lang.String
  
  type PlatformOwner = java.lang.String
  
  type PlatformProgrammingLanguages = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformProgrammingLanguage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type PlatformStatus = typingsSlinky.awsSdk.elasticbeanstalkMod._PlatformStatus | java.lang.String
  
  type PlatformSummaryList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformSummary]
  
  type PlatformVersion = java.lang.String
  
  type QueueList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Queue]
  
  type RefreshedAt = js.Date
  
  type RegexLabel = java.lang.String
  
  type RegexPattern = java.lang.String
  
  type RequestCount = scala.Double
  
  type RequestId = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Key = java.lang.String
  
  type SampleTimestamp = js.Date
  
  type SearchFilterAttribute = java.lang.String
  
  type SearchFilterOperator = java.lang.String
  
  type SearchFilterValue = java.lang.String
  
  type SearchFilterValues = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SearchFilterValue]
  
  type SearchFilters = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SearchFilter]
  
  type SolutionStackFileTypeList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.FileTypeExtension]
  
  type SolutionStackName = java.lang.String
  
  type SourceLocation = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CodeCommit_
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type SourceRepository = typingsSlinky.awsSdk.elasticbeanstalkMod._SourceRepository | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Git
    - typingsSlinky.awsSdk.awsSdkStrings.Zip_
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.elasticbeanstalkMod._SourceType | java.lang.String
  
  type String = java.lang.String
  
  type SupportedAddon = java.lang.String
  
  type SupportedAddonList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedAddon]
  
  type SupportedTier = java.lang.String
  
  type SupportedTierList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.SupportedTier]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Tag]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Tag]
  
  type TerminateEnvForce = scala.Boolean
  
  type TerminateEnvironmentResources = scala.Boolean
  
  type TimeFilterEnd = js.Date
  
  type TimeFilterStart = js.Date
  
  type Timestamp = js.Date
  
  type Token = java.lang.String
  
  type TriggerList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.Trigger]
  
  type UpdateDate = js.Date
  
  type UserDefinedOption = scala.Boolean
  
  type ValidationMessageString = java.lang.String
  
  type ValidationMessagesList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.ValidationMessage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.warning__
    - java.lang.String
  */
  type ValidationSeverity = typingsSlinky.awsSdk.elasticbeanstalkMod._ValidationSeverity | java.lang.String
  
  type VersionLabel = java.lang.String
  
  type VersionLabels = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel]
  
  type VersionLabelsList = js.Array[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel]
  
  type VirtualizationType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2010-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.elasticbeanstalkMod._apiVersion | java.lang.String
}
