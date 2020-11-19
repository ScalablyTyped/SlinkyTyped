package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object organizationsMod {
  
  type AccountArn = java.lang.String
  
  type AccountId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVITED
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - java.lang.String
  */
  type AccountJoinedMethod = typingsSlinky.awsSdk.organizationsMod._AccountJoinedMethod | java.lang.String
  
  type AccountName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
    - java.lang.String
  */
  type AccountStatus = typingsSlinky.awsSdk.organizationsMod._AccountStatus | java.lang.String
  
  type Accounts = js.Array[typingsSlinky.awsSdk.organizationsMod.Account]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVITE
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES
    - typingsSlinky.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES
    - typingsSlinky.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
    - java.lang.String
  */
  type ActionType = typingsSlinky.awsSdk.organizationsMod._ActionType | java.lang.String
  
  type AwsManagedPolicy = scala.Boolean
  
  type ChildId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ChildType = typingsSlinky.awsSdk.organizationsMod._ChildType | java.lang.String
  
  type Children = js.Array[typingsSlinky.awsSdk.organizationsMod.Child]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.organizationsMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_ALREADY_EXISTS
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_EMAIL
    - typingsSlinky.awsSdk.awsSdkStrings.CONCURRENT_ACCOUNT_MODIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.GOVCLOUD_ACCOUNT_ALREADY_EXISTS
    - java.lang.String
  */
  type CreateAccountFailureReason = typingsSlinky.awsSdk.organizationsMod._CreateAccountFailureReason | java.lang.String
  
  type CreateAccountRequestId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CreateAccountState = typingsSlinky.awsSdk.organizationsMod._CreateAccountState | java.lang.String
  
  type CreateAccountStates = js.Array[typingsSlinky.awsSdk.organizationsMod.CreateAccountState]
  
  type CreateAccountStatuses = js.Array[typingsSlinky.awsSdk.organizationsMod.CreateAccountStatus]
  
  type DelegatedAdministrators = js.Array[typingsSlinky.awsSdk.organizationsMod.DelegatedAdministrator]
  
  type DelegatedServices = js.Array[typingsSlinky.awsSdk.organizationsMod.DelegatedService]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TAG_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.AISERVICES_OPT_OUT_POLICY
    - java.lang.String
  */
  type EffectivePolicyType = typingsSlinky.awsSdk.organizationsMod._EffectivePolicyType | java.lang.String
  
  type Email = java.lang.String
  
  type EnabledServicePrincipals = js.Array[typingsSlinky.awsSdk.organizationsMod.EnabledServicePrincipal]
  
  type GenericArn = java.lang.String
  
  type HandshakeArn = java.lang.String
  
  type HandshakeId = java.lang.String
  
  type HandshakeNotes = java.lang.String
  
  type HandshakeParties = js.Array[typingsSlinky.awsSdk.organizationsMod.HandshakeParty]
  
  type HandshakePartyId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type HandshakePartyType = typingsSlinky.awsSdk.organizationsMod._HandshakePartyType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION_FEATURE_SET
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER_EMAIL
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.NOTES
    - typingsSlinky.awsSdk.awsSdkStrings.PARENT_HANDSHAKE
    - java.lang.String
  */
  type HandshakeResourceType = typingsSlinky.awsSdk.organizationsMod._HandshakeResourceType | java.lang.String
  
  type HandshakeResourceValue = java.lang.String
  
  type HandshakeResources = js.Array[typingsSlinky.awsSdk.organizationsMod.HandshakeResource]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUESTED
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED
    - typingsSlinky.awsSdk.awsSdkStrings.DECLINED
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type HandshakeState = typingsSlinky.awsSdk.organizationsMod._HandshakeState | java.lang.String
  
  type Handshakes = js.Array[typingsSlinky.awsSdk.organizationsMod.Handshake]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type IAMUserAccessToBilling = typingsSlinky.awsSdk.organizationsMod._IAMUserAccessToBilling | java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type OrganizationArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.CONSOLIDATED_BILLING
    - java.lang.String
  */
  type OrganizationFeatureSet = typingsSlinky.awsSdk.organizationsMod._OrganizationFeatureSet | java.lang.String
  
  type OrganizationId = java.lang.String
  
  type OrganizationalUnitArn = java.lang.String
  
  type OrganizationalUnitId = java.lang.String
  
  type OrganizationalUnitName = java.lang.String
  
  type OrganizationalUnits = js.Array[typingsSlinky.awsSdk.organizationsMod.OrganizationalUnit]
  
  type ParentId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROOT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ParentType = typingsSlinky.awsSdk.organizationsMod._ParentType | java.lang.String
  
  type Parents = js.Array[typingsSlinky.awsSdk.organizationsMod.Parent]
  
  type Policies = js.Array[typingsSlinky.awsSdk.organizationsMod.PolicySummary]
  
  type PolicyArn = java.lang.String
  
  type PolicyContent = java.lang.String
  
  type PolicyDescription = java.lang.String
  
  type PolicyId = java.lang.String
  
  type PolicyName = java.lang.String
  
  type PolicyTargetId = java.lang.String
  
  type PolicyTargets = js.Array[typingsSlinky.awsSdk.organizationsMod.PolicyTargetSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_CONTROL_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.TAG_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.BACKUP_POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.AISERVICES_OPT_OUT_POLICY
    - java.lang.String
  */
  type PolicyType = typingsSlinky.awsSdk.organizationsMod._PolicyType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ENABLE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DISABLE
    - java.lang.String
  */
  type PolicyTypeStatus = typingsSlinky.awsSdk.organizationsMod._PolicyTypeStatus | java.lang.String
  
  type PolicyTypes = js.Array[typingsSlinky.awsSdk.organizationsMod.PolicyTypeSummary]
  
  type RoleName = java.lang.String
  
  type RootArn = java.lang.String
  
  type RootId = java.lang.String
  
  type RootName = java.lang.String
  
  type Roots = js.Array[typingsSlinky.awsSdk.organizationsMod.Root]
  
  type ServicePrincipal = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.organizationsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type TaggableResourceId = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.organizationsMod.Tag]
  
  type TargetName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typingsSlinky.awsSdk.awsSdkStrings.ROOT
    - java.lang.String
  */
  type TargetType = typingsSlinky.awsSdk.organizationsMod._TargetType | java.lang.String
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.organizationsMod._apiVersion | java.lang.String
}
