package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ec2Mod {
  type AccountAttributeList = js.Array[typingsSlinky.awsSdk.ec2Mod.AccountAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`supported-platforms`
    - typingsSlinky.awsSdk.awsSdkStrings.`default-vpc`
    - java.lang.String
  */
  type AccountAttributeName = typingsSlinky.awsSdk.ec2Mod._AccountAttributeName | java.lang.String
  type AccountAttributeNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.AccountAttributeName]
  type AccountAttributeValueList = js.Array[typingsSlinky.awsSdk.ec2Mod.AccountAttributeValue]
  type ActiveInstanceSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ActiveInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.pending_fulfillment
    - typingsSlinky.awsSdk.awsSdkStrings.pending_termination
    - typingsSlinky.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type ActivityStatus = typingsSlinky.awsSdk.ec2Mod._ActivityStatus | java.lang.String
  type AddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.Address]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.default_
    - typingsSlinky.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Affinity = typingsSlinky.awsSdk.ec2Mod._Affinity | java.lang.String
  type AllocationId = java.lang.String
  type AllocationIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.AllocationId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.`under-assessment`
    - typingsSlinky.awsSdk.awsSdkStrings.`permanent-failure`
    - typingsSlinky.awsSdk.awsSdkStrings.released
    - typingsSlinky.awsSdk.awsSdkStrings.`released-permanent-failure`
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type AllocationState = typingsSlinky.awsSdk.ec2Mod._AllocationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.lowestPrice
    - typingsSlinky.awsSdk.awsSdkStrings.diversified
    - typingsSlinky.awsSdk.awsSdkStrings.capacityOptimized
    - java.lang.String
  */
  type AllocationStrategy = typingsSlinky.awsSdk.ec2Mod._AllocationStrategy | java.lang.String
  type AllowedPrincipalSet = js.Array[typingsSlinky.awsSdk.ec2Mod.AllowedPrincipal]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.on_
    - typingsSlinky.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AllowsMultipleInstanceTypes = typingsSlinky.awsSdk.ec2Mod._AllowsMultipleInstanceTypes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.i386
    - typingsSlinky.awsSdk.awsSdkStrings.x86_64_
    - typingsSlinky.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureType = typingsSlinky.awsSdk.ec2Mod._ArchitectureType | java.lang.String
  type ArchitectureTypeList = js.Array[typingsSlinky.awsSdk.ec2Mod.ArchitectureType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.i386
    - typingsSlinky.awsSdk.awsSdkStrings.x86_64_
    - typingsSlinky.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureValues = typingsSlinky.awsSdk.ec2Mod._ArchitectureValues | java.lang.String
  type AssignedPrivateIpAddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.AssignedPrivateIpAddress]
  type AssociatedNetworkType = typingsSlinky.awsSdk.awsSdkStrings.vpc_ | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[typingsSlinky.awsSdk.ec2Mod.AssociatedTargetNetwork]
  type AssociationIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.IamInstanceProfileAssociationId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.`association-failed`
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type AssociationStatusCode = typingsSlinky.awsSdk.ec2Mod._AssociationStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.attaching_
    - typingsSlinky.awsSdk.awsSdkStrings.attached_
    - typingsSlinky.awsSdk.awsSdkStrings.detaching__
    - typingsSlinky.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type AttachmentStatus = typingsSlinky.awsSdk.ec2Mod._AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[typingsSlinky.awsSdk.ec2Mod.AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = typingsSlinky.awsSdk.ec2Mod._AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.on_
    - typingsSlinky.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AutoPlacement = typingsSlinky.awsSdk.ec2Mod._AutoPlacement | java.lang.String
  type AutoRecoveryFlag = scala.Boolean
  type AvailabilityZoneList = js.Array[typingsSlinky.awsSdk.ec2Mod.AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[typingsSlinky.awsSdk.ec2Mod.AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`opt-in-not-required`
    - typingsSlinky.awsSdk.awsSdkStrings.`opted-in`
    - typingsSlinky.awsSdk.awsSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type AvailabilityZoneOptInStatus = typingsSlinky.awsSdk.ec2Mod._AvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.information
    - typingsSlinky.awsSdk.awsSdkStrings.impaired__
    - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type AvailabilityZoneState = typingsSlinky.awsSdk.ec2Mod._AvailabilityZoneState | java.lang.String
  type AvailabilityZoneStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type AvailableInstanceCapacityList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceCapacity]
  type BareMetalFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.submitted__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled_running
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled_terminating
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type BatchState = typingsSlinky.awsSdk.ec2Mod._BatchState | java.lang.String
  type BillingProductList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type BlockDeviceMappingList = js.Array[typingsSlinky.awsSdk.ec2Mod.BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.BlockDeviceMapping]
  type Boolean = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.BundleId]
  type BundleTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.BundleTask]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.`waiting-for-shutdown`
    - typingsSlinky.awsSdk.awsSdkStrings.bundling
    - typingsSlinky.awsSdk.awsSdkStrings.storing
    - typingsSlinky.awsSdk.awsSdkStrings.cancelling__
    - typingsSlinky.awsSdk.awsSdkStrings.complete__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type BundleTaskState = typingsSlinky.awsSdk.ec2Mod._BundleTaskState | java.lang.String
  type BurstablePerformanceFlag = scala.Boolean
  type ByoipCidrSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.advertised
    - typingsSlinky.awsSdk.awsSdkStrings.deprovisioned_
    - typingsSlinky.awsSdk.awsSdkStrings.`failed-deprovision`
    - typingsSlinky.awsSdk.awsSdkStrings.`failed-provision`
    - typingsSlinky.awsSdk.awsSdkStrings.`pending-deprovision`
    - typingsSlinky.awsSdk.awsSdkStrings.`pending-provision`
    - typingsSlinky.awsSdk.awsSdkStrings.provisioned_
    - typingsSlinky.awsSdk.awsSdkStrings.`provisioned-not-publicly-advertisable`
    - java.lang.String
  */
  type ByoipCidrState = typingsSlinky.awsSdk.ec2Mod._ByoipCidrState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdMalformed
    - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState
    - typingsSlinky.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type CancelBatchErrorCode = typingsSlinky.awsSdk.ec2Mod._CancelBatchErrorCode | java.lang.String
  type CancelSpotFleetRequestsErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CancelSpotFleetRequestsSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.closed__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = typingsSlinky.awsSdk.ec2Mod._CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.CancelledSpotInstanceRequest]
  type CapacityReservationId = java.lang.String
  type CapacityReservationIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CapacityReservationId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typingsSlinky.awsSdk.awsSdkStrings.`Red Hat Enterprise Linux`
    - typingsSlinky.awsSdk.awsSdkStrings.`SUSE Linux`
    - typingsSlinky.awsSdk.awsSdkStrings.Windows_
    - typingsSlinky.awsSdk.awsSdkStrings.`Windows with SQL Server`
    - typingsSlinky.awsSdk.awsSdkStrings.`Windows with SQL Server Enterprise`
    - typingsSlinky.awsSdk.awsSdkStrings.`Windows with SQL Server Standard`
    - typingsSlinky.awsSdk.awsSdkStrings.`Windows with SQL Server Web`
    - typingsSlinky.awsSdk.awsSdkStrings.`Linux with SQL Server Standard`
    - typingsSlinky.awsSdk.awsSdkStrings.`Linux with SQL Server Web`
    - typingsSlinky.awsSdk.awsSdkStrings.`Linux with SQL Server Enterprise`
    - java.lang.String
  */
  type CapacityReservationInstancePlatform = typingsSlinky.awsSdk.ec2Mod._CapacityReservationInstancePlatform | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type CapacityReservationPreference = typingsSlinky.awsSdk.ec2Mod._CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.expired__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type CapacityReservationState = typingsSlinky.awsSdk.ec2Mod._CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.default_
    - typingsSlinky.awsSdk.awsSdkStrings.dedicated_
    - java.lang.String
  */
  type CapacityReservationTenancy = typingsSlinky.awsSdk.ec2Mod._CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[typingsSlinky.awsSdk.ec2Mod.ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[typingsSlinky.awsSdk.ec2Mod.ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[typingsSlinky.awsSdk.ec2Mod.ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - java.lang.String
  */
  type ClientCertificateRevocationListStatusCode = typingsSlinky.awsSdk.ec2Mod._ClientCertificateRevocationListStatusCode | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ec2Mod.ClientApiVersions
  type ClientVpnAssociationId = java.lang.String
  type ClientVpnAuthenticationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnAuthenticationRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`certificate-authentication`
    - typingsSlinky.awsSdk.awsSdkStrings.`directory-service-authentication`
    - typingsSlinky.awsSdk.awsSdkStrings.`federated-authentication`
    - java.lang.String
  */
  type ClientVpnAuthenticationType = typingsSlinky.awsSdk.ec2Mod._ClientVpnAuthenticationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.authorizing
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = typingsSlinky.awsSdk.ec2Mod._ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.`failed-to-terminate`
    - typingsSlinky.awsSdk.awsSdkStrings.terminating__
    - typingsSlinky.awsSdk.awsSdkStrings.terminated__
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = typingsSlinky.awsSdk.ec2Mod._ClientVpnConnectionStatusCode | java.lang.String
  type ClientVpnEndpointId = java.lang.String
  type ClientVpnEndpointIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`pending-associate`
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = typingsSlinky.awsSdk.ec2Mod._ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = typingsSlinky.awsSdk.ec2Mod._ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type CoipAddressUsageSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CoipAddressUsage]
  type CoipPoolId = java.lang.String
  type CoipPoolIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CoipPoolId]
  type CoipPoolMaxResults = scala.Double
  type CoipPoolSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CoipPool]
  type ConnectionNotificationId = java.lang.String
  type ConnectionNotificationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ConnectionNotificationState = typingsSlinky.awsSdk.ec2Mod._ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = typingsSlinky.awsSdk.awsSdkStrings.Topic | java.lang.String
  type ContainerFormat = typingsSlinky.awsSdk.awsSdkStrings.ova | java.lang.String
  type ConversionIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ConversionTaskId]
  type ConversionTaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelling__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ConversionTaskState = typingsSlinky.awsSdk.ec2Mod._ConversionTaskState | java.lang.String
  type CopyTagsFromSource = typingsSlinky.awsSdk.awsSdkStrings.volume_ | java.lang.String
  type CoreCount = scala.Double
  type CoreCountList = js.Array[typingsSlinky.awsSdk.ec2Mod.CoreCount]
  type CreateFleetErrorsSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CreateFleetError]
  type CreateFleetInstancesSet = js.Array[typingsSlinky.awsSdk.ec2Mod.CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[typingsSlinky.awsSdk.ec2Mod.CreateVolumePermission]
  type CurrencyCodeValues = typingsSlinky.awsSdk.awsSdkStrings.USD | java.lang.String
  type CurrentGenerationFlag = scala.Boolean
  type CustomerGatewayId = java.lang.String
  type CustomerGatewayIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.CustomerGatewayId]
  type CustomerGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.CustomerGateway]
  type DITMaxResults = scala.Double
  type DITOMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type DatafeedSubscriptionState = typingsSlinky.awsSdk.ec2Mod._DatafeedSubscriptionState | java.lang.String
  type DateTime = js.Date
  type DedicatedHostFlag = scala.Boolean
  type DedicatedHostId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = typingsSlinky.awsSdk.ec2Mod._DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = typingsSlinky.awsSdk.ec2Mod._DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.spot_
    - typingsSlinky.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type DefaultTargetCapacityType = typingsSlinky.awsSdk.ec2Mod._DefaultTargetCapacityType | java.lang.String
  type DefaultingDhcpOptionsId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.fleetIdDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.fleetIdMalformed
    - typingsSlinky.awsSdk.awsSdkStrings.fleetNotInDeletableState
    - typingsSlinky.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type DeleteFleetErrorCode = typingsSlinky.awsSdk.ec2Mod._DeleteFleetErrorCode | java.lang.String
  type DeleteFleetErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`reserved-instances-id-invalid`
    - typingsSlinky.awsSdk.awsSdkStrings.`reserved-instances-not-in-queued-state`
    - typingsSlinky.awsSdk.awsSdkStrings.`unexpected-error`
    - java.lang.String
  */
  type DeleteQueuedReservedInstancesErrorCode = typingsSlinky.awsSdk.ec2Mod._DeleteQueuedReservedInstancesErrorCode | java.lang.String
  type DeleteQueuedReservedInstancesIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservationId]
  type DescribeByoipCidrsMaxResults = scala.Double
  type DescribeCapacityReservationsMaxResults = scala.Double
  type DescribeClassicLinkInstancesMaxResults = scala.Double
  type DescribeClientVpnAuthorizationRulesMaxResults = scala.Double
  type DescribeClientVpnConnectionsMaxResults = scala.Double
  type DescribeClientVpnEndpointMaxResults = scala.Double
  type DescribeClientVpnRoutesMaxResults = scala.Double
  type DescribeClientVpnTargetNetworksMaxResults = scala.Double
  type DescribeConversionTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.ConversionTask]
  type DescribeDhcpOptionsMaxResults = scala.Double
  type DescribeEgressOnlyInternetGatewaysMaxResults = scala.Double
  type DescribeElasticGpusMaxResults = scala.Double
  type DescribeExportImageTasksMaxResults = scala.Double
  type DescribeFastSnapshotRestoreSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DescribeFastSnapshotRestoreSuccessItem]
  type DescribeFastSnapshotRestoresMaxResults = scala.Double
  type DescribeFleetsErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DescribeFleetsInstances]
  type DescribeFpgaImagesMaxResults = scala.Double
  type DescribeHostReservationsMaxResults = scala.Double
  type DescribeIamInstanceProfileAssociationsMaxResults = scala.Double
  type DescribeInstanceCreditSpecificationsMaxResults = scala.Double
  type DescribeInternetGatewaysMaxResults = scala.Double
  type DescribeLaunchTemplatesMaxResults = scala.Double
  type DescribeMovingAddressesMaxResults = scala.Double
  type DescribeNatGatewaysMaxResults = scala.Double
  type DescribeNetworkAclsMaxResults = scala.Double
  type DescribeNetworkInterfacePermissionsMaxResults = scala.Double
  type DescribeNetworkInterfacesMaxResults = scala.Double
  type DescribePrincipalIdFormatMaxResults = scala.Double
  type DescribeRouteTablesMaxResults = scala.Double
  type DescribeScheduledInstanceAvailabilityMaxResults = scala.Double
  type DescribeSecurityGroupsMaxResults = scala.Double
  type DescribeSpotFleetInstancesMaxResults = scala.Double
  type DescribeSpotFleetRequestHistoryMaxResults = scala.Double
  type DescribeStaleSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsNextToken = java.lang.String
  type DescribeSubnetsMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportNextToken = java.lang.String
  type DescribeVpcPeeringConnectionsMaxResults = scala.Double
  type DescribeVpcsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ebs_
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = typingsSlinky.awsSdk.ec2Mod._DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[typingsSlinky.awsSdk.ec2Mod.DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[typingsSlinky.awsSdk.ec2Mod.AttributeValue]
  type DhcpOptionsId = java.lang.String
  type DhcpOptionsIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.DhcpOptionsId]
  type DhcpOptionsList = js.Array[typingsSlinky.awsSdk.ec2Mod.DhcpOptions]
  type DisableFastSnapshotRestoreErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DisableFastSnapshotRestoreErrorItem]
  type DisableFastSnapshotRestoreStateErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DisableFastSnapshotRestoreStateErrorItem]
  type DisableFastSnapshotRestoreSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DisableFastSnapshotRestoreSuccessItem]
  type DiskCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VMDK
    - typingsSlinky.awsSdk.awsSdkStrings.RAW
    - typingsSlinky.awsSdk.awsSdkStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = typingsSlinky.awsSdk.ec2Mod._DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[typingsSlinky.awsSdk.ec2Mod.DiskImage]
  type DiskInfoList = js.Array[typingsSlinky.awsSdk.ec2Mod.DiskInfo]
  type DiskSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.hdd_
    - typingsSlinky.awsSdk.awsSdkStrings.ssd_
    - java.lang.String
  */
  type DiskType = typingsSlinky.awsSdk.ec2Mod._DiskType | java.lang.String
  type DnsEntrySet = js.Array[typingsSlinky.awsSdk.ec2Mod.DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pendingVerification_
    - typingsSlinky.awsSdk.awsSdkStrings.verified_
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type DnsNameState = typingsSlinky.awsSdk.ec2Mod._DnsNameState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DnsSupportValue = typingsSlinky.awsSdk.ec2Mod._DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.vpc_
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - java.lang.String
  */
  type DomainType = typingsSlinky.awsSdk.ec2Mod._DomainType | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.unsupported
    - typingsSlinky.awsSdk.awsSdkStrings.supported
    - java.lang.String
  */
  type EbsEncryptionSupport = typingsSlinky.awsSdk.ec2Mod._EbsEncryptionSupport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.unsupported
    - typingsSlinky.awsSdk.awsSdkStrings.supported
    - typingsSlinky.awsSdk.awsSdkStrings.default_
    - java.lang.String
  */
  type EbsOptimizedSupport = typingsSlinky.awsSdk.ec2Mod._EbsOptimizedSupport | java.lang.String
  type EgressOnlyInternetGatewayId = java.lang.String
  type EgressOnlyInternetGatewayIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.EgressOnlyInternetGateway]
  type ElasticGpuAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpuAssociation]
  type ElasticGpuId = java.lang.String
  type ElasticGpuIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpuId]
  type ElasticGpuSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpus]
  type ElasticGpuSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuState = typingsSlinky.awsSdk.awsSdkStrings.ATTACHED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OK
    - typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED
    - java.lang.String
  */
  type ElasticGpuStatus = typingsSlinky.awsSdk.ec2Mod._ElasticGpuStatus | java.lang.String
  type ElasticInferenceAcceleratorAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAcceleratorCount = scala.Double
  type ElasticInferenceAccelerators = js.Array[typingsSlinky.awsSdk.ec2Mod.ElasticInferenceAccelerator]
  type ElasticIpAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.unsupported
    - typingsSlinky.awsSdk.awsSdkStrings.supported
    - typingsSlinky.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type EnaSupport = typingsSlinky.awsSdk.ec2Mod._EnaSupport | java.lang.String
  type EnableFastSnapshotRestoreErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.EnableFastSnapshotRestoreErrorItem]
  type EnableFastSnapshotRestoreStateErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.EnableFastSnapshotRestoreStateErrorItem]
  type EnableFastSnapshotRestoreSuccessSet = js.Array[typingsSlinky.awsSdk.ec2Mod.EnableFastSnapshotRestoreSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.unlimited_
    - typingsSlinky.awsSdk.awsSdkStrings.limited
    - java.lang.String
  */
  type EndDateType = typingsSlinky.awsSdk.ec2Mod._EndDateType | java.lang.String
  type EndpointSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpoint]
  type ErrorSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ValidationError]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-reboot`
    - typingsSlinky.awsSdk.awsSdkStrings.`system-reboot`
    - typingsSlinky.awsSdk.awsSdkStrings.`system-maintenance`
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-retirement`
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-stop`
    - java.lang.String
  */
  type EventCode = typingsSlinky.awsSdk.ec2Mod._EventCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.instanceChange
    - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestChange
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.information
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.ec2Mod._EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.noTermination
    - typingsSlinky.awsSdk.awsSdkStrings.default_
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = typingsSlinky.awsSdk.ec2Mod._ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.citrix
    - typingsSlinky.awsSdk.awsSdkStrings.vmware_
    - typingsSlinky.awsSdk.awsSdkStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = typingsSlinky.awsSdk.ec2Mod._ExportEnvironment | java.lang.String
  type ExportImageTaskId = java.lang.String
  type ExportImageTaskIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.ExportImageTaskId]
  type ExportImageTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.ExportImageTask]
  type ExportTaskId = java.lang.String
  type ExportTaskIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ExportTaskId]
  type ExportTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.ExportTask]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelling__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ExportTaskState = typingsSlinky.awsSdk.ec2Mod._ExportTaskState | java.lang.String
  type ExportVmTaskId = java.lang.String
  type FailedQueuedPurchaseDeletionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.FailedQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enabling__
    - typingsSlinky.awsSdk.awsSdkStrings.optimizing
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - typingsSlinky.awsSdk.awsSdkStrings.disabling_
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type FastSnapshotRestoreStateCode = typingsSlinky.awsSdk.ec2Mod._FastSnapshotRestoreStateCode | java.lang.String
  type FilterList = js.Array[typingsSlinky.awsSdk.ec2Mod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - typingsSlinky.awsSdk.awsSdkStrings.pending_fulfillment
    - typingsSlinky.awsSdk.awsSdkStrings.pending_termination
    - typingsSlinky.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type FleetActivityStatus = typingsSlinky.awsSdk.ec2Mod._FleetActivityStatus | java.lang.String
  type FleetCapacityReservationUsageStrategy = typingsSlinky.awsSdk.awsSdkStrings.`use-capacity-reservations-first` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-change`
    - typingsSlinky.awsSdk.awsSdkStrings.`fleet-change`
    - typingsSlinky.awsSdk.awsSdkStrings.`service-error`
    - java.lang.String
  */
  type FleetEventType = typingsSlinky.awsSdk.ec2Mod._FleetEventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`no-termination`
    - typingsSlinky.awsSdk.awsSdkStrings.termination
    - java.lang.String
  */
  type FleetExcessCapacityTerminationPolicy = typingsSlinky.awsSdk.ec2Mod._FleetExcessCapacityTerminationPolicy | java.lang.String
  type FleetId = java.lang.String
  type FleetIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetId]
  type FleetLaunchTemplateConfigList = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetLaunchTemplateOverridesRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`lowest-price`
    - typingsSlinky.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type FleetOnDemandAllocationStrategy = typingsSlinky.awsSdk.ec2Mod._FleetOnDemandAllocationStrategy | java.lang.String
  type FleetSet = js.Array[typingsSlinky.awsSdk.ec2Mod.FleetData]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.submitted__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted_running
    - typingsSlinky.awsSdk.awsSdkStrings.deleted_terminating
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type FleetStateCode = typingsSlinky.awsSdk.ec2Mod._FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.request__
    - typingsSlinky.awsSdk.awsSdkStrings.maintain
    - typingsSlinky.awsSdk.awsSdkStrings.instant
    - java.lang.String
  */
  type FleetType = typingsSlinky.awsSdk.ec2Mod._FleetType | java.lang.String
  type Float = scala.Double
  type FlowLogIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcFlowLogId]
  type FlowLogResourceId = java.lang.String
  type FlowLogResourceIds = js.Array[typingsSlinky.awsSdk.ec2Mod.FlowLogResourceId]
  type FlowLogSet = js.Array[typingsSlinky.awsSdk.ec2Mod.FlowLog]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VPC
    - typingsSlinky.awsSdk.awsSdkStrings.Subnet
    - typingsSlinky.awsSdk.awsSdkStrings.NetworkInterface
    - java.lang.String
  */
  type FlowLogsResourceType = typingsSlinky.awsSdk.ec2Mod._FlowLogsResourceType | java.lang.String
  type FpgaDeviceCount = scala.Double
  type FpgaDeviceInfoList = js.Array[typingsSlinky.awsSdk.ec2Mod.FpgaDeviceInfo]
  type FpgaDeviceManufacturerName = java.lang.String
  type FpgaDeviceMemorySize = scala.Double
  type FpgaDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.description
    - typingsSlinky.awsSdk.awsSdkStrings.name__
    - typingsSlinky.awsSdk.awsSdkStrings.loadPermission
    - typingsSlinky.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = typingsSlinky.awsSdk.ec2Mod._FpgaImageAttributeName | java.lang.String
  type FpgaImageId = java.lang.String
  type FpgaImageIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.FpgaImageId]
  type FpgaImageList = js.Array[typingsSlinky.awsSdk.ec2Mod.FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type FpgaImageStateCode = typingsSlinky.awsSdk.ec2Mod._FpgaImageStateCode | java.lang.String
  type FreeTierEligibleFlag = scala.Boolean
  type GatewayType = typingsSlinky.awsSdk.awsSdkStrings.ipsecDot1 | java.lang.String
  type GetCapacityReservationUsageRequestMaxResults = scala.Double
  type GpuDeviceCount = scala.Double
  type GpuDeviceInfoList = js.Array[typingsSlinky.awsSdk.ec2Mod.GpuDeviceInfo]
  type GpuDeviceManufacturerName = java.lang.String
  type GpuDeviceMemorySize = scala.Double
  type GpuDeviceName = java.lang.String
  type GroupIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type GroupIdentifierList = js.Array[typingsSlinky.awsSdk.ec2Mod.GroupIdentifier]
  type GroupIdentifierSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupIdentifier]
  type GroupIds = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type GroupNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupName]
  type HibernationFlag = scala.Boolean
  type HistoryRecordSet = js.Array[typingsSlinky.awsSdk.ec2Mod.HistoryRecordEntry]
  type HistoryRecords = js.Array[typingsSlinky.awsSdk.ec2Mod.HistoryRecord]
  type HostInstanceList = js.Array[typingsSlinky.awsSdk.ec2Mod.HostInstance]
  type HostList = js.Array[typingsSlinky.awsSdk.ec2Mod.Host]
  type HostOfferingSet = js.Array[typingsSlinky.awsSdk.ec2Mod.HostOffering]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.on_
    - typingsSlinky.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type HostRecovery = typingsSlinky.awsSdk.ec2Mod._HostRecovery | java.lang.String
  type HostReservationId = java.lang.String
  type HostReservationIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.HostReservationId]
  type HostReservationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.HostReservation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.dedicated_
    - typingsSlinky.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type HostTenancy = typingsSlinky.awsSdk.ec2Mod._HostTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.optional__
    - typingsSlinky.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type HttpTokensState = typingsSlinky.awsSdk.ec2Mod._HttpTokensState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ovm
    - typingsSlinky.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type HypervisorType = typingsSlinky.awsSdk.ec2Mod._HypervisorType | java.lang.String
  type IKEVersionsList = js.Array[typingsSlinky.awsSdk.ec2Mod.IKEVersionsListValue]
  type IKEVersionsRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.IKEVersionsRequestListValue]
  type IamInstanceProfileAssociationId = java.lang.String
  type IamInstanceProfileAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.IamInstanceProfileAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type IamInstanceProfileAssociationState = typingsSlinky.awsSdk.ec2Mod._IamInstanceProfileAssociationState | java.lang.String
  type IdFormatList = js.Array[typingsSlinky.awsSdk.ec2Mod.IdFormat]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.description
    - typingsSlinky.awsSdk.awsSdkStrings.kernel
    - typingsSlinky.awsSdk.awsSdkStrings.ramdisk
    - typingsSlinky.awsSdk.awsSdkStrings.launchPermission
    - typingsSlinky.awsSdk.awsSdkStrings.productCodes
    - typingsSlinky.awsSdk.awsSdkStrings.blockDeviceMapping
    - typingsSlinky.awsSdk.awsSdkStrings.sriovNetSupport
    - java.lang.String
  */
  type ImageAttributeName = typingsSlinky.awsSdk.ec2Mod._ImageAttributeName | java.lang.String
  type ImageDiskContainerList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImageDiskContainer]
  type ImageId = java.lang.String
  type ImageIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImageId]
  type ImageList = js.Array[typingsSlinky.awsSdk.ec2Mod.Image]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.invalid__
    - typingsSlinky.awsSdk.awsSdkStrings.deregistered__
    - typingsSlinky.awsSdk.awsSdkStrings.transient
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type ImageState = typingsSlinky.awsSdk.ec2Mod._ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.machine
    - typingsSlinky.awsSdk.awsSdkStrings.kernel
    - typingsSlinky.awsSdk.awsSdkStrings.ramdisk
    - java.lang.String
  */
  type ImageTypeValues = typingsSlinky.awsSdk.ec2Mod._ImageTypeValues | java.lang.String
  type ImportImageLicenseSpecificationListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportImageLicenseConfigurationRequest]
  type ImportImageLicenseSpecificationListResponse = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportImageLicenseConfigurationResponse]
  type ImportImageTaskId = java.lang.String
  type ImportImageTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskId = java.lang.String
  type ImportSnapshotTaskIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportSnapshotTaskId]
  type ImportSnapshotTaskList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportSnapshotTask]
  type ImportTaskId = java.lang.String
  type ImportTaskIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.ImportImageTaskId]
  type InferenceDeviceCount = scala.Double
  type InferenceDeviceInfoList = js.Array[typingsSlinky.awsSdk.ec2Mod.InferenceDeviceInfo]
  type InferenceDeviceManufacturerName = java.lang.String
  type InferenceDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.instanceType_
    - typingsSlinky.awsSdk.awsSdkStrings.kernel
    - typingsSlinky.awsSdk.awsSdkStrings.ramdisk
    - typingsSlinky.awsSdk.awsSdkStrings.userData
    - typingsSlinky.awsSdk.awsSdkStrings.disableApiTermination
    - typingsSlinky.awsSdk.awsSdkStrings.instanceInitiatedShutdownBehavior
    - typingsSlinky.awsSdk.awsSdkStrings.rootDeviceName
    - typingsSlinky.awsSdk.awsSdkStrings.blockDeviceMapping
    - typingsSlinky.awsSdk.awsSdkStrings.productCodes
    - typingsSlinky.awsSdk.awsSdkStrings.sourceDestCheck
    - typingsSlinky.awsSdk.awsSdkStrings.groupSet
    - typingsSlinky.awsSdk.awsSdkStrings.ebsOptimized
    - typingsSlinky.awsSdk.awsSdkStrings.sriovNetSupport
    - typingsSlinky.awsSdk.awsSdkStrings.enaSupport
    - java.lang.String
  */
  type InstanceAttributeName = typingsSlinky.awsSdk.ec2Mod._InstanceAttributeName | java.lang.String
  type InstanceBlockDeviceMappingList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceCount]
  type InstanceCreditSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceCreditSpecificationRequest]
  type InstanceEventId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.healthy__
    - typingsSlinky.awsSdk.awsSdkStrings.unhealthy__
    - java.lang.String
  */
  type InstanceHealthStatus = typingsSlinky.awsSdk.ec2Mod._InstanceHealthStatus | java.lang.String
  type InstanceId = java.lang.String
  type InstanceIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type InstanceIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceId]
  type InstanceIdsSet = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.hibernate
    - typingsSlinky.awsSdk.awsSdkStrings.stop
    - typingsSlinky.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type InstanceInterruptionBehavior = typingsSlinky.awsSdk.ec2Mod._InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.spot_
    - typingsSlinky.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = typingsSlinky.awsSdk.ec2Mod._InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.spot_
    - typingsSlinky.awsSdk.awsSdkStrings.scheduled__
    - java.lang.String
  */
  type InstanceLifecycleType = typingsSlinky.awsSdk.ec2Mod._InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[typingsSlinky.awsSdk.ec2Mod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = typingsSlinky.awsSdk.ec2Mod._InstanceMatchCriteria | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = typingsSlinky.awsSdk.ec2Mod._InstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type InstanceMetadataOptionsState = typingsSlinky.awsSdk.ec2Mod._InstanceMetadataOptionsState | java.lang.String
  type InstanceMonitoringList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.running__
    - typingsSlinky.awsSdk.awsSdkStrings.`shutting-down`
    - typingsSlinky.awsSdk.awsSdkStrings.terminated__
    - typingsSlinky.awsSdk.awsSdkStrings.stopping__
    - typingsSlinky.awsSdk.awsSdkStrings.stopped__
    - java.lang.String
  */
  type InstanceStateName = typingsSlinky.awsSdk.ec2Mod._InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceStatusEvent]
  type InstanceStatusList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceStatus]
  type InstanceStorageFlag = scala.Boolean
  type InstanceTagKeySet = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.t1Dotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotnano
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotnano
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotnano
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotmicro
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.t3aDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m1Dotsmall
    - typingsSlinky.awsSdk.awsSdkStrings.m1Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.m1Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m4Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m2Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.cr1Dot8xlarge
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
    - typingsSlinky.awsSdk.awsSdkStrings.r5Dotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5aDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5adDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1Dot32xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.x1eDot32xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i2Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3Dotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDot3xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDot6xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.i3enDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.hi1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.hs1Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c1Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.c1Dotxlarge
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
    - typingsSlinky.awsSdk.awsSdkStrings.c5Dotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5dDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDot9xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.c5nDot18xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.cc1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.cc2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g3Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g3sDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.g4dnDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.cg1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p2Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p3Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p3Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p3Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.p3dnDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.d2Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.f1Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.f1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.f1Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5Dotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5aDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5adDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.h1Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.h1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.h1Dot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.h1Dot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDot3xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDot6xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.z1dDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.`u-6tb1Dotmetal`
    - typingsSlinky.awsSdk.awsSdkStrings.`u-9tb1Dotmetal`
    - typingsSlinky.awsSdk.awsSdkStrings.`u-12tb1Dotmetal`
    - typingsSlinky.awsSdk.awsSdkStrings.`u-18tb1Dotmetal`
    - typingsSlinky.awsSdk.awsSdkStrings.`u-24tb1Dotmetal`
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.a1Dotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5dnDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m5nDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5dnDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot16xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.r5nDot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.inf1Dotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.inf1Dot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.inf1Dot6xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.inf1Dot24xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDotmetal
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDotmedium
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDotlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDotxlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDot2xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDot4xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDot8xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDot12xlarge
    - typingsSlinky.awsSdk.awsSdkStrings.m6gDot16xlarge
    - java.lang.String
  */
  type InstanceType = typingsSlinky.awsSdk.ec2Mod._InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.nitro
    - typingsSlinky.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type InstanceTypeHypervisor = typingsSlinky.awsSdk.ec2Mod._InstanceTypeHypervisor | java.lang.String
  type InstanceTypeInfoList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceTypeInfo]
  type InstanceTypeList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceType]
  type InstanceTypeOfferingsList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceTypeOffering]
  type InstanceUsageSet = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceUsage]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`INSTANCE-ATTACH`
    - typingsSlinky.awsSdk.awsSdkStrings.`EIP-ASSOCIATE`
    - java.lang.String
  */
  type InterfacePermissionType = typingsSlinky.awsSdk.ec2Mod._InterfacePermissionType | java.lang.String
  type InternetGatewayAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.InternetGatewayAttachment]
  type InternetGatewayId = java.lang.String
  type InternetGatewayIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.InternetGatewayId]
  type InternetGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.InternetGateway]
  type IpPermissionList = js.Array[typingsSlinky.awsSdk.ec2Mod.IpPermission]
  type IpRangeList = js.Array[typingsSlinky.awsSdk.ec2Mod.IpRange]
  type IpRanges = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type Ipv4PoolEc2Id = java.lang.String
  type Ipv6Address = java.lang.String
  type Ipv6AddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type Ipv6CidrAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv6CidrAssociation]
  type Ipv6CidrBlockSet = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv6CidrBlock]
  type Ipv6Flag = scala.Boolean
  type Ipv6PoolEc2Id = java.lang.String
  type Ipv6PoolIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv6PoolEc2Id]
  type Ipv6PoolMaxResults = scala.Double
  type Ipv6PoolSet = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv6Pool]
  type Ipv6RangeList = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv6Range]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type Ipv6SupportValue = typingsSlinky.awsSdk.ec2Mod._Ipv6SupportValue | java.lang.String
  type KernelId = java.lang.String
  type KeyNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.KeyPairName]
  type KeyPairId = java.lang.String
  type KeyPairIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.KeyPairId]
  type KeyPairList = js.Array[typingsSlinky.awsSdk.ec2Mod.KeyPairInfo]
  type KeyPairName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchPermissionList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchPermission]
  type LaunchSpecsList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateConfig]
  type LaunchTemplateElasticInferenceAcceleratorCount = scala.Double
  type LaunchTemplateElasticInferenceAcceleratorList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAccelerator]
  type LaunchTemplateElasticInferenceAcceleratorResponseList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAcceleratorResponse]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.launchTemplateIdDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.launchTemplateIdMalformed
    - typingsSlinky.awsSdk.awsSdkStrings.launchTemplateNameDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.launchTemplateNameMalformed
    - typingsSlinky.awsSdk.awsSdkStrings.launchTemplateVersionDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type LaunchTemplateErrorCode = typingsSlinky.awsSdk.ec2Mod._LaunchTemplateErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.optional__
    - typingsSlinky.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type LaunchTemplateHttpTokensState = typingsSlinky.awsSdk.ec2Mod._LaunchTemplateHttpTokensState | java.lang.String
  type LaunchTemplateId = java.lang.String
  type LaunchTemplateIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataEndpointState = typingsSlinky.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataOptionsState = typingsSlinky.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataOptionsState | java.lang.String
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecification]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = js.Array[
    typingsSlinky.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecificationRequest
  ]
  type LaunchTemplateLicenseList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateLicenseConfiguration]
  type LaunchTemplateLicenseSpecificationListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateLicenseConfigurationRequest]
  type LaunchTemplateName = java.lang.String
  type LaunchTemplateNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateName]
  type LaunchTemplateOverridesList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateOverrides]
  type LaunchTemplateSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplate]
  type LaunchTemplateTagSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateVersion]
  type LicenseList = js.Array[typingsSlinky.awsSdk.ec2Mod.LicenseConfiguration]
  type LicenseSpecificationListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.LicenseConfigurationRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.sold
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type ListingState = typingsSlinky.awsSdk.ec2Mod._ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.closed__
    - java.lang.String
  */
  type ListingStatus = typingsSlinky.awsSdk.ec2Mod._ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[typingsSlinky.awsSdk.ec2Mod.LoadPermission]
  type LoadPermissionListRequest = js.Array[typingsSlinky.awsSdk.ec2Mod.LoadPermissionRequest]
  type LocalGatewayId = java.lang.String
  type LocalGatewayIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayId]
  type LocalGatewayMaxResults = scala.Double
  type LocalGatewayRouteList = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.blackhole
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LocalGatewayRouteState = typingsSlinky.awsSdk.ec2Mod._LocalGatewayRouteState | java.lang.String
  type LocalGatewayRouteTableIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRoutetableId]
  type LocalGatewayRouteTableSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTable]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationId = java.lang.String
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet = js.Array[
    typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
  ]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = js.Array[
    typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation
  ]
  type LocalGatewayRouteTableVpcAssociationId = java.lang.String
  type LocalGatewayRouteTableVpcAssociationIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociationId]
  type LocalGatewayRouteTableVpcAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.static__
    - typingsSlinky.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type LocalGatewayRouteType = typingsSlinky.awsSdk.ec2Mod._LocalGatewayRouteType | java.lang.String
  type LocalGatewayRoutetableId = java.lang.String
  type LocalGatewaySet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGateway]
  type LocalGatewayVirtualInterfaceGroupId = java.lang.String
  type LocalGatewayVirtualInterfaceGroupIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId]
  type LocalGatewayVirtualInterfaceGroupSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroup]
  type LocalGatewayVirtualInterfaceId = java.lang.String
  type LocalGatewayVirtualInterfaceIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceId]
  type LocalGatewayVirtualInterfaceSet = js.Array[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterface]
  type Location = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.`availability-zone`
    - typingsSlinky.awsSdk.awsSdkStrings.`availability-zone-id`
    - java.lang.String
  */
  type LocationType = typingsSlinky.awsSdk.ec2Mod._LocationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`cloud-watch-logs`
    - typingsSlinky.awsSdk.awsSdkStrings.s3_
    - java.lang.String
  */
  type LogDestinationType = typingsSlinky.awsSdk.ec2Mod._LogDestinationType | java.lang.String
  type Long = scala.Double
  type MarketType = typingsSlinky.awsSdk.awsSdkStrings.spot_ | java.lang.String
  type MaxIpv4AddrPerInterface = scala.Double
  type MaxIpv6AddrPerInterface = scala.Double
  type MaxNetworkInterfaces = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.static__
    - typingsSlinky.awsSdk.awsSdkStrings.igmp
    - java.lang.String
  */
  type MembershipType = typingsSlinky.awsSdk.ec2Mod._MembershipType | java.lang.String
  type MemorySize = scala.Double
  type MillisecondDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`opted-in`
    - typingsSlinky.awsSdk.awsSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type ModifyAvailabilityZoneOptInStatus = typingsSlinky.awsSdk.ec2Mod._ModifyAvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - typingsSlinky.awsSdk.awsSdkStrings.disabling_
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type MonitoringState = typingsSlinky.awsSdk.ec2Mod._MonitoringState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.movingToVpc
    - typingsSlinky.awsSdk.awsSdkStrings.restoringToClassic
    - java.lang.String
  */
  type MoveStatus = typingsSlinky.awsSdk.ec2Mod._MoveStatus | java.lang.String
  type MovingAddressStatusSet = js.Array[typingsSlinky.awsSdk.ec2Mod.MovingAddressStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type MulticastSupportValue = typingsSlinky.awsSdk.ec2Mod._MulticastSupportValue | java.lang.String
  type NatGatewayAddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.NatGatewayAddress]
  type NatGatewayId = java.lang.String
  type NatGatewayIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.NatGatewayId]
  type NatGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.NatGateway]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type NatGatewayState = typingsSlinky.awsSdk.ec2Mod._NatGatewayState | java.lang.String
  type NetworkAclAssociationId = java.lang.String
  type NetworkAclAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkAclEntry]
  type NetworkAclId = java.lang.String
  type NetworkAclIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkAclId]
  type NetworkAclList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkAcl]
  type NetworkInterfaceAttachmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.description
    - typingsSlinky.awsSdk.awsSdkStrings.groupSet
    - typingsSlinky.awsSdk.awsSdkStrings.sourceDestCheck
    - typingsSlinky.awsSdk.awsSdkStrings.attachment
    - java.lang.String
  */
  type NetworkInterfaceAttribute = typingsSlinky.awsSdk.ec2Mod._NetworkInterfaceAttribute | java.lang.String
  type NetworkInterfaceCreationType = typingsSlinky.awsSdk.awsSdkStrings.efa | java.lang.String
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId]
  type NetworkInterfaceIpv6AddressesList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterface]
  type NetworkInterfacePermissionId = java.lang.String
  type NetworkInterfacePermissionIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfacePermissionId]
  type NetworkInterfacePermissionList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.granted_
    - typingsSlinky.awsSdk.awsSdkStrings.revoking
    - typingsSlinky.awsSdk.awsSdkStrings.revoked__
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = typingsSlinky.awsSdk.ec2Mod._NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.attaching_
    - typingsSlinky.awsSdk.awsSdkStrings.`in-use`
    - typingsSlinky.awsSdk.awsSdkStrings.detaching__
    - java.lang.String
  */
  type NetworkInterfaceStatus = typingsSlinky.awsSdk.ec2Mod._NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.interface_
    - typingsSlinky.awsSdk.awsSdkStrings.natGateway
    - typingsSlinky.awsSdk.awsSdkStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = typingsSlinky.awsSdk.ec2Mod._NetworkInterfaceType | java.lang.String
  type NetworkPerformance = java.lang.String
  type NewDhcpConfigurationList = js.Array[typingsSlinky.awsSdk.ec2Mod.NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[typingsSlinky.awsSdk.ec2Mod.Integer]
  type OccurrenceDaySet = js.Array[typingsSlinky.awsSdk.ec2Mod.Integer]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.convertible_
    - java.lang.String
  */
  type OfferingClassType = typingsSlinky.awsSdk.ec2Mod._OfferingClassType | java.lang.String
  type OfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`Heavy Utilization`
    - typingsSlinky.awsSdk.awsSdkStrings.`Medium Utilization`
    - typingsSlinky.awsSdk.awsSdkStrings.`Light Utilization`
    - typingsSlinky.awsSdk.awsSdkStrings.`No Upfront`
    - typingsSlinky.awsSdk.awsSdkStrings.`Partial Upfront`
    - typingsSlinky.awsSdk.awsSdkStrings.`All Upfront`
    - java.lang.String
  */
  type OfferingTypeValues = typingsSlinky.awsSdk.ec2Mod._OfferingTypeValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.lowestPrice
    - typingsSlinky.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type OnDemandAllocationStrategy = typingsSlinky.awsSdk.ec2Mod._OnDemandAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.add__
    - typingsSlinky.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type OperationType = typingsSlinky.awsSdk.ec2Mod._OperationType | java.lang.String
  type OwnerStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AllUpfront
    - typingsSlinky.awsSdk.awsSdkStrings.PartialUpfront
    - typingsSlinky.awsSdk.awsSdkStrings.NoUpfront
    - java.lang.String
  */
  type PaymentOption = typingsSlinky.awsSdk.ec2Mod._PaymentOption | java.lang.String
  type PermissionGroup = typingsSlinky.awsSdk.awsSdkStrings.all__ | java.lang.String
  type Phase1DHGroupNumbersList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1DHGroupNumbersListValue]
  type Phase1DHGroupNumbersRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1DHGroupNumbersRequestListValue]
  type Phase1EncryptionAlgorithmsList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsListValue]
  type Phase1EncryptionAlgorithmsRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsRequestListValue]
  type Phase1IntegrityAlgorithmsList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsListValue]
  type Phase1IntegrityAlgorithmsRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsRequestListValue]
  type Phase2DHGroupNumbersList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2DHGroupNumbersListValue]
  type Phase2DHGroupNumbersRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2DHGroupNumbersRequestListValue]
  type Phase2EncryptionAlgorithmsList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsListValue]
  type Phase2EncryptionAlgorithmsRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsRequestListValue]
  type Phase2IntegrityAlgorithmsList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsListValue]
  type Phase2IntegrityAlgorithmsRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsRequestListValue]
  type PlacementGroupId = java.lang.String
  type PlacementGroupIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.PlacementGroupId]
  type PlacementGroupList = js.Array[typingsSlinky.awsSdk.ec2Mod.PlacementGroup]
  type PlacementGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type PlacementGroupState = typingsSlinky.awsSdk.ec2Mod._PlacementGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.cluster_
    - typingsSlinky.awsSdk.awsSdkStrings.partition
    - typingsSlinky.awsSdk.awsSdkStrings.spread
    - java.lang.String
  */
  type PlacementGroupStrategy = typingsSlinky.awsSdk.ec2Mod._PlacementGroupStrategy | java.lang.String
  type PlacementGroupStrategyList = js.Array[typingsSlinky.awsSdk.ec2Mod.PlacementGroupStrategy]
  type PlacementGroupStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.PlacementGroupName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.cluster_
    - typingsSlinky.awsSdk.awsSdkStrings.spread
    - typingsSlinky.awsSdk.awsSdkStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = typingsSlinky.awsSdk.ec2Mod._PlacementStrategy | java.lang.String
  type PlatformValues = typingsSlinky.awsSdk.awsSdkStrings.Windows_ | java.lang.String
  type PoolCidrBlocksSet = js.Array[typingsSlinky.awsSdk.ec2Mod.PoolCidrBlock]
  type PoolMaxResults = scala.Double
  type PrefixListIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.PrefixListId]
  type PrefixListIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type PrefixListResourceId = java.lang.String
  type PrefixListResourceIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.PrefixListResourceId]
  type PrefixListSet = js.Array[typingsSlinky.awsSdk.ec2Mod.PrefixList]
  type PriceScheduleList = js.Array[typingsSlinky.awsSdk.ec2Mod.PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.PriceScheduleSpecification]
  type PricingDetailsList = js.Array[typingsSlinky.awsSdk.ec2Mod.PricingDetail]
  type PrincipalIdFormatList = js.Array[typingsSlinky.awsSdk.ec2Mod.PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.Service_
    - typingsSlinky.awsSdk.awsSdkStrings.OrganizationUnit
    - typingsSlinky.awsSdk.awsSdkStrings.Account_
    - typingsSlinky.awsSdk.awsSdkStrings.User_
    - typingsSlinky.awsSdk.awsSdkStrings.Role_
    - java.lang.String
  */
  type PrincipalType = typingsSlinky.awsSdk.ec2Mod._PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type ProcessorSustainedClockSpeed = scala.Double
  type ProductCodeList = js.Array[typingsSlinky.awsSdk.ec2Mod.ProductCode]
  type ProductCodeStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.devpay
    - typingsSlinky.awsSdk.awsSdkStrings.marketplace_
    - java.lang.String
  */
  type ProductCodeValues = typingsSlinky.awsSdk.ec2Mod._ProductCodeValues | java.lang.String
  type ProductDescriptionList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type PropagatingVgwList = js.Array[typingsSlinky.awsSdk.ec2Mod.PropagatingVgw]
  type PublicIpStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type PublicIpv4PoolIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.Ipv4PoolEc2Id]
  type PublicIpv4PoolRangeSet = js.Array[typingsSlinky.awsSdk.ec2Mod.PublicIpv4PoolRange]
  type PublicIpv4PoolSet = js.Array[typingsSlinky.awsSdk.ec2Mod.PublicIpv4Pool]
  type PurchaseRequestSet = js.Array[typingsSlinky.awsSdk.ec2Mod.PurchaseRequest]
  type PurchaseSet = js.Array[typingsSlinky.awsSdk.ec2Mod.Purchase]
  type PurchasedScheduledInstanceSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typingsSlinky.awsSdk.awsSdkStrings.`LinuxSlashUNIX LeftparenthesisAmazon VPCRightparenthesis`
    - typingsSlinky.awsSdk.awsSdkStrings.Windows_
    - typingsSlinky.awsSdk.awsSdkStrings.`Windows LeftparenthesisAmazon VPCRightparenthesis`
    - java.lang.String
  */
  type RIProductDescription = typingsSlinky.awsSdk.ec2Mod._RIProductDescription | java.lang.String
  type RamdiskId = java.lang.String
  type ReasonCodesList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReportInstanceReasonCodes]
  type RecurringChargeFrequency = typingsSlinky.awsSdk.awsSdkStrings.Hourly_ | java.lang.String
  type RecurringChargesList = js.Array[typingsSlinky.awsSdk.ec2Mod.RecurringCharge]
  type RegionList = js.Array[typingsSlinky.awsSdk.ec2Mod.Region]
  type RegionNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-stuck-in-state`
    - typingsSlinky.awsSdk.awsSdkStrings.unresponsive
    - typingsSlinky.awsSdk.awsSdkStrings.`not-accepting-credentials`
    - typingsSlinky.awsSdk.awsSdkStrings.`password-not-available`
    - typingsSlinky.awsSdk.awsSdkStrings.`performance-network`
    - typingsSlinky.awsSdk.awsSdkStrings.`performance-instance-store`
    - typingsSlinky.awsSdk.awsSdkStrings.`performance-ebs-volume`
    - typingsSlinky.awsSdk.awsSdkStrings.`performance-other`
    - typingsSlinky.awsSdk.awsSdkStrings.other_
    - java.lang.String
  */
  type ReportInstanceReasonCodes = typingsSlinky.awsSdk.ec2Mod._ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ok__
    - typingsSlinky.awsSdk.awsSdkStrings.impaired__
    - java.lang.String
  */
  type ReportStatusType = typingsSlinky.awsSdk.ec2Mod._ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.DedicatedHostId]
  type RequestHostIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.DedicatedHostId]
  type RequestInstanceTypeList = js.Array[typingsSlinky.awsSdk.ec2Mod.InstanceType]
  type RequestSpotLaunchSpecificationSecurityGroupIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type RequestSpotLaunchSpecificationSecurityGroupList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupName]
  type ReservationId = java.lang.String
  type ReservationList = js.Array[typingsSlinky.awsSdk.ec2Mod.Reservation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-pending`
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-failed`
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type ReservationState = typingsSlinky.awsSdk.ec2Mod._ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservationId]
  type ReservedInstanceReservationValueSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-pending`
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-failed`
    - typingsSlinky.awsSdk.awsSdkStrings.retired
    - typingsSlinky.awsSdk.awsSdkStrings.queued__
    - typingsSlinky.awsSdk.awsSdkStrings.`queued-deleted`
    - java.lang.String
  */
  type ReservedInstanceState = typingsSlinky.awsSdk.ec2Mod._ReservedInstanceState | java.lang.String
  type ReservedInstancesConfigurationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservationId]
  type ReservedInstancesList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstances]
  type ReservedInstancesListingId = java.lang.String
  type ReservedInstancesListingList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesListing]
  type ReservedInstancesModificationId = java.lang.String
  type ReservedInstancesModificationIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesModificationId]
  type ReservedInstancesModificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesModificationResult]
  type ReservedInstancesOfferingId = java.lang.String
  type ReservedInstancesOfferingIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesOfferingId]
  type ReservedInstancesOfferingList = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesId]
  type ResetFpgaImageAttributeName = typingsSlinky.awsSdk.awsSdkStrings.loadPermission | java.lang.String
  type ResetImageAttributeName = typingsSlinky.awsSdk.awsSdkStrings.launchPermission | java.lang.String
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.TaggableResourceId]
  type ResourceList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`client-vpn-endpoint`
    - typingsSlinky.awsSdk.awsSdkStrings.`customer-gateway`
    - typingsSlinky.awsSdk.awsSdkStrings.`dedicated-host`
    - typingsSlinky.awsSdk.awsSdkStrings.`dhcp-options`
    - typingsSlinky.awsSdk.awsSdkStrings.`elastic-ip`
    - typingsSlinky.awsSdk.awsSdkStrings.fleet
    - typingsSlinky.awsSdk.awsSdkStrings.`fpga-image`
    - typingsSlinky.awsSdk.awsSdkStrings.`host-reservation`
    - typingsSlinky.awsSdk.awsSdkStrings.image
    - typingsSlinky.awsSdk.awsSdkStrings.instance__
    - typingsSlinky.awsSdk.awsSdkStrings.`internet-gateway`
    - typingsSlinky.awsSdk.awsSdkStrings.`key-pair`
    - typingsSlinky.awsSdk.awsSdkStrings.`launch-template`
    - typingsSlinky.awsSdk.awsSdkStrings.natgateway_
    - typingsSlinky.awsSdk.awsSdkStrings.`network-acl`
    - typingsSlinky.awsSdk.awsSdkStrings.`network-interface`
    - typingsSlinky.awsSdk.awsSdkStrings.`placement-group`
    - typingsSlinky.awsSdk.awsSdkStrings.`reserved-instances`
    - typingsSlinky.awsSdk.awsSdkStrings.`route-table`
    - typingsSlinky.awsSdk.awsSdkStrings.`security-group`
    - typingsSlinky.awsSdk.awsSdkStrings.snapshot_
    - typingsSlinky.awsSdk.awsSdkStrings.`spot-fleet-request`
    - typingsSlinky.awsSdk.awsSdkStrings.`spot-instances-request`
    - typingsSlinky.awsSdk.awsSdkStrings.subnet_
    - typingsSlinky.awsSdk.awsSdkStrings.`traffic-mirror-filter`
    - typingsSlinky.awsSdk.awsSdkStrings.`traffic-mirror-session`
    - typingsSlinky.awsSdk.awsSdkStrings.`traffic-mirror-target`
    - typingsSlinky.awsSdk.awsSdkStrings.`transit-gateway`
    - typingsSlinky.awsSdk.awsSdkStrings.`transit-gateway-attachment`
    - typingsSlinky.awsSdk.awsSdkStrings.`transit-gateway-multicast-domain`
    - typingsSlinky.awsSdk.awsSdkStrings.`transit-gateway-route-table`
    - typingsSlinky.awsSdk.awsSdkStrings.volume_
    - typingsSlinky.awsSdk.awsSdkStrings.vpc_
    - typingsSlinky.awsSdk.awsSdkStrings.`vpc-peering-connection`
    - typingsSlinky.awsSdk.awsSdkStrings.`vpn-connection`
    - typingsSlinky.awsSdk.awsSdkStrings.`vpn-gateway`
    - typingsSlinky.awsSdk.awsSdkStrings.`vpc-flow-log`
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.ec2Mod._ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type ResponseHostIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type RestorableByStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ebs_
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = typingsSlinky.awsSdk.ec2Mod._RootDeviceType | java.lang.String
  type RootDeviceTypeList = js.Array[typingsSlinky.awsSdk.ec2Mod.RootDeviceType]
  type RouteGatewayId = java.lang.String
  type RouteList = js.Array[typingsSlinky.awsSdk.ec2Mod.Route]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CreateRouteTable
    - typingsSlinky.awsSdk.awsSdkStrings.CreateRoute
    - typingsSlinky.awsSdk.awsSdkStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = typingsSlinky.awsSdk.ec2Mod._RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.blackhole
    - java.lang.String
  */
  type RouteState = typingsSlinky.awsSdk.ec2Mod._RouteState | java.lang.String
  type RouteTableAssociationId = java.lang.String
  type RouteTableAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.RouteTableAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type RouteTableAssociationStateCode = typingsSlinky.awsSdk.ec2Mod._RouteTableAssociationStateCode | java.lang.String
  type RouteTableId = java.lang.String
  type RouteTableIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.RouteTableId]
  type RouteTableList = js.Array[typingsSlinky.awsSdk.ec2Mod.RouteTable]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.allow__
    - typingsSlinky.awsSdk.awsSdkStrings.deny__
    - java.lang.String
  */
  type RuleAction = typingsSlinky.awsSdk.ec2Mod._RuleAction | java.lang.String
  type ScheduledInstanceAvailabilitySet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstanceAvailability]
  type ScheduledInstanceId = java.lang.String
  type ScheduledInstanceIdRequestSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstanceId]
  type ScheduledInstanceSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type SecurityGroupId = java.lang.String
  type SecurityGroupIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type SecurityGroupList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroup]
  type SecurityGroupName = java.lang.String
  type SecurityGroupReferences = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupReference]
  type SecurityGroupStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupName]
  type SensitiveUserData = java.lang.String
  type ServiceConfigurationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ServiceConfiguration]
  type ServiceDetailSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ServiceDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Available_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ServiceState = typingsSlinky.awsSdk.ec2Mod._ServiceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Interface
    - typingsSlinky.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type ServiceType = typingsSlinky.awsSdk.ec2Mod._ServiceType | java.lang.String
  type ServiceTypeDetailSet = js.Array[typingsSlinky.awsSdk.ec2Mod.ServiceTypeDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.stop
    - typingsSlinky.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type ShutdownBehavior = typingsSlinky.awsSdk.ec2Mod._ShutdownBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.productCodes
    - typingsSlinky.awsSdk.awsSdkStrings.createVolumePermission
    - java.lang.String
  */
  type SnapshotAttributeName = typingsSlinky.awsSdk.ec2Mod._SnapshotAttributeName | java.lang.String
  type SnapshotDetailList = js.Array[typingsSlinky.awsSdk.ec2Mod.SnapshotDetail]
  type SnapshotId = java.lang.String
  type SnapshotIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.SnapshotId]
  type SnapshotList = js.Array[typingsSlinky.awsSdk.ec2Mod.Snapshot]
  type SnapshotSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type SnapshotState = typingsSlinky.awsSdk.ec2Mod._SnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`lowest-price`
    - typingsSlinky.awsSdk.awsSdkStrings.diversified
    - typingsSlinky.awsSdk.awsSdkStrings.`capacity-optimized`
    - java.lang.String
  */
  type SpotAllocationStrategy = typingsSlinky.awsSdk.ec2Mod._SpotAllocationStrategy | java.lang.String
  type SpotFleetRequestConfigSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotFleetRequestConfig]
  type SpotFleetRequestId = java.lang.String
  type SpotFleetRequestIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotFleetRequestId]
  type SpotFleetTagSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.hibernate
    - typingsSlinky.awsSdk.awsSdkStrings.stop
    - typingsSlinky.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = typingsSlinky.awsSdk.ec2Mod._SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestId = java.lang.String
  type SpotInstanceRequestIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotInstanceRequestId]
  type SpotInstanceRequestList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.closed__
    - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SpotInstanceState = typingsSlinky.awsSdk.ec2Mod._SpotInstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`one-time`
    - typingsSlinky.awsSdk.awsSdkStrings.persistent
    - java.lang.String
  */
  type SpotInstanceType = typingsSlinky.awsSdk.ec2Mod._SpotInstanceType | java.lang.String
  type SpotPriceHistoryList = js.Array[typingsSlinky.awsSdk.ec2Mod.SpotPrice]
  type StaleIpPermissionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[typingsSlinky.awsSdk.ec2Mod.StaleSecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PendingAcceptance
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Available_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleting_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - typingsSlinky.awsSdk.awsSdkStrings.Rejected_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Expired_
    - java.lang.String
  */
  type State = typingsSlinky.awsSdk.ec2Mod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MoveInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.InVpc
    - typingsSlinky.awsSdk.awsSdkStrings.InClassic
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.ec2Mod._Status | java.lang.String
  type StatusName = typingsSlinky.awsSdk.awsSdkStrings.reachability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.passed_
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`
    - typingsSlinky.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type StatusType = typingsSlinky.awsSdk.ec2Mod._StatusType | java.lang.String
  type String = java.lang.String
  type SubnetAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.SubnetAssociation]
  type SubnetCidrAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - typingsSlinky.awsSdk.awsSdkStrings.failing__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = typingsSlinky.awsSdk.ec2Mod._SubnetCidrBlockStateCode | java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.SubnetId]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[typingsSlinky.awsSdk.ec2Mod.Subnet]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type SubnetState = typingsSlinky.awsSdk.ec2Mod._SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SuccessfulInstanceCreditSpecificationItem]
  type SuccessfulQueuedPurchaseDeletionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.SuccessfulQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ok__
    - typingsSlinky.awsSdk.awsSdkStrings.impaired__
    - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`
    - typingsSlinky.awsSdk.awsSdkStrings.`not-applicable`
    - typingsSlinky.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type SummaryStatus = typingsSlinky.awsSdk.ec2Mod._SummaryStatus | java.lang.String
  type TagDescriptionList = js.Array[typingsSlinky.awsSdk.ec2Mod.TagDescription]
  type TagList = js.Array[typingsSlinky.awsSdk.ec2Mod.Tag]
  type TagSpecificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.TagSpecification]
  type TaggableResourceId = java.lang.String
  type TargetConfigurationRequestSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TargetConfigurationRequest]
  type TargetGroups = js.Array[typingsSlinky.awsSdk.ec2Mod.TargetGroup]
  type TargetNetworkSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TargetNetwork]
  type TargetReservationValueSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TargetReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UP
    - typingsSlinky.awsSdk.awsSdkStrings.DOWN
    - java.lang.String
  */
  type TelemetryStatus = typingsSlinky.awsSdk.ec2Mod._TelemetryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.default_
    - typingsSlinky.awsSdk.awsSdkStrings.dedicated_
    - typingsSlinky.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Tenancy = typingsSlinky.awsSdk.ec2Mod._Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TerminateConnectionStatus]
  type ThreadsPerCore = scala.Double
  type ThreadsPerCoreList = js.Array[typingsSlinky.awsSdk.ec2Mod.ThreadsPerCore]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ingress
    - typingsSlinky.awsSdk.awsSdkStrings.egress
    - java.lang.String
  */
  type TrafficDirection = typingsSlinky.awsSdk.ec2Mod._TrafficDirection | java.lang.String
  type TrafficMirrorFilterId = java.lang.String
  type TrafficMirrorFilterIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`destination-port-range`
    - typingsSlinky.awsSdk.awsSdkStrings.`source-port-range`
    - typingsSlinky.awsSdk.awsSdkStrings.protocol
    - typingsSlinky.awsSdk.awsSdkStrings.description
    - java.lang.String
  */
  type TrafficMirrorFilterRuleField = typingsSlinky.awsSdk.ec2Mod._TrafficMirrorFilterRuleField | java.lang.String
  type TrafficMirrorFilterRuleFieldList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleId = java.lang.String
  type TrafficMirrorFilterRuleList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilter]
  type TrafficMirrorNetworkService = typingsSlinky.awsSdk.awsSdkStrings.`amazon-dns` | java.lang.String
  type TrafficMirrorNetworkServiceList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorNetworkService]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.accept__
    - typingsSlinky.awsSdk.awsSdkStrings.reject__
    - java.lang.String
  */
  type TrafficMirrorRuleAction = typingsSlinky.awsSdk.ec2Mod._TrafficMirrorRuleAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`packet-length`
    - typingsSlinky.awsSdk.awsSdkStrings.description
    - typingsSlinky.awsSdk.awsSdkStrings.`virtual-network-id`
    - java.lang.String
  */
  type TrafficMirrorSessionField = typingsSlinky.awsSdk.ec2Mod._TrafficMirrorSessionField | java.lang.String
  type TrafficMirrorSessionFieldList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorSessionField]
  type TrafficMirrorSessionId = java.lang.String
  type TrafficMirrorSessionIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorSessionId]
  type TrafficMirrorSessionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorSession]
  type TrafficMirrorTargetId = java.lang.String
  type TrafficMirrorTargetIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorTargetId]
  type TrafficMirrorTargetSet = js.Array[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`network-interface`
    - typingsSlinky.awsSdk.awsSdkStrings.`network-load-balancer`
    - java.lang.String
  */
  type TrafficMirrorTargetType = typingsSlinky.awsSdk.ec2Mod._TrafficMirrorTargetType | java.lang.String
  type TrafficMirroringMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT
    - typingsSlinky.awsSdk.awsSdkStrings.REJECT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TrafficType = typingsSlinky.awsSdk.ec2Mod._TrafficType | java.lang.String
  type TransitAssociationGatewayId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayAssociationState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentId = java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId]
  type TransitGatewayAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.vpc_
    - typingsSlinky.awsSdk.awsSdkStrings.vpn
    - typingsSlinky.awsSdk.awsSdkStrings.`direct-connect-gateway`
    - typingsSlinky.awsSdk.awsSdkStrings.`tgw-peering`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = typingsSlinky.awsSdk.ec2Mod._TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.initiating
    - typingsSlinky.awsSdk.awsSdkStrings.pendingAcceptance_
    - typingsSlinky.awsSdk.awsSdkStrings.rollingBack_
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.rejected__
    - typingsSlinky.awsSdk.awsSdkStrings.rejecting_
    - typingsSlinky.awsSdk.awsSdkStrings.failing__
    - java.lang.String
  */
  type TransitGatewayAttachmentState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayId = java.lang.String
  type TransitGatewayIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayId]
  type TransitGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayMulitcastDomainAssociationState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayMulitcastDomainAssociationState | java.lang.String
  type TransitGatewayMulticastDomainAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomainAssociation]
  type TransitGatewayMulticastDomainId = java.lang.String
  type TransitGatewayMulticastDomainIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomainId]
  type TransitGatewayMulticastDomainList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomain]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayMulticastDomainState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayMulticastDomainState | java.lang.String
  type TransitGatewayMulticastGroupList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastGroup]
  type TransitGatewayNetworkInterfaceIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId]
  type TransitGatewayPeeringAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayPeeringAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enabling__
    - typingsSlinky.awsSdk.awsSdkStrings.enabled__
    - typingsSlinky.awsSdk.awsSdkStrings.disabling_
    - typingsSlinky.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type TransitGatewayPropagationState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.blackhole
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableId = java.lang.String
  type TransitGatewayRouteTableIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTableId]
  type TransitGatewayRouteTableList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteTableState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.static__
    - typingsSlinky.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = typingsSlinky.awsSdk.ec2Mod._TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayState = typingsSlinky.awsSdk.ec2Mod._TransitGatewayState | java.lang.String
  type TransitGatewaySubnetIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SubnetId]
  type TransitGatewayVpcAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.tcp_
    - typingsSlinky.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typingsSlinky.awsSdk.ec2Mod._TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[typingsSlinky.awsSdk.ec2Mod.TunnelOption]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.t2
    - typingsSlinky.awsSdk.awsSdkStrings.t3
    - typingsSlinky.awsSdk.awsSdkStrings.t3a
    - java.lang.String
  */
  type UnlimitedSupportedInstanceFamily = typingsSlinky.awsSdk.ec2Mod._UnlimitedSupportedInstanceFamily | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidInstanceIDDotMalformed
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidInstanceIDDotNotFound
    - typingsSlinky.awsSdk.awsSdkStrings.IncorrectInstanceState
    - typingsSlinky.awsSdk.awsSdkStrings.InstanceCreditSpecificationDotNotSupported
    - java.lang.String
  */
  type UnsuccessfulInstanceCreditSpecificationErrorCode = typingsSlinky.awsSdk.ec2Mod._UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[typingsSlinky.awsSdk.ec2Mod.UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[typingsSlinky.awsSdk.ec2Mod.UnsuccessfulItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.spot_
    - typingsSlinky.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type UsageClassType = typingsSlinky.awsSdk.ec2Mod._UsageClassType | java.lang.String
  type UsageClassTypeList = js.Array[typingsSlinky.awsSdk.ec2Mod.UsageClassType]
  type UserGroupStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type UserIdGroupPairList = js.Array[typingsSlinky.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[typingsSlinky.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type VCpuCount = scala.Double
  type ValueStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type VersionDescription = java.lang.String
  type VersionStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type VgwTelemetryList = js.Array[typingsSlinky.awsSdk.ec2Mod.VgwTelemetry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.hvm
    - typingsSlinky.awsSdk.awsSdkStrings.paravirtual
    - java.lang.String
  */
  type VirtualizationType = typingsSlinky.awsSdk.ec2Mod._VirtualizationType | java.lang.String
  type VolumeAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.attaching_
    - typingsSlinky.awsSdk.awsSdkStrings.attached_
    - typingsSlinky.awsSdk.awsSdkStrings.detaching__
    - typingsSlinky.awsSdk.awsSdkStrings.detached__
    - typingsSlinky.awsSdk.awsSdkStrings.busy_
    - java.lang.String
  */
  type VolumeAttachmentState = typingsSlinky.awsSdk.ec2Mod._VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.autoEnableIO
    - typingsSlinky.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = typingsSlinky.awsSdk.ec2Mod._VolumeAttributeName | java.lang.String
  type VolumeId = java.lang.String
  type VolumeIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeId]
  type VolumeList = js.Array[typingsSlinky.awsSdk.ec2Mod.Volume]
  type VolumeModificationList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.modifying_
    - typingsSlinky.awsSdk.awsSdkStrings.optimizing
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VolumeModificationState = typingsSlinky.awsSdk.ec2Mod._VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.`in-use`
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type VolumeState = typingsSlinky.awsSdk.ec2Mod._VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeStatusAction]
  type VolumeStatusAttachmentStatusList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeStatusAttachmentStatus]
  type VolumeStatusDetailsList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ok__
    - typingsSlinky.awsSdk.awsSdkStrings.impaired__
    - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`
    - java.lang.String
  */
  type VolumeStatusInfoStatus = typingsSlinky.awsSdk.ec2Mod._VolumeStatusInfoStatus | java.lang.String
  type VolumeStatusList = js.Array[typingsSlinky.awsSdk.ec2Mod.VolumeStatusItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`io-enabled`
    - typingsSlinky.awsSdk.awsSdkStrings.`io-performance`
    - java.lang.String
  */
  type VolumeStatusName = typingsSlinky.awsSdk.ec2Mod._VolumeStatusName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.io1
    - typingsSlinky.awsSdk.awsSdkStrings.gp2
    - typingsSlinky.awsSdk.awsSdkStrings.sc1
    - typingsSlinky.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type VolumeType = typingsSlinky.awsSdk.ec2Mod._VolumeType | java.lang.String
  type VpcAttachmentList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enableDnsSupport
    - typingsSlinky.awsSdk.awsSdkStrings.enableDnsHostnames
    - java.lang.String
  */
  type VpcAttributeName = typingsSlinky.awsSdk.ec2Mod._VpcAttributeName | java.lang.String
  type VpcCidrAssociationId = java.lang.String
  type VpcCidrBlockAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - typingsSlinky.awsSdk.awsSdkStrings.failing__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VpcCidrBlockStateCode = typingsSlinky.awsSdk.ec2Mod._VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcId]
  type VpcClassicLinkList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcEndpointConnection]
  type VpcEndpointId = java.lang.String
  type VpcEndpointIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcEndpointId]
  type VpcEndpointRouteTableIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.RouteTableId]
  type VpcEndpointSecurityGroupIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SecurityGroupId]
  type VpcEndpointServiceId = java.lang.String
  type VpcEndpointServiceIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcEndpointServiceId]
  type VpcEndpointSet = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcEndpoint]
  type VpcEndpointSubnetIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.SubnetId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Interface
    - typingsSlinky.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = typingsSlinky.awsSdk.ec2Mod._VpcEndpointType | java.lang.String
  type VpcFlowLogId = java.lang.String
  type VpcId = java.lang.String
  type VpcIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcId]
  type VpcIpv6CidrBlockAssociationSet = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[typingsSlinky.awsSdk.ec2Mod.Vpc]
  type VpcPeeringConnectionId = java.lang.String
  type VpcPeeringConnectionIdList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcPeeringConnectionId]
  type VpcPeeringConnectionList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`initiating-request`
    - typingsSlinky.awsSdk.awsSdkStrings.`pending-acceptance`
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.rejected__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.expired__
    - typingsSlinky.awsSdk.awsSdkStrings.provisioning_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = typingsSlinky.awsSdk.ec2Mod._VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type VpcState = typingsSlinky.awsSdk.ec2Mod._VpcState | java.lang.String
  type VpcTenancy = typingsSlinky.awsSdk.awsSdkStrings.default_ | java.lang.String
  type VpnConnectionId = java.lang.String
  type VpnConnectionIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnConnectionId]
  type VpnConnectionList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.enable_
    - typingsSlinky.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type VpnEcmpSupportValue = typingsSlinky.awsSdk.ec2Mod._VpnEcmpSupportValue | java.lang.String
  type VpnGatewayId = java.lang.String
  type VpnGatewayIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnGatewayId]
  type VpnGatewayList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnGateway]
  type VpnProtocol = typingsSlinky.awsSdk.awsSdkStrings.openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type VpnState = typingsSlinky.awsSdk.ec2Mod._VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnStaticRoute]
  type VpnStaticRouteSource = typingsSlinky.awsSdk.awsSdkStrings.Static_ | java.lang.String
  type VpnTunnelOptionsSpecificationsList = js.Array[typingsSlinky.awsSdk.ec2Mod.VpnTunnelOptionsSpecification]
  type ZoneIdStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type ZoneNameStringList = js.Array[typingsSlinky.awsSdk.ec2Mod.String]
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.ec2Mod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-06-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-10-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-02-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-05-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-06-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-09-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-10-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-03-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-04-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-10-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-04-01`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-09-15`
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ec2Mod._apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`Availability Zone`
    - typingsSlinky.awsSdk.awsSdkStrings.Region_
    - java.lang.String
  */
  type scope = typingsSlinky.awsSdk.ec2Mod._scope | java.lang.String
  type totalFpgaMemory = scala.Double
  type totalGpuMemory = scala.Double
}
