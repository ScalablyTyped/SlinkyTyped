package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object smsMod {
  
  type AmiId = java.lang.String
  
  type AppDescription = java.lang.String
  
  type AppId = java.lang.String
  
  type AppIdWithValidation = java.lang.String
  
  type AppIds = js.Array[typingsSlinky.awsSdk.smsMod.AppId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONFIGURED
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURED
    - java.lang.String
  */
  type AppLaunchConfigurationStatus = typingsSlinky.awsSdk.smsMod._AppLaunchConfigurationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_LAUNCH
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.LAUNCH_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.LAUNCH_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.LAUNCHED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIALLY_LAUNCHED
    - typingsSlinky.awsSdk.awsSdkStrings.DELTA_LAUNCH_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELTA_LAUNCH_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.LAUNCH_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type AppLaunchStatus = typingsSlinky.awsSdk.smsMod._AppLaunchStatus | java.lang.String
  
  type AppLaunchStatusMessage = java.lang.String
  
  type AppName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONFIGURED
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURED
    - java.lang.String
  */
  type AppReplicationConfigurationStatus = typingsSlinky.awsSdk.smsMod._AppReplicationConfigurationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_REPLICATION
    - typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATED
    - typingsSlinky.awsSdk.awsSdkStrings.PARTIALLY_REPLICATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELTA_REPLICATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DELTA_REPLICATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELTA_REPLICATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_STOP_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.REPLICATION_STOPPED
    - java.lang.String
  */
  type AppReplicationStatus = typingsSlinky.awsSdk.smsMod._AppReplicationStatus | java.lang.String
  
  type AppReplicationStatusMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type AppStatus = typingsSlinky.awsSdk.smsMod._AppStatus | java.lang.String
  
  type AppStatusMessage = java.lang.String
  
  type AppValidationConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.AppValidationConfiguration]
  
  type AppValidationStrategy = typingsSlinky.awsSdk.awsSdkStrings.SSM | java.lang.String
  
  type Apps = js.Array[typingsSlinky.awsSdk.smsMod.AppSummary]
  
  type AssociatePublicIpAddress = scala.Boolean
  
  type AutoLaunch = scala.Boolean
  
  type BucketName = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.smsMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type Command = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VSPHERE
    - typingsSlinky.awsSdk.awsSdkStrings.SCVMM
    - typingsSlinky.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
    - typingsSlinky.awsSdk.awsSdkStrings.SMS_OPTIMIZED
    - java.lang.String
  */
  type ConnectorCapability = typingsSlinky.awsSdk.smsMod._ConnectorCapability | java.lang.String
  
  type ConnectorCapabilityList = js.Array[typingsSlinky.awsSdk.smsMod.ConnectorCapability]
  
  type ConnectorId = java.lang.String
  
  type ConnectorList = js.Array[typingsSlinky.awsSdk.smsMod.Connector]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type ConnectorStatus = typingsSlinky.awsSdk.smsMod._ConnectorStatus | java.lang.String
  
  type ConnectorVersion = java.lang.String
  
  type Description = java.lang.String
  
  type EC2KeyName = java.lang.String
  
  type Encrypted = scala.Boolean
  
  type ExecutionTimeoutSeconds = scala.Double
  
  type ForceStopAppReplication = scala.Boolean
  
  type ForceTerminateApp = scala.Boolean
  
  type Frequency = scala.Double
  
  type ImportedAppId = java.lang.String
  
  type InstanceId = java.lang.String
  
  type InstanceType = java.lang.String
  
  type IpAddress = java.lang.String
  
  type KmsKeyId = java.lang.String
  
  type LaunchOrder = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.BYOL
    - java.lang.String
  */
  type LicenseType = typingsSlinky.awsSdk.smsMod._LicenseType | java.lang.String
  
  type LogicalId = java.lang.String
  
  type MacAddress = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type NonEmptyStringWithMaxLen255 = java.lang.String
  
  type NumberOfRecentAmisToKeep = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - typingsSlinky.awsSdk.awsSdkStrings.YAML
    - java.lang.String
  */
  type OutputFormat = typingsSlinky.awsSdk.smsMod._OutputFormat | java.lang.String
  
  type ReplicationJobId = java.lang.String
  
  type ReplicationJobList = js.Array[typingsSlinky.awsSdk.smsMod.ReplicationJob]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILING
    - java.lang.String
  */
  type ReplicationJobState = typingsSlinky.awsSdk.smsMod._ReplicationJobState | java.lang.String
  
  type ReplicationJobStatusMessage = java.lang.String
  
  type ReplicationJobTerminated = scala.Boolean
  
  type ReplicationRunId = java.lang.String
  
  type ReplicationRunList = js.Array[typingsSlinky.awsSdk.smsMod.ReplicationRun]
  
  type ReplicationRunStage = java.lang.String
  
  type ReplicationRunStageProgress = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.MISSED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ReplicationRunState = typingsSlinky.awsSdk.smsMod._ReplicationRunState | java.lang.String
  
  type ReplicationRunStatusMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
    - java.lang.String
  */
  type ReplicationRunType = typingsSlinky.awsSdk.smsMod._ReplicationRunType | java.lang.String
  
  type RoleName = java.lang.String
  
  type RunOnce = scala.Boolean
  
  type S3BucketName = java.lang.String
  
  type S3KeyName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SHELL_SCRIPT
    - typingsSlinky.awsSdk.awsSdkStrings.POWERSHELL_SCRIPT
    - java.lang.String
  */
  type ScriptType = typingsSlinky.awsSdk.smsMod._ScriptType | java.lang.String
  
  type SecurityGroup = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_IMPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORTING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ServerCatalogStatus = typingsSlinky.awsSdk.smsMod._ServerCatalogStatus | java.lang.String
  
  type ServerGroupId = java.lang.String
  
  type ServerGroupLaunchConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerGroupLaunchConfiguration]
  
  type ServerGroupName = java.lang.String
  
  type ServerGroupReplicationConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerGroupReplicationConfiguration]
  
  type ServerGroupValidationConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerGroupValidationConfiguration]
  
  type ServerGroups = js.Array[typingsSlinky.awsSdk.smsMod.ServerGroup]
  
  type ServerId = java.lang.String
  
  type ServerLaunchConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerLaunchConfiguration]
  
  type ServerList = js.Array[typingsSlinky.awsSdk.smsMod.Server]
  
  type ServerReplicationConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerReplicationConfiguration]
  
  type ServerType = typingsSlinky.awsSdk.awsSdkStrings.VIRTUAL_MACHINE | java.lang.String
  
  type ServerValidationConfigurations = js.Array[typingsSlinky.awsSdk.smsMod.ServerValidationConfiguration]
  
  type ServerValidationStrategy = typingsSlinky.awsSdk.awsSdkStrings.USERDATA | java.lang.String
  
  type StackId = java.lang.String
  
  type StackName = java.lang.String
  
  type Subnet = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.smsMod.Tag]
  
  type Timestamp = js.Date
  
  type TotalServerGroups = scala.Double
  
  type TotalServers = scala.Double
  
  type VPC = java.lang.String
  
  type ValidationId = java.lang.String
  
  type ValidationOutputList = js.Array[typingsSlinky.awsSdk.smsMod.ValidationOutput]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_VALIDATION
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ValidationStatus = typingsSlinky.awsSdk.smsMod._ValidationStatus | java.lang.String
  
  type ValidationStatusMessage = java.lang.String
  
  type VmId = java.lang.String
  
  type VmManagerId = java.lang.String
  
  type VmManagerName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VSPHERE
    - typingsSlinky.awsSdk.awsSdkStrings.SCVMM
    - typingsSlinky.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
    - java.lang.String
  */
  type VmManagerType = typingsSlinky.awsSdk.smsMod._VmManagerType | java.lang.String
  
  type VmName = java.lang.String
  
  type VmPath = java.lang.String
  
  type VmServerAddressList = js.Array[typingsSlinky.awsSdk.smsMod.VmServerAddress]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-10-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.smsMod._apiVersion | java.lang.String
}
