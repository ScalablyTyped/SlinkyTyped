package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fmsMod {
  type AWSAccountId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.fmsMod.ClientApiVersions
  type ComplianceViolators = js.Array[typingsSlinky.awsSdk.fmsMod.ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[typingsSlinky.awsSdk.fmsMod.CustomerPolicyScopeId]
  type CustomerPolicyScopeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.CustomerPolicyScopeIdList]
  type DetailedInfo = java.lang.String
  type EvaluationResults = js.Array[typingsSlinky.awsSdk.fmsMod.EvaluationResult]
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.fmsMod.DetailedInfo]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[typingsSlinky.awsSdk.fmsMod.AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
  type PolicyComplianceStatusList = js.Array[typingsSlinky.awsSdk.fmsMod.PolicyComplianceStatus]
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
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.fmsMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.fmsMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
}
