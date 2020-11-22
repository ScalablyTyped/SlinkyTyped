package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gameliftMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT
    - typingsSlinky.awsSdk.awsSdkStrings.REJECT
    - java.lang.String
  */
  type AcceptanceType = typingsSlinky.awsSdk.gameliftMod._AcceptanceType | java.lang.String
  
  type AliasArn = java.lang.String
  
  type AliasId = java.lang.String
  
  type AliasIdOrArn = java.lang.String
  
  type AliasList = js.Array[typingsSlinky.awsSdk.gameliftMod.Alias]
  
  type AmazonResourceName = java.lang.String
  
  type ArnStringModel = java.lang.String
  
  type AutoScalingGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type BackfillMode = typingsSlinky.awsSdk.gameliftMod._BackfillMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT_PREFERRED
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND_ONLY
    - java.lang.String
  */
  type BalancingStrategy = typingsSlinky.awsSdk.gameliftMod._BalancingStrategy | java.lang.String
  
  type BooleanModel = scala.Boolean
  
  type BuildArn = java.lang.String
  
  type BuildId = java.lang.String
  
  type BuildIdOrArn = java.lang.String
  
  type BuildList = js.Array[typingsSlinky.awsSdk.gameliftMod.Build]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BuildStatus = typingsSlinky.awsSdk.gameliftMod._BuildStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.GENERATED
    - java.lang.String
  */
  type CertificateType = typingsSlinky.awsSdk.gameliftMod._CertificateType | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.gameliftMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperatorType = typingsSlinky.awsSdk.gameliftMod._ComparisonOperatorType | java.lang.String
  
  type CustomEventData = java.lang.String
  
  type DesiredPlayerSessionList = js.Array[typingsSlinky.awsSdk.gameliftMod.DesiredPlayerSession]
  
  type DnsName = java.lang.String
  
  type Double = scala.Double
  
  type DoubleObject = scala.Double
  
  type EC2InstanceLimitList = js.Array[typingsSlinky.awsSdk.gameliftMod.EC2InstanceLimit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c3Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type EC2InstanceType = typingsSlinky.awsSdk.gameliftMod._EC2InstanceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GENERIC_EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_SCALING_EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_DOWNLOADING
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_VALIDATING
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_STATE_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_INITIALIZATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_BINARY_DOWNLOAD_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VALIDATION_TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_INVALID_PATH
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_CRASHED
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_FORCE_TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.GAME_SESSION_ACTIVATION_TIMEOUT
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_CREATION_EXTRACTING_BUILD
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_CREATION_RUNNING_INSTALLER
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.INSTANCE_INTERRUPTED
    - java.lang.String
  */
  type EventCode = typingsSlinky.awsSdk.gameliftMod._EventCode | java.lang.String
  
  type EventList = js.Array[typingsSlinky.awsSdk.gameliftMod.Event]
  
  type FleetAction = typingsSlinky.awsSdk.awsSdkStrings.AUTO_SCALING | java.lang.String
  
  type FleetActionList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetAction]
  
  type FleetArn = java.lang.String
  
  type FleetAttributesList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetAttributes]
  
  type FleetCapacityList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetCapacity]
  
  type FleetId = java.lang.String
  
  type FleetIdList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetId]
  
  type FleetIdOrArn = java.lang.String
  
  type FleetIdOrArnList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetIdOrArn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEW
    - typingsSlinky.awsSdk.awsSdkStrings.DOWNLOADING
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATING
    - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type FleetStatus = typingsSlinky.awsSdk.gameliftMod._FleetStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type FleetType = typingsSlinky.awsSdk.gameliftMod._FleetType | java.lang.String
  
  type FleetUtilizationList = js.Array[typingsSlinky.awsSdk.gameliftMod.FleetUtilization]
  
  type Float = scala.Double
  
  type FreeText = java.lang.String
  
  type GamePropertyKey = java.lang.String
  
  type GamePropertyList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameProperty]
  
  type GamePropertyValue = java.lang.String
  
  type GameServerClaimStatus = typingsSlinky.awsSdk.awsSdkStrings.CLAIMED | java.lang.String
  
  type GameServerConnectionInfo = java.lang.String
  
  type GameServerData = java.lang.String
  
  type GameServerGroupAction = typingsSlinky.awsSdk.awsSdkStrings.REPLACE_INSTANCE_TYPES | java.lang.String
  
  type GameServerGroupActions = js.Array[typingsSlinky.awsSdk.gameliftMod.GameServerGroupAction]
  
  type GameServerGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAFE_DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.FORCE_DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.RETAIN
    - java.lang.String
  */
  type GameServerGroupDeleteOption = typingsSlinky.awsSdk.gameliftMod._GameServerGroupDeleteOption | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type GameServerGroupInstanceType = typingsSlinky.awsSdk.gameliftMod._GameServerGroupInstanceType | java.lang.String
  
  type GameServerGroupName = java.lang.String
  
  type GameServerGroupNameOrArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEW
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GameServerGroupStatus = typingsSlinky.awsSdk.gameliftMod._GameServerGroupStatus | java.lang.String
  
  type GameServerGroups = js.Array[typingsSlinky.awsSdk.gameliftMod.GameServerGroup]
  
  type GameServerHealthCheck = typingsSlinky.awsSdk.awsSdkStrings.HEALTHY | java.lang.String
  
  type GameServerId = java.lang.String
  
  type GameServerInstanceId = java.lang.String
  
  type GameServerInstanceIds = js.Array[typingsSlinky.awsSdk.gameliftMod.GameServerInstanceId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DRAINING
    - typingsSlinky.awsSdk.awsSdkStrings.SPOT_TERMINATING
    - java.lang.String
  */
  type GameServerInstanceStatus = typingsSlinky.awsSdk.gameliftMod._GameServerInstanceStatus | java.lang.String
  
  type GameServerInstances = js.Array[typingsSlinky.awsSdk.gameliftMod.GameServerInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NO_PROTECTION
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_PROTECTION
    - java.lang.String
  */
  type GameServerProtectionPolicy = typingsSlinky.awsSdk.gameliftMod._GameServerProtectionPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UTILIZED
    - java.lang.String
  */
  type GameServerUtilizationStatus = typingsSlinky.awsSdk.gameliftMod._GameServerUtilizationStatus | java.lang.String
  
  type GameServers = js.Array[typingsSlinky.awsSdk.gameliftMod.GameServer]
  
  type GameSessionActivationTimeoutSeconds = scala.Double
  
  type GameSessionData = java.lang.String
  
  type GameSessionDetailList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameSessionDetail]
  
  type GameSessionList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameSession]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FULFILLED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type GameSessionPlacementState = typingsSlinky.awsSdk.gameliftMod._GameSessionPlacementState | java.lang.String
  
  type GameSessionQueueArn = java.lang.String
  
  type GameSessionQueueDestinationList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameSessionQueueDestination]
  
  type GameSessionQueueList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameSessionQueue]
  
  type GameSessionQueueName = java.lang.String
  
  type GameSessionQueueNameOrArn = java.lang.String
  
  type GameSessionQueueNameOrArnList = js.Array[typingsSlinky.awsSdk.gameliftMod.GameSessionQueueNameOrArn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GameSessionStatus = typingsSlinky.awsSdk.gameliftMod._GameSessionStatus | java.lang.String
  
  type GameSessionStatusReason = typingsSlinky.awsSdk.awsSdkStrings.INTERRUPTED | java.lang.String
  
  type IamRoleArn = java.lang.String
  
  type IdStringModel = java.lang.String
  
  type InstanceDefinitions = js.Array[typingsSlinky.awsSdk.gameliftMod.InstanceDefinition]
  
  type InstanceId = java.lang.String
  
  type InstanceList = js.Array[typingsSlinky.awsSdk.gameliftMod.Instance]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - java.lang.String
  */
  type InstanceStatus = typingsSlinky.awsSdk.gameliftMod._InstanceStatus | java.lang.String
  
  type Integer = scala.Double
  
  type IpAddress = java.lang.String
  
  type IpPermissionsList = js.Array[typingsSlinky.awsSdk.gameliftMod.IpPermission]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type IpProtocol = typingsSlinky.awsSdk.gameliftMod._IpProtocol | java.lang.String
  
  type LatencyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.gameliftMod.PositiveInteger]
  
  type LaunchTemplateId = java.lang.String
  
  type LaunchTemplateName = java.lang.String
  
  type LaunchTemplateVersion = java.lang.String
  
  type MatchedPlayerSessionList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchedPlayerSession]
  
  type MatchmakerData = java.lang.String
  
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  
  type MatchmakingConfigurationArn = java.lang.String
  
  type MatchmakingConfigurationList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingConfiguration]
  
  type MatchmakingConfigurationName = java.lang.String
  
  type MatchmakingConfigurationNameList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingConfigurationName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PLACING
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRES_ACCEPTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.SEARCHING
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type MatchmakingConfigurationStatus = typingsSlinky.awsSdk.gameliftMod._MatchmakingConfigurationStatus | java.lang.String
  
  type MatchmakingIdList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingIdStringModel]
  
  type MatchmakingIdStringModel = java.lang.String
  
  type MatchmakingRequestTimeoutInteger = scala.Double
  
  type MatchmakingRuleSetArn = java.lang.String
  
  type MatchmakingRuleSetList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingRuleSet]
  
  type MatchmakingRuleSetName = java.lang.String
  
  type MatchmakingRuleSetNameList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingRuleSetName]
  
  type MatchmakingTicketList = js.Array[typingsSlinky.awsSdk.gameliftMod.MatchmakingTicket]
  
  type MaxConcurrentGameSessionActivations = scala.Double
  
  type MetricGroup = java.lang.String
  
  type MetricGroupList = js.Array[typingsSlinky.awsSdk.gameliftMod.MetricGroup]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ActivatingGameSessions
    - typingsSlinky.awsSdk.awsSdkStrings.ActiveGameSessions
    - typingsSlinky.awsSdk.awsSdkStrings.ActiveInstances
    - typingsSlinky.awsSdk.awsSdkStrings.AvailableGameSessions
    - typingsSlinky.awsSdk.awsSdkStrings.AvailablePlayerSessions
    - typingsSlinky.awsSdk.awsSdkStrings.CurrentPlayerSessions
    - typingsSlinky.awsSdk.awsSdkStrings.IdleInstances
    - typingsSlinky.awsSdk.awsSdkStrings.PercentAvailableGameSessions
    - typingsSlinky.awsSdk.awsSdkStrings.PercentIdleInstances
    - typingsSlinky.awsSdk.awsSdkStrings.QueueDepth
    - typingsSlinky.awsSdk.awsSdkStrings.WaitTime
    - java.lang.String
  */
  type MetricName = typingsSlinky.awsSdk.gameliftMod._MetricName | java.lang.String
  
  type NonBlankAndLengthConstraintString = java.lang.String
  
  type NonBlankString = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NonNegativeDouble = scala.Double
  
  type NonZeroAndMaxString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS_2012
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - java.lang.String
  */
  type OperatingSystem = typingsSlinky.awsSdk.gameliftMod._OperatingSystem | java.lang.String
  
  type PlacedPlayerSessionList = js.Array[typingsSlinky.awsSdk.gameliftMod.PlacedPlayerSession]
  
  type PlayerAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.gameliftMod.AttributeValue]
  
  type PlayerData = java.lang.String
  
  type PlayerDataMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.gameliftMod.PlayerData]
  
  type PlayerIdList = js.Array[typingsSlinky.awsSdk.gameliftMod.NonZeroAndMaxString]
  
  type PlayerLatencyList = js.Array[typingsSlinky.awsSdk.gameliftMod.PlayerLatency]
  
  type PlayerLatencyPolicyList = js.Array[typingsSlinky.awsSdk.gameliftMod.PlayerLatencyPolicy]
  
  type PlayerList = js.Array[typingsSlinky.awsSdk.gameliftMod.Player]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_ALL
    - typingsSlinky.awsSdk.awsSdkStrings.DENY_ALL
    - java.lang.String
  */
  type PlayerSessionCreationPolicy = typingsSlinky.awsSdk.gameliftMod._PlayerSessionCreationPolicy | java.lang.String
  
  type PlayerSessionId = java.lang.String
  
  type PlayerSessionList = js.Array[typingsSlinky.awsSdk.gameliftMod.PlayerSession]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESERVED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMEDOUT
    - java.lang.String
  */
  type PlayerSessionStatus = typingsSlinky.awsSdk.gameliftMod._PlayerSessionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RuleBased
    - typingsSlinky.awsSdk.awsSdkStrings.TargetBased
    - java.lang.String
  */
  type PolicyType = typingsSlinky.awsSdk.gameliftMod._PolicyType | java.lang.String
  
  type PortNumber = scala.Double
  
  type PositiveInteger = scala.Double
  
  type PositiveLong = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NoProtection
    - typingsSlinky.awsSdk.awsSdkStrings.FullProtection
    - java.lang.String
  */
  type ProtectionPolicy = typingsSlinky.awsSdk.gameliftMod._ProtectionPolicy | java.lang.String
  
  type QueueArnsList = js.Array[typingsSlinky.awsSdk.gameliftMod.ArnStringModel]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIMPLE
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINAL
    - java.lang.String
  */
  type RoutingStrategyType = typingsSlinky.awsSdk.gameliftMod._RoutingStrategyType | java.lang.String
  
  type RuleSetBody = java.lang.String
  
  type RuleSetLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ChangeInCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.ExactCapacity
    - typingsSlinky.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - java.lang.String
  */
  type ScalingAdjustmentType = typingsSlinky.awsSdk.gameliftMod._ScalingAdjustmentType | java.lang.String
  
  type ScalingPolicyList = js.Array[typingsSlinky.awsSdk.gameliftMod.ScalingPolicy]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ScalingStatusType = typingsSlinky.awsSdk.gameliftMod._ScalingStatusType | java.lang.String
  
  type ScriptArn = java.lang.String
  
  type ScriptId = java.lang.String
  
  type ScriptIdOrArn = java.lang.String
  
  type ScriptList = js.Array[typingsSlinky.awsSdk.gameliftMod.Script]
  
  type ServerProcessList = js.Array[typingsSlinky.awsSdk.gameliftMod.ServerProcess]
  
  type SnsArnStringModel = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.gameliftMod._SortOrder | java.lang.String
  
  type StringDoubleMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.gameliftMod.DoubleObject]
  
  type StringList = js.Array[typingsSlinky.awsSdk.gameliftMod.NonZeroAndMaxString]
  
  type StringModel = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.gameliftMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.gameliftMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type VpcPeeringAuthorizationList = js.Array[typingsSlinky.awsSdk.gameliftMod.VpcPeeringAuthorization]
  
  type VpcPeeringConnectionList = js.Array[typingsSlinky.awsSdk.gameliftMod.VpcPeeringConnection]
  
  type VpcSubnet = java.lang.String
  
  type VpcSubnets = js.Array[typingsSlinky.awsSdk.gameliftMod.VpcSubnet]
  
  type WeightedCapacity = java.lang.String
  
  type WholeNumber = scala.Double
  
  type ZipBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.gameliftMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-10-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.gameliftMod._apiVersion | java.lang.String
}
