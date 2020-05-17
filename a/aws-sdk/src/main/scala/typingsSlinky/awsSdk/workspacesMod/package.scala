package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workspacesMod {
  type ARN = java.lang.String
  type AccountModificationList = js.Array[typingsSlinky.awsSdk.workspacesMod.AccountModification]
  type Alias = java.lang.String
  type BooleanObject = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.BundleId]
  type BundleList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceBundle]
  type BundleOwner = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.workspacesMod.ClientApiVersions
  type ClientPropertiesList = js.Array[typingsSlinky.awsSdk.workspacesMod.ClientPropertiesResult]
  type ComputerName = java.lang.String
  type DedicatedTenancyCidrRangeList = js.Array[typingsSlinky.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = java.lang.String
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
  type ModificationStateList = js.Array[typingsSlinky.awsSdk.workspacesMod.ModificationState]
  type NonEmptyString = java.lang.String
  type PaginationToken = java.lang.String
  type RebootWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.RebootRequest]
  type RebuildWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.RebuildRequest]
  type Region = java.lang.String
  type RegistrationCode = java.lang.String
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.NonEmptyString]
  type RootVolumeSizeGib = scala.Double
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
  type TerminateWorkspaceRequests = js.Array[typingsSlinky.awsSdk.workspacesMod.TerminateRequest]
  type Timestamp = js.Date
  type UserName = java.lang.String
  type UserVolumeSizeGib = scala.Double
  type VolumeEncryptionKey = java.lang.String
  type WorkspaceConnectionStatusList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceConnectionStatus]
  type WorkspaceErrorCode = java.lang.String
  type WorkspaceId = java.lang.String
  type WorkspaceIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceId]
  type WorkspaceImageDescription = java.lang.String
  type WorkspaceImageErrorCode = java.lang.String
  type WorkspaceImageId = java.lang.String
  type WorkspaceImageIdList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceImageId]
  type WorkspaceImageList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceImage]
  type WorkspaceImageName = java.lang.String
  type WorkspaceList = js.Array[typingsSlinky.awsSdk.workspacesMod.Workspace]
  type WorkspaceRequestList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspaceRequest]
  type WorkspacesIpGroupsList = js.Array[typingsSlinky.awsSdk.workspacesMod.WorkspacesIpGroup]
}
