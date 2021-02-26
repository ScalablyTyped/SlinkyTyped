package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ecsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.STAGING
    - typingsSlinky.awsSdk.awsSdkStrings.STAGED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AgentUpdateStatus = typingsSlinky.awsSdk.ecsMod._AgentUpdateStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typingsSlinky.awsSdk.ecsMod._AssignPublicIp | java.lang.String
  
  type AttachmentDetails = js.Array[typingsSlinky.awsSdk.ecsMod.KeyValuePair]
  
  type AttachmentStateChanges = js.Array[typingsSlinky.awsSdk.ecsMod.AttachmentStateChange]
  
  type Attachments = js.Array[typingsSlinky.awsSdk.ecsMod.Attachment]
  
  type Attributes = js.Array[typingsSlinky.awsSdk.ecsMod.Attribute]
  
  type Boolean = scala.Boolean
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedInteger = scala.Double
  
  type CapacityProviderField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type CapacityProviderFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.CapacityProviderField]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type CapacityProviderStatus = typingsSlinky.awsSdk.ecsMod._CapacityProviderStatus | java.lang.String
  
  type CapacityProviderStrategy = js.Array[typingsSlinky.awsSdk.ecsMod.CapacityProviderStrategyItem]
  
  type CapacityProviderStrategyItemBase = scala.Double
  
  type CapacityProviderStrategyItemWeight = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type CapacityProviderUpdateStatus = typingsSlinky.awsSdk.ecsMod._CapacityProviderUpdateStatus | java.lang.String
  
  type CapacityProviders = js.Array[typingsSlinky.awsSdk.ecsMod.CapacityProvider]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ecsMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ATTACHMENTS
    - typingsSlinky.awsSdk.awsSdkStrings.SETTINGS
    - typingsSlinky.awsSdk.awsSdkStrings.STATISTICS
    - typingsSlinky.awsSdk.awsSdkStrings.TAGS
    - java.lang.String
  */
  type ClusterField = typingsSlinky.awsSdk.ecsMod._ClusterField | java.lang.String
  
  type ClusterFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.ClusterField]
  
  type ClusterSettingName = typingsSlinky.awsSdk.awsSdkStrings.containerInsights | java.lang.String
  
  type ClusterSettings = js.Array[typingsSlinky.awsSdk.ecsMod.ClusterSetting]
  
  type Clusters = js.Array[typingsSlinky.awsSdk.ecsMod.Cluster]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type Compatibility = typingsSlinky.awsSdk.ecsMod._Compatibility | java.lang.String
  
  type CompatibilityList = js.Array[typingsSlinky.awsSdk.ecsMod.Compatibility]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type Connectivity = typingsSlinky.awsSdk.ecsMod._Connectivity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.START
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - java.lang.String
  */
  type ContainerCondition = typingsSlinky.awsSdk.ecsMod._ContainerCondition | java.lang.String
  
  type ContainerDefinitions = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerDefinition]
  
  type ContainerDependencies = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerDependency]
  
  type ContainerInstanceField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type ContainerInstanceFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerInstanceField]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DRAINING
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTRATION_FAILED
    - java.lang.String
  */
  type ContainerInstanceStatus = typingsSlinky.awsSdk.ecsMod._ContainerInstanceStatus | java.lang.String
  
  type ContainerInstances = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerInstance]
  
  type ContainerOverrides = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerOverride]
  
  type ContainerStateChanges = js.Array[typingsSlinky.awsSdk.ecsMod.ContainerStateChange]
  
  type Containers = js.Array[typingsSlinky.awsSdk.ecsMod.Container]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ECS
    - typingsSlinky.awsSdk.awsSdkStrings.CODE_DEPLOY
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DeploymentControllerType = typingsSlinky.awsSdk.ecsMod._DeploymentControllerType | java.lang.String
  
  type Deployments = js.Array[typingsSlinky.awsSdk.ecsMod.Deployment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DesiredStatus = typingsSlinky.awsSdk.ecsMod._DesiredStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.read_
    - typingsSlinky.awsSdk.awsSdkStrings.write_
    - typingsSlinky.awsSdk.awsSdkStrings.mknod_
    - java.lang.String
  */
  type DeviceCgroupPermission = typingsSlinky.awsSdk.ecsMod._DeviceCgroupPermission | java.lang.String
  
  type DeviceCgroupPermissions = js.Array[typingsSlinky.awsSdk.ecsMod.DeviceCgroupPermission]
  
  type DevicesList = js.Array[typingsSlinky.awsSdk.ecsMod.Device]
  
  type DockerLabelsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecsMod.String]
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type EFSAuthorizationConfigIAM = typingsSlinky.awsSdk.ecsMod._EFSAuthorizationConfigIAM | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type EFSTransitEncryption = typingsSlinky.awsSdk.ecsMod._EFSTransitEncryption | java.lang.String
  
  type EnvironmentFileType = typingsSlinky.awsSdk.awsSdkStrings.s3_ | java.lang.String
  
  type EnvironmentFiles = js.Array[typingsSlinky.awsSdk.ecsMod.EnvironmentFile]
  
  type EnvironmentVariables = js.Array[typingsSlinky.awsSdk.ecsMod.KeyValuePair]
  
  type Failures = js.Array[typingsSlinky.awsSdk.ecsMod.Failure]
  
  type FirelensConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.fluentd
    - typingsSlinky.awsSdk.awsSdkStrings.fluentbit
    - java.lang.String
  */
  type FirelensConfigurationType = typingsSlinky.awsSdk.ecsMod._FirelensConfigurationType | java.lang.String
  
  type GpuIds = js.Array[typingsSlinky.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = typingsSlinky.awsSdk.ecsMod._HealthStatus | java.lang.String
  
  type HostEntryList = js.Array[typingsSlinky.awsSdk.ecsMod.HostEntry]
  
  type InferenceAcceleratorOverrides = js.Array[typingsSlinky.awsSdk.ecsMod.InferenceAcceleratorOverride]
  
  type InferenceAccelerators = js.Array[typingsSlinky.awsSdk.ecsMod.InferenceAccelerator]
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.host__
    - typingsSlinky.awsSdk.awsSdkStrings.task_
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type IpcMode = typingsSlinky.awsSdk.ecsMod._IpcMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typingsSlinky.awsSdk.ecsMod._LaunchType | java.lang.String
  
  type LoadBalancers = js.Array[typingsSlinky.awsSdk.ecsMod.LoadBalancer]
  
  type LogConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`json-file`
    - typingsSlinky.awsSdk.awsSdkStrings.syslog
    - typingsSlinky.awsSdk.awsSdkStrings.journald
    - typingsSlinky.awsSdk.awsSdkStrings.gelf
    - typingsSlinky.awsSdk.awsSdkStrings.fluentd
    - typingsSlinky.awsSdk.awsSdkStrings.awslogs
    - typingsSlinky.awsSdk.awsSdkStrings.splunk
    - typingsSlinky.awsSdk.awsSdkStrings.awsfirelens
    - java.lang.String
  */
  type LogDriver = typingsSlinky.awsSdk.ecsMod._LogDriver | java.lang.String
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedScalingStatus = typingsSlinky.awsSdk.ecsMod._ManagedScalingStatus | java.lang.String
  
  type ManagedScalingStepSize = scala.Double
  
  type ManagedScalingTargetCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedTerminationProtection = typingsSlinky.awsSdk.ecsMod._ManagedTerminationProtection | java.lang.String
  
  type MountPointList = js.Array[typingsSlinky.awsSdk.ecsMod.MountPoint]
  
  type NetworkBindings = js.Array[typingsSlinky.awsSdk.ecsMod.NetworkBinding]
  
  type NetworkInterfaces = js.Array[typingsSlinky.awsSdk.ecsMod.NetworkInterface]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.bridge
    - typingsSlinky.awsSdk.awsSdkStrings.host__
    - typingsSlinky.awsSdk.awsSdkStrings.awsvpc_
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type NetworkMode = typingsSlinky.awsSdk.ecsMod._NetworkMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.host__
    - typingsSlinky.awsSdk.awsSdkStrings.task_
    - java.lang.String
  */
  type PidMode = typingsSlinky.awsSdk.ecsMod._PidMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.distinctInstance
    - typingsSlinky.awsSdk.awsSdkStrings.memberOf
    - java.lang.String
  */
  type PlacementConstraintType = typingsSlinky.awsSdk.ecsMod._PlacementConstraintType | java.lang.String
  
  type PlacementConstraints = js.Array[typingsSlinky.awsSdk.ecsMod.PlacementConstraint]
  
  type PlacementStrategies = js.Array[typingsSlinky.awsSdk.ecsMod.PlacementStrategy]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.random__
    - typingsSlinky.awsSdk.awsSdkStrings.spread_
    - typingsSlinky.awsSdk.awsSdkStrings.binpack
    - java.lang.String
  */
  type PlacementStrategyType = typingsSlinky.awsSdk.ecsMod._PlacementStrategyType | java.lang.String
  
  type PlatformDeviceType = typingsSlinky.awsSdk.awsSdkStrings.GPU | java.lang.String
  
  type PlatformDevices = js.Array[typingsSlinky.awsSdk.ecsMod.PlatformDevice]
  
  type PortMappingList = js.Array[typingsSlinky.awsSdk.ecsMod.PortMapping]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TASK_DEFINITION
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE
    - java.lang.String
  */
  type PropagateTags = typingsSlinky.awsSdk.ecsMod._PropagateTags | java.lang.String
  
  type ProxyConfigurationProperties = js.Array[typingsSlinky.awsSdk.ecsMod.KeyValuePair]
  
  type ProxyConfigurationType = typingsSlinky.awsSdk.awsSdkStrings.APPMESH | java.lang.String
  
  type RequiresAttributes = js.Array[typingsSlinky.awsSdk.ecsMod.Attribute]
  
  type ResourceRequirements = js.Array[typingsSlinky.awsSdk.ecsMod.ResourceRequirement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GPU
    - typingsSlinky.awsSdk.awsSdkStrings.InferenceAccelerator
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.ecsMod._ResourceType | java.lang.String
  
  type Resources = js.Array[typingsSlinky.awsSdk.ecsMod.Resource]
  
  type ScaleUnit = typingsSlinky.awsSdk.awsSdkStrings.PERCENT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICA
    - typingsSlinky.awsSdk.awsSdkStrings.DAEMON
    - java.lang.String
  */
  type SchedulingStrategy = typingsSlinky.awsSdk.ecsMod._SchedulingStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.task_
    - typingsSlinky.awsSdk.awsSdkStrings.shared__
    - java.lang.String
  */
  type Scope = typingsSlinky.awsSdk.ecsMod._Scope | java.lang.String
  
  type SecretList = js.Array[typingsSlinky.awsSdk.ecsMod.Secret]
  
  type ServiceEvents = js.Array[typingsSlinky.awsSdk.ecsMod.ServiceEvent]
  
  type ServiceField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type ServiceFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.ServiceField]
  
  type ServiceRegistries = js.Array[typingsSlinky.awsSdk.ecsMod.ServiceRegistry]
  
  type Services = js.Array[typingsSlinky.awsSdk.ecsMod.Service]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.serviceLongArnFormat
    - typingsSlinky.awsSdk.awsSdkStrings.taskLongArnFormat
    - typingsSlinky.awsSdk.awsSdkStrings.containerInstanceLongArnFormat
    - typingsSlinky.awsSdk.awsSdkStrings.awsvpcTrunking
    - typingsSlinky.awsSdk.awsSdkStrings.containerInsights
    - java.lang.String
  */
  type SettingName = typingsSlinky.awsSdk.ecsMod._SettingName | java.lang.String
  
  type Settings = js.Array[typingsSlinky.awsSdk.ecsMod.Setting]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.ecsMod._SortOrder | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STEADY_STATE
    - typingsSlinky.awsSdk.awsSdkStrings.STABILIZING
    - java.lang.String
  */
  type StabilityStatus = typingsSlinky.awsSdk.ecsMod._StabilityStatus | java.lang.String
  
  type Statistics = js.Array[typingsSlinky.awsSdk.ecsMod.KeyValuePair]
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.ecsMod.String]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ecsMod.String]
  
  type SystemControls = js.Array[typingsSlinky.awsSdk.ecsMod.SystemControl]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.ecsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.ecsMod.Tag]
  
  type TargetType = typingsSlinky.awsSdk.awsSdkStrings.`container-instance` | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TaskDefinitionFamilyStatus = typingsSlinky.awsSdk.ecsMod._TaskDefinitionFamilyStatus | java.lang.String
  
  type TaskDefinitionField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskDefinitionFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.TaskDefinitionField]
  
  type TaskDefinitionPlacementConstraintType = typingsSlinky.awsSdk.awsSdkStrings.memberOf | java.lang.String
  
  type TaskDefinitionPlacementConstraints = js.Array[typingsSlinky.awsSdk.ecsMod.TaskDefinitionPlacementConstraint]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type TaskDefinitionStatus = typingsSlinky.awsSdk.ecsMod._TaskDefinitionStatus | java.lang.String
  
  type TaskField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.TaskField]
  
  type TaskSetField = typingsSlinky.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskSetFieldList = js.Array[typingsSlinky.awsSdk.ecsMod.TaskSetField]
  
  type TaskSets = js.Array[typingsSlinky.awsSdk.ecsMod.TaskSet]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TaskFailedToStart
    - typingsSlinky.awsSdk.awsSdkStrings.EssentialContainerExited
    - typingsSlinky.awsSdk.awsSdkStrings.UserInitiated
    - java.lang.String
  */
  type TaskStopCode = typingsSlinky.awsSdk.ecsMod._TaskStopCode | java.lang.String
  
  type Tasks = js.Array[typingsSlinky.awsSdk.ecsMod.Task]
  
  type Timestamp = js.Date
  
  type TmpfsList = js.Array[typingsSlinky.awsSdk.ecsMod.Tmpfs]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.tcp_
    - typingsSlinky.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typingsSlinky.awsSdk.ecsMod._TransportProtocol | java.lang.String
  
  type UlimitList = js.Array[typingsSlinky.awsSdk.ecsMod.Ulimit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.core__
    - typingsSlinky.awsSdk.awsSdkStrings.cpu__
    - typingsSlinky.awsSdk.awsSdkStrings.data_
    - typingsSlinky.awsSdk.awsSdkStrings.fsize
    - typingsSlinky.awsSdk.awsSdkStrings.locks
    - typingsSlinky.awsSdk.awsSdkStrings.memlock
    - typingsSlinky.awsSdk.awsSdkStrings.msgqueue
    - typingsSlinky.awsSdk.awsSdkStrings.nice
    - typingsSlinky.awsSdk.awsSdkStrings.nofile
    - typingsSlinky.awsSdk.awsSdkStrings.nproc
    - typingsSlinky.awsSdk.awsSdkStrings.rss
    - typingsSlinky.awsSdk.awsSdkStrings.rtprio
    - typingsSlinky.awsSdk.awsSdkStrings.rttime
    - typingsSlinky.awsSdk.awsSdkStrings.sigpending
    - typingsSlinky.awsSdk.awsSdkStrings.stack
    - java.lang.String
  */
  type UlimitName = typingsSlinky.awsSdk.ecsMod._UlimitName | java.lang.String
  
  type VolumeFromList = js.Array[typingsSlinky.awsSdk.ecsMod.VolumeFrom]
  
  type VolumeList = js.Array[typingsSlinky.awsSdk.ecsMod.Volume]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-11-13`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ecsMod._apiVersion | java.lang.String
}
