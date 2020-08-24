package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitoidentityserviceproviderMod {
  type AWSAccountIdType = java.lang.String
  type AccountTakeoverActionNotifyType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BLOCK
    - typingsSlinky.awsSdk.awsSdkStrings.MFA_IF_CONFIGURED
    - typingsSlinky.awsSdk.awsSdkStrings.MFA_REQUIRED
    - typingsSlinky.awsSdk.awsSdkStrings.NO_ACTION
    - java.lang.String
  */
  type AccountTakeoverEventActionType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._AccountTakeoverEventActionType | java.lang.String
  type AdminCreateUserUnusedAccountValidityDaysType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.AUDIT
    - typingsSlinky.awsSdk.awsSdkStrings.ENFORCED
    - java.lang.String
  */
  type AdvancedSecurityModeType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._AdvancedSecurityModeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.phone_number
    - typingsSlinky.awsSdk.awsSdkStrings.email__
    - typingsSlinky.awsSdk.awsSdkStrings.preferred_username
    - java.lang.String
  */
  type AliasAttributeType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._AliasAttributeType | java.lang.String
  type AliasAttributesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AliasAttributeType]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.String_
    - typingsSlinky.awsSdk.awsSdkStrings.Number_
    - typingsSlinky.awsSdk.awsSdkStrings.DateTime_
    - typingsSlinky.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type AttributeDataType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._AttributeDataType | java.lang.String
  type AttributeListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AttributeType]
  type AttributeMappingKeyType = java.lang.String
  type AttributeMappingType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type AttributeNameListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]
  type AttributeNameType = java.lang.String
  type AttributeValueType = java.lang.String
  type AuthEventsType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AuthEventType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.REFRESH_TOKEN_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.REFRESH_TOKEN
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_USER_PASSWORD_AUTH
    - java.lang.String
  */
  type AuthFlowType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._AuthFlowType | java.lang.String
  type AuthParametersType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type BlockedIPRangeListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type BooleanType = scala.Boolean
  type CSSType = java.lang.String
  type CSSVersionType = java.lang.String
  type CallbackURLsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Password_
    - typingsSlinky.awsSdk.awsSdkStrings.Mfa
    - java.lang.String
  */
  type ChallengeName = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._ChallengeName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SMS_MFA
    - typingsSlinky.awsSdk.awsSdkStrings.SOFTWARE_TOKEN_MFA
    - typingsSlinky.awsSdk.awsSdkStrings.SELECT_MFA_TYPE
    - typingsSlinky.awsSdk.awsSdkStrings.MFA_SETUP
    - typingsSlinky.awsSdk.awsSdkStrings.PASSWORD_VERIFIER
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_CHALLENGE
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_PASSWORD_VERIFIER
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.NEW_PASSWORD_REQUIRED
    - java.lang.String
  */
  type ChallengeNameType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._ChallengeNameType | java.lang.String
  type ChallengeParametersType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type ChallengeResponse = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._ChallengeResponse | java.lang.String
  type ChallengeResponseListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponseType]
  type ChallengeResponsesType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientApiVersions
  type ClientIdType = java.lang.String
  type ClientMetadataType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ClientNameType = java.lang.String
  type ClientPermissionListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ClientPermissionType]
  type ClientPermissionType = java.lang.String
  type ClientSecretType = java.lang.String
  type CodeDeliveryDetailsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.CodeDeliveryDetailsType]
  type CompletionMessageType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BLOCK
    - typingsSlinky.awsSdk.awsSdkStrings.NO_ACTION
    - java.lang.String
  */
  type CompromisedCredentialsEventActionType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._CompromisedCredentialsEventActionType | java.lang.String
  type ConfirmationCodeType = java.lang.String
  type CustomAttributeNameType = java.lang.String
  type CustomAttributesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]
  type DateType = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIRM_WITH_LINK
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIRM_WITH_CODE
    - java.lang.String
  */
  type DefaultEmailOptionType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._DefaultEmailOptionType | java.lang.String
  type DeliveryMediumListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.DeliveryMediumType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SMS
    - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type DeliveryMediumType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._DeliveryMediumType | java.lang.String
  type DescriptionType = java.lang.String
  type DeviceKeyType = java.lang.String
  type DeviceListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.DeviceType]
  type DeviceNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.remembered
    - typingsSlinky.awsSdk.awsSdkStrings.not_remembered
    - java.lang.String
  */
  type DeviceRememberedStatusType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._DeviceRememberedStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatusType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._DomainStatusType | java.lang.String
  type DomainType = java.lang.String
  type DomainVersionType = java.lang.String
  type EmailAddressType = java.lang.String
  type EmailNotificationBodyType = java.lang.String
  type EmailNotificationSubjectType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COGNITO_DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.DEVELOPER
    - java.lang.String
  */
  type EmailSendingAccountType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._EmailSendingAccountType | java.lang.String
  type EmailVerificationMessageByLinkType = java.lang.String
  type EmailVerificationMessageType = java.lang.String
  type EmailVerificationSubjectByLinkType = java.lang.String
  type EmailVerificationSubjectType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SIGN_IN
    - typingsSlinky.awsSdk.awsSdkStrings.PASSWORD_CHANGE
    - typingsSlinky.awsSdk.awsSdkStrings.SIGN_UP
    - java.lang.String
  */
  type EventFilterType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._EventFilterType | java.lang.String
  type EventFiltersType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.EventFilterType]
  type EventIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type EventResponseType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._EventResponseType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SignIn
    - typingsSlinky.awsSdk.awsSdkStrings.SignUp
    - typingsSlinky.awsSdk.awsSdkStrings.ForgotPassword
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._EventType | java.lang.String
  type ExplicitAuthFlowsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ExplicitAuthFlowsType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOM_AUTH_FLOW_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_ADMIN_USER_PASSWORD_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_CUSTOM_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_USER_PASSWORD_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_USER_SRP_AUTH
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW_REFRESH_TOKEN_AUTH
    - java.lang.String
  */
  type ExplicitAuthFlowsType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._ExplicitAuthFlowsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Valid_
    - typingsSlinky.awsSdk.awsSdkStrings.Invalid_
    - java.lang.String
  */
  type FeedbackValueType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._FeedbackValueType | java.lang.String
  type ForceAliasCreation = scala.Boolean
  type GenerateSecret = scala.Boolean
  type GroupListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.GroupType]
  type GroupNameType = java.lang.String
  type HexStringType = java.lang.String
  type HttpHeaderList = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.HttpHeader]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAML
    - typingsSlinky.awsSdk.awsSdkStrings.Facebook
    - typingsSlinky.awsSdk.awsSdkStrings.Google
    - typingsSlinky.awsSdk.awsSdkStrings.LoginWithAmazon
    - typingsSlinky.awsSdk.awsSdkStrings.SignInWithApple
    - typingsSlinky.awsSdk.awsSdkStrings.OIDC
    - java.lang.String
  */
  type IdentityProviderTypeType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._IdentityProviderTypeType | java.lang.String
  type IdpIdentifierType = java.lang.String
  type IdpIdentifiersListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.IdpIdentifierType]
  type ImageFileType = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.Blob | java.lang.String
  type ImageUrlType = java.lang.String
  type IntegerType = scala.Double
  type ListOfStringTypes = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ListProvidersLimitType = scala.Double
  type ListResourceServersLimitType = scala.Double
  type LogoutURLsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]
  type LongType = scala.Double
  type MFAOptionListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.MFAOptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESEND
    - typingsSlinky.awsSdk.awsSdkStrings.SUPPRESS
    - java.lang.String
  */
  type MessageActionType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._MessageActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.code
    - typingsSlinky.awsSdk.awsSdkStrings.`implicit`
    - typingsSlinky.awsSdk.awsSdkStrings.client_credentials
    - java.lang.String
  */
  type OAuthFlowType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._OAuthFlowType | java.lang.String
  type OAuthFlowsType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.OAuthFlowType]
  type PaginationKey = java.lang.String
  type PaginationKeyType = java.lang.String
  type PasswordPolicyMinLengthType = scala.Double
  type PasswordType = java.lang.String
  type PoolQueryLimitType = scala.Double
  type PreSignedUrlType = java.lang.String
  type PrecedenceType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LEGACY
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type PreventUserExistenceErrorTypes = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._PreventUserExistenceErrorTypes | java.lang.String
  type PriorityType = scala.Double
  type ProviderDetailsType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ProviderNameType = java.lang.String
  type ProviderNameTypeV1 = java.lang.String
  type ProvidersListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ProviderDescription]
  type QueryLimit = scala.Double
  type QueryLimitType = scala.Double
  type RecoveryMechanismsType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.RecoveryOptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.verified_email
    - typingsSlinky.awsSdk.awsSdkStrings.verified_phone_number
    - typingsSlinky.awsSdk.awsSdkStrings.admin_only
    - java.lang.String
  */
  type RecoveryOptionNameType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._RecoveryOptionNameType | java.lang.String
  type RedirectUrlType = java.lang.String
  type RefreshTokenValidityType = scala.Double
  type ResourceServerIdentifierType = java.lang.String
  type ResourceServerNameType = java.lang.String
  type ResourceServerScopeDescriptionType = java.lang.String
  type ResourceServerScopeListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ResourceServerScopeType]
  type ResourceServerScopeNameType = java.lang.String
  type ResourceServersListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ResourceServerType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NoRisk
    - typingsSlinky.awsSdk.awsSdkStrings.AccountTakeover
    - typingsSlinky.awsSdk.awsSdkStrings.Block_
    - java.lang.String
  */
  type RiskDecisionType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._RiskDecisionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Low_
    - typingsSlinky.awsSdk.awsSdkStrings.Medium_
    - typingsSlinky.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type RiskLevelType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._RiskLevelType | java.lang.String
  type S3BucketType = java.lang.String
  type SESConfigurationSet = java.lang.String
  type SchemaAttributesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]
  type ScopeListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ScopeType]
  type ScopeType = java.lang.String
  type SearchPaginationTokenType = java.lang.String
  type SearchedAttributeNamesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]
  type SecretCodeType = java.lang.String
  type SecretHashType = java.lang.String
  type SessionType = java.lang.String
  type SkippedIPRangeListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type SmsVerificationMessageType = java.lang.String
  type SoftwareTokenMFAUserCodeType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Enabled_
    - typingsSlinky.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type StatusType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._StatusType | java.lang.String
  type StringType = java.lang.String
  type SupportedIdentityProvidersListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ProviderNameType]
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TemporaryPasswordValidityDaysType = scala.Double
  type TokenModelType = java.lang.String
  type UserFilterType = java.lang.String
  type UserImportJobIdType = java.lang.String
  type UserImportJobNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Created_
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
    - typingsSlinky.awsSdk.awsSdkStrings.Expired_
    - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type UserImportJobStatusType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._UserImportJobStatusType | java.lang.String
  type UserImportJobsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.UserImportJobType]
  type UserMFASettingListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type UserPoolClientListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.UserPoolClientDescription]
  type UserPoolIdType = java.lang.String
  type UserPoolListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.UserPoolDescriptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.ON
    - typingsSlinky.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type UserPoolMfaType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._UserPoolMfaType | java.lang.String
  type UserPoolNameType = java.lang.String
  type UserPoolTagsListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.TagKeysType]
  type UserPoolTagsType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.TagValueType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNCONFIRMED
    - typingsSlinky.awsSdk.awsSdkStrings.CONFIRMED
    - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPROMISED
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.RESET_REQUIRED
    - typingsSlinky.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD
    - java.lang.String
  */
  type UserStatusType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._UserStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.phone_number
    - typingsSlinky.awsSdk.awsSdkStrings.email__
    - java.lang.String
  */
  type UsernameAttributeType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._UsernameAttributeType | java.lang.String
  type UsernameAttributesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.UsernameAttributeType]
  type UsernameType = java.lang.String
  type UsersListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.UserType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.phone_number
    - typingsSlinky.awsSdk.awsSdkStrings.email__
    - java.lang.String
  */
  type VerifiedAttributeType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._VerifiedAttributeType | java.lang.String
  type VerifiedAttributesListType = js.Array[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.VerifiedAttributeType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type VerifySoftwareTokenResponseType = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._VerifySoftwareTokenResponseType | java.lang.String
  type WrappedBooleanType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-04-18`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cognitoidentityserviceproviderMod._apiVersion | java.lang.String
}
