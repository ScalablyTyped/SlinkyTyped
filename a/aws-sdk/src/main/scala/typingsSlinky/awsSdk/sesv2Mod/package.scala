package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sesv2Mod {
  
  type AdditionalContactEmailAddress = java.lang.String
  
  type AdditionalContactEmailAddresses = js.Array[typingsSlinky.awsSdk.sesv2Mod.AdditionalContactEmailAddress]
  
  type AmazonResourceName = java.lang.String
  
  type AttributesData = java.lang.String
  
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
  
  type BulkEmailEntryList = js.Array[typingsSlinky.awsSdk.sesv2Mod.BulkEmailEntry]
  
  type BulkEmailEntryResultList = js.Array[typingsSlinky.awsSdk.sesv2Mod.BulkEmailEntryResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE_REJECTED
    - typingsSlinky.awsSdk.awsSdkStrings.MAIL_FROM_DOMAIN_NOT_VERIFIED
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_SET_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.TEMPLATE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_SUSPENDED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_THROTTLED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_DAILY_QUOTA_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_SENDING_POOL_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT_SENDING_PAUSED
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIGURATION_SET_SENDING_PAUSED
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_PARAMETER
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSIENT_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BulkEmailStatus = typingsSlinky.awsSdk.sesv2Mod._BulkEmailStatus | java.lang.String
  
  type CampaignId = java.lang.String
  
  type CaseId = java.lang.String
  
  type Charset = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sesv2Mod.ClientApiVersions
  
  type CloudWatchDimensionConfigurations = js.Array[typingsSlinky.awsSdk.sesv2Mod.CloudWatchDimensionConfiguration]
  
  type ConfigurationSetName = java.lang.String
  
  type ConfigurationSetNameList = js.Array[typingsSlinky.awsSdk.sesv2Mod.ConfigurationSetName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EN
    - typingsSlinky.awsSdk.awsSdkStrings.JA
    - java.lang.String
  */
  type ContactLanguage = typingsSlinky.awsSdk.sesv2Mod._ContactLanguage | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - java.lang.String
  */
  type ContactListImportAction = typingsSlinky.awsSdk.sesv2Mod._ContactListImportAction | java.lang.String
  
  type ContactListName = java.lang.String
  
  type CustomRedirectDomain = java.lang.String
  
  type CustomVerificationEmailTemplatesList = js.Array[typingsSlinky.awsSdk.sesv2Mod.CustomVerificationEmailTemplateMetadata]
  
  type DailyVolumes = js.Array[typingsSlinky.awsSdk.sesv2Mod.DailyVolume]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CSV
    - typingsSlinky.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type DataFormat = typingsSlinky.awsSdk.sesv2Mod._DataFormat | java.lang.String
  
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
  
  type Description = java.lang.String
  
  type DimensionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE_TAG
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_HEADER
    - typingsSlinky.awsSdk.awsSdkStrings.LINK_TAG
    - java.lang.String
  */
  type DimensionValueSource = typingsSlinky.awsSdk.sesv2Mod._DimensionValueSource | java.lang.String
  
  type DisplayName = java.lang.String
  
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
  
  type EmailTemplateData = java.lang.String
  
  type EmailTemplateHtml = java.lang.String
  
  type EmailTemplateMetadataList = js.Array[typingsSlinky.awsSdk.sesv2Mod.EmailTemplateMetadata]
  
  type EmailTemplateName = java.lang.String
  
  type EmailTemplateSubject = java.lang.String
  
  type EmailTemplateText = java.lang.String
  
  type Enabled = scala.Boolean
  
  type EnabledWrapper = scala.Boolean
  
  type ErrorMessage = java.lang.String
  
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
    - typingsSlinky.awsSdk.awsSdkStrings.DELIVERY_DELAY
    - typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIPTION
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.sesv2Mod._EventType | java.lang.String
  
  type EventTypes = js.Array[typingsSlinky.awsSdk.sesv2Mod.EventType]
  
  type FailedRecordsCount = scala.Double
  
  type FailedRecordsS3Url = java.lang.String
  
  type FailureRedirectionURL = java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUPPRESSION_LIST
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT_LIST
    - java.lang.String
  */
  type ImportDestinationType = typingsSlinky.awsSdk.sesv2Mod._ImportDestinationType | java.lang.String
  
  type ImportJobSummaryList = js.Array[typingsSlinky.awsSdk.sesv2Mod.ImportJobSummary]
  
  type Ip = java.lang.String
  
  type IpList = js.Array[typingsSlinky.awsSdk.sesv2Mod.Ip]
  
  type IspName = java.lang.String
  
  type IspNameList = js.Array[typingsSlinky.awsSdk.sesv2Mod.IspName]
  
  type IspPlacements = js.Array[typingsSlinky.awsSdk.sesv2Mod.IspPlacement]
  
  type JobId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = typingsSlinky.awsSdk.sesv2Mod._JobStatus | java.lang.String
  
  type LastFreshStart = js.Date
  
  type ListOfContactLists = js.Array[typingsSlinky.awsSdk.sesv2Mod.ContactList]
  
  type ListOfContacts = js.Array[typingsSlinky.awsSdk.sesv2Mod.Contact]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MARKETING
    - typingsSlinky.awsSdk.awsSdkStrings.TRANSACTIONAL
    - java.lang.String
  */
  type MailType = typingsSlinky.awsSdk.sesv2Mod._MailType | java.lang.String
  
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
  
  type Policy = java.lang.String
  
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesv2Mod.Policy]
  
  type PolicyName = java.lang.String
  
  type PoolName = java.lang.String
  
  type PrivateKey = java.lang.String
  
  type ProcessedRecordsCount = scala.Double
  
  type RawMessageData = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.sesv2Mod.Blob | java.lang.String
  
  type RblName = java.lang.String
  
  type RenderedEmailTemplate = java.lang.String
  
  type ReportId = java.lang.String
  
  type ReportName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.GRANTED
    - typingsSlinky.awsSdk.awsSdkStrings.DENIED
    - java.lang.String
  */
  type ReviewStatus = typingsSlinky.awsSdk.sesv2Mod._ReviewStatus | java.lang.String
  
  type S3Url = java.lang.String
  
  type Selector = java.lang.String
  
  type SendingPoolName = java.lang.String
  
  type SentLast24Hours = scala.Double
  
  type Subject = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPT_IN
    - typingsSlinky.awsSdk.awsSdkStrings.OPT_OUT
    - java.lang.String
  */
  type SubscriptionStatus = typingsSlinky.awsSdk.sesv2Mod._SubscriptionStatus | java.lang.String
  
  type SuccessRedirectionURL = java.lang.String
  
  type SuppressedDestinationSummaries = js.Array[typingsSlinky.awsSdk.sesv2Mod.SuppressedDestinationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.PUT
    - java.lang.String
  */
  type SuppressionListImportAction = typingsSlinky.awsSdk.sesv2Mod._SuppressionListImportAction | java.lang.String
  
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
  
  type TemplateContent = java.lang.String
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRE
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type TlsPolicy = typingsSlinky.awsSdk.sesv2Mod._TlsPolicy | java.lang.String
  
  type TopicName = java.lang.String
  
  type TopicPreferenceList = js.Array[typingsSlinky.awsSdk.sesv2Mod.TopicPreference]
  
  type Topics = js.Array[typingsSlinky.awsSdk.sesv2Mod.Topic]
  
  type UnsubscribeAll = scala.Boolean
  
  type UseCaseDescription = java.lang.String
  
  type UseDefaultIfPreferenceUnavailable = scala.Boolean
  
  type Volume = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DONE
    - java.lang.String
  */
  type WarmupStatus = typingsSlinky.awsSdk.sesv2Mod._WarmupStatus | java.lang.String
  
  type WebsiteURL = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-09-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sesv2Mod._apiVersion | java.lang.String
}
