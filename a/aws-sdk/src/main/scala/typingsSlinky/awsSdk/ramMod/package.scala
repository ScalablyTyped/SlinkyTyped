package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ramMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ramMod.ClientApiVersions
  type DateTime = js.Date
  type Integer = scala.Double
  type MaxResults = scala.Double
  type PermissionArnList = js.Array[typingsSlinky.awsSdk.ramMod.String]
  type Policy = java.lang.String
  type PolicyList = js.Array[typingsSlinky.awsSdk.ramMod.Policy]
  type PrincipalArnOrIdList = js.Array[typingsSlinky.awsSdk.ramMod.String]
  type PrincipalList = js.Array[typingsSlinky.awsSdk.ramMod.Principal]
  type ResourceArnList = js.Array[typingsSlinky.awsSdk.ramMod.String]
  type ResourceList = js.Array[typingsSlinky.awsSdk.ramMod.Resource]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SELF
    - typingsSlinky.awsSdk.awsSdkStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = typingsSlinky.awsSdk.ramMod._ResourceOwner | java.lang.String
  type ResourceShareArnList = js.Array[typingsSlinky.awsSdk.ramMod.String]
  type ResourceShareAssociationList = js.Array[typingsSlinky.awsSdk.ramMod.ResourceShareAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING
    - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = typingsSlinky.awsSdk.ramMod._ResourceShareAssociationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRINCIPAL
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = typingsSlinky.awsSdk.ramMod._ResourceShareAssociationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED_FROM_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.PROMOTING_TO_STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ResourceShareFeatureSet = typingsSlinky.awsSdk.ramMod._ResourceShareFeatureSet | java.lang.String
  type ResourceShareInvitationArnList = js.Array[typingsSlinky.awsSdk.ramMod.String]
  type ResourceShareInvitationList = js.Array[typingsSlinky.awsSdk.ramMod.ResourceShareInvitation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED
    - typingsSlinky.awsSdk.awsSdkStrings.REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = typingsSlinky.awsSdk.ramMod._ResourceShareInvitationStatus | java.lang.String
  type ResourceShareList = js.Array[typingsSlinky.awsSdk.ramMod.ResourceShare]
  type ResourceSharePermissionList = js.Array[typingsSlinky.awsSdk.ramMod.ResourceSharePermissionSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = typingsSlinky.awsSdk.ramMod._ResourceShareStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE
    - typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ResourceStatus = typingsSlinky.awsSdk.ramMod._ResourceStatus | java.lang.String
  type String = java.lang.String
  type TagFilters = js.Array[typingsSlinky.awsSdk.ramMod.TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.ramMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.ramMod.Tag]
  type TagValue = java.lang.String
  type TagValueList = js.Array[typingsSlinky.awsSdk.ramMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-01-04`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ramMod._apiVersion | java.lang.String
}
