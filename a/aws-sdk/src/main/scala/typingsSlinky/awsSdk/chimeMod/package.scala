package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object chimeMod {
  
  type AccountList = js.Array[typingsSlinky.awsSdk.chimeMod.Account]
  
  type AccountName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Team
    - typingsSlinky.awsSdk.awsSdkStrings.EnterpriseDirectory
    - typingsSlinky.awsSdk.awsSdkStrings.EnterpriseLWA
    - typingsSlinky.awsSdk.awsSdkStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = typingsSlinky.awsSdk.chimeMod._AccountType | java.lang.String
  
  type Alpha2CountryCode = java.lang.String
  
  type AppInstanceAdminList = js.Array[typingsSlinky.awsSdk.chimeMod.AppInstanceAdminSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Channel_
    - typingsSlinky.awsSdk.awsSdkStrings.ChannelMessage
    - java.lang.String
  */
  type AppInstanceDataType = typingsSlinky.awsSdk.chimeMod._AppInstanceDataType | java.lang.String
  
  type AppInstanceList = js.Array[typingsSlinky.awsSdk.chimeMod.AppInstanceSummary]
  
  type AppInstanceStreamingConfigurationList = js.Array[typingsSlinky.awsSdk.chimeMod.AppInstanceStreamingConfiguration]
  
  type AppInstanceUserList = js.Array[typingsSlinky.awsSdk.chimeMod.AppInstanceUserSummary]
  
  type AreaCode = java.lang.String
  
  type Arn = java.lang.String
  
  type AttendeeList = js.Array[typingsSlinky.awsSdk.chimeMod.Attendee]
  
  type AttendeeTagKeyList = js.Array[typingsSlinky.awsSdk.chimeMod.TagKey]
  
  type AttendeeTagList = js.Array[typingsSlinky.awsSdk.chimeMod.Tag]
  
  type BatchCreateAttendeeErrorList = js.Array[typingsSlinky.awsSdk.chimeMod.CreateAttendeeError]
  
  type Boolean = scala.Boolean
  
  type BotList = js.Array[typingsSlinky.awsSdk.chimeMod.Bot]
  
  type BotType = typingsSlinky.awsSdk.awsSdkStrings.ChatBot | java.lang.String
  
  type CallingName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Unassigned
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.UpdateFailed
    - java.lang.String
  */
  type CallingNameStatus = typingsSlinky.awsSdk.chimeMod._CallingNameStatus | java.lang.String
  
  type CallingRegion = java.lang.String
  
  type CallingRegionList = js.Array[typingsSlinky.awsSdk.chimeMod.CallingRegion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Voice_
    - typingsSlinky.awsSdk.awsSdkStrings.SMS
    - java.lang.String
  */
  type Capability = typingsSlinky.awsSdk.chimeMod._Capability | java.lang.String
  
  type CapabilityList = js.Array[typingsSlinky.awsSdk.chimeMod.Capability]
  
  type ChannelBanSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelBanSummary]
  
  type ChannelMembershipForAppInstanceUserSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelMembershipForAppInstanceUserSummary]
  
  type ChannelMembershipSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelMembershipSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.HIDDEN
    - java.lang.String
  */
  type ChannelMembershipType = typingsSlinky.awsSdk.chimeMod._ChannelMembershipType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PERSISTENT
    - typingsSlinky.awsSdk.awsSdkStrings.NON_PERSISTENT
    - java.lang.String
  */
  type ChannelMessagePersistenceType = typingsSlinky.awsSdk.chimeMod._ChannelMessagePersistenceType | java.lang.String
  
  type ChannelMessageSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelMessageSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.CONTROL
    - java.lang.String
  */
  type ChannelMessageType = typingsSlinky.awsSdk.chimeMod._ChannelMessageType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNRESTRICTED
    - typingsSlinky.awsSdk.awsSdkStrings.RESTRICTED
    - java.lang.String
  */
  type ChannelMode = typingsSlinky.awsSdk.chimeMod._ChannelMode | java.lang.String
  
  type ChannelModeratedByAppInstanceUserSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelModeratedByAppInstanceUserSummary]
  
  type ChannelModeratorSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelModeratorSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type ChannelPrivacy = typingsSlinky.awsSdk.chimeMod._ChannelPrivacy | java.lang.String
  
  type ChannelSummaryList = js.Array[typingsSlinky.awsSdk.chimeMod.ChannelSummary]
  
  type ChimeArn = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.chimeMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type Content = java.lang.String
  
  type Country = java.lang.String
  
  type CountryList = js.Array[typingsSlinky.awsSdk.chimeMod.Country]
  
  type CpsLimit = scala.Double
  
  type CreateAttendeeRequestItemList = js.Array[typingsSlinky.awsSdk.chimeMod.CreateAttendeeRequestItem]
  
  type CreateMeetingWithAttendeesRequestItemList = js.Array[typingsSlinky.awsSdk.chimeMod.CreateAttendeeRequestItem]
  
  type CredentialList = js.Array[typingsSlinky.awsSdk.chimeMod.Credential]
  
  type DNISEmergencyCallingConfigurationList = js.Array[typingsSlinky.awsSdk.chimeMod.DNISEmergencyCallingConfiguration]
  
  type DataRetentionInHours = scala.Double
  
  type E164PhoneNumber = java.lang.String
  
  type E164PhoneNumberList = js.Array[typingsSlinky.awsSdk.chimeMod.E164PhoneNumber]
  
  type EmailAddress = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotSent
    - typingsSlinky.awsSdk.awsSdkStrings.Sent
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type EmailStatus = typingsSlinky.awsSdk.chimeMod._EmailStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BadRequest
    - typingsSlinky.awsSdk.awsSdkStrings.Conflict_
    - typingsSlinky.awsSdk.awsSdkStrings.Forbidden
    - typingsSlinky.awsSdk.awsSdkStrings.NotFound
    - typingsSlinky.awsSdk.awsSdkStrings.PreconditionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceLimitExceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceFailure
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDenied
    - typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailable
    - typingsSlinky.awsSdk.awsSdkStrings.Throttled_
    - typingsSlinky.awsSdk.awsSdkStrings.Throttling_
    - typingsSlinky.awsSdk.awsSdkStrings.Unauthorized_
    - typingsSlinky.awsSdk.awsSdkStrings.Unprocessable
    - typingsSlinky.awsSdk.awsSdkStrings.VoiceConnectorGroupAssociationsExist
    - typingsSlinky.awsSdk.awsSdkStrings.PhoneNumberAssociationsExist
    - java.lang.String
  */
  type ErrorCode = typingsSlinky.awsSdk.chimeMod._ErrorCode | java.lang.String
  
  type ExternalMeetingIdType = java.lang.String
  
  type ExternalUserIdType = java.lang.String
  
  type FunctionArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Country_
    - typingsSlinky.awsSdk.awsSdkStrings.AreaCode
    - java.lang.String
  */
  type GeoMatchLevel = typingsSlinky.awsSdk.chimeMod._GeoMatchLevel | java.lang.String
  
  type GuidString = java.lang.String
  
  type Integer = scala.Double
  
  type InviteList = js.Array[typingsSlinky.awsSdk.chimeMod.Invite]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.Accepted_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type InviteStatus = typingsSlinky.awsSdk.chimeMod._InviteStatus | java.lang.String
  
  type Iso8601Timestamp = js.Date
  
  type JoinTokenString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Basic_
    - typingsSlinky.awsSdk.awsSdkStrings.Plus
    - typingsSlinky.awsSdk.awsSdkStrings.Pro
    - typingsSlinky.awsSdk.awsSdkStrings.ProTrial
    - java.lang.String
  */
  type License = typingsSlinky.awsSdk.chimeMod._License | java.lang.String
  
  type LicenseList = js.Array[typingsSlinky.awsSdk.chimeMod.License]
  
  type MaxResults = scala.Double
  
  type MeetingList = js.Array[typingsSlinky.awsSdk.chimeMod.Meeting]
  
  type MeetingTagKeyList = js.Array[typingsSlinky.awsSdk.chimeMod.TagKey]
  
  type MeetingTagList = js.Array[typingsSlinky.awsSdk.chimeMod.Tag]
  
  type MemberErrorList = js.Array[typingsSlinky.awsSdk.chimeMod.MemberError]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.User_
    - typingsSlinky.awsSdk.awsSdkStrings.Bot_
    - typingsSlinky.awsSdk.awsSdkStrings.Webhook
    - java.lang.String
  */
  type MemberType = typingsSlinky.awsSdk.chimeMod._MemberType | java.lang.String
  
  type MembershipItemList = js.Array[typingsSlinky.awsSdk.chimeMod.MembershipItem]
  
  type MessageId = java.lang.String
  
  type Metadata = java.lang.String
  
  type NextToken = java.lang.String
  
  type NextTokenString = java.lang.String
  
  type NonEmptyContent = java.lang.String
  
  type NonEmptyResourceName = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type NonEmptyString128 = java.lang.String
  
  type NonEmptyStringList = js.Array[typingsSlinky.awsSdk.chimeMod.String]
  
  type NonNullableBoolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EventBridge
    - typingsSlinky.awsSdk.awsSdkStrings.SNS
    - typingsSlinky.awsSdk.awsSdkStrings.SQS
    - java.lang.String
  */
  type NotificationTarget = typingsSlinky.awsSdk.chimeMod._NotificationTarget | java.lang.String
  
  type NullableBoolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PreferSticky
    - typingsSlinky.awsSdk.awsSdkStrings.AvoidSticky
    - java.lang.String
  */
  type NumberSelectionBehavior = typingsSlinky.awsSdk.chimeMod._NumberSelectionBehavior | java.lang.String
  
  type OrderedPhoneNumberList = js.Array[typingsSlinky.awsSdk.chimeMod.OrderedPhoneNumber]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Processing_
    - typingsSlinky.awsSdk.awsSdkStrings.Acquired
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = typingsSlinky.awsSdk.chimeMod._OrderedPhoneNumberStatus | java.lang.String
  
  type OriginationRouteList = js.Array[typingsSlinky.awsSdk.chimeMod.OriginationRoute]
  
  type OriginationRoutePriority = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TCP
    - typingsSlinky.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = typingsSlinky.awsSdk.chimeMod._OriginationRouteProtocol | java.lang.String
  
  type OriginationRouteWeight = scala.Double
  
  type ParticipantPhoneNumberList = js.Array[typingsSlinky.awsSdk.chimeMod.E164PhoneNumber]
  
  type Participants = js.Array[typingsSlinky.awsSdk.chimeMod.Participant]
  
  type PhoneNumberAssociationList = js.Array[typingsSlinky.awsSdk.chimeMod.PhoneNumberAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AccountId
    - typingsSlinky.awsSdk.awsSdkStrings.UserId
    - typingsSlinky.awsSdk.awsSdkStrings.VoiceConnectorId
    - typingsSlinky.awsSdk.awsSdkStrings.VoiceConnectorGroupId
    - typingsSlinky.awsSdk.awsSdkStrings.SipRuleId
    - java.lang.String
  */
  type PhoneNumberAssociationName = typingsSlinky.awsSdk.chimeMod._PhoneNumberAssociationName | java.lang.String
  
  type PhoneNumberErrorList = js.Array[typingsSlinky.awsSdk.chimeMod.PhoneNumberError]
  
  type PhoneNumberList = js.Array[typingsSlinky.awsSdk.chimeMod.PhoneNumber]
  
  type PhoneNumberMaxResults = scala.Double
  
  type PhoneNumberOrderList = js.Array[typingsSlinky.awsSdk.chimeMod.PhoneNumberOrder]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Processing_
    - typingsSlinky.awsSdk.awsSdkStrings.Successful_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Partial_
    - java.lang.String
  */
  type PhoneNumberOrderStatus = typingsSlinky.awsSdk.chimeMod._PhoneNumberOrderStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BusinessCalling
    - typingsSlinky.awsSdk.awsSdkStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = typingsSlinky.awsSdk.chimeMod._PhoneNumberProductType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AcquireInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.AcquireFailed
    - typingsSlinky.awsSdk.awsSdkStrings.Unassigned
    - typingsSlinky.awsSdk.awsSdkStrings.Assigned_
    - typingsSlinky.awsSdk.awsSdkStrings.ReleaseInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteInProgress
    - typingsSlinky.awsSdk.awsSdkStrings.ReleaseFailed
    - typingsSlinky.awsSdk.awsSdkStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = typingsSlinky.awsSdk.chimeMod._PhoneNumberStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Local_
    - typingsSlinky.awsSdk.awsSdkStrings.TollFree
    - java.lang.String
  */
  type PhoneNumberType = typingsSlinky.awsSdk.chimeMod._PhoneNumberType | java.lang.String
  
  type Port = scala.Double
  
  type PositiveInteger = scala.Double
  
  type ProfileServiceMaxResults = scala.Double
  
  type ProxySessionNameString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Open_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Closed_
    - java.lang.String
  */
  type ProxySessionStatus = typingsSlinky.awsSdk.chimeMod._ProxySessionStatus | java.lang.String
  
  type ProxySessions = js.Array[typingsSlinky.awsSdk.chimeMod.ProxySession]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Unregistered
    - typingsSlinky.awsSdk.awsSdkStrings.Registered_
    - typingsSlinky.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type RegistrationStatus = typingsSlinky.awsSdk.chimeMod._RegistrationStatus | java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResultMax = scala.Double
  
  type RetentionDays = scala.Double
  
  type RoomList = js.Array[typingsSlinky.awsSdk.chimeMod.Room]
  
  type RoomMembershipList = js.Array[typingsSlinky.awsSdk.chimeMod.RoomMembership]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Administrator_
    - typingsSlinky.awsSdk.awsSdkStrings.Member
    - java.lang.String
  */
  type RoomMembershipRole = typingsSlinky.awsSdk.chimeMod._RoomMembershipRole | java.lang.String
  
  type SensitiveString = java.lang.String
  
  type SensitiveStringList = js.Array[typingsSlinky.awsSdk.chimeMod.SensitiveString]
  
  type SigninDelegateGroupList = js.Array[typingsSlinky.awsSdk.chimeMod.SigninDelegateGroup]
  
  type SipApplicationPriority = scala.Double
  
  type SipMediaApplicationEndpointList = js.Array[typingsSlinky.awsSdk.chimeMod.SipMediaApplicationEndpoint]
  
  type SipMediaApplicationList = js.Array[typingsSlinky.awsSdk.chimeMod.SipMediaApplication]
  
  type SipMediaApplicationName = java.lang.String
  
  type SipRuleList = js.Array[typingsSlinky.awsSdk.chimeMod.SipRule]
  
  type SipRuleName = java.lang.String
  
  type SipRuleTargetApplicationList = js.Array[typingsSlinky.awsSdk.chimeMod.SipRuleTargetApplication]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ToPhoneNumber
    - typingsSlinky.awsSdk.awsSdkStrings.RequestUriHostname
    - java.lang.String
  */
  type SipRuleTriggerType = typingsSlinky.awsSdk.chimeMod._SipRuleTriggerType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.chimeMod._SortOrder | java.lang.String
  
  type StreamingNotificationTargetList = js.Array[typingsSlinky.awsSdk.chimeMod.StreamingNotificationTarget]
  
  type String = java.lang.String
  
  type String128 = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.chimeMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.chimeMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.chimeMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = js.Date
  
  type TollFreePrefix = java.lang.String
  
  type UpdatePhoneNumberRequestItemList = js.Array[typingsSlinky.awsSdk.chimeMod.UpdatePhoneNumberRequestItem]
  
  type UpdateUserRequestItemList = js.Array[typingsSlinky.awsSdk.chimeMod.UpdateUserRequestItem]
  
  type UriType = java.lang.String
  
  type UrlType = java.lang.String
  
  type UserEmailList = js.Array[typingsSlinky.awsSdk.chimeMod.EmailAddress]
  
  type UserErrorList = js.Array[typingsSlinky.awsSdk.chimeMod.UserError]
  
  type UserId = java.lang.String
  
  type UserIdList = js.Array[typingsSlinky.awsSdk.chimeMod.NonEmptyString]
  
  type UserList = js.Array[typingsSlinky.awsSdk.chimeMod.User]
  
  type UserName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PrivateUser
    - typingsSlinky.awsSdk.awsSdkStrings.SharedDevice
    - java.lang.String
  */
  type UserType = typingsSlinky.awsSdk.chimeMod._UserType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`us-east-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`us-west-2`
    - java.lang.String
  */
  type VoiceConnectorAwsRegion = typingsSlinky.awsSdk.chimeMod._VoiceConnectorAwsRegion | java.lang.String
  
  type VoiceConnectorGroupList = js.Array[typingsSlinky.awsSdk.chimeMod.VoiceConnectorGroup]
  
  type VoiceConnectorGroupName = java.lang.String
  
  type VoiceConnectorItemList = js.Array[typingsSlinky.awsSdk.chimeMod.VoiceConnectorItem]
  
  type VoiceConnectorItemPriority = scala.Double
  
  type VoiceConnectorList = js.Array[typingsSlinky.awsSdk.chimeMod.VoiceConnector]
  
  type VoiceConnectorName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-05-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.chimeMod._apiVersion | java.lang.String
}
