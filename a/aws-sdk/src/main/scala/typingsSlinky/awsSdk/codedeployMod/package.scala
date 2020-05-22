package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codedeployMod {
  type AdditionalDeploymentStatusInfo = java.lang.String
  type AlarmList = js.Array[typingsSlinky.awsSdk.codedeployMod.Alarm]
  type AlarmName = java.lang.String
  type ApplicationId = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.registerTime
    - typingsSlinky.awsSdk.awsSdkStrings.firstUsedTime
    - typingsSlinky.awsSdk.awsSdkStrings.lastUsedTime
    - java.lang.String
  */
  type ApplicationRevisionSortBy = typingsSlinky.awsSdk.codedeployMod._ApplicationRevisionSortBy | java.lang.String
  type ApplicationsInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.ApplicationInfo]
  type ApplicationsList = js.Array[typingsSlinky.awsSdk.codedeployMod.ApplicationName]
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
    - java.lang.String
  */
  type AutoRollbackEvent = typingsSlinky.awsSdk.codedeployMod._AutoRollbackEvent | java.lang.String
  type AutoRollbackEventsList = js.Array[typingsSlinky.awsSdk.codedeployMod.AutoRollbackEvent]
  type AutoScalingGroupHook = java.lang.String
  type AutoScalingGroupList = js.Array[typingsSlinky.awsSdk.codedeployMod.AutoScalingGroup]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupNameList = js.Array[typingsSlinky.awsSdk.codedeployMod.AutoScalingGroupName]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.tar
    - typingsSlinky.awsSdk.awsSdkStrings.tgz
    - typingsSlinky.awsSdk.awsSdkStrings.zip__
    - typingsSlinky.awsSdk.awsSdkStrings.YAML
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type BundleType = typingsSlinky.awsSdk.codedeployMod._BundleType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codedeployMod.ClientApiVersions
  type CloudFormationResourceType = java.lang.String
  type CommitId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Server_
    - typingsSlinky.awsSdk.awsSdkStrings.Lambda_
    - typingsSlinky.awsSdk.awsSdkStrings.ECS
    - java.lang.String
  */
  type ComputePlatform = typingsSlinky.awsSdk.codedeployMod._ComputePlatform | java.lang.String
  type DeploymentConfigId = java.lang.String
  type DeploymentConfigName = java.lang.String
  type DeploymentConfigsList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentConfigName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.user__
    - typingsSlinky.awsSdk.awsSdkStrings.autoscaling
    - typingsSlinky.awsSdk.awsSdkStrings.codeDeployRollback
    - typingsSlinky.awsSdk.awsSdkStrings.CodeDeploy
    - typingsSlinky.awsSdk.awsSdkStrings.CloudFormation_
    - typingsSlinky.awsSdk.awsSdkStrings.CloudFormationRollback
    - java.lang.String
  */
  type DeploymentCreator = typingsSlinky.awsSdk.codedeployMod._DeploymentCreator | java.lang.String
  type DeploymentGroupId = java.lang.String
  type DeploymentGroupInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentGroupInfo]
  type DeploymentGroupName = java.lang.String
  type DeploymentGroupsList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentGroupName]
  type DeploymentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
    - typingsSlinky.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
    - java.lang.String
  */
  type DeploymentOption = typingsSlinky.awsSdk.codedeployMod._DeploymentOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
    - typingsSlinky.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
    - java.lang.String
  */
  type DeploymentReadyAction = typingsSlinky.awsSdk.codedeployMod._DeploymentReadyAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Queued_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Baking_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type DeploymentStatus = typingsSlinky.awsSdk.codedeployMod._DeploymentStatus | java.lang.String
  type DeploymentStatusList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[typingsSlinky.awsSdk.codedeployMod.ErrorMessage]
  type DeploymentTargetList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceTarget
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaTarget
    - typingsSlinky.awsSdk.awsSdkStrings.ECSTarget
    - typingsSlinky.awsSdk.awsSdkStrings.CloudFormationTarget
    - java.lang.String
  */
  type DeploymentTargetType = typingsSlinky.awsSdk.codedeployMod._DeploymentTargetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PLACE
    - typingsSlinky.awsSdk.awsSdkStrings.BLUE_GREEN
    - java.lang.String
  */
  type DeploymentType = typingsSlinky.awsSdk.codedeployMod._DeploymentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY_WAIT
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATION_WAIT
    - java.lang.String
  */
  type DeploymentWaitType = typingsSlinky.awsSdk.codedeployMod._DeploymentWaitType | java.lang.String
  type DeploymentsInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentInfo]
  type DeploymentsList = js.Array[typingsSlinky.awsSdk.codedeployMod.DeploymentId]
  type Description = java.lang.String
  type Duration = scala.Double
  type EC2TagFilterList = js.Array[typingsSlinky.awsSdk.codedeployMod.EC2TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.VALUE_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type EC2TagFilterType = typingsSlinky.awsSdk.codedeployMod._EC2TagFilterType | java.lang.String
  type EC2TagSetList = js.Array[typingsSlinky.awsSdk.codedeployMod.EC2TagFilterList]
  type ECSClusterName = java.lang.String
  type ECSServiceList = js.Array[typingsSlinky.awsSdk.codedeployMod.ECSService]
  type ECSServiceName = java.lang.String
  type ECSTaskSetCount = scala.Double
  type ECSTaskSetIdentifier = java.lang.String
  type ECSTaskSetList = js.Array[typingsSlinky.awsSdk.codedeployMod.ECSTaskSet]
  type ECSTaskSetStatus = java.lang.String
  type ELBInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.ELBInfo]
  type ELBName = java.lang.String
  type ETag = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT_ISSUE
    - typingsSlinky.awsSdk.awsSdkStrings.ALARM_ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOSCALING_VALIDATION_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO_SCALING_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO_SCALING_IAM_ROLE_PERMISSIONS
    - typingsSlinky.awsSdk.awsSdkStrings.CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_APPLICATION_UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_GROUP_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.ECS_UPDATE_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.ELASTIC_LOAD_BALANCING_INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.ELB_INVALID_INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS_INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.HOOK_EXECUTION_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE_PERMISSIONS
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_ECS_SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_LAMBDA_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_LAMBDA_FUNCTION
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_REVISION
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL_STOP
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_ELB_INFORMATION
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_GITHUB_TOKEN
    - typingsSlinky.awsSdk.awsSdkStrings.NO_EC2_SUBSCRIPTION
    - typingsSlinky.awsSdk.awsSdkStrings.NO_INSTANCES
    - typingsSlinky.awsSdk.awsSdkStrings.OVER_MAX_INSTANCES
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.REVISION_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.THROTTLED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_FAILURE
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.codedeployMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type ExternalId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.OVERWRITE
    - typingsSlinky.awsSdk.awsSdkStrings.RETAIN
    - java.lang.String
  */
  type FileExistsBehavior = typingsSlinky.awsSdk.codedeployMod._FileExistsBehavior | java.lang.String
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[typingsSlinky.awsSdk.codedeployMod.FilterValue]
  type GitHubAccountTokenName = java.lang.String
  type GitHubAccountTokenNameList = js.Array[typingsSlinky.awsSdk.codedeployMod.GitHubAccountTokenName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISCOVER_EXISTING
    - typingsSlinky.awsSdk.awsSdkStrings.COPY_AUTO_SCALING_GROUP
    - java.lang.String
  */
  type GreenFleetProvisioningAction = typingsSlinky.awsSdk.codedeployMod._GreenFleetProvisioningAction | java.lang.String
  type IamSessionArn = java.lang.String
  type IamUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE
    - typingsSlinky.awsSdk.awsSdkStrings.KEEP_ALIVE
    - java.lang.String
  */
  type InstanceAction = typingsSlinky.awsSdk.codedeployMod._InstanceAction | java.lang.String
  type InstanceArn = java.lang.String
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceInfo]
  type InstanceName = java.lang.String
  type InstanceNameList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Skipped_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type InstanceStatus = typingsSlinky.awsSdk.codedeployMod._InstanceStatus | java.lang.String
  type InstanceStatusList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceStatus]
  type InstanceSummaryList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Blue_
    - typingsSlinky.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type InstanceType = typingsSlinky.awsSdk.codedeployMod._InstanceType | java.lang.String
  type InstanceTypeList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceType]
  type InstancesList = js.Array[typingsSlinky.awsSdk.codedeployMod.InstanceId]
  type Key = java.lang.String
  type LambdaFunctionAlias = java.lang.String
  type LambdaFunctionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.ScriptMissing
    - typingsSlinky.awsSdk.awsSdkStrings.ScriptNotExecutable
    - typingsSlinky.awsSdk.awsSdkStrings.ScriptTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ScriptFailed
    - typingsSlinky.awsSdk.awsSdkStrings.UnknownError
    - java.lang.String
  */
  type LifecycleErrorCode = typingsSlinky.awsSdk.codedeployMod._LifecycleErrorCode | java.lang.String
  type LifecycleEventHookExecutionId = java.lang.String
  type LifecycleEventList = js.Array[typingsSlinky.awsSdk.codedeployMod.LifecycleEvent]
  type LifecycleEventName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Skipped_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type LifecycleEventStatus = typingsSlinky.awsSdk.codedeployMod._LifecycleEventStatus | java.lang.String
  type LifecycleMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.include_
    - typingsSlinky.awsSdk.awsSdkStrings.exclude_
    - typingsSlinky.awsSdk.awsSdkStrings.ignore__
    - java.lang.String
  */
  type ListStateFilterAction = typingsSlinky.awsSdk.codedeployMod._ListStateFilterAction | java.lang.String
  type ListenerArn = java.lang.String
  type ListenerArnList = js.Array[typingsSlinky.awsSdk.codedeployMod.ListenerArn]
  type LogTail = java.lang.String
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HOST_COUNT
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_PERCENT
    - java.lang.String
  */
  type MinimumHealthyHostsType = typingsSlinky.awsSdk.codedeployMod._MinimumHealthyHostsType | java.lang.String
  type MinimumHealthyHostsValue = scala.Double
  type NextToken = java.lang.String
  type NullableBoolean = scala.Boolean
  type OnPremisesTagSetList = js.Array[typingsSlinky.awsSdk.codedeployMod.TagFilterList]
  type Percentage = scala.Double
  type RawStringContent = java.lang.String
  type RawStringSha256 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Registered_
    - typingsSlinky.awsSdk.awsSdkStrings.Deregistered_
    - java.lang.String
  */
  type RegistrationStatus = typingsSlinky.awsSdk.codedeployMod._RegistrationStatus | java.lang.String
  type Repository = java.lang.String
  type RevisionInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.RevisionInfo]
  type RevisionLocationList = js.Array[typingsSlinky.awsSdk.codedeployMod.RevisionLocation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.GitHub_
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.AppSpecContent
    - java.lang.String
  */
  type RevisionLocationType = typingsSlinky.awsSdk.codedeployMod._RevisionLocationType | java.lang.String
  type Role = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type ScriptName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ascending__
    - typingsSlinky.awsSdk.awsSdkStrings.descending__
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.codedeployMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StopStatus = typingsSlinky.awsSdk.codedeployMod._StopStatus | java.lang.String
  type TagFilterList = js.Array[typingsSlinky.awsSdk.codedeployMod.TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.VALUE_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type TagFilterType = typingsSlinky.awsSdk.codedeployMod._TagFilterType | java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.codedeployMod.Key]
  type TagList = js.Array[typingsSlinky.awsSdk.codedeployMod.Tag]
  type TargetArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TargetStatus
    - typingsSlinky.awsSdk.awsSdkStrings.ServerInstanceLabel
    - java.lang.String
  */
  type TargetFilterName = typingsSlinky.awsSdk.codedeployMod._TargetFilterName | java.lang.String
  type TargetFilters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codedeployMod.FilterValueList]
  type TargetGroupInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.TargetGroupInfo]
  type TargetGroupName = java.lang.String
  type TargetGroupPairInfoList = js.Array[typingsSlinky.awsSdk.codedeployMod.TargetGroupPairInfo]
  type TargetId = java.lang.String
  type TargetIdList = js.Array[typingsSlinky.awsSdk.codedeployMod.TargetId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Blue_
    - typingsSlinky.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type TargetLabel = typingsSlinky.awsSdk.codedeployMod._TargetLabel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Skipped_
    - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
    - typingsSlinky.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type TargetStatus = typingsSlinky.awsSdk.codedeployMod._TargetStatus | java.lang.String
  type Time = js.Date
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TimeBasedCanary
    - typingsSlinky.awsSdk.awsSdkStrings.TimeBasedLinear
    - typingsSlinky.awsSdk.awsSdkStrings.AllAtOnce
    - java.lang.String
  */
  type TrafficRoutingType = typingsSlinky.awsSdk.codedeployMod._TrafficRoutingType | java.lang.String
  type TrafficWeight = scala.Double
  type TriggerConfigList = js.Array[typingsSlinky.awsSdk.codedeployMod.TriggerConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentStart
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentSuccess
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentFailure
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentStop
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentRollback
    - typingsSlinky.awsSdk.awsSdkStrings.DeploymentReady
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceStart
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceSuccess
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceFailure
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceReady
    - java.lang.String
  */
  type TriggerEventType = typingsSlinky.awsSdk.codedeployMod._TriggerEventType | java.lang.String
  type TriggerEventTypeList = js.Array[typingsSlinky.awsSdk.codedeployMod.TriggerEventType]
  type TriggerName = java.lang.String
  type TriggerTargetArn = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type VersionId = java.lang.String
  type WaitTimeInMins = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-10-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codedeployMod._apiVersion | java.lang.String
}
