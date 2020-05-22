package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wafv2Mod {
  type Action = java.lang.String
  type Boolean = scala.Boolean
  type CapacityUnit = scala.Double
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.wafv2Mod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.LE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.wafv2Mod._ComparisonOperator | java.lang.String
  type ConsumedCapacity = scala.Double
  type Country = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AF
    - typingsSlinky.awsSdk.awsSdkStrings.AX
    - typingsSlinky.awsSdk.awsSdkStrings.AL
    - typingsSlinky.awsSdk.awsSdkStrings.DZ
    - typingsSlinky.awsSdk.awsSdkStrings.AS
    - typingsSlinky.awsSdk.awsSdkStrings.AD
    - typingsSlinky.awsSdk.awsSdkStrings.AO
    - typingsSlinky.awsSdk.awsSdkStrings.AI
    - typingsSlinky.awsSdk.awsSdkStrings.AQ
    - typingsSlinky.awsSdk.awsSdkStrings.AG
    - typingsSlinky.awsSdk.awsSdkStrings.AR
    - typingsSlinky.awsSdk.awsSdkStrings.AM
    - typingsSlinky.awsSdk.awsSdkStrings.AW
    - typingsSlinky.awsSdk.awsSdkStrings.AU
    - typingsSlinky.awsSdk.awsSdkStrings.AT
    - typingsSlinky.awsSdk.awsSdkStrings.AZ
    - typingsSlinky.awsSdk.awsSdkStrings.BS
    - typingsSlinky.awsSdk.awsSdkStrings.BH
    - typingsSlinky.awsSdk.awsSdkStrings.BD
    - typingsSlinky.awsSdk.awsSdkStrings.BB
    - typingsSlinky.awsSdk.awsSdkStrings.BY
    - typingsSlinky.awsSdk.awsSdkStrings.BE
    - typingsSlinky.awsSdk.awsSdkStrings.BZ
    - typingsSlinky.awsSdk.awsSdkStrings.BJ
    - typingsSlinky.awsSdk.awsSdkStrings.BM
    - typingsSlinky.awsSdk.awsSdkStrings.BT
    - typingsSlinky.awsSdk.awsSdkStrings.BO
    - typingsSlinky.awsSdk.awsSdkStrings.BQ
    - typingsSlinky.awsSdk.awsSdkStrings.BA
    - typingsSlinky.awsSdk.awsSdkStrings.BW
    - typingsSlinky.awsSdk.awsSdkStrings.BV
    - typingsSlinky.awsSdk.awsSdkStrings.BR
    - typingsSlinky.awsSdk.awsSdkStrings.IO
    - typingsSlinky.awsSdk.awsSdkStrings.BN
    - typingsSlinky.awsSdk.awsSdkStrings.BG
    - typingsSlinky.awsSdk.awsSdkStrings.BF
    - typingsSlinky.awsSdk.awsSdkStrings.BI
    - typingsSlinky.awsSdk.awsSdkStrings.KH
    - typingsSlinky.awsSdk.awsSdkStrings.CM
    - typingsSlinky.awsSdk.awsSdkStrings.CA
    - typingsSlinky.awsSdk.awsSdkStrings.CV
    - typingsSlinky.awsSdk.awsSdkStrings.KY
    - typingsSlinky.awsSdk.awsSdkStrings.CF
    - typingsSlinky.awsSdk.awsSdkStrings.TD
    - typingsSlinky.awsSdk.awsSdkStrings.CL
    - typingsSlinky.awsSdk.awsSdkStrings.CN
    - typingsSlinky.awsSdk.awsSdkStrings.CX
    - typingsSlinky.awsSdk.awsSdkStrings.CC
    - typingsSlinky.awsSdk.awsSdkStrings.CO
    - typingsSlinky.awsSdk.awsSdkStrings.KM
    - typingsSlinky.awsSdk.awsSdkStrings.CG
    - typingsSlinky.awsSdk.awsSdkStrings.CD
    - typingsSlinky.awsSdk.awsSdkStrings.CK
    - typingsSlinky.awsSdk.awsSdkStrings.CR
    - typingsSlinky.awsSdk.awsSdkStrings.CI
    - typingsSlinky.awsSdk.awsSdkStrings.HR
    - typingsSlinky.awsSdk.awsSdkStrings.CU
    - typingsSlinky.awsSdk.awsSdkStrings.CW
    - typingsSlinky.awsSdk.awsSdkStrings.CY
    - typingsSlinky.awsSdk.awsSdkStrings.CZ
    - typingsSlinky.awsSdk.awsSdkStrings.DK
    - typingsSlinky.awsSdk.awsSdkStrings.DJ
    - typingsSlinky.awsSdk.awsSdkStrings.DM
    - typingsSlinky.awsSdk.awsSdkStrings.DO
    - typingsSlinky.awsSdk.awsSdkStrings.EC
    - typingsSlinky.awsSdk.awsSdkStrings.EG
    - typingsSlinky.awsSdk.awsSdkStrings.SV
    - typingsSlinky.awsSdk.awsSdkStrings.GQ
    - typingsSlinky.awsSdk.awsSdkStrings.ER
    - typingsSlinky.awsSdk.awsSdkStrings.EE
    - typingsSlinky.awsSdk.awsSdkStrings.ET
    - typingsSlinky.awsSdk.awsSdkStrings.FK
    - typingsSlinky.awsSdk.awsSdkStrings.FO
    - typingsSlinky.awsSdk.awsSdkStrings.FJ
    - typingsSlinky.awsSdk.awsSdkStrings.FI
    - typingsSlinky.awsSdk.awsSdkStrings.FR
    - typingsSlinky.awsSdk.awsSdkStrings.GF
    - typingsSlinky.awsSdk.awsSdkStrings.PF
    - typingsSlinky.awsSdk.awsSdkStrings.TF
    - typingsSlinky.awsSdk.awsSdkStrings.GA
    - typingsSlinky.awsSdk.awsSdkStrings.GM
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.DE
    - typingsSlinky.awsSdk.awsSdkStrings.GH
    - typingsSlinky.awsSdk.awsSdkStrings.GI
    - typingsSlinky.awsSdk.awsSdkStrings.GR
    - typingsSlinky.awsSdk.awsSdkStrings.GL
    - typingsSlinky.awsSdk.awsSdkStrings.GD
    - typingsSlinky.awsSdk.awsSdkStrings.GP
    - typingsSlinky.awsSdk.awsSdkStrings.GU
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.GG
    - typingsSlinky.awsSdk.awsSdkStrings.GN
    - typingsSlinky.awsSdk.awsSdkStrings.GW
    - typingsSlinky.awsSdk.awsSdkStrings.GY
    - typingsSlinky.awsSdk.awsSdkStrings.HT
    - typingsSlinky.awsSdk.awsSdkStrings.HM
    - typingsSlinky.awsSdk.awsSdkStrings.VA
    - typingsSlinky.awsSdk.awsSdkStrings.HN
    - typingsSlinky.awsSdk.awsSdkStrings.HK
    - typingsSlinky.awsSdk.awsSdkStrings.HU
    - typingsSlinky.awsSdk.awsSdkStrings.IS
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.ID
    - typingsSlinky.awsSdk.awsSdkStrings.IR
    - typingsSlinky.awsSdk.awsSdkStrings.IQ
    - typingsSlinky.awsSdk.awsSdkStrings.IE
    - typingsSlinky.awsSdk.awsSdkStrings.IM
    - typingsSlinky.awsSdk.awsSdkStrings.IL
    - typingsSlinky.awsSdk.awsSdkStrings.IT
    - typingsSlinky.awsSdk.awsSdkStrings.JM
    - typingsSlinky.awsSdk.awsSdkStrings.JP
    - typingsSlinky.awsSdk.awsSdkStrings.JE
    - typingsSlinky.awsSdk.awsSdkStrings.JO
    - typingsSlinky.awsSdk.awsSdkStrings.KZ
    - typingsSlinky.awsSdk.awsSdkStrings.KE
    - typingsSlinky.awsSdk.awsSdkStrings.KI
    - typingsSlinky.awsSdk.awsSdkStrings.KP
    - typingsSlinky.awsSdk.awsSdkStrings.KR
    - typingsSlinky.awsSdk.awsSdkStrings.KW
    - typingsSlinky.awsSdk.awsSdkStrings.KG
    - typingsSlinky.awsSdk.awsSdkStrings.LA
    - typingsSlinky.awsSdk.awsSdkStrings.LV
    - typingsSlinky.awsSdk.awsSdkStrings.LB
    - typingsSlinky.awsSdk.awsSdkStrings.LS
    - typingsSlinky.awsSdk.awsSdkStrings.LR
    - typingsSlinky.awsSdk.awsSdkStrings.LY
    - typingsSlinky.awsSdk.awsSdkStrings.LI
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.LU
    - typingsSlinky.awsSdk.awsSdkStrings.MO
    - typingsSlinky.awsSdk.awsSdkStrings.MK
    - typingsSlinky.awsSdk.awsSdkStrings.MG
    - typingsSlinky.awsSdk.awsSdkStrings.MW
    - typingsSlinky.awsSdk.awsSdkStrings.MY
    - typingsSlinky.awsSdk.awsSdkStrings.MV
    - typingsSlinky.awsSdk.awsSdkStrings.ML
    - typingsSlinky.awsSdk.awsSdkStrings.MT
    - typingsSlinky.awsSdk.awsSdkStrings.MH
    - typingsSlinky.awsSdk.awsSdkStrings.MQ
    - typingsSlinky.awsSdk.awsSdkStrings.MR
    - typingsSlinky.awsSdk.awsSdkStrings.MU
    - typingsSlinky.awsSdk.awsSdkStrings.YT
    - typingsSlinky.awsSdk.awsSdkStrings.MX
    - typingsSlinky.awsSdk.awsSdkStrings.FM
    - typingsSlinky.awsSdk.awsSdkStrings.MD
    - typingsSlinky.awsSdk.awsSdkStrings.MC
    - typingsSlinky.awsSdk.awsSdkStrings.MN
    - typingsSlinky.awsSdk.awsSdkStrings.ME
    - typingsSlinky.awsSdk.awsSdkStrings.MS
    - typingsSlinky.awsSdk.awsSdkStrings.MA
    - typingsSlinky.awsSdk.awsSdkStrings.MZ
    - typingsSlinky.awsSdk.awsSdkStrings.MM
    - typingsSlinky.awsSdk.awsSdkStrings.NA
    - typingsSlinky.awsSdk.awsSdkStrings.NR
    - typingsSlinky.awsSdk.awsSdkStrings.NP
    - typingsSlinky.awsSdk.awsSdkStrings.NL
    - typingsSlinky.awsSdk.awsSdkStrings.NC
    - typingsSlinky.awsSdk.awsSdkStrings.NZ
    - typingsSlinky.awsSdk.awsSdkStrings.NI
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.NG
    - typingsSlinky.awsSdk.awsSdkStrings.NU
    - typingsSlinky.awsSdk.awsSdkStrings.NF
    - typingsSlinky.awsSdk.awsSdkStrings.MP
    - typingsSlinky.awsSdk.awsSdkStrings.NO
    - typingsSlinky.awsSdk.awsSdkStrings.OM
    - typingsSlinky.awsSdk.awsSdkStrings.PK
    - typingsSlinky.awsSdk.awsSdkStrings.PW
    - typingsSlinky.awsSdk.awsSdkStrings.PS
    - typingsSlinky.awsSdk.awsSdkStrings.PA
    - typingsSlinky.awsSdk.awsSdkStrings.PG
    - typingsSlinky.awsSdk.awsSdkStrings.PY
    - typingsSlinky.awsSdk.awsSdkStrings.PE
    - typingsSlinky.awsSdk.awsSdkStrings.PH
    - typingsSlinky.awsSdk.awsSdkStrings.PN
    - typingsSlinky.awsSdk.awsSdkStrings.PL
    - typingsSlinky.awsSdk.awsSdkStrings.PT
    - typingsSlinky.awsSdk.awsSdkStrings.PR
    - typingsSlinky.awsSdk.awsSdkStrings.QA
    - typingsSlinky.awsSdk.awsSdkStrings.RE
    - typingsSlinky.awsSdk.awsSdkStrings.RO
    - typingsSlinky.awsSdk.awsSdkStrings.RU
    - typingsSlinky.awsSdk.awsSdkStrings.RW
    - typingsSlinky.awsSdk.awsSdkStrings.BL
    - typingsSlinky.awsSdk.awsSdkStrings.SH
    - typingsSlinky.awsSdk.awsSdkStrings.KN
    - typingsSlinky.awsSdk.awsSdkStrings.LC
    - typingsSlinky.awsSdk.awsSdkStrings.MF
    - typingsSlinky.awsSdk.awsSdkStrings.PM
    - typingsSlinky.awsSdk.awsSdkStrings.VC
    - typingsSlinky.awsSdk.awsSdkStrings.WS
    - typingsSlinky.awsSdk.awsSdkStrings.SM
    - typingsSlinky.awsSdk.awsSdkStrings.ST
    - typingsSlinky.awsSdk.awsSdkStrings.SA
    - typingsSlinky.awsSdk.awsSdkStrings.SN
    - typingsSlinky.awsSdk.awsSdkStrings.RS
    - typingsSlinky.awsSdk.awsSdkStrings.SC
    - typingsSlinky.awsSdk.awsSdkStrings.SL
    - typingsSlinky.awsSdk.awsSdkStrings.SG
    - typingsSlinky.awsSdk.awsSdkStrings.SX
    - typingsSlinky.awsSdk.awsSdkStrings.SK
    - typingsSlinky.awsSdk.awsSdkStrings.SI
    - typingsSlinky.awsSdk.awsSdkStrings.SB
    - typingsSlinky.awsSdk.awsSdkStrings.SO
    - typingsSlinky.awsSdk.awsSdkStrings.ZA
    - typingsSlinky.awsSdk.awsSdkStrings.GS
    - typingsSlinky.awsSdk.awsSdkStrings.SS
    - typingsSlinky.awsSdk.awsSdkStrings.ES
    - typingsSlinky.awsSdk.awsSdkStrings.LK
    - typingsSlinky.awsSdk.awsSdkStrings.SD
    - typingsSlinky.awsSdk.awsSdkStrings.SR
    - typingsSlinky.awsSdk.awsSdkStrings.SJ
    - typingsSlinky.awsSdk.awsSdkStrings.SZ
    - typingsSlinky.awsSdk.awsSdkStrings.SE
    - typingsSlinky.awsSdk.awsSdkStrings.CH
    - typingsSlinky.awsSdk.awsSdkStrings.SY
    - typingsSlinky.awsSdk.awsSdkStrings.TW
    - typingsSlinky.awsSdk.awsSdkStrings.TJ
    - typingsSlinky.awsSdk.awsSdkStrings.TZ
    - typingsSlinky.awsSdk.awsSdkStrings.TH
    - typingsSlinky.awsSdk.awsSdkStrings.TL
    - typingsSlinky.awsSdk.awsSdkStrings.TG
    - typingsSlinky.awsSdk.awsSdkStrings.TK
    - typingsSlinky.awsSdk.awsSdkStrings.TO
    - typingsSlinky.awsSdk.awsSdkStrings.TT
    - typingsSlinky.awsSdk.awsSdkStrings.TN
    - typingsSlinky.awsSdk.awsSdkStrings.TR
    - typingsSlinky.awsSdk.awsSdkStrings.TM
    - typingsSlinky.awsSdk.awsSdkStrings.TC
    - typingsSlinky.awsSdk.awsSdkStrings.TV
    - typingsSlinky.awsSdk.awsSdkStrings.UG
    - typingsSlinky.awsSdk.awsSdkStrings.UA
    - typingsSlinky.awsSdk.awsSdkStrings.AE
    - typingsSlinky.awsSdk.awsSdkStrings.GB
    - typingsSlinky.awsSdk.awsSdkStrings.US
    - typingsSlinky.awsSdk.awsSdkStrings.UM
    - typingsSlinky.awsSdk.awsSdkStrings.UY
    - typingsSlinky.awsSdk.awsSdkStrings.UZ
    - typingsSlinky.awsSdk.awsSdkStrings.VU
    - typingsSlinky.awsSdk.awsSdkStrings.VE
    - typingsSlinky.awsSdk.awsSdkStrings.VN
    - typingsSlinky.awsSdk.awsSdkStrings.VG
    - typingsSlinky.awsSdk.awsSdkStrings.VI
    - typingsSlinky.awsSdk.awsSdkStrings.WF
    - typingsSlinky.awsSdk.awsSdkStrings.EH
    - typingsSlinky.awsSdk.awsSdkStrings.YE
    - typingsSlinky.awsSdk.awsSdkStrings.ZM
    - typingsSlinky.awsSdk.awsSdkStrings.ZW
    - java.lang.String
  */
  type CountryCode = typingsSlinky.awsSdk.wafv2Mod._CountryCode | java.lang.String
  type CountryCodes = js.Array[typingsSlinky.awsSdk.wafv2Mod.CountryCode]
  type EntityDescription = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  type ExcludedRules = js.Array[typingsSlinky.awsSdk.wafv2Mod.ExcludedRule]
  type FieldToMatchData = java.lang.String
  type FirewallManagerRuleGroups = js.Array[typingsSlinky.awsSdk.wafv2Mod.FirewallManagerRuleGroup]
  type HTTPHeaders = js.Array[typingsSlinky.awsSdk.wafv2Mod.HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type IPAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IPV4
    - typingsSlinky.awsSdk.awsSdkStrings.IPV6
    - java.lang.String
  */
  type IPAddressVersion = typingsSlinky.awsSdk.wafv2Mod._IPAddressVersion | java.lang.String
  type IPAddresses = js.Array[typingsSlinky.awsSdk.wafv2Mod.IPAddress]
  type IPSetSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.IPSetSummary]
  type IPString = java.lang.String
  type ListMaxItems = scala.Double
  type LockToken = java.lang.String
  type LogDestinationConfigs = js.Array[typingsSlinky.awsSdk.wafv2Mod.ResourceArn]
  type LoggingConfigurations = js.Array[typingsSlinky.awsSdk.wafv2Mod.LoggingConfiguration]
  type ManagedRuleGroupSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.ManagedRuleGroupSummary]
  type MetricName = java.lang.String
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PolicyString = java.lang.String
  type PopulationSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXACTLY
    - typingsSlinky.awsSdk.awsSdkStrings.STARTS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.ENDS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS_WORD
    - java.lang.String
  */
  type PositionalConstraint = typingsSlinky.awsSdk.wafv2Mod._PositionalConstraint | java.lang.String
  type RateBasedStatementAggregateKeyType = typingsSlinky.awsSdk.awsSdkStrings.IP | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[typingsSlinky.awsSdk.wafv2Mod.FieldToMatch]
  type RegexPatternSetSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.RegexPatternSetSummary]
  type RegexPatternString = java.lang.String
  type RegularExpressionList = js.Array[typingsSlinky.awsSdk.wafv2Mod.Regex]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typingsSlinky.awsSdk.wafv2Mod.ResourceArn]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
    - typingsSlinky.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.wafv2Mod._ResourceType | java.lang.String
  type RuleGroupSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.RuleGroupSummary]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.RuleSummary]
  type Rules = js.Array[typingsSlinky.awsSdk.wafv2Mod.Rule]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[typingsSlinky.awsSdk.wafv2Mod.SampledHTTPRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFRONT
    - typingsSlinky.awsSdk.awsSdkStrings.REGIONAL
    - java.lang.String
  */
  type Scope = typingsSlinky.awsSdk.wafv2Mod._Scope | java.lang.String
  type SearchString = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.wafv2Mod.Blob | java.lang.String
  type Size = scala.Double
  type Statements = js.Array[typingsSlinky.awsSdk.wafv2Mod.Statement]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.wafv2Mod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.wafv2Mod.Tag]
  type TagValue = java.lang.String
  type TextTransformationPriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
    - typingsSlinky.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
    - typingsSlinky.awsSdk.awsSdkStrings.LOWERCASE
    - typingsSlinky.awsSdk.awsSdkStrings.CMD_LINE
    - typingsSlinky.awsSdk.awsSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformationType = typingsSlinky.awsSdk.wafv2Mod._TextTransformationType | java.lang.String
  type TextTransformations = js.Array[typingsSlinky.awsSdk.wafv2Mod.TextTransformation]
  type Timestamp = js.Date
  type URIString = java.lang.String
  type VendorName = java.lang.String
  type WebACLSummaries = js.Array[typingsSlinky.awsSdk.wafv2Mod.WebACLSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-07-29`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.wafv2Mod._apiVersion | java.lang.String
}
