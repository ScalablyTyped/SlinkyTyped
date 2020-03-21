package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object route53domainsMod {
  type AddressLine = java.lang.String
  type BillingRecords = js.Array[typingsSlinky.awsSdk.route53domainsMod.BillingRecord]
  type Boolean = scala.Boolean
  type City = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.route53domainsMod.ClientApiVersions
  type ContactName = java.lang.String
  type ContactNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PERSON
    - typingsSlinky.awsSdk.awsSdkStrings.COMPANY
    - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATION
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC_BODY
    - typingsSlinky.awsSdk.awsSdkStrings.RESELLER
    - java.lang.String
  */
  type ContactType = typingsSlinky.awsSdk.route53domainsMod._ContactType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AD
    - typingsSlinky.awsSdk.awsSdkStrings.AE
    - typingsSlinky.awsSdk.awsSdkStrings.AF
    - typingsSlinky.awsSdk.awsSdkStrings.AG
    - typingsSlinky.awsSdk.awsSdkStrings.AI
    - typingsSlinky.awsSdk.awsSdkStrings.AL
    - typingsSlinky.awsSdk.awsSdkStrings.AM
    - typingsSlinky.awsSdk.awsSdkStrings.AN
    - typingsSlinky.awsSdk.awsSdkStrings.AO
    - typingsSlinky.awsSdk.awsSdkStrings.AQ
    - typingsSlinky.awsSdk.awsSdkStrings.AR
    - typingsSlinky.awsSdk.awsSdkStrings.AS
    - typingsSlinky.awsSdk.awsSdkStrings.AT
    - typingsSlinky.awsSdk.awsSdkStrings.AU
    - typingsSlinky.awsSdk.awsSdkStrings.AW
    - typingsSlinky.awsSdk.awsSdkStrings.AZ
    - typingsSlinky.awsSdk.awsSdkStrings.BA
    - typingsSlinky.awsSdk.awsSdkStrings.BB
    - typingsSlinky.awsSdk.awsSdkStrings.BD
    - typingsSlinky.awsSdk.awsSdkStrings.BE
    - typingsSlinky.awsSdk.awsSdkStrings.BF
    - typingsSlinky.awsSdk.awsSdkStrings.BG
    - typingsSlinky.awsSdk.awsSdkStrings.BH
    - typingsSlinky.awsSdk.awsSdkStrings.BI
    - typingsSlinky.awsSdk.awsSdkStrings.BJ
    - typingsSlinky.awsSdk.awsSdkStrings.BL
    - typingsSlinky.awsSdk.awsSdkStrings.BM
    - typingsSlinky.awsSdk.awsSdkStrings.BN
    - typingsSlinky.awsSdk.awsSdkStrings.BO
    - typingsSlinky.awsSdk.awsSdkStrings.BR
    - typingsSlinky.awsSdk.awsSdkStrings.BS
    - typingsSlinky.awsSdk.awsSdkStrings.BT
    - typingsSlinky.awsSdk.awsSdkStrings.BW
    - typingsSlinky.awsSdk.awsSdkStrings.BY
    - typingsSlinky.awsSdk.awsSdkStrings.BZ
    - typingsSlinky.awsSdk.awsSdkStrings.CA
    - typingsSlinky.awsSdk.awsSdkStrings.CC
    - typingsSlinky.awsSdk.awsSdkStrings.CD
    - typingsSlinky.awsSdk.awsSdkStrings.CF
    - typingsSlinky.awsSdk.awsSdkStrings.CG
    - typingsSlinky.awsSdk.awsSdkStrings.CH
    - typingsSlinky.awsSdk.awsSdkStrings.CI
    - typingsSlinky.awsSdk.awsSdkStrings.CK
    - typingsSlinky.awsSdk.awsSdkStrings.CL
    - typingsSlinky.awsSdk.awsSdkStrings.CM
    - typingsSlinky.awsSdk.awsSdkStrings.CN
    - typingsSlinky.awsSdk.awsSdkStrings.CO
    - typingsSlinky.awsSdk.awsSdkStrings.CR
    - typingsSlinky.awsSdk.awsSdkStrings.CU
    - typingsSlinky.awsSdk.awsSdkStrings.CV
    - typingsSlinky.awsSdk.awsSdkStrings.CX
    - typingsSlinky.awsSdk.awsSdkStrings.CY
    - typingsSlinky.awsSdk.awsSdkStrings.CZ
    - typingsSlinky.awsSdk.awsSdkStrings.DE
    - typingsSlinky.awsSdk.awsSdkStrings.DJ
    - typingsSlinky.awsSdk.awsSdkStrings.DK
    - typingsSlinky.awsSdk.awsSdkStrings.DM
    - typingsSlinky.awsSdk.awsSdkStrings.DO
    - typingsSlinky.awsSdk.awsSdkStrings.DZ
    - typingsSlinky.awsSdk.awsSdkStrings.EC
    - typingsSlinky.awsSdk.awsSdkStrings.EE
    - typingsSlinky.awsSdk.awsSdkStrings.EG
    - typingsSlinky.awsSdk.awsSdkStrings.ER
    - typingsSlinky.awsSdk.awsSdkStrings.ES
    - typingsSlinky.awsSdk.awsSdkStrings.ET
    - typingsSlinky.awsSdk.awsSdkStrings.FI
    - typingsSlinky.awsSdk.awsSdkStrings.FJ
    - typingsSlinky.awsSdk.awsSdkStrings.FK
    - typingsSlinky.awsSdk.awsSdkStrings.FM
    - typingsSlinky.awsSdk.awsSdkStrings.FO
    - typingsSlinky.awsSdk.awsSdkStrings.FR
    - typingsSlinky.awsSdk.awsSdkStrings.GA
    - typingsSlinky.awsSdk.awsSdkStrings.GB
    - typingsSlinky.awsSdk.awsSdkStrings.GD
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.GH
    - typingsSlinky.awsSdk.awsSdkStrings.GI
    - typingsSlinky.awsSdk.awsSdkStrings.GL
    - typingsSlinky.awsSdk.awsSdkStrings.GM
    - typingsSlinky.awsSdk.awsSdkStrings.GN
    - typingsSlinky.awsSdk.awsSdkStrings.GQ
    - typingsSlinky.awsSdk.awsSdkStrings.GR
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.GU
    - typingsSlinky.awsSdk.awsSdkStrings.GW
    - typingsSlinky.awsSdk.awsSdkStrings.GY
    - typingsSlinky.awsSdk.awsSdkStrings.HK
    - typingsSlinky.awsSdk.awsSdkStrings.HN
    - typingsSlinky.awsSdk.awsSdkStrings.HR
    - typingsSlinky.awsSdk.awsSdkStrings.HT
    - typingsSlinky.awsSdk.awsSdkStrings.HU
    - typingsSlinky.awsSdk.awsSdkStrings.ID
    - typingsSlinky.awsSdk.awsSdkStrings.IE
    - typingsSlinky.awsSdk.awsSdkStrings.IL
    - typingsSlinky.awsSdk.awsSdkStrings.IM
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.IQ
    - typingsSlinky.awsSdk.awsSdkStrings.IR
    - typingsSlinky.awsSdk.awsSdkStrings.IS
    - typingsSlinky.awsSdk.awsSdkStrings.IT
    - typingsSlinky.awsSdk.awsSdkStrings.JM
    - typingsSlinky.awsSdk.awsSdkStrings.JO
    - typingsSlinky.awsSdk.awsSdkStrings.JP
    - typingsSlinky.awsSdk.awsSdkStrings.KE
    - typingsSlinky.awsSdk.awsSdkStrings.KG
    - typingsSlinky.awsSdk.awsSdkStrings.KH
    - typingsSlinky.awsSdk.awsSdkStrings.KI
    - typingsSlinky.awsSdk.awsSdkStrings.KM
    - typingsSlinky.awsSdk.awsSdkStrings.KN
    - typingsSlinky.awsSdk.awsSdkStrings.KP
    - typingsSlinky.awsSdk.awsSdkStrings.KR
    - typingsSlinky.awsSdk.awsSdkStrings.KW
    - typingsSlinky.awsSdk.awsSdkStrings.KY
    - typingsSlinky.awsSdk.awsSdkStrings.KZ
    - typingsSlinky.awsSdk.awsSdkStrings.LA
    - typingsSlinky.awsSdk.awsSdkStrings.LB
    - typingsSlinky.awsSdk.awsSdkStrings.LC
    - typingsSlinky.awsSdk.awsSdkStrings.LI
    - typingsSlinky.awsSdk.awsSdkStrings.LK
    - typingsSlinky.awsSdk.awsSdkStrings.LR
    - typingsSlinky.awsSdk.awsSdkStrings.LS
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.LU
    - typingsSlinky.awsSdk.awsSdkStrings.LV
    - typingsSlinky.awsSdk.awsSdkStrings.LY
    - typingsSlinky.awsSdk.awsSdkStrings.MA
    - typingsSlinky.awsSdk.awsSdkStrings.MC
    - typingsSlinky.awsSdk.awsSdkStrings.MD
    - typingsSlinky.awsSdk.awsSdkStrings.ME
    - typingsSlinky.awsSdk.awsSdkStrings.MF
    - typingsSlinky.awsSdk.awsSdkStrings.MG
    - typingsSlinky.awsSdk.awsSdkStrings.MH
    - typingsSlinky.awsSdk.awsSdkStrings.MK
    - typingsSlinky.awsSdk.awsSdkStrings.ML
    - typingsSlinky.awsSdk.awsSdkStrings.MM
    - typingsSlinky.awsSdk.awsSdkStrings.MN
    - typingsSlinky.awsSdk.awsSdkStrings.MO
    - typingsSlinky.awsSdk.awsSdkStrings.MP
    - typingsSlinky.awsSdk.awsSdkStrings.MR
    - typingsSlinky.awsSdk.awsSdkStrings.MS
    - typingsSlinky.awsSdk.awsSdkStrings.MT
    - typingsSlinky.awsSdk.awsSdkStrings.MU
    - typingsSlinky.awsSdk.awsSdkStrings.MV
    - typingsSlinky.awsSdk.awsSdkStrings.MW
    - typingsSlinky.awsSdk.awsSdkStrings.MX
    - typingsSlinky.awsSdk.awsSdkStrings.MY
    - typingsSlinky.awsSdk.awsSdkStrings.MZ
    - typingsSlinky.awsSdk.awsSdkStrings.NA
    - typingsSlinky.awsSdk.awsSdkStrings.NC
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.NG
    - typingsSlinky.awsSdk.awsSdkStrings.NI
    - typingsSlinky.awsSdk.awsSdkStrings.NL
    - typingsSlinky.awsSdk.awsSdkStrings.NO
    - typingsSlinky.awsSdk.awsSdkStrings.NP
    - typingsSlinky.awsSdk.awsSdkStrings.NR
    - typingsSlinky.awsSdk.awsSdkStrings.NU
    - typingsSlinky.awsSdk.awsSdkStrings.NZ
    - typingsSlinky.awsSdk.awsSdkStrings.OM
    - typingsSlinky.awsSdk.awsSdkStrings.PA
    - typingsSlinky.awsSdk.awsSdkStrings.PE
    - typingsSlinky.awsSdk.awsSdkStrings.PF
    - typingsSlinky.awsSdk.awsSdkStrings.PG
    - typingsSlinky.awsSdk.awsSdkStrings.PH
    - typingsSlinky.awsSdk.awsSdkStrings.PK
    - typingsSlinky.awsSdk.awsSdkStrings.PL
    - typingsSlinky.awsSdk.awsSdkStrings.PM
    - typingsSlinky.awsSdk.awsSdkStrings.PN
    - typingsSlinky.awsSdk.awsSdkStrings.PR
    - typingsSlinky.awsSdk.awsSdkStrings.PT
    - typingsSlinky.awsSdk.awsSdkStrings.PW
    - typingsSlinky.awsSdk.awsSdkStrings.PY
    - typingsSlinky.awsSdk.awsSdkStrings.QA
    - typingsSlinky.awsSdk.awsSdkStrings.RO
    - typingsSlinky.awsSdk.awsSdkStrings.RS
    - typingsSlinky.awsSdk.awsSdkStrings.RU
    - typingsSlinky.awsSdk.awsSdkStrings.RW
    - typingsSlinky.awsSdk.awsSdkStrings.SA
    - typingsSlinky.awsSdk.awsSdkStrings.SB
    - typingsSlinky.awsSdk.awsSdkStrings.SC
    - typingsSlinky.awsSdk.awsSdkStrings.SD
    - typingsSlinky.awsSdk.awsSdkStrings.SE
    - typingsSlinky.awsSdk.awsSdkStrings.SG
    - typingsSlinky.awsSdk.awsSdkStrings.SH
    - typingsSlinky.awsSdk.awsSdkStrings.SI
    - typingsSlinky.awsSdk.awsSdkStrings.SK
    - typingsSlinky.awsSdk.awsSdkStrings.SL
    - typingsSlinky.awsSdk.awsSdkStrings.SM
    - typingsSlinky.awsSdk.awsSdkStrings.SN
    - typingsSlinky.awsSdk.awsSdkStrings.SO
    - typingsSlinky.awsSdk.awsSdkStrings.SR
    - typingsSlinky.awsSdk.awsSdkStrings.ST
    - typingsSlinky.awsSdk.awsSdkStrings.SV
    - typingsSlinky.awsSdk.awsSdkStrings.SY
    - typingsSlinky.awsSdk.awsSdkStrings.SZ
    - typingsSlinky.awsSdk.awsSdkStrings.TC
    - typingsSlinky.awsSdk.awsSdkStrings.TD
    - typingsSlinky.awsSdk.awsSdkStrings.TG
    - typingsSlinky.awsSdk.awsSdkStrings.TH
    - typingsSlinky.awsSdk.awsSdkStrings.TJ
    - typingsSlinky.awsSdk.awsSdkStrings.TK
    - typingsSlinky.awsSdk.awsSdkStrings.TL
    - typingsSlinky.awsSdk.awsSdkStrings.TM
    - typingsSlinky.awsSdk.awsSdkStrings.TN
    - typingsSlinky.awsSdk.awsSdkStrings.TO
    - typingsSlinky.awsSdk.awsSdkStrings.TR
    - typingsSlinky.awsSdk.awsSdkStrings.TT
    - typingsSlinky.awsSdk.awsSdkStrings.TV
    - typingsSlinky.awsSdk.awsSdkStrings.TW
    - typingsSlinky.awsSdk.awsSdkStrings.TZ
    - typingsSlinky.awsSdk.awsSdkStrings.UA
    - typingsSlinky.awsSdk.awsSdkStrings.UG
    - typingsSlinky.awsSdk.awsSdkStrings.US
    - typingsSlinky.awsSdk.awsSdkStrings.UY
    - typingsSlinky.awsSdk.awsSdkStrings.UZ
    - typingsSlinky.awsSdk.awsSdkStrings.VA
    - typingsSlinky.awsSdk.awsSdkStrings.VC
    - typingsSlinky.awsSdk.awsSdkStrings.VE
    - typingsSlinky.awsSdk.awsSdkStrings.VG
    - typingsSlinky.awsSdk.awsSdkStrings.VI
    - typingsSlinky.awsSdk.awsSdkStrings.VN
    - typingsSlinky.awsSdk.awsSdkStrings.VU
    - typingsSlinky.awsSdk.awsSdkStrings.WF
    - typingsSlinky.awsSdk.awsSdkStrings.WS
    - typingsSlinky.awsSdk.awsSdkStrings.YE
    - typingsSlinky.awsSdk.awsSdkStrings.YT
    - typingsSlinky.awsSdk.awsSdkStrings.ZA
    - typingsSlinky.awsSdk.awsSdkStrings.ZM
    - typingsSlinky.awsSdk.awsSdkStrings.ZW
    - java.lang.String
  */
  type CountryCode = typingsSlinky.awsSdk.route53domainsMod._CountryCode | java.lang.String
  type CurrentExpiryYear = scala.Double
  type DNSSec = java.lang.String
  type DomainAuthCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_RESERVED
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_PREORDER
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM
    - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED
    - typingsSlinky.awsSdk.awsSdkStrings.RESERVED
    - typingsSlinky.awsSdk.awsSdkStrings.DONT_KNOW
    - java.lang.String
  */
  type DomainAvailability = typingsSlinky.awsSdk.route53domainsMod._DomainAvailability | java.lang.String
  type DomainName = java.lang.String
  type DomainStatus = java.lang.String
  type DomainStatusList = js.Array[typingsSlinky.awsSdk.route53domainsMod.DomainStatus]
  type DomainSuggestionsList = js.Array[typingsSlinky.awsSdk.route53domainsMod.DomainSuggestion]
  type DomainSummaryList = js.Array[typingsSlinky.awsSdk.route53domainsMod.DomainSummary]
  type DurationInYears = scala.Double
  type Email = java.lang.String
  type ErrorMessage = java.lang.String
  type ExtraParamList = js.Array[typingsSlinky.awsSdk.route53domainsMod.ExtraParam]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DUNS_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.BRAND_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.BIRTH_DEPARTMENT
    - typingsSlinky.awsSdk.awsSdkStrings.BIRTH_DATE_IN_YYYY_MM_DD
    - typingsSlinky.awsSdk.awsSdkStrings.BIRTH_COUNTRY
    - typingsSlinky.awsSdk.awsSdkStrings.BIRTH_CITY
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.AU_ID_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.AU_ID_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.CA_LEGAL_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.CA_BUSINESS_ENTITY_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.ES_IDENTIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.ES_IDENTIFICATION_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.ES_LEGAL_FORM
    - typingsSlinky.awsSdk.awsSdkStrings.FI_BUSINESS_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.FI_ID_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.FI_NATIONALITY
    - typingsSlinky.awsSdk.awsSdkStrings.FI_ORGANIZATION_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.IT_PIN
    - typingsSlinky.awsSdk.awsSdkStrings.IT_REGISTRANT_ENTITY_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.RU_PASSPORT_DATA
    - typingsSlinky.awsSdk.awsSdkStrings.SE_ID_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.SG_ID_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.VAT_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.UK_CONTACT_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.UK_COMPANY_NUMBER
    - java.lang.String
  */
  type ExtraParamName = typingsSlinky.awsSdk.route53domainsMod._ExtraParamName | java.lang.String
  type ExtraParamValue = java.lang.String
  type FIAuthKey = java.lang.String
  type GlueIp = java.lang.String
  type GlueIpList = js.Array[typingsSlinky.awsSdk.route53domainsMod.GlueIp]
  type HostName = java.lang.String
  type Integer = scala.Double
  type InvoiceId = java.lang.String
  type LangCode = java.lang.String
  type NameserverList = js.Array[typingsSlinky.awsSdk.route53domainsMod.Nameserver]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = typingsSlinky.awsSdk.route53domainsMod._OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[typingsSlinky.awsSdk.route53domainsMod.OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTER_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFER_IN_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_DOMAIN_CONTACT
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_NAMESERVER
    - typingsSlinky.awsSdk.awsSdkStrings.CHANGE_PRIVACY_PROTECTION
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_LOCK
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLE_AUTORENEW
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLE_AUTORENEW
    - typingsSlinky.awsSdk.awsSdkStrings.ADD_DNSSEC
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE_DNSSEC
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRE_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFER_OUT_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.CHANGE_DOMAIN_OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.RENEW_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.PUSH_DOMAIN
    - java.lang.String
  */
  type OperationType = typingsSlinky.awsSdk.route53domainsMod._OperationType | java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = scala.Double
  type Price = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DONE
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ReachabilityStatus = typingsSlinky.awsSdk.route53domainsMod._ReachabilityStatus | java.lang.String
  type RegistrarName = java.lang.String
  type RegistrarUrl = java.lang.String
  type RegistrarWhoIsServer = java.lang.String
  type RegistryDomainId = java.lang.String
  type Reseller = java.lang.String
  type State = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.route53domainsMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.route53domainsMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSFERABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNTRANSFERABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DONT_KNOW
    - java.lang.String
  */
  type Transferable = typingsSlinky.awsSdk.route53domainsMod._Transferable | java.lang.String
  type ZipCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2014-05-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.route53domainsMod._apiVersion | java.lang.String
}
