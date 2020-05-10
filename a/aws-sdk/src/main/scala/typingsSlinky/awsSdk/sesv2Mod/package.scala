package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sesv2Mod {
  type AmazonResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USE_DEFAULT_VALUE
    - typingsSlinky.awsSdk.awsSdkStrings.REJECT_MESSAGE
    - java.lang.String
  */
  type BehaviorOnMxFailure = typingsSlinky.awsSdk.sesv2Mod._BehaviorOnMxFailure | java.lang.String
  type BlacklistEntries = js.Array[typingsSlinky.awsSdk.sesv2Mod.BlacklistEntry]
  type BlacklistItemName = java.lang.String
  type BlacklistItemNames = js.Array[typingsSlinky.awsSdk.sesv2Mod.BlacklistItemName]
  type BlacklistReport = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesv2Mod.BlacklistEntries]
  type BlacklistingDescription = java.lang.String
  type CampaignId = java.lang.String
  type Charset = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sesv2Mod.ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[typingsSlinky.awsSdk.sesv2Mod.CloudWatchDimensionConfiguration]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSetNameList = js.Array[typingsSlinky.awsSdk.sesv2Mod.ConfigurationSetName]
  type CustomRedirectDomain = java.lang.String
  type DailyVolumes = js.Array[typingsSlinky.awsSdk.sesv2Mod.DailyVolume]
  type DedicatedIpList = js.Array[typingsSlinky.awsSdk.sesv2Mod.DedicatedIp]
  type DefaultDimensionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_EXPIRATION
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DeliverabilityDashboardAccountStatus = typingsSlinky.awsSdk.sesv2Mod._DeliverabilityDashboardAccountStatus | java.lang.String
  type DeliverabilityTestReports = js.Array[typingsSlinky.awsSdk.sesv2Mod.DeliverabilityTestReport]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type DeliverabilityTestStatus = typingsSlinky.awsSdk.sesv2Mod._DeliverabilityTestStatus | java.lang.String
  type DeliverabilityTestSubject = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE_TAG
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = typingsSlinky.awsSdk.sesv2Mod._DimensionValueSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_SES
    - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DkimSigningAttributesOrigin = typingsSlinky.awsSdk.sesv2Mod._DkimSigningAttributesOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DkimStatus = typingsSlinky.awsSdk.sesv2Mod._DkimStatus | java.lang.String
  type DnsToken = java.lang.String
  type DnsTokenList = js.Array[typingsSlinky.awsSdk.sesv2Mod.DnsToken]
  type Domain = java.lang.String
  type DomainDeliverabilityCampaignList = js.Array[typingsSlinky.awsSdk.sesv2Mod.DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[typingsSlinky.awsSdk.sesv2Mod.DomainDeliverabilityTrackingOption]
  type DomainIspPlacements = js.Array[typingsSlinky.awsSdk.sesv2Mod.DomainIspPlacement]
  type EmailAddress = java.lang.String
  type EmailAddressList = js.Array[typingsSlinky.awsSdk.sesv2Mod.EmailAddress]
  type Enabled = scala.Boolean
  type Esp = java.lang.String
  type Esps = js.Array[typingsSlinky.awsSdk.sesv2Mod.Esp]
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[typingsSlinky.awsSdk.sesv2Mod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SEND
    - typingsSlinky.awsSdk.awsSdkStrings.REJECT
    - typingsSlinky.awsSdk.awsSdkStrings.BOUNCE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLAINT
    - typingsSlinky.awsSdk.awsSdkStrings.DELIVERY
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CLICK
    - typingsSlinky.awsSdk.awsSdkStrings.RENDERING_FAILURE
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.sesv2Mod._EventType | java.lang.String
  type EventTypes = js.Array[typingsSlinky.awsSdk.sesv2Mod.EventType]
  type FeedbackId = java.lang.String
  type GeneralEnforcementStatus = java.lang.String
  type Identity = java.lang.String
  type IdentityInfoList = js.Array[typingsSlinky.awsSdk.sesv2Mod.IdentityInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.MANAGED_DOMAIN
    - java.lang.String
  */
  type IdentityType = typingsSlinky.awsSdk.sesv2Mod._IdentityType | java.lang.String
  type ImageUrl = java.lang.String
  type Ip = java.lang.String
  type IpList = js.Array[typingsSlinky.awsSdk.sesv2Mod.Ip]
  type IspName = java.lang.String
  type IspNameList = js.Array[typingsSlinky.awsSdk.sesv2Mod.IspName]
  type IspPlacements = js.Array[typingsSlinky.awsSdk.sesv2Mod.IspPlacement]
  type LastFreshStart = js.Date
  type ListOfDedicatedIpPools = js.Array[typingsSlinky.awsSdk.sesv2Mod.PoolName]
  type MailFromDomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - java.lang.String
  */
  type MailFromDomainStatus = typingsSlinky.awsSdk.sesv2Mod._MailFromDomainStatus | java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxSendRate = scala.Double
  type MessageContent = java.lang.String
  type MessageData = java.lang.String
  type MessageTagList = js.Array[typingsSlinky.awsSdk.sesv2Mod.MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type OutboundMessageId = java.lang.String
  type Percentage = scala.Double
  type Percentage100Wrapper = scala.Double
  type PoolName = java.lang.String
  type PrivateKey = java.lang.String
  type RawMessageData = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.sesv2Mod.Blob | java.lang.String
  type RblName = java.lang.String
  type ReportId = java.lang.String
  type ReportName = java.lang.String
  type Selector = java.lang.String
  type SendingPoolName = java.lang.String
  type SentLast24Hours = scala.Double
  type Subject = java.lang.String
  type SuppressedDestinationSummaries = js.Array[typingsSlinky.awsSdk.sesv2Mod.SuppressedDestinationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BOUNCE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLAINT
    - java.lang.String
  */
  type SuppressionListReason = typingsSlinky.awsSdk.sesv2Mod._SuppressionListReason | java.lang.String
  type SuppressionListReasons = js.Array[typingsSlinky.awsSdk.sesv2Mod.SuppressionListReason]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.sesv2Mod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.sesv2Mod.Tag]
  type TagValue = java.lang.String
  type TemplateArn = java.lang.String
  type TemplateData = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRE
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = typingsSlinky.awsSdk.sesv2Mod._TlsPolicy | java.lang.String
  type Volume = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = typingsSlinky.awsSdk.sesv2Mod._WarmupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-09-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sesv2Mod._apiVersion | java.lang.String
}
