package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object guarddutyMod {
  type AccountDetails = js.Array[typingsSlinky.awsSdk.guarddutyMod.AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsSlinky.awsSdk.guarddutyMod.AccountId]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.guarddutyMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CountBySeverity = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.guarddutyMod.Integer]
  type Criterion = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.guarddutyMod.Condition]
  type DestinationType = typingsSlinky.awsSdk.awsSdkStrings.S3 | java.lang.String
  type Destinations = js.Array[typingsSlinky.awsSdk.guarddutyMod.Destination]
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[typingsSlinky.awsSdk.guarddutyMod.DetectorId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DetectorStatus = typingsSlinky.awsSdk.guarddutyMod._DetectorStatus | java.lang.String
  type Double = scala.Double
  type Email = java.lang.String
  type Eq = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  type Equals = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USEFUL
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type Feedback = typingsSlinky.awsSdk.guarddutyMod._Feedback | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOOP
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type FilterAction = typingsSlinky.awsSdk.guarddutyMod._FilterAction | java.lang.String
  type FilterDescription = java.lang.String
  type FilterName = java.lang.String
  type FilterNames = js.Array[typingsSlinky.awsSdk.guarddutyMod.FilterName]
  type FilterRank = scala.Double
  type FindingId = java.lang.String
  type FindingIds = js.Array[typingsSlinky.awsSdk.guarddutyMod.FindingId]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_HOUR
    - typingsSlinky.awsSdk.awsSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = typingsSlinky.awsSdk.guarddutyMod._FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = typingsSlinky.awsSdk.awsSdkStrings.COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[typingsSlinky.awsSdk.guarddutyMod.FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[typingsSlinky.awsSdk.guarddutyMod.FindingType]
  type Findings = js.Array[typingsSlinky.awsSdk.guarddutyMod.Finding]
  type GuardDutyArn = java.lang.String
  type Integer = scala.Double
  type Invitations = js.Array[typingsSlinky.awsSdk.guarddutyMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TXT
    - typingsSlinky.awsSdk.awsSdkStrings.STIX
    - typingsSlinky.awsSdk.awsSdkStrings.OTX_CSV
    - typingsSlinky.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typingsSlinky.awsSdk.awsSdkStrings.PROOF_POINT
    - typingsSlinky.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type IpSetFormat = typingsSlinky.awsSdk.guarddutyMod._IpSetFormat | java.lang.String
  type IpSetIds = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type IpSetStatus = typingsSlinky.awsSdk.guarddutyMod._IpSetStatus | java.lang.String
  type Ipv6Addresses = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  type Location = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type Members = js.Array[typingsSlinky.awsSdk.guarddutyMod.Member]
  type Name = java.lang.String
  type Neq = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  type NetworkInterfaces = js.Array[typingsSlinky.awsSdk.guarddutyMod.NetworkInterface]
  type NotEquals = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASC
    - typingsSlinky.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typingsSlinky.awsSdk.guarddutyMod._OrderBy | java.lang.String
  type PortProbeDetails = js.Array[typingsSlinky.awsSdk.guarddutyMod.PortProbeDetail]
  type PrivateIpAddresses = js.Array[typingsSlinky.awsSdk.guarddutyMod.PrivateIpAddressDetails]
  type ProductCodes = js.Array[typingsSlinky.awsSdk.guarddutyMod.ProductCode]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VERIFICATION
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLISHING
    - typingsSlinky.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type PublishingStatus = typingsSlinky.awsSdk.guarddutyMod._PublishingStatus | java.lang.String
  type SecurityGroups = js.Array[typingsSlinky.awsSdk.guarddutyMod.SecurityGroup]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.guarddutyMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.guarddutyMod.TagValue]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.guarddutyMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TXT
    - typingsSlinky.awsSdk.awsSdkStrings.STIX
    - typingsSlinky.awsSdk.awsSdkStrings.OTX_CSV
    - typingsSlinky.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typingsSlinky.awsSdk.awsSdkStrings.PROOF_POINT
    - typingsSlinky.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type ThreatIntelSetFormat = typingsSlinky.awsSdk.guarddutyMod._ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetIds = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DEACTIVATING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE_PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ThreatIntelSetStatus = typingsSlinky.awsSdk.guarddutyMod._ThreatIntelSetStatus | java.lang.String
  type ThreatIntelligenceDetails = js.Array[typingsSlinky.awsSdk.guarddutyMod.ThreatIntelligenceDetail]
  type ThreatNames = js.Array[typingsSlinky.awsSdk.guarddutyMod.String]
  type UnprocessedAccounts = js.Array[typingsSlinky.awsSdk.guarddutyMod.UnprocessedAccount]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-11-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.guarddutyMod._apiVersion | java.lang.String
}
