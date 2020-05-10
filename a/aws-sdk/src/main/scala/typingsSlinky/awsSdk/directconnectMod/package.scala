package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object directconnectMod {
  type ASN = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ipv4_
    - typingsSlinky.awsSdk.awsSdkStrings.ipv6_
    - java.lang.String
  */
  type AddressFamily = typingsSlinky.awsSdk.directconnectMod._AddressFamily | java.lang.String
  type AmazonAddress = java.lang.String
  type AssociatedGatewayId = java.lang.String
  type AvailablePortSpeeds = js.Array[typingsSlinky.awsSdk.directconnectMod.PortSpeed]
  type AwsDevice = java.lang.String
  type AwsDeviceV2 = java.lang.String
  type BGPAuthKey = java.lang.String
  type BGPPeerId = java.lang.String
  type BGPPeerList = js.Array[typingsSlinky.awsSdk.directconnectMod.BGPPeer]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.verifying__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type BGPPeerState = typingsSlinky.awsSdk.directconnectMod._BGPPeerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.up_
    - typingsSlinky.awsSdk.awsSdkStrings.down_
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type BGPStatus = typingsSlinky.awsSdk.directconnectMod._BGPStatus | java.lang.String
  type Bandwidth = java.lang.String
  type BooleanFlag = scala.Boolean
  type CIDR = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.directconnectMod.ClientApiVersions
  type ConnectionId = java.lang.String
  type ConnectionList = js.Array[typingsSlinky.awsSdk.directconnectMod.Connection]
  type ConnectionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ordering
    - typingsSlinky.awsSdk.awsSdkStrings.requested__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.down_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.rejected__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type ConnectionState = typingsSlinky.awsSdk.directconnectMod._ConnectionState | java.lang.String
  type Count = scala.Double
  type CustomerAddress = java.lang.String
  type DirectConnectGatewayAssociationId = java.lang.String
  type DirectConnectGatewayAssociationList = js.Array[typingsSlinky.awsSdk.directconnectMod.DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId = java.lang.String
  type DirectConnectGatewayAssociationProposalList = js.Array[typingsSlinky.awsSdk.directconnectMod.DirectConnectGatewayAssociationProposal]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.requested__
    - typingsSlinky.awsSdk.awsSdkStrings.accepted__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = typingsSlinky.awsSdk.directconnectMod._DirectConnectGatewayAssociationProposalState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.associating__
    - typingsSlinky.awsSdk.awsSdkStrings.associated__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociating__
    - typingsSlinky.awsSdk.awsSdkStrings.disassociated_
    - typingsSlinky.awsSdk.awsSdkStrings.updating__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = typingsSlinky.awsSdk.directconnectMod._DirectConnectGatewayAssociationState | java.lang.String
  type DirectConnectGatewayAttachmentList = js.Array[typingsSlinky.awsSdk.directconnectMod.DirectConnectGatewayAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.attaching_
    - typingsSlinky.awsSdk.awsSdkStrings.attached_
    - typingsSlinky.awsSdk.awsSdkStrings.detaching__
    - typingsSlinky.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentState = typingsSlinky.awsSdk.directconnectMod._DirectConnectGatewayAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TransitVirtualInterface
    - typingsSlinky.awsSdk.awsSdkStrings.PrivateVirtualInterface
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentType = typingsSlinky.awsSdk.directconnectMod._DirectConnectGatewayAttachmentType | java.lang.String
  type DirectConnectGatewayId = java.lang.String
  type DirectConnectGatewayList = js.Array[typingsSlinky.awsSdk.directconnectMod.DirectConnectGateway]
  type DirectConnectGatewayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayState = typingsSlinky.awsSdk.directconnectMod._DirectConnectGatewayState | java.lang.String
  type GatewayIdToAssociate = java.lang.String
  type GatewayIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.virtualPrivateGateway
    - typingsSlinky.awsSdk.awsSdkStrings.transitGateway
    - java.lang.String
  */
  type GatewayType = typingsSlinky.awsSdk.directconnectMod._GatewayType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - typingsSlinky.awsSdk.awsSdkStrings.yes_
    - typingsSlinky.awsSdk.awsSdkStrings.no_
    - java.lang.String
  */
  type HasLogicalRedundancy = typingsSlinky.awsSdk.directconnectMod._HasLogicalRedundancy | java.lang.String
  type InterconnectId = java.lang.String
  type InterconnectList = js.Array[typingsSlinky.awsSdk.directconnectMod.Interconnect]
  type InterconnectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.requested__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.down_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type InterconnectState = typingsSlinky.awsSdk.directconnectMod._InterconnectState | java.lang.String
  type JumboFrameCapable = scala.Boolean
  type LagId = java.lang.String
  type LagList = js.Array[typingsSlinky.awsSdk.directconnectMod.Lag]
  type LagName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.requested__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.down_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LagState = typingsSlinky.awsSdk.directconnectMod._LagState | java.lang.String
  type LoaContent = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.directconnectMod.Blob | java.lang.String
  type LoaContentType = typingsSlinky.awsSdk.awsSdkStrings.applicationSlashpdf | java.lang.String
  type LoaIssueTime = js.Date
  type LocationCode = java.lang.String
  type LocationList = js.Array[typingsSlinky.awsSdk.directconnectMod.Location]
  type LocationName = java.lang.String
  type LongAsn = scala.Double
  type MTU = scala.Double
  type MaxResultSetSize = scala.Double
  type OwnerAccount = java.lang.String
  type PaginationToken = java.lang.String
  type PartnerName = java.lang.String
  type PortSpeed = java.lang.String
  type ProviderList = js.Array[typingsSlinky.awsSdk.directconnectMod.ProviderName]
  type ProviderName = java.lang.String
  type Region = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArnList = js.Array[typingsSlinky.awsSdk.directconnectMod.ResourceArn]
  type ResourceTagList = js.Array[typingsSlinky.awsSdk.directconnectMod.ResourceTag]
  type RouteFilterPrefixList = js.Array[typingsSlinky.awsSdk.directconnectMod.RouteFilterPrefix]
  type RouterConfig = java.lang.String
  type StateChangeError = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.directconnectMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.directconnectMod.Tag]
  type TagValue = java.lang.String
  type VLAN = scala.Double
  type VirtualGatewayId = java.lang.String
  type VirtualGatewayList = js.Array[typingsSlinky.awsSdk.directconnectMod.VirtualGateway]
  type VirtualGatewayRegion = java.lang.String
  type VirtualGatewayState = java.lang.String
  type VirtualInterfaceId = java.lang.String
  type VirtualInterfaceList = js.Array[typingsSlinky.awsSdk.directconnectMod.VirtualInterface]
  type VirtualInterfaceName = java.lang.String
  type VirtualInterfaceRegion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.confirming
    - typingsSlinky.awsSdk.awsSdkStrings.verifying__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.available__
    - typingsSlinky.awsSdk.awsSdkStrings.down_
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.rejected__
    - typingsSlinky.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type VirtualInterfaceState = typingsSlinky.awsSdk.directconnectMod._VirtualInterfaceState | java.lang.String
  type VirtualInterfaceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-10-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.directconnectMod._apiVersion | java.lang.String
}
