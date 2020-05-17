package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wafMod {
  type Action = java.lang.String
  type ActivatedRules = js.Array[typingsSlinky.awsSdk.wafMod.ActivatedRule]
  type ByteMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchSetUpdate]
  type ByteMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchTuple]
  type ChangeToken = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.wafMod.ClientApiVersions
  type Country = java.lang.String
  type ExcludedRules = js.Array[typingsSlinky.awsSdk.wafMod.ExcludedRule]
  type GeoMatchConstraints = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = scala.Double
  type HTTPHeaders = js.Array[typingsSlinky.awsSdk.wafMod.HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type IPSetDescriptorValue = java.lang.String
  type IPSetDescriptors = js.Array[typingsSlinky.awsSdk.wafMod.IPSetDescriptor]
  type IPSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.IPSetSummary]
  type IPSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.IPSetUpdate]
  type IPString = java.lang.String
  type LogDestinationConfigs = js.Array[typingsSlinky.awsSdk.wafMod.ResourceArn]
  type LoggingConfigurations = js.Array[typingsSlinky.awsSdk.wafMod.LoggingConfiguration]
  type ManagedKey = java.lang.String
  type ManagedKeys = js.Array[typingsSlinky.awsSdk.wafMod.ManagedKey]
  type MatchFieldData = java.lang.String
  type MetricName = java.lang.String
  type Negated = scala.Boolean
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PolicyString = java.lang.String
  type PopulationSize = scala.Double
  type Predicates = js.Array[typingsSlinky.awsSdk.wafMod.Predicate]
  type RateLimit = scala.Double
  type RedactedFields = js.Array[typingsSlinky.awsSdk.wafMod.FieldToMatch]
  type RegexMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.RegexPatternSetUpdate]
  type RegexPatternString = java.lang.String
  type RegexPatternStrings = js.Array[typingsSlinky.awsSdk.wafMod.RegexPatternString]
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type RuleGroupSummaries = js.Array[typingsSlinky.awsSdk.wafMod.RuleGroupSummary]
  type RuleGroupUpdates = js.Array[typingsSlinky.awsSdk.wafMod.RuleGroupUpdate]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[typingsSlinky.awsSdk.wafMod.RuleSummary]
  type RuleUpdates = js.Array[typingsSlinky.awsSdk.wafMod.RuleUpdate]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[typingsSlinky.awsSdk.wafMod.SampledHTTPRequest]
  type Size = scala.Double
  type SizeConstraintSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[typingsSlinky.awsSdk.wafMod.SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[typingsSlinky.awsSdk.wafMod.SubscribedRuleGroupSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.wafMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.wafMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type URIString = java.lang.String
  type WebACLSummaries = js.Array[typingsSlinky.awsSdk.wafMod.WebACLSummary]
  type WebACLUpdates = js.Array[typingsSlinky.awsSdk.wafMod.WebACLUpdate]
  type XssMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchSetUpdate]
  type XssMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchTuple]
}
