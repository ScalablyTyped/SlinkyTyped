package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wafMod {
  
  type Action = java.lang.String
  
  type ActivatedRules = js.Array[typingsSlinky.awsSdk.wafMod.ActivatedRule]
  
  type ByteMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchSetSummary]
  
  type ByteMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchSetUpdate]
  
  type ByteMatchTargetString = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.wafMod.Blob | java.lang.String
  
  type ByteMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.ByteMatchTuple]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INSERT
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeAction = typingsSlinky.awsSdk.wafMod._ChangeAction | java.lang.String
  
  type ChangeToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeTokenStatus = typingsSlinky.awsSdk.wafMod._ChangeTokenStatus | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.wafMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.LE
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = typingsSlinky.awsSdk.wafMod._ComparisonOperator | java.lang.String
  
  type Country = java.lang.String
  
  type ExcludedRules = js.Array[typingsSlinky.awsSdk.wafMod.ExcludedRule]
  
  type GeoMatchConstraintType = typingsSlinky.awsSdk.awsSdkStrings.Country_ | java.lang.String
  
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
  type GeoMatchConstraintValue = typingsSlinky.awsSdk.wafMod._GeoMatchConstraintValue | java.lang.String
  
  type GeoMatchConstraints = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchConstraint]
  
  type GeoMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchSetSummary]
  
  type GeoMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.GeoMatchSetUpdate]
  
  type GetSampledRequestsMaxItems = scala.Double
  
  type HTTPHeaders = js.Array[typingsSlinky.awsSdk.wafMod.HTTPHeader]
  
  type HTTPMethod = java.lang.String
  
  type HTTPVersion = java.lang.String
  
  type HeaderName = java.lang.String
  
  type HeaderValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IPV4
    - typingsSlinky.awsSdk.awsSdkStrings.IPV6
    - java.lang.String
  */
  type IPSetDescriptorType = typingsSlinky.awsSdk.wafMod._IPSetDescriptorType | java.lang.String
  
  type IPSetDescriptorValue = java.lang.String
  
  type IPSetDescriptors = js.Array[typingsSlinky.awsSdk.wafMod.IPSetDescriptor]
  
  type IPSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.IPSetSummary]
  
  type IPSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.IPSetUpdate]
  
  type IPString = java.lang.String
  
  type IgnoreUnsupportedType = scala.Boolean
  
  type LogDestinationConfigs = js.Array[typingsSlinky.awsSdk.wafMod.ResourceArn]
  
  type LoggingConfigurations = js.Array[typingsSlinky.awsSdk.wafMod.LoggingConfiguration]
  
  type ManagedKey = java.lang.String
  
  type ManagedKeys = js.Array[typingsSlinky.awsSdk.wafMod.ManagedKey]
  
  type MatchFieldData = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.URI
    - typingsSlinky.awsSdk.awsSdkStrings.QUERY_STRING
    - typingsSlinky.awsSdk.awsSdkStrings.HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.METHOD
    - typingsSlinky.awsSdk.awsSdkStrings.BODY
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_QUERY_ARG
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_QUERY_ARGS
    - java.lang.String
  */
  type MatchFieldType = typingsSlinky.awsSdk.wafMod._MatchFieldType | java.lang.String
  
  type MetricName = java.lang.String
  
  type Negated = scala.Boolean
  
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
  type PositionalConstraint = typingsSlinky.awsSdk.wafMod._PositionalConstraint | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IPMatch
    - typingsSlinky.awsSdk.awsSdkStrings.ByteMatch
    - typingsSlinky.awsSdk.awsSdkStrings.SqlInjectionMatch
    - typingsSlinky.awsSdk.awsSdkStrings.GeoMatch
    - typingsSlinky.awsSdk.awsSdkStrings.SizeConstraint
    - typingsSlinky.awsSdk.awsSdkStrings.XssMatch
    - typingsSlinky.awsSdk.awsSdkStrings.RegexMatch
    - java.lang.String
  */
  type PredicateType = typingsSlinky.awsSdk.wafMod._PredicateType | java.lang.String
  
  type Predicates = js.Array[typingsSlinky.awsSdk.wafMod.Predicate]
  
  type RateKey = typingsSlinky.awsSdk.awsSdkStrings.IP | java.lang.String
  
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
  
  type S3BucketName = java.lang.String
  
  type S3ObjectUrl = java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
    - typingsSlinky.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
    - typingsSlinky.awsSdk.awsSdkStrings.LOWERCASE
    - typingsSlinky.awsSdk.awsSdkStrings.CMD_LINE
    - typingsSlinky.awsSdk.awsSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformation = typingsSlinky.awsSdk.wafMod._TextTransformation | java.lang.String
  
  type Timestamp = js.Date
  
  type URIString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BLOCK
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type WafActionType = typingsSlinky.awsSdk.wafMod._WafActionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type WafOverrideActionType = typingsSlinky.awsSdk.wafMod._WafOverrideActionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGULAR
    - typingsSlinky.awsSdk.awsSdkStrings.RATE_BASED
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type WafRuleType = typingsSlinky.awsSdk.wafMod._WafRuleType | java.lang.String
  
  type WebACLSummaries = js.Array[typingsSlinky.awsSdk.wafMod.WebACLSummary]
  
  type WebACLUpdates = js.Array[typingsSlinky.awsSdk.wafMod.WebACLUpdate]
  
  type XssMatchSetSummaries = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchSetSummary]
  
  type XssMatchSetUpdates = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchSetUpdate]
  
  type XssMatchTuples = js.Array[typingsSlinky.awsSdk.wafMod.XssMatchTuple]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-08-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.wafMod._apiVersion | java.lang.String
}
