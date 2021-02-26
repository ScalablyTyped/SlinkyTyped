package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workdocsMod {
  
  type ActivityNamesFilterType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_IN
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_RENAMED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_VERSION_UPLOADED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_VERSION_VIEWED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DOWNLOADED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_RECYCLED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_RESTORED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_REVERTED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_SHARED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_UNSHARED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_SHARE_PERMISSION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_MOVED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_ADDED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_ADDED
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_RENAMED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_RECYCLED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_RESTORED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_SHARED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_UNSHARED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_SHARE_PERMISSION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER_MOVED
    - java.lang.String
  */
  type ActivityType = typingsSlinky.awsSdk.workdocsMod._ActivityType | java.lang.String
  
  type AuthenticationHeaderType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRUE
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type BooleanEnumType = typingsSlinky.awsSdk.workdocsMod._BooleanEnumType | java.lang.String
  
  type BooleanType = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.workdocsMod.ClientApiVersions
  
  type CommentIdType = java.lang.String
  
  type CommentList = js.Array[typingsSlinky.awsSdk.workdocsMod.Comment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLISHED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CommentStatusType = typingsSlinky.awsSdk.workdocsMod._CommentStatusType | java.lang.String
  
  type CommentTextType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
    - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CommentVisibilityType = typingsSlinky.awsSdk.workdocsMod._CommentVisibilityType | java.lang.String
  
  type CustomMetadataKeyList = js.Array[typingsSlinky.awsSdk.workdocsMod.CustomMetadataKeyType]
  
  type CustomMetadataKeyType = java.lang.String
  
  type CustomMetadataMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.workdocsMod.CustomMetadataValueType]
  
  type CustomMetadataValueType = java.lang.String
  
  type DocumentContentType = java.lang.String
  
  type DocumentMetadataList = js.Array[typingsSlinky.awsSdk.workdocsMod.DocumentMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ORIGINAL
    - typingsSlinky.awsSdk.awsSdkStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = typingsSlinky.awsSdk.workdocsMod._DocumentSourceType | java.lang.String
  
  type DocumentSourceUrlMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.workdocsMod.UrlType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DocumentStatusType = typingsSlinky.awsSdk.workdocsMod._DocumentStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SMALL
    - typingsSlinky.awsSdk.awsSdkStrings.SMALL_HQ
    - typingsSlinky.awsSdk.awsSdkStrings.LARGE
    - java.lang.String
  */
  type DocumentThumbnailType = typingsSlinky.awsSdk.workdocsMod._DocumentThumbnailType | java.lang.String
  
  type DocumentThumbnailUrlMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.workdocsMod.UrlType]
  
  type DocumentVersionIdType = java.lang.String
  
  type DocumentVersionMetadataList = js.Array[typingsSlinky.awsSdk.workdocsMod.DocumentVersionMetadata]
  
  type DocumentVersionStatus = typingsSlinky.awsSdk.awsSdkStrings.ACTIVE | java.lang.String
  
  type EmailAddressType = java.lang.String
  
  type FieldNamesType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type FolderContentType = typingsSlinky.awsSdk.workdocsMod._FolderContentType | java.lang.String
  
  type FolderMetadataList = js.Array[typingsSlinky.awsSdk.workdocsMod.FolderMetadata]
  
  type GroupMetadataList = js.Array[typingsSlinky.awsSdk.workdocsMod.GroupMetadata]
  
  type GroupNameType = java.lang.String
  
  type HashType = java.lang.String
  
  type HeaderNameType = java.lang.String
  
  type HeaderValueType = java.lang.String
  
  type IdType = java.lang.String
  
  type LimitType = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.en_
    - typingsSlinky.awsSdk.awsSdkStrings.fr_
    - typingsSlinky.awsSdk.awsSdkStrings.ko
    - typingsSlinky.awsSdk.awsSdkStrings.de_
    - typingsSlinky.awsSdk.awsSdkStrings.es_
    - typingsSlinky.awsSdk.awsSdkStrings.ja_
    - typingsSlinky.awsSdk.awsSdkStrings.ru_
    - typingsSlinky.awsSdk.awsSdkStrings.zh_CN
    - typingsSlinky.awsSdk.awsSdkStrings.zh_TW
    - typingsSlinky.awsSdk.awsSdkStrings.pt_BR
    - typingsSlinky.awsSdk.awsSdkStrings.default__
    - java.lang.String
  */
  type LocaleType = typingsSlinky.awsSdk.workdocsMod._LocaleType | java.lang.String
  
  type MarkerType = java.lang.String
  
  type MessageType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type OrderType = typingsSlinky.awsSdk.workdocsMod._OrderType | java.lang.String
  
  type OrganizationUserList = js.Array[typingsSlinky.awsSdk.workdocsMod.User]
  
  type PageMarkerType = java.lang.String
  
  type PasswordType = java.lang.String
  
  type PermissionInfoList = js.Array[typingsSlinky.awsSdk.workdocsMod.PermissionInfo]
  
  type PositiveIntegerType = scala.Double
  
  type PositiveSizeType = scala.Double
  
  type PrincipalList = js.Array[typingsSlinky.awsSdk.workdocsMod.Principal]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.INVITE
    - typingsSlinky.awsSdk.awsSdkStrings.ANONYMOUS
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type PrincipalType = typingsSlinky.awsSdk.workdocsMod._PrincipalType | java.lang.String
  
  type ResourceCollectionType = typingsSlinky.awsSdk.awsSdkStrings.SHARED_WITH_ME | java.lang.String
  
  type ResourceIdType = java.lang.String
  
  type ResourceNameType = java.lang.String
  
  type ResourcePathComponentList = js.Array[typingsSlinky.awsSdk.workdocsMod.ResourcePathComponent]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - java.lang.String
  */
  type ResourceSortType = typingsSlinky.awsSdk.workdocsMod._ResourceSortType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.RESTORING
    - typingsSlinky.awsSdk.awsSdkStrings.RECYCLING
    - typingsSlinky.awsSdk.awsSdkStrings.RECYCLED
    - java.lang.String
  */
  type ResourceStateType = typingsSlinky.awsSdk.workdocsMod._ResourceStateType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FOLDER
    - typingsSlinky.awsSdk.awsSdkStrings.DOCUMENT
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.workdocsMod._ResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DIRECT
    - typingsSlinky.awsSdk.awsSdkStrings.INHERITED
    - java.lang.String
  */
  type RolePermissionType = typingsSlinky.awsSdk.workdocsMod._RolePermissionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VIEWER
    - typingsSlinky.awsSdk.awsSdkStrings.CONTRIBUTOR
    - typingsSlinky.awsSdk.awsSdkStrings.OWNER
    - typingsSlinky.awsSdk.awsSdkStrings.COOWNER
    - java.lang.String
  */
  type RoleType = typingsSlinky.awsSdk.workdocsMod._RoleType | java.lang.String
  
  type SearchQueryType = java.lang.String
  
  type SharePrincipalList = js.Array[typingsSlinky.awsSdk.workdocsMod.SharePrincipal]
  
  type ShareResultsList = js.Array[typingsSlinky.awsSdk.workdocsMod.ShareResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ShareStatusType = typingsSlinky.awsSdk.workdocsMod._ShareStatusType | java.lang.String
  
  type SharedLabel = java.lang.String
  
  type SharedLabels = js.Array[typingsSlinky.awsSdk.workdocsMod.SharedLabel]
  
  type SignedHeaderMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.workdocsMod.HeaderValueType]
  
  type SizeType = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNLIMITED
    - typingsSlinky.awsSdk.awsSdkStrings.QUOTA
    - java.lang.String
  */
  type StorageType = typingsSlinky.awsSdk.workdocsMod._StorageType | java.lang.String
  
  type SubscriptionEndPointType = java.lang.String
  
  type SubscriptionList = js.Array[typingsSlinky.awsSdk.workdocsMod.Subscription]
  
  type SubscriptionProtocolType = typingsSlinky.awsSdk.awsSdkStrings.HTTPS | java.lang.String
  
  type SubscriptionType = typingsSlinky.awsSdk.awsSdkStrings.ALL | java.lang.String
  
  type TimeZoneIdType = java.lang.String
  
  type TimestampType = js.Date
  
  type UrlType = java.lang.String
  
  type UserActivities = js.Array[typingsSlinky.awsSdk.workdocsMod.Activity]
  
  type UserAttributeValueType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE_PENDING
    - java.lang.String
  */
  type UserFilterType = typingsSlinky.awsSdk.workdocsMod._UserFilterType | java.lang.String
  
  type UserIdsType = java.lang.String
  
  type UserMetadataList = js.Array[typingsSlinky.awsSdk.workdocsMod.UserMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_LIMIT
    - typingsSlinky.awsSdk.awsSdkStrings.USER_STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.STORAGE_USED
    - java.lang.String
  */
  type UserSortType = typingsSlinky.awsSdk.workdocsMod._UserSortType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type UserStatusType = typingsSlinky.awsSdk.workdocsMod._UserStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.ADMIN
    - typingsSlinky.awsSdk.awsSdkStrings.POWERUSER
    - typingsSlinky.awsSdk.awsSdkStrings.MINIMALUSER
    - typingsSlinky.awsSdk.awsSdkStrings.WORKSPACESUSER
    - java.lang.String
  */
  type UserType = typingsSlinky.awsSdk.workdocsMod._UserType | java.lang.String
  
  type UsernameType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-05-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.workdocsMod._apiVersion | java.lang.String
}
