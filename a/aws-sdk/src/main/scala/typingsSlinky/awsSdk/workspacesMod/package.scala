package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workspacesMod {
  
  type ARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessPropertyValue = typingsSlinky.awsSdk.workspacesMod._AccessPropertyValue | java.lang.String
  
  type AccountModificationList = js.Array[typingsSlinky.awsSdk.workspacesMod.AccountModification]
  
  type Alias = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Microsoft_Office_2016
    - typingsSlinky.awsSdk.awsSdkStrings.Microsoft_Office_2019
    - java.lang.String
  */
  type Application = typingsSlinky.awsSdk.workspacesMod._Application | java.lang.String
  
  type ApplicationList = js.Array[typingsSlinky.awsSdk.workspacesMod.Application]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_ASSOCIATED
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATED_WITH_OWNER_ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATED_WITH_SHARED_ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ASSOCIATION
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DISASSOCIATION
    - java.lang.String
  */
  type AssociationStatus = typingsSlinky.awsSdk.workspacesMod._AssociationStatus | java.lang.String
  
  type AwsAccount = java.lang.String
  
  type BooleanObject = scala.Boolean
  
  type BundleId = java.lang.String
  
  type BundleIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.BundleId]
  
  type BundleList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceBundle]
  
  type BundleOwner = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.workspacesMod.ClientApiVersions
  
  type ClientPropertiesList = js.Array[typingsSlinky.awsSdk.workspacesMod.ClientPropertiesResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.PERFORMANCE
    - typingsSlinky.awsSdk.awsSdkStrings.POWER
    - typingsSlinky.awsSdk.awsSdkStrings.GRAPHICS
    - typingsSlinky.awsSdk.awsSdkStrings.POWERPRO
    - typingsSlinky.awsSdk.awsSdkStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = typingsSlinky.awsSdk.workspacesMod._Compute | java.lang.String
  
  type ComputerName = java.lang.String
  
  type ConnectionAliasAssociationList = js.Array[typingsSlinky.awsSdk.workspacesMod.ConnectionAliasAssociation]
  
  type ConnectionAliasId = java.lang.String
  
  type ConnectionAliasIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.ConnectionAliasId]
  
  type ConnectionAliasList = js.Array[typingsSlinky.awsSdk.workspacesMod.ConnectionAlias]
  
  type ConnectionAliasPermissions = js.Array[typingsSlinky.awsSdk.workspacesMod.ConnectionAliasPermission]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ConnectionAliasState = typingsSlinky.awsSdk.workspacesMod._ConnectionAliasState | java.lang.String
  
  type ConnectionIdentifier = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = typingsSlinky.awsSdk.workspacesMod._ConnectionState | java.lang.String
  
  type ConnectionString = java.lang.String
  
  type DedicatedTenancyCidrRangeList = js.Array[typingsSlinky.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange]
  
  type DedicatedTenancyManagementCidrRange = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = typingsSlinky.awsSdk.workspacesMod._DedicatedTenancyModificationStateEnum | java.lang.String
  
  type DedicatedTenancySupportEnum = typingsSlinky.awsSdk.awsSdkStrings.ENABLED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = typingsSlinky.awsSdk.workspacesMod._DedicatedTenancySupportResultEnum | java.lang.String
  
  type DefaultOu = java.lang.String
  
  type Description = java.lang.String
  
  type DirectoryId = java.lang.String
  
  type DirectoryIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.DirectoryId]
  
  type DirectoryList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceDirectory]
  
  type DirectoryName = java.lang.String
  
  type DnsIpAddresses = js.Array[typingsSlinky.awsSdk.workspacesMod.IpAddress]
  
  type Ec2ImageId = java.lang.String
  
  type ErrorType = java.lang.String
  
  type FailedCreateWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedCreateWorkspaceRequest]
  
  type FailedRebootWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedRebuildWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedStartWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedStopWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type FailedTerminateWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  
  type ImagePermissions = js.Array[typingsSlinky.awsSdk.workspacesMod.ImagePermission]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OWNED
    - typingsSlinky.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type ImageType = typingsSlinky.awsSdk.workspacesMod._ImageType | java.lang.String
  
  type IpAddress = java.lang.String
  
  type IpGroupDesc = java.lang.String
  
  type IpGroupId = java.lang.String
  
  type IpGroupIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.IpGroupId]
  
  type IpGroupName = java.lang.String
  
  type IpRevokedRuleList = js.Array[typingsSlinky.awsSdk.workspacesMod.IpRule]
  
  type IpRule = java.lang.String
  
  type IpRuleDesc = java.lang.String
  
  type IpRuleList = js.Array[typingsSlinky.awsSdk.workspacesMod.IpRuleItem]
  
  type Limit = scala.Double
  
  type ManagementCidrRangeConstraint = java.lang.String
  
  type ManagementCidrRangeMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROOT_VOLUME
    - typingsSlinky.awsSdk.awsSdkStrings.USER_VOLUME
    - typingsSlinky.awsSdk.awsSdkStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = typingsSlinky.awsSdk.workspacesMod._ModificationResourceEnum | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_INITIATED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = typingsSlinky.awsSdk.workspacesMod._ModificationStateEnum | java.lang.String
  
  type ModificationStateList = js.Array[typingsSlinky.awsSdk.workspacesMod.ModificationState]
  
  type NonEmptyString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = typingsSlinky.awsSdk.workspacesMod._OperatingSystemType | java.lang.String
  
  type PaginationToken = java.lang.String
  
  type RebootWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.RebootRequest]
  
  type RebuildWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.RebuildRequest]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = typingsSlinky.awsSdk.workspacesMod._ReconnectEnum | java.lang.String
  
  type Region = java.lang.String
  
  type RegistrationCode = java.lang.String
  
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.NonEmptyString]
  
  type RootVolumeSizeGib = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO_STOP
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = typingsSlinky.awsSdk.workspacesMod._RunningMode | java.lang.String
  
  type RunningModeAutoStopTimeoutInMinutes = scala.Double
  
  type SecurityGroupId = java.lang.String
  
  type SnapshotList = js.Array[typingsSlinky.awsSdk.workspacesMod.Snapshot]
  
  type StartWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.StartRequest]
  
  type StopWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.StopRequest]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typingsSlinky.awsSdk.workspacesMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.workspacesMod.NonEmptyString]
  
  type TagList = js.Array[typingsSlinky.awsSdk.workspacesMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = typingsSlinky.awsSdk.workspacesMod._TargetWorkspaceState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEDICATED
    - typingsSlinky.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type Tenancy = typingsSlinky.awsSdk.workspacesMod._Tenancy | java.lang.String
  
  type TerminateWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.TerminateRequest]
  
  type Timestamp = js.Date
  
  type UserName = java.lang.String
  
  type UserVolumeSizeGib = scala.Double
  
  type VolumeEncryptionKey = java.lang.String
  
  type WorkspaceConnectionStatusList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceConnectionStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTERING
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTERED
    - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERING
    - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTERED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = typingsSlinky.awsSdk.workspacesMod._WorkspaceDirectoryState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIMPLE_AD
    - typingsSlinky.awsSdk.awsSdkStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = typingsSlinky.awsSdk.workspacesMod._WorkspaceDirectoryType | java.lang.String
  
  type WorkspaceErrorCode = java.lang.String
  
  type WorkspaceId = java.lang.String
  
  type WorkspaceIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceId]
  
  type WorkspaceImageDescription = java.lang.String
  
  type WorkspaceImageErrorCode = java.lang.String
  
  type WorkspaceImageId = java.lang.String
  
  type WorkspaceImageIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceImageId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BYOL_REGULAR
    - typingsSlinky.awsSdk.awsSdkStrings.BYOL_GRAPHICS
    - typingsSlinky.awsSdk.awsSdkStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = typingsSlinky.awsSdk.workspacesMod._WorkspaceImageIngestionProcess | java.lang.String
  
  type WorkspaceImageList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceImage]
  
  type WorkspaceImageName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = typingsSlinky.awsSdk.workspacesMod._WorkspaceImageRequiredTenancy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = typingsSlinky.awsSdk.workspacesMod._WorkspaceImageState | java.lang.String
  
  type WorkspaceList = js.Array[typingsSlinky.awsSdk.workspacesMod.Workspace]
  
  type WorkspaceRequestList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceRequest]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED
    - typingsSlinky.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.REBOOTING
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.REBUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORING
    - typingsSlinky.awsSdk.awsSdkStrings.MAINTENANCE
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = typingsSlinky.awsSdk.workspacesMod._WorkspaceState | java.lang.String
  
  type WorkspacesIpGroupsList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspacesIpGroup]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-04-08`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.workspacesMod._apiVersion | java.lang.String
}
