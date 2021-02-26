package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appstreamMod {
  
  type AccessEndpointList = js.Array[typingsSlinky.awsSdk.appstreamMod.AccessEndpoint]
  
  type AccessEndpointType = typingsSlinky.awsSdk.awsSdkStrings.STREAMING | java.lang.String
  
  type AccountName = java.lang.String
  
  type AccountPassword = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
    - typingsSlinky.awsSdk.awsSdkStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_UPLOAD
    - typingsSlinky.awsSdk.awsSdkStrings.FILE_DOWNLOAD
    - typingsSlinky.awsSdk.awsSdkStrings.PRINTING_TO_LOCAL_DEVICE
    - java.lang.String
  */
  type Action = typingsSlinky.awsSdk.appstreamMod._Action | java.lang.String
  
  type Applications = js.Array[typingsSlinky.awsSdk.appstreamMod.Application]
  
  type AppstreamAgentVersion = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnList = js.Array[typingsSlinky.awsSdk.appstreamMod.Arn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.API
    - typingsSlinky.awsSdk.awsSdkStrings.SAML
    - typingsSlinky.awsSdk.awsSdkStrings.USERPOOL
    - java.lang.String
  */
  type AuthenticationType = typingsSlinky.awsSdk.appstreamMod._AuthenticationType | java.lang.String
  
  type AwsAccountId = java.lang.String
  
  type AwsAccountIdList = js.Array[typingsSlinky.awsSdk.appstreamMod.AwsAccountId]
  
  type Boolean = scala.Boolean
  
  type BooleanObject = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.appstreamMod.ClientApiVersions
  
  type DescribeImagesMaxResults = scala.Double
  
  type Description = java.lang.String
  
  type DirectoryConfigList = js.Array[typingsSlinky.awsSdk.appstreamMod.DirectoryConfig]
  
  type DirectoryName = java.lang.String
  
  type DirectoryNameList = js.Array[typingsSlinky.awsSdk.appstreamMod.DirectoryName]
  
  type DisplayName = java.lang.String
  
  type Domain = java.lang.String
  
  type DomainList = js.Array[typingsSlinky.awsSdk.appstreamMod.Domain]
  
  type EmbedHostDomain = java.lang.String
  
  type EmbedHostDomains = js.Array[typingsSlinky.awsSdk.appstreamMod.EmbedHostDomain]
  
  type FeedbackURL = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_INFO
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE_ARN
    - java.lang.String
  */
  type FleetAttribute = typingsSlinky.awsSdk.appstreamMod._FleetAttribute | java.lang.String
  
  type FleetAttributes = js.Array[typingsSlinky.awsSdk.appstreamMod.FleetAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_IS_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.MACHINE_ROLE_IS_MISSING
    - typingsSlinky.awsSdk.awsSdkStrings.STS_DISABLED_IN_REGION
    - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.INVALID_SUBNET_CONFIGURATION
    - typingsSlinky.awsSdk.awsSdkStrings.SECURITY_GROUPS_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.IGW_NOT_ATTACHED
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_MORE_DATA
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED
    - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type FleetErrorCode = typingsSlinky.awsSdk.appstreamMod._FleetErrorCode | java.lang.String
  
  type FleetErrors = js.Array[typingsSlinky.awsSdk.appstreamMod.FleetError]
  
  type FleetList = js.Array[typingsSlinky.awsSdk.appstreamMod.Fleet]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type FleetState = typingsSlinky.awsSdk.appstreamMod._FleetState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS_ON
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type FleetType = typingsSlinky.awsSdk.appstreamMod._FleetType | java.lang.String
  
  type ImageBuilderList = js.Array[typingsSlinky.awsSdk.appstreamMod.ImageBuilder]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING_AGENT
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.REBOOTING
    - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOTTING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ImageBuilderState = typingsSlinky.awsSdk.appstreamMod._ImageBuilderState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_UNAVAILABLE
    - java.lang.String
  */
  type ImageBuilderStateChangeReasonCode = typingsSlinky.awsSdk.appstreamMod._ImageBuilderStateChangeReasonCode | java.lang.String
  
  type ImageList = js.Array[typingsSlinky.awsSdk.appstreamMod.Image]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COPYING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ImageState = typingsSlinky.awsSdk.appstreamMod._ImageState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE
    - java.lang.String
  */
  type ImageStateChangeReasonCode = typingsSlinky.awsSdk.appstreamMod._ImageStateChangeReasonCode | java.lang.String
  
  type Integer = scala.Double
  
  type LastReportGenerationExecutionErrors = js.Array[typingsSlinky.awsSdk.appstreamMod.LastReportGenerationExecutionError]
  
  type Long = scala.Double
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUPPRESS
    - typingsSlinky.awsSdk.awsSdkStrings.RESEND
    - java.lang.String
  */
  type MessageAction = typingsSlinky.awsSdk.appstreamMod._MessageAction | java.lang.String
  
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.appstreamMod.String]
  
  type Name = java.lang.String
  
  type OrganizationalUnitDistinguishedName = java.lang.String
  
  type OrganizationalUnitDistinguishedNamesList = js.Array[typingsSlinky.awsSdk.appstreamMod.OrganizationalUnitDistinguishedName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.appstreamMod._Permission | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019
    - java.lang.String
  */
  type PlatformType = typingsSlinky.awsSdk.appstreamMod._PlatformType | java.lang.String
  
  type RedirectURL = java.lang.String
  
  type RegionName = java.lang.String
  
  type ResourceErrors = js.Array[typingsSlinky.awsSdk.appstreamMod.ResourceError]
  
  type ResourceIdentifier = java.lang.String
  
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.appstreamMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONNECTED
    - java.lang.String
  */
  type SessionConnectionState = typingsSlinky.awsSdk.appstreamMod._SessionConnectionState | java.lang.String
  
  type SessionList = js.Array[typingsSlinky.awsSdk.appstreamMod.Session]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type SessionState = typingsSlinky.awsSdk.appstreamMod._SessionState | java.lang.String
  
  type SettingsGroup = java.lang.String
  
  type SharedImagePermissionsList = js.Array[typingsSlinky.awsSdk.appstreamMod.SharedImagePermissions]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_CONNECTORS
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_HOMEFOLDERS
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ONE_DRIVE
    - typingsSlinky.awsSdk.awsSdkStrings.REDIRECT_URL
    - typingsSlinky.awsSdk.awsSdkStrings.FEEDBACK_URL
    - typingsSlinky.awsSdk.awsSdkStrings.THEME_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.USER_SETTINGS
    - typingsSlinky.awsSdk.awsSdkStrings.EMBED_HOST_DOMAINS
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_ROLE_ARN
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_ENDPOINTS
    - java.lang.String
  */
  type StackAttribute = typingsSlinky.awsSdk.appstreamMod._StackAttribute | java.lang.String
  
  type StackAttributes = js.Array[typingsSlinky.awsSdk.appstreamMod.StackAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type StackErrorCode = typingsSlinky.awsSdk.appstreamMod._StackErrorCode | java.lang.String
  
  type StackErrors = js.Array[typingsSlinky.awsSdk.appstreamMod.StackError]
  
  type StackList = js.Array[typingsSlinky.awsSdk.appstreamMod.Stack]
  
  type StorageConnectorList = js.Array[typingsSlinky.awsSdk.appstreamMod.StorageConnector]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HOMEFOLDERS
    - typingsSlinky.awsSdk.awsSdkStrings.GOOGLE_DRIVE
    - typingsSlinky.awsSdk.awsSdkStrings.ONE_DRIVE
    - java.lang.String
  */
  type StorageConnectorType = typingsSlinky.awsSdk.appstreamMod._StorageConnectorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.APP
    - typingsSlinky.awsSdk.awsSdkStrings.DESKTOP
    - java.lang.String
  */
  type StreamView = typingsSlinky.awsSdk.appstreamMod._StreamView | java.lang.String
  
  type StreamingUrlUserId = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.appstreamMod.String]
  
  type SubnetIdList = js.Array[typingsSlinky.awsSdk.appstreamMod.String]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.appstreamMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.appstreamMod.TagValue]
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type UsageReportExecutionErrorCode = typingsSlinky.awsSdk.appstreamMod._UsageReportExecutionErrorCode | java.lang.String
  
  type UsageReportSchedule = typingsSlinky.awsSdk.awsSdkStrings.DAILY | java.lang.String
  
  type UsageReportSubscriptionList = js.Array[typingsSlinky.awsSdk.appstreamMod.UsageReportSubscription]
  
  type UserAttributeValue = java.lang.String
  
  type UserId = java.lang.String
  
  type UserList = js.Array[typingsSlinky.awsSdk.appstreamMod.User]
  
  type UserSettingList = js.Array[typingsSlinky.awsSdk.appstreamMod.UserSetting]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STACK_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.USER_NAME_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECTORY_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type UserStackAssociationErrorCode = typingsSlinky.awsSdk.appstreamMod._UserStackAssociationErrorCode | java.lang.String
  
  type UserStackAssociationErrorList = js.Array[typingsSlinky.awsSdk.appstreamMod.UserStackAssociationError]
  
  type UserStackAssociationList = js.Array[typingsSlinky.awsSdk.appstreamMod.UserStackAssociation]
  
  type Username = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - typingsSlinky.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type VisibilityType = typingsSlinky.awsSdk.appstreamMod._VisibilityType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.appstreamMod._apiVersion | java.lang.String
}
