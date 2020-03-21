package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sesMod {
  type Address = java.lang.String
  type AddressList = js.Array[typingsSlinky.awsSdk.sesMod.Address]
  type AmazonResourceName = java.lang.String
  type ArrivalDate = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UseDefaultValue
    - typingsSlinky.awsSdk.awsSdkStrings.RejectMessage
    - java.lang.String
  */
  type BehaviorOnMXFailure = typingsSlinky.awsSdk.sesMod._BehaviorOnMXFailure | java.lang.String
  type BounceMessage = java.lang.String
  type BounceSmtpReplyCode = java.lang.String
  type BounceStatusCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.MessageTooLarge
    - typingsSlinky.awsSdk.awsSdkStrings.ExceededQuota
    - typingsSlinky.awsSdk.awsSdkStrings.ContentRejected
    - typingsSlinky.awsSdk.awsSdkStrings.Undefined_
    - typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type BounceType = typingsSlinky.awsSdk.sesMod._BounceType | java.lang.String
  type BouncedRecipientInfoList = js.Array[typingsSlinky.awsSdk.sesMod.BouncedRecipientInfo]
  type BulkEmailDestinationList = js.Array[typingsSlinky.awsSdk.sesMod.BulkEmailDestination]
  type BulkEmailDestinationStatusList = js.Array[typingsSlinky.awsSdk.sesMod.BulkEmailDestinationStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.MessageRejected
    - typingsSlinky.awsSdk.awsSdkStrings.MailFromDomainNotVerified
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationSetDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.TemplateDoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.AccountSuspended
    - typingsSlinky.awsSdk.awsSdkStrings.AccountThrottled
    - typingsSlinky.awsSdk.awsSdkStrings.AccountDailyQuotaExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidSendingPoolName
    - typingsSlinky.awsSdk.awsSdkStrings.AccountSendingPaused
    - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationSetSendingPaused
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidParameterValue
    - typingsSlinky.awsSdk.awsSdkStrings.TransientFailure
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type BulkEmailStatus = typingsSlinky.awsSdk.sesMod._BulkEmailStatus | java.lang.String
  type Charset = java.lang.String
  type Cidr = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.sesMod.ClientApiVersions
  type CloudWatchDimensionConfigurations = js.Array[typingsSlinky.awsSdk.sesMod.CloudWatchDimensionConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.eventDestinations
    - typingsSlinky.awsSdk.awsSdkStrings.trackingOptions
    - typingsSlinky.awsSdk.awsSdkStrings.deliveryOptions
    - typingsSlinky.awsSdk.awsSdkStrings.reputationOptions
    - java.lang.String
  */
  type ConfigurationSetAttribute = typingsSlinky.awsSdk.sesMod._ConfigurationSetAttribute | java.lang.String
  type ConfigurationSetAttributeList = js.Array[typingsSlinky.awsSdk.sesMod.ConfigurationSetAttribute]
  type ConfigurationSetName = java.lang.String
  type ConfigurationSets = js.Array[typingsSlinky.awsSdk.sesMod.ConfigurationSet]
  type Counter = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure
    - java.lang.String
  */
  type CustomMailFromStatus = typingsSlinky.awsSdk.sesMod._CustomMailFromStatus | java.lang.String
  type CustomRedirectDomain = java.lang.String
  type CustomVerificationEmailTemplates = js.Array[typingsSlinky.awsSdk.sesMod.CustomVerificationEmailTemplate]
  type DefaultDimensionValue = java.lang.String
  type DiagnosticCode = java.lang.String
  type DimensionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.messageTag
    - typingsSlinky.awsSdk.awsSdkStrings.emailHeader
    - typingsSlinky.awsSdk.awsSdkStrings.linkTag
    - java.lang.String
  */
  type DimensionValueSource = typingsSlinky.awsSdk.sesMod._DimensionValueSource | java.lang.String
  type DkimAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesMod.IdentityDkimAttributes]
  type Domain = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - typingsSlinky.awsSdk.awsSdkStrings.delayed_
    - typingsSlinky.awsSdk.awsSdkStrings.delivered
    - typingsSlinky.awsSdk.awsSdkStrings.relayed
    - typingsSlinky.awsSdk.awsSdkStrings.expanded_
    - java.lang.String
  */
  type DsnAction = typingsSlinky.awsSdk.sesMod._DsnAction | java.lang.String
  type DsnStatus = java.lang.String
  type Enabled = scala.Boolean
  type Error = java.lang.String
  type EventDestinationName = java.lang.String
  type EventDestinations = js.Array[typingsSlinky.awsSdk.sesMod.EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.send_
    - typingsSlinky.awsSdk.awsSdkStrings.reject__
    - typingsSlinky.awsSdk.awsSdkStrings.bounce__
    - typingsSlinky.awsSdk.awsSdkStrings.complaint__
    - typingsSlinky.awsSdk.awsSdkStrings.delivery__
    - typingsSlinky.awsSdk.awsSdkStrings.open__
    - typingsSlinky.awsSdk.awsSdkStrings.click_
    - typingsSlinky.awsSdk.awsSdkStrings.renderingFailure
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.sesMod._EventType | java.lang.String
  type EventTypes = js.Array[typingsSlinky.awsSdk.sesMod.EventType]
  type Explanation = java.lang.String
  type ExtensionFieldList = js.Array[typingsSlinky.awsSdk.sesMod.ExtensionField]
  type ExtensionFieldName = java.lang.String
  type ExtensionFieldValue = java.lang.String
  type FailureRedirectionURL = java.lang.String
  type FromAddress = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type HtmlPart = java.lang.String
  type Identity = java.lang.String
  type IdentityList = js.Array[typingsSlinky.awsSdk.sesMod.Identity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EmailAddress
    - typingsSlinky.awsSdk.awsSdkStrings.Domain_
    - java.lang.String
  */
  type IdentityType = typingsSlinky.awsSdk.sesMod._IdentityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Event_
    - typingsSlinky.awsSdk.awsSdkStrings.RequestResponse
    - java.lang.String
  */
  type InvocationType = typingsSlinky.awsSdk.sesMod._InvocationType | java.lang.String
  type LastAttemptDate = js.Date
  type LastFreshStart = js.Date
  type MailFromDomainAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesMod.IdentityMailFromDomainAttributes]
  type MailFromDomainName = java.lang.String
  type Max24HourSend = scala.Double
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MaxSendRate = scala.Double
  type MessageData = java.lang.String
  type MessageId = java.lang.String
  type MessageTagList = js.Array[typingsSlinky.awsSdk.sesMod.MessageTag]
  type MessageTagName = java.lang.String
  type MessageTagValue = java.lang.String
  type NextToken = java.lang.String
  type NotificationAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesMod.IdentityNotificationAttributes]
  type NotificationTopic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Bounce_
    - typingsSlinky.awsSdk.awsSdkStrings.Complaint_
    - typingsSlinky.awsSdk.awsSdkStrings.Delivery_
    - java.lang.String
  */
  type NotificationType = typingsSlinky.awsSdk.sesMod._NotificationType | java.lang.String
  type Policy = java.lang.String
  type PolicyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesMod.Policy]
  type PolicyName = java.lang.String
  type PolicyNameList = js.Array[typingsSlinky.awsSdk.sesMod.PolicyName]
  type RawMessageData = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.sesMod.Blob | java.lang.String
  type ReceiptActionsList = js.Array[typingsSlinky.awsSdk.sesMod.ReceiptAction]
  type ReceiptFilterList = js.Array[typingsSlinky.awsSdk.sesMod.ReceiptFilter]
  type ReceiptFilterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Block_
    - typingsSlinky.awsSdk.awsSdkStrings.Allow_
    - java.lang.String
  */
  type ReceiptFilterPolicy = typingsSlinky.awsSdk.sesMod._ReceiptFilterPolicy | java.lang.String
  type ReceiptRuleName = java.lang.String
  type ReceiptRuleNamesList = js.Array[typingsSlinky.awsSdk.sesMod.ReceiptRuleName]
  type ReceiptRuleSetName = java.lang.String
  type ReceiptRuleSetsLists = js.Array[typingsSlinky.awsSdk.sesMod.ReceiptRuleSetMetadata]
  type ReceiptRulesList = js.Array[typingsSlinky.awsSdk.sesMod.ReceiptRule]
  type Recipient = java.lang.String
  type RecipientsList = js.Array[typingsSlinky.awsSdk.sesMod.Recipient]
  type RemoteMta = java.lang.String
  type RenderedTemplate = java.lang.String
  type ReportingMta = java.lang.String
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`UTF-8`
    - typingsSlinky.awsSdk.awsSdkStrings.Base64
    - java.lang.String
  */
  type SNSActionEncoding = typingsSlinky.awsSdk.sesMod._SNSActionEncoding | java.lang.String
  type SendDataPointList = js.Array[typingsSlinky.awsSdk.sesMod.SendDataPoint]
  type SentLast24Hours = scala.Double
  type StopScope = typingsSlinky.awsSdk.awsSdkStrings.RuleSet | java.lang.String
  type Subject = java.lang.String
  type SubjectPart = java.lang.String
  type SuccessRedirectionURL = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateData = java.lang.String
  type TemplateMetadataList = js.Array[typingsSlinky.awsSdk.sesMod.TemplateMetadata]
  type TemplateName = java.lang.String
  type TextPart = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Require_
    - typingsSlinky.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type TlsPolicy = typingsSlinky.awsSdk.sesMod._TlsPolicy | java.lang.String
  type VerificationAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.sesMod.IdentityVerificationAttributes]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.TemporaryFailure
    - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
    - java.lang.String
  */
  type VerificationStatus = typingsSlinky.awsSdk.sesMod._VerificationStatus | java.lang.String
  type VerificationToken = java.lang.String
  type VerificationTokenList = js.Array[typingsSlinky.awsSdk.sesMod.VerificationToken]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2010-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.sesMod._apiVersion | java.lang.String
}
