package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iamMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_LEVEL
    - typingsSlinky.awsSdk.awsSdkStrings.ACTION_LEVEL
    - java.lang.String
  */
  type AccessAdvisorUsageGranularityType = typingsSlinky.awsSdk.iamMod._AccessAdvisorUsageGranularityType | java.lang.String
  type AccessDetails = js.Array[typingsSlinky.awsSdk.iamMod.AccessDetail]
  type ActionNameListType = js.Array[typingsSlinky.awsSdk.iamMod.ActionNameType]
  type ActionNameType = java.lang.String
  type ArnListType = js.Array[typingsSlinky.awsSdk.iamMod.arnType]
  type BootstrapDatum = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iamMod.Blob | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iamMod.ClientApiVersions
  type ColumnNumber = scala.Double
  type ContextEntryListType = js.Array[typingsSlinky.awsSdk.iamMod.ContextEntry]
  type ContextKeyNameType = java.lang.String
  type ContextKeyNamesResultListType = js.Array[typingsSlinky.awsSdk.iamMod.ContextKeyNameType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.string__
    - typingsSlinky.awsSdk.awsSdkStrings.stringList_
    - typingsSlinky.awsSdk.awsSdkStrings.numeric
    - typingsSlinky.awsSdk.awsSdkStrings.numericList
    - typingsSlinky.awsSdk.awsSdkStrings.boolean__
    - typingsSlinky.awsSdk.awsSdkStrings.booleanList
    - typingsSlinky.awsSdk.awsSdkStrings.ip_
    - typingsSlinky.awsSdk.awsSdkStrings.ipList
    - typingsSlinky.awsSdk.awsSdkStrings.binary__
    - typingsSlinky.awsSdk.awsSdkStrings.binaryList
    - typingsSlinky.awsSdk.awsSdkStrings.date_
    - typingsSlinky.awsSdk.awsSdkStrings.dateList
    - java.lang.String
  */
  type ContextKeyTypeEnum = typingsSlinky.awsSdk.iamMod._ContextKeyTypeEnum | java.lang.String
  type ContextKeyValueListType = js.Array[typingsSlinky.awsSdk.iamMod.ContextKeyValueType]
  type ContextKeyValueType = java.lang.String
  type DeletionTaskIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DeletionTaskStatusType = typingsSlinky.awsSdk.iamMod._DeletionTaskStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.User_
    - typingsSlinky.awsSdk.awsSdkStrings.Role_
    - typingsSlinky.awsSdk.awsSdkStrings.Group_
    - typingsSlinky.awsSdk.awsSdkStrings.LocalManagedPolicy
    - typingsSlinky.awsSdk.awsSdkStrings.AWSManagedPolicy
    - java.lang.String
  */
  type EntityType = typingsSlinky.awsSdk.iamMod._EntityType | java.lang.String
  type EvalDecisionDetailsType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iamMod.PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = java.lang.String
  type EvaluationResultsListType = js.Array[typingsSlinky.awsSdk.iamMod.EvaluationResult]
  type LineNumber = scala.Double
  type ManagedPolicyDetailListType = js.Array[typingsSlinky.awsSdk.iamMod.ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[typingsSlinky.awsSdk.iamMod.OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = java.lang.String
  type PermissionsBoundaryAttachmentType = typingsSlinky.awsSdk.awsSdkStrings.PermissionsBoundaryPolicy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.allowed__
    - typingsSlinky.awsSdk.awsSdkStrings.explicitDeny
    - typingsSlinky.awsSdk.awsSdkStrings.implicitDeny
    - java.lang.String
  */
  type PolicyEvaluationDecisionType = typingsSlinky.awsSdk.iamMod._PolicyEvaluationDecisionType | java.lang.String
  type PolicyGroupListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyGroup]
  type PolicyIdentifierType = java.lang.String
  type PolicyRoleListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyRole]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.user__
    - typingsSlinky.awsSdk.awsSdkStrings.group__
    - typingsSlinky.awsSdk.awsSdkStrings.role__
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-managed`
    - typingsSlinky.awsSdk.awsSdkStrings.`user-managed`
    - typingsSlinky.awsSdk.awsSdkStrings.resource__
    - typingsSlinky.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type PolicySourceType = typingsSlinky.awsSdk.iamMod._PolicySourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PermissionsPolicy
    - typingsSlinky.awsSdk.awsSdkStrings.PermissionsBoundary
    - java.lang.String
  */
  type PolicyUsageType = typingsSlinky.awsSdk.iamMod._PolicyUsageType | java.lang.String
  type PolicyUserListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyUser]
  type ReasonType = java.lang.String
  type RegionNameType = java.lang.String
  type ReportContentType = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iamMod.Blob | java.lang.String
  type ReportFormatType = typingsSlinky.awsSdk.awsSdkStrings.textSlashcsv | java.lang.String
  type ReportStateDescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
    - java.lang.String
  */
  type ReportStateType = typingsSlinky.awsSdk.iamMod._ReportStateType | java.lang.String
  type ResourceHandlingOptionType = java.lang.String
  type ResourceNameListType = js.Array[typingsSlinky.awsSdk.iamMod.ResourceNameType]
  type ResourceNameType = java.lang.String
  type ResourceSpecificResultListType = js.Array[typingsSlinky.awsSdk.iamMod.ResourceSpecificResult]
  type RoleUsageListType = js.Array[typingsSlinky.awsSdk.iamMod.RoleUsageType]
  type SAMLMetadataDocumentType = java.lang.String
  type SAMLProviderListType = js.Array[typingsSlinky.awsSdk.iamMod.SAMLProviderListEntry]
  type SAMLProviderNameType = java.lang.String
  type SSHPublicKeyListType = js.Array[typingsSlinky.awsSdk.iamMod.SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType = js.Array[typingsSlinky.awsSdk.iamMod.ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed = js.Array[typingsSlinky.awsSdk.iamMod.ServiceLastAccessed]
  type SimulationPolicyListType = js.Array[typingsSlinky.awsSdk.iamMod.policyDocumentType]
  type StatementListType = js.Array[typingsSlinky.awsSdk.iamMod.Statement]
  type TrackedActionsLastAccessed = js.Array[typingsSlinky.awsSdk.iamMod.TrackedActionLastAccessed]
  type accessKeyIdType = java.lang.String
  type accessKeyMetadataListType = js.Array[typingsSlinky.awsSdk.iamMod.AccessKeyMetadata]
  type accessKeySecretType = java.lang.String
  type accountAliasListType = js.Array[typingsSlinky.awsSdk.iamMod.accountAliasType]
  type accountAliasType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2010-05-08`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iamMod._apiVersion | java.lang.String
  type arnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Assigned_
    - typingsSlinky.awsSdk.awsSdkStrings.Unassigned
    - typingsSlinky.awsSdk.awsSdkStrings.Any_
    - java.lang.String
  */
  type assignmentStatusType = typingsSlinky.awsSdk.iamMod._assignmentStatusType | java.lang.String
  type attachedPoliciesListType = js.Array[typingsSlinky.awsSdk.iamMod.AttachedPolicy]
  type attachmentCountType = scala.Double
  type authenticationCodeType = java.lang.String
  type booleanObjectType = scala.Boolean
  type booleanType = scala.Boolean
  type certificateBodyType = java.lang.String
  type certificateChainType = java.lang.String
  type certificateIdType = java.lang.String
  type certificateListType = js.Array[typingsSlinky.awsSdk.iamMod.SigningCertificate]
  type clientIDListType = js.Array[typingsSlinky.awsSdk.iamMod.clientIDType]
  type clientIDType = java.lang.String
  type customSuffixType = java.lang.String
  type dateType = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSH
    - typingsSlinky.awsSdk.awsSdkStrings.PEM
    - java.lang.String
  */
  type encodingType = typingsSlinky.awsSdk.iamMod._encodingType | java.lang.String
  type entityDetailsListType = js.Array[typingsSlinky.awsSdk.iamMod.EntityDetails]
  type entityListType = js.Array[typingsSlinky.awsSdk.iamMod.EntityType]
  type entityNameType = java.lang.String
  type existingUserNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.v1Token
    - typingsSlinky.awsSdk.awsSdkStrings.v2Token
    - java.lang.String
  */
  type globalEndpointTokenVersion = typingsSlinky.awsSdk.iamMod._globalEndpointTokenVersion | java.lang.String
  type groupDetailListType = js.Array[typingsSlinky.awsSdk.iamMod.GroupDetail]
  type groupListType = js.Array[typingsSlinky.awsSdk.iamMod.Group]
  type groupNameListType = js.Array[typingsSlinky.awsSdk.iamMod.groupNameType]
  type groupNameType = java.lang.String
  type idType = java.lang.String
  type instanceProfileListType = js.Array[typingsSlinky.awsSdk.iamMod.InstanceProfile]
  type instanceProfileNameType = java.lang.String
  type integerType = scala.Double
  type jobIDType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type jobStatusType = typingsSlinky.awsSdk.iamMod._jobStatusType | java.lang.String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[typingsSlinky.awsSdk.iamMod.ListPoliciesGrantingServiceAccessEntry]
  type markerType = java.lang.String
  type maxItemsType = scala.Double
  type maxPasswordAgeType = scala.Double
  type mfaDeviceListType = js.Array[typingsSlinky.awsSdk.iamMod.MFADevice]
  type minimumPasswordLengthType = scala.Double
  type organizationsEntityPathType = java.lang.String
  type organizationsPolicyIdType = java.lang.String
  type passwordReusePreventionType = scala.Double
  type passwordType = java.lang.String
  type pathPrefixType = java.lang.String
  type pathType = java.lang.String
  type policyDescriptionType = java.lang.String
  type policyDetailListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyDetail]
  type policyDocumentType = java.lang.String
  type policyDocumentVersionListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyVersion]
  type policyGrantingServiceAccessListType = js.Array[typingsSlinky.awsSdk.iamMod.PolicyGrantingServiceAccess]
  type policyListType = js.Array[typingsSlinky.awsSdk.iamMod.Policy]
  type policyNameListType = js.Array[typingsSlinky.awsSdk.iamMod.policyNameType]
  type policyNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.ROLE
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type policyOwnerEntityType = typingsSlinky.awsSdk.iamMod._policyOwnerEntityType | java.lang.String
  type policyPathType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - typingsSlinky.awsSdk.awsSdkStrings.AWS
    - typingsSlinky.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type policyScopeType = typingsSlinky.awsSdk.iamMod._policyScopeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INLINE
    - typingsSlinky.awsSdk.awsSdkStrings.MANAGED
    - java.lang.String
  */
  type policyType = typingsSlinky.awsSdk.iamMod._policyType | java.lang.String
  type policyVersionIdType = java.lang.String
  type privateKeyType = java.lang.String
  type publicKeyFingerprintType = java.lang.String
  type publicKeyIdType = java.lang.String
  type publicKeyMaterialType = java.lang.String
  type responseMarkerType = java.lang.String
  type roleDescriptionType = java.lang.String
  type roleDetailListType = js.Array[typingsSlinky.awsSdk.iamMod.RoleDetail]
  type roleListType = js.Array[typingsSlinky.awsSdk.iamMod.Role]
  type roleMaxSessionDurationType = scala.Double
  type roleNameType = java.lang.String
  type serialNumberType = java.lang.String
  type serverCertificateMetadataListType = js.Array[typingsSlinky.awsSdk.iamMod.ServerCertificateMetadata]
  type serverCertificateNameType = java.lang.String
  type serviceName = java.lang.String
  type serviceNameType = java.lang.String
  type serviceNamespaceListType = js.Array[typingsSlinky.awsSdk.iamMod.serviceNamespaceType]
  type serviceNamespaceType = java.lang.String
  type servicePassword = java.lang.String
  type serviceSpecificCredentialId = java.lang.String
  type serviceUserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_DESCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
    - java.lang.String
  */
  type sortKeyType = typingsSlinky.awsSdk.iamMod._sortKeyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type statusType = typingsSlinky.awsSdk.iamMod._statusType | java.lang.String
  type stringType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Users
    - typingsSlinky.awsSdk.awsSdkStrings.UsersQuota
    - typingsSlinky.awsSdk.awsSdkStrings.Groups
    - typingsSlinky.awsSdk.awsSdkStrings.GroupsQuota
    - typingsSlinky.awsSdk.awsSdkStrings.ServerCertificates
    - typingsSlinky.awsSdk.awsSdkStrings.ServerCertificatesQuota
    - typingsSlinky.awsSdk.awsSdkStrings.UserPolicySizeQuota
    - typingsSlinky.awsSdk.awsSdkStrings.GroupPolicySizeQuota
    - typingsSlinky.awsSdk.awsSdkStrings.GroupsPerUserQuota
    - typingsSlinky.awsSdk.awsSdkStrings.SigningCertificatesPerUserQuota
    - typingsSlinky.awsSdk.awsSdkStrings.AccessKeysPerUserQuota
    - typingsSlinky.awsSdk.awsSdkStrings.MFADevices
    - typingsSlinky.awsSdk.awsSdkStrings.MFADevicesInUse
    - typingsSlinky.awsSdk.awsSdkStrings.AccountMFAEnabled
    - typingsSlinky.awsSdk.awsSdkStrings.AccountAccessKeysPresent
    - typingsSlinky.awsSdk.awsSdkStrings.AccountSigningCertificatesPresent
    - typingsSlinky.awsSdk.awsSdkStrings.AttachedPoliciesPerGroupQuota
    - typingsSlinky.awsSdk.awsSdkStrings.AttachedPoliciesPerRoleQuota
    - typingsSlinky.awsSdk.awsSdkStrings.AttachedPoliciesPerUserQuota
    - typingsSlinky.awsSdk.awsSdkStrings.Policies
    - typingsSlinky.awsSdk.awsSdkStrings.PoliciesQuota
    - typingsSlinky.awsSdk.awsSdkStrings.PolicySizeQuota
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyVersionsInUse
    - typingsSlinky.awsSdk.awsSdkStrings.PolicyVersionsInUseQuota
    - typingsSlinky.awsSdk.awsSdkStrings.VersionsPerPolicyQuota
    - typingsSlinky.awsSdk.awsSdkStrings.GlobalEndpointTokenVersion
    - java.lang.String
  */
  type summaryKeyType = typingsSlinky.awsSdk.iamMod._summaryKeyType | java.lang.String
  type summaryMapType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.iamMod.summaryValueType]
  type summaryValueType = scala.Double
  type tagKeyListType = js.Array[typingsSlinky.awsSdk.iamMod.tagKeyType]
  type tagKeyType = java.lang.String
  type tagListType = js.Array[typingsSlinky.awsSdk.iamMod.Tag]
  type tagValueType = java.lang.String
  type thumbprintListType = js.Array[typingsSlinky.awsSdk.iamMod.thumbprintType]
  type thumbprintType = java.lang.String
  type userDetailListType = js.Array[typingsSlinky.awsSdk.iamMod.UserDetail]
  type userListType = js.Array[typingsSlinky.awsSdk.iamMod.User]
  type userNameType = java.lang.String
  type virtualMFADeviceListType = js.Array[typingsSlinky.awsSdk.iamMod.VirtualMFADevice]
  type virtualMFADeviceName = java.lang.String
}
