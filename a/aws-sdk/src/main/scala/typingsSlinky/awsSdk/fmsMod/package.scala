package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.fmsMod.ClientApiVersions
  type ComplianceViolators = js.Array[typingsSlinky.awsSdk.fmsMod.ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[typingsSlinky.awsSdk.fmsMod.CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
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
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.DetailedInfo]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[typingsSlinky.awsSdk.fmsMod.AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
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
  type ProtectionData = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceCount = scala.Double
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceTagKey = java.lang.String
  type ResourceTagValue = java.lang.String
  type ResourceTags = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceTag]
  type ResourceType = java.lang.String
  type ResourceTypeList = js.Array[typingsSlinky.awsSdk.fmsMod.ResourceType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WAF
    - typingsSlinky.awsSdk.awsSdkStrings.SHIELD_ADVANCED
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_COMMON
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
    - java.lang.String
  */
  type SecurityServiceType = typingsSlinky.awsSdk.fmsMod._SecurityServiceType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.fmsMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.fmsMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
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
    - java.lang.String
  */
  type ViolationReason = typingsSlinky.awsSdk.fmsMod._ViolationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-01-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.fmsMod._apiVersion | java.lang.String
}
