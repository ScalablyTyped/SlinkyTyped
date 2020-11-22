package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fmsMod {
  
  type AWSAccountId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.READY
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETION
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type AccountRoleStatus = typingsSlinky.awsSdk.fmsMod._AccountRoleStatus | java.lang.String
  
  type AppsList = js.Array[typingsSlinky.awsSdk.fmsMod.App]
  
  type AppsListsData = js.Array[typingsSlinky.awsSdk.fmsMod.AppsListDataSummary]
  
  type AwsEc2NetworkInterfaceViolations = js.Array[typingsSlinky.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolation]
  
  type Boolean = scala.Boolean
  
  type CIDR = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.fmsMod.ClientApiVersions
  
  type ComplianceViolators = js.Array[typingsSlinky.awsSdk.fmsMod.ComplianceViolator]
  
  type CustomerPolicyScopeId = java.lang.String
  
  type CustomerPolicyScopeIdList = js.Array[typingsSlinky.awsSdk.fmsMod.CustomerPolicyScopeId]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ORG_UNIT
    - java.lang.String
  */
  type CustomerPolicyScopeIdType = typingsSlinky.awsSdk.fmsMod._CustomerPolicyScopeIdType | java.lang.String
  
  type CustomerPolicyScopeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.CustomerPolicyScopeIdList]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWSCONFIG
    - typingsSlinky.awsSdk.awsSdkStrings.AWSWAF
    - typingsSlinky.awsSdk.awsSdkStrings.AWSSHIELD_ADVANCED
    - typingsSlinky.awsSdk.awsSdkStrings.AWSVPC
    - java.lang.String
  */
  type DependentServiceName = typingsSlinky.awsSdk.fmsMod._DependentServiceName | java.lang.String
  
  type DetailedInfo = java.lang.String
  
  type EvaluationResults = js.Array[typingsSlinky.awsSdk.fmsMod.EvaluationResult]
  
  type IPPortNumber = scala.Double
  
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.DetailedInfo]
  
  type LengthBoundedString = java.lang.String
  
  type ListId = java.lang.String
  
  type ManagedServiceData = java.lang.String
  
  type MemberAccounts = js.Array[typingsSlinky.awsSdk.fmsMod.AWSAccountId]
  
  type NetworkFirewallAction = java.lang.String
  
  type NetworkFirewallActionList = js.Array[typingsSlinky.awsSdk.fmsMod.NetworkFirewallAction]
  
  type NetworkFirewallResourceName = java.lang.String
  
  type PaginationMaxResults = scala.Double
  
  type PaginationToken = java.lang.String
  
  type PartialMatches = js.Array[typingsSlinky.awsSdk.fmsMod.PartialMatch]
  
  type PolicyComplianceStatusList = js.Array[typingsSlinky.awsSdk.fmsMod.PolicyComplianceStatus]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT
    - typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type PolicyComplianceStatusType = typingsSlinky.awsSdk.fmsMod._PolicyComplianceStatusType | java.lang.String
  
  type PolicyId = java.lang.String
  
  type PolicySummaryList = js.Array[typingsSlinky.awsSdk.fmsMod.PolicySummary]
  
  type PolicyUpdateToken = java.lang.String
  
  type PreviousAppsList = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.AppsList]
  
  type PreviousListVersion = java.lang.String
  
  type PreviousProtocolsList = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.ProtocolsList]
  
  type ProtectionData = java.lang.String
  
  type Protocol = java.lang.String
  
  type ProtocolsList = js.Array[typingsSlinky.awsSdk.fmsMod.Protocol]
  
  type ProtocolsListsData = js.Array[typingsSlinky.awsSdk.fmsMod.ProtocolsListDataSummary]
  
  type ReferenceRule = java.lang.String
  
  type RemediationActionDescription = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
    - java.lang.String
  */
  type RemediationActionType = typingsSlinky.awsSdk.fmsMod._RemediationActionType | java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourceCount = scala.Double
  
  type ResourceId = java.lang.String
  
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceId]
  
  type ResourceName = java.lang.String
  
  type ResourceTagKey = java.lang.String
  
  type ResourceTagValue = java.lang.String
  
  type ResourceTags = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceTag]
  
  type ResourceType = java.lang.String
  
  type ResourceTypeList = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceType]
  
  type ResourceViolations = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceViolation]
  
  type SecurityGroupRemediationActions = js.Array[typingsSlinky.awsSdk.fmsMod.SecurityGroupRemediationAction]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WAF
    - typingsSlinky.awsSdk.awsSdkStrings.WAFV2
    - typingsSlinky.awsSdk.awsSdkStrings.SHIELD_ADVANCED
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_COMMON
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK_FIREWALL
    - java.lang.String
  */
  type SecurityServiceType = typingsSlinky.awsSdk.fmsMod._SecurityServiceType | java.lang.String
  
  type StatefulRuleGroupList = js.Array[typingsSlinky.awsSdk.fmsMod.StatefulRuleGroup]
  
  type StatelessRuleGroupList = js.Array[typingsSlinky.awsSdk.fmsMod.StatelessRuleGroup]
  
  type StatelessRuleGroupPriority = scala.Double
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.fmsMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.fmsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetViolationReason = java.lang.String
  
  type TargetViolationReasons = js.Array[typingsSlinky.awsSdk.fmsMod.TargetViolationReason]
  
  type TimeStamp = js.Date
  
  type UpdateToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WEB_ACL_MISSING_RULE_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_INCORRECT_WEB_ACL
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_MISSING_SHIELD_PROTECTION
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_MISSING_SECURITY_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUP_UNUSED
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUP_REDUNDANT
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_FIREWALL
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_FIREWALL_SUBNET_IN_AZ
    - typingsSlinky.awsSdk.awsSdkStrings.MISSING_EXPECTED_ROUTE_TABLE
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK_FIREWALL_POLICY_MODIFIED
    - java.lang.String
  */
  type ViolationReason = typingsSlinky.awsSdk.fmsMod._ViolationReason | java.lang.String
  
  type ViolationTarget = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.fmsMod._apiVersion | java.lang.String
}
