package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managedblockchainMod {
  type AvailabilityZoneString = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.managedblockchainMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTER
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type Edition = typingsSlinky.awsSdk.managedblockchainMod._Edition | java.lang.String
  type Framework = typingsSlinky.awsSdk.awsSdkStrings.HYPERLEDGER_FABRIC | java.lang.String
  type FrameworkVersionString = java.lang.String
  type InstanceTypeString = java.lang.String
  type InvitationList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTING
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type InvitationStatus = typingsSlinky.awsSdk.managedblockchainMod._InvitationStatus | java.lang.String
  type InviteActionList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.InviteAction]
  type IsOwned = scala.Boolean
  type MemberListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type MemberStatus = typingsSlinky.awsSdk.managedblockchainMod._MemberStatus | java.lang.String
  type MemberSummaryList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.MemberSummary]
  type NameString = java.lang.String
  type NetworkListMaxResults = scala.Double
  type NetworkMemberNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type NetworkStatus = typingsSlinky.awsSdk.managedblockchainMod._NetworkStatus | java.lang.String
  type NetworkSummaryList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.NetworkSummary]
  type NodeListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NodeStatus = typingsSlinky.awsSdk.managedblockchainMod._NodeStatus | java.lang.String
  type NodeSummaryList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.NodeSummary]
  type PaginationToken = java.lang.String
  type PasswordString = java.lang.String
  type PrincipalString = java.lang.String
  type ProposalDurationInt = scala.Double
  type ProposalListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTION_FAILED
    - java.lang.String
  */
  type ProposalStatus = typingsSlinky.awsSdk.managedblockchainMod._ProposalStatus | java.lang.String
  type ProposalSummaryList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.ProposalSummary]
  type ProposalVoteList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.VoteSummary]
  type RemoveActionList = js.Array[typingsSlinky.awsSdk.managedblockchainMod.RemoveAction]
  type ResourceIdString = java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
    - java.lang.String
  */
  type ThresholdComparator = typingsSlinky.awsSdk.managedblockchainMod._ThresholdComparator | java.lang.String
  type ThresholdPercentageInt = scala.Double
  type Timestamp = js.Date
  type UsernameString = java.lang.String
  type VoteCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.YES
    - typingsSlinky.awsSdk.awsSdkStrings.NO
    - java.lang.String
  */
  type VoteValue = typingsSlinky.awsSdk.managedblockchainMod._VoteValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.managedblockchainMod._apiVersion | java.lang.String
}
