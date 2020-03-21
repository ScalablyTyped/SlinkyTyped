package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object directoryserviceMod {
  type AccessUrl = java.lang.String
  type AddedDateTime = js.Date
  type AliasName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = js.Array[typingsSlinky.awsSdk.directoryserviceMod.Attribute]
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[typingsSlinky.awsSdk.directoryserviceMod.AvailabilityZone]
  type CertificateCN = java.lang.String
  type CertificateData = java.lang.String
  type CertificateExpiryDateTime = js.Date
  type CertificateId = java.lang.String
  type CertificateRegisteredDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Registering_
    - typingsSlinky.awsSdk.awsSdkStrings.Registered_
    - typingsSlinky.awsSdk.awsSdkStrings.RegisterFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Deregistering_
    - typingsSlinky.awsSdk.awsSdkStrings.Deregistered_
    - typingsSlinky.awsSdk.awsSdkStrings.DeregisterFailed
    - java.lang.String
  */
  type CertificateState = typingsSlinky.awsSdk.directoryserviceMod._CertificateState | java.lang.String
  type CertificateStateReason = java.lang.String
  type CertificatesInfo = js.Array[typingsSlinky.awsSdk.directoryserviceMod.CertificateInfo]
  type CidrIp = java.lang.String
  type CidrIps = js.Array[typingsSlinky.awsSdk.directoryserviceMod.CidrIp]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.directoryserviceMod.ClientApiVersions
  type CloudOnlyDirectoriesLimitReached = scala.Boolean
  type ComputerName = java.lang.String
  type ComputerPassword = java.lang.String
  type ConditionalForwarders = js.Array[typingsSlinky.awsSdk.directoryserviceMod.ConditionalForwarder]
  type ConnectPassword = java.lang.String
  type ConnectedDirectoriesLimitReached = scala.Boolean
  type CreateSnapshotBeforeSchemaExtension = scala.Boolean
  type CreatedDateTime = js.Date
  type CustomerId = java.lang.String
  type CustomerUserName = java.lang.String
  type DeleteAssociatedConditionalForwarder = scala.Boolean
  type Description = java.lang.String
  type DesiredNumberOfDomainControllers = scala.Double
  type DirectoryDescriptions = js.Array[typingsSlinky.awsSdk.directoryserviceMod.DirectoryDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enterprise
    - typingsSlinky.awsSdk.awsSdkStrings.Standard_
    - java.lang.String
  */
  type DirectoryEdition = typingsSlinky.awsSdk.directoryserviceMod._DirectoryEdition | java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIds = js.Array[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId]
  type DirectoryName = java.lang.String
  type DirectoryShortName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Small_
    - typingsSlinky.awsSdk.awsSdkStrings.Large_
    - java.lang.String
  */
  type DirectorySize = typingsSlinky.awsSdk.directoryserviceMod._DirectorySize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Requested_
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inoperable_
    - typingsSlinky.awsSdk.awsSdkStrings.Impaired_
    - typingsSlinky.awsSdk.awsSdkStrings.Restoring_
    - typingsSlinky.awsSdk.awsSdkStrings.RestoreFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DirectoryStage = typingsSlinky.awsSdk.directoryserviceMod._DirectoryStage | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SimpleAD
    - typingsSlinky.awsSdk.awsSdkStrings.ADConnector
    - typingsSlinky.awsSdk.awsSdkStrings.MicrosoftAD
    - typingsSlinky.awsSdk.awsSdkStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = typingsSlinky.awsSdk.directoryserviceMod._DirectoryType | java.lang.String
  type DnsIpAddrs = js.Array[typingsSlinky.awsSdk.directoryserviceMod.IpAddr]
  type DomainControllerId = java.lang.String
  type DomainControllerIds = js.Array[typingsSlinky.awsSdk.directoryserviceMod.DomainControllerId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Impaired_
    - typingsSlinky.awsSdk.awsSdkStrings.Restoring_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DomainControllerStatus = typingsSlinky.awsSdk.directoryserviceMod._DomainControllerStatus | java.lang.String
  type DomainControllerStatusReason = java.lang.String
  type DomainControllers = js.Array[typingsSlinky.awsSdk.directoryserviceMod.DomainController]
  type EndDateTime = js.Date
  type EventTopics = js.Array[typingsSlinky.awsSdk.directoryserviceMod.EventTopic]
  type IpAddr = java.lang.String
  type IpAddrs = js.Array[typingsSlinky.awsSdk.directoryserviceMod.IpAddr]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Adding
    - typingsSlinky.awsSdk.awsSdkStrings.Added
    - typingsSlinky.awsSdk.awsSdkStrings.Removing
    - typingsSlinky.awsSdk.awsSdkStrings.Removed_
    - typingsSlinky.awsSdk.awsSdkStrings.AddFailed
    - typingsSlinky.awsSdk.awsSdkStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = typingsSlinky.awsSdk.directoryserviceMod._IpRouteStatusMsg | java.lang.String
  type IpRouteStatusReason = java.lang.String
  type IpRoutes = js.Array[typingsSlinky.awsSdk.directoryserviceMod.IpRoute]
  type IpRoutesInfo = js.Array[typingsSlinky.awsSdk.directoryserviceMod.IpRouteInfo]
  type LDAPSSettingsInfo = js.Array[typingsSlinky.awsSdk.directoryserviceMod.LDAPSSettingInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabling_
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.EnableFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type LDAPSStatus = typingsSlinky.awsSdk.directoryserviceMod._LDAPSStatus | java.lang.String
  type LDAPSStatusReason = java.lang.String
  type LDAPSType = typingsSlinky.awsSdk.awsSdkStrings.Client | java.lang.String
  type LastUpdatedDateTime = js.Date
  type LaunchTime = js.Date
  type LdifContent = java.lang.String
  type Limit = scala.Double
  type LogGroupName = java.lang.String
  type LogSubscriptions = js.Array[typingsSlinky.awsSdk.directoryserviceMod.LogSubscription]
  type ManualSnapshotsLimitReached = scala.Boolean
  type NextToken = java.lang.String
  type Notes = java.lang.String
  type OrganizationalUnitDN = java.lang.String
  type PageLimit = scala.Double
  type Password = java.lang.String
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PAP
    - typingsSlinky.awsSdk.awsSdkStrings.CHAP
    - typingsSlinky.awsSdk.awsSdkStrings.`MS-CHAPv1`
    - typingsSlinky.awsSdk.awsSdkStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = typingsSlinky.awsSdk.directoryserviceMod._RadiusAuthenticationProtocol | java.lang.String
  type RadiusDisplayLabel = java.lang.String
  type RadiusRetries = scala.Double
  type RadiusSharedSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RadiusStatus = typingsSlinky.awsSdk.directoryserviceMod._RadiusStatus | java.lang.String
  type RadiusTimeout = scala.Double
  type RemoteDomainName = java.lang.String
  type RemoteDomainNames = js.Array[typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName]
  type ReplicationScope = typingsSlinky.awsSdk.awsSdkStrings.Domain_ | java.lang.String
  type RequestId = java.lang.String
  type ResourceId = java.lang.String
  type SID = java.lang.String
  type SchemaExtensionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Initializing_
    - typingsSlinky.awsSdk.awsSdkStrings.CreatingSnapshot
    - typingsSlinky.awsSdk.awsSdkStrings.UpdatingSchema
    - typingsSlinky.awsSdk.awsSdkStrings.Replicating
    - typingsSlinky.awsSdk.awsSdkStrings.CancelInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.RollbackInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - java.lang.String
  */
  type SchemaExtensionStatus = typingsSlinky.awsSdk.directoryserviceMod._SchemaExtensionStatus | java.lang.String
  type SchemaExtensionStatusReason = java.lang.String
  type SchemaExtensionsInfo = js.Array[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionInfo]
  type SecurityGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type SelectiveAuth = typingsSlinky.awsSdk.directoryserviceMod._SelectiveAuth | java.lang.String
  type Server = java.lang.String
  type Servers = js.Array[typingsSlinky.awsSdk.directoryserviceMod.Server]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONS
    - typingsSlinky.awsSdk.awsSdkStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = typingsSlinky.awsSdk.directoryserviceMod._ShareMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Shared_
    - typingsSlinky.awsSdk.awsSdkStrings.PendingAcceptance
    - typingsSlinky.awsSdk.awsSdkStrings.Rejected_
    - typingsSlinky.awsSdk.awsSdkStrings.Rejecting
    - typingsSlinky.awsSdk.awsSdkStrings.RejectFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Sharing
    - typingsSlinky.awsSdk.awsSdkStrings.ShareFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ShareStatus = typingsSlinky.awsSdk.directoryserviceMod._ShareStatus | java.lang.String
  type SharedDirectories = js.Array[typingsSlinky.awsSdk.directoryserviceMod.SharedDirectory]
  type SnapshotId = java.lang.String
  type SnapshotIds = js.Array[typingsSlinky.awsSdk.directoryserviceMod.SnapshotId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Completed_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SnapshotStatus = typingsSlinky.awsSdk.directoryserviceMod._SnapshotStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Auto_
    - typingsSlinky.awsSdk.awsSdkStrings.Manual_
    - java.lang.String
  */
  type SnapshotType = typingsSlinky.awsSdk.directoryserviceMod._SnapshotType | java.lang.String
  type Snapshots = js.Array[typingsSlinky.awsSdk.directoryserviceMod.Snapshot]
  type SsoEnabled = scala.Boolean
  type StageReason = java.lang.String
  type StartDateTime = js.Date
  type StartTime = js.Date
  type StateLastUpdatedDateTime = js.Date
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsSlinky.awsSdk.directoryserviceMod.SubnetId]
  type SubscriptionCreatedDateTime = js.Date
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.directoryserviceMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.directoryserviceMod.Tag]
  type TargetId = java.lang.String
  type TargetType = typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type TopicArn = java.lang.String
  type TopicName = java.lang.String
  type TopicNames = js.Array[typingsSlinky.awsSdk.directoryserviceMod.TopicName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Registered_
    - typingsSlinky.awsSdk.awsSdkStrings.`Topic not found`
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type TopicStatus = typingsSlinky.awsSdk.directoryserviceMod._TopicStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`One-WayColon Outgoing`
    - typingsSlinky.awsSdk.awsSdkStrings.`One-WayColon Incoming`
    - typingsSlinky.awsSdk.awsSdkStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = typingsSlinky.awsSdk.directoryserviceMod._TrustDirection | java.lang.String
  type TrustId = java.lang.String
  type TrustIds = js.Array[typingsSlinky.awsSdk.directoryserviceMod.TrustId]
  type TrustPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Creating_
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Verifying_
    - typingsSlinky.awsSdk.awsSdkStrings.VerifyFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Verified
    - typingsSlinky.awsSdk.awsSdkStrings.Updating_
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Updated_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type TrustState = typingsSlinky.awsSdk.directoryserviceMod._TrustState | java.lang.String
  type TrustStateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Forest
    - typingsSlinky.awsSdk.awsSdkStrings.External_
    - java.lang.String
  */
  type TrustType = typingsSlinky.awsSdk.directoryserviceMod._TrustType | java.lang.String
  type Trusts = js.Array[typingsSlinky.awsSdk.directoryserviceMod.Trust]
  type UpdateSecurityGroupForDirectoryControllers = scala.Boolean
  type UseSameUsername = scala.Boolean
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-04-16`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.directoryserviceMod._apiVersion | java.lang.String
}
