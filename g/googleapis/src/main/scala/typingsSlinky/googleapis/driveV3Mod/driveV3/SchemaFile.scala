package typingsSlinky.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.anon.CameraMake
import typingsSlinky.googleapis.anon.CanChangeCopyRequiresWriterPermission
import typingsSlinky.googleapis.anon.DurationMillis
import typingsSlinky.googleapis.anon.IndexableText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a file.
  */
@js.native
trait SchemaFile extends StObject {
  
  /**
    * A collection of arbitrary key-value pairs which are private to the
    * requesting app. Entries with null values are cleared in update and copy
    * requests.
    */
  var appProperties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Capabilities the current user has on this file. Each capability
    * corresponds to a fine-grained action that a user may take.
    */
  var capabilities: js.UndefOr[CanChangeCopyRequiresWriterPermission] = js.native
  
  /**
    * Additional information about the content of the file. These fields are
    * never populated in responses.
    */
  var contentHints: js.UndefOr[IndexableText] = js.native
  
  /**
    * Whether the options to copy, print, or download this file, should be
    * disabled for readers and commenters.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /**
    * The time at which the file was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.native
  
  /**
    * A short description of the file.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether the file has been explicitly trashed, as opposed to recursively
    * trashed from a parent folder.
    */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The final component of fullFileExtension. This is only available for
    * files with binary content in Drive.
    */
  var fileExtension: js.UndefOr[String] = js.native
  
  /**
    * The color for a folder as an RGB hex string. The supported colors are
    * published in the folderColorPalette field of the About resource. If an
    * unsupported color is specified, the closest color in the palette will be
    * used instead.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  
  /**
    * The full file extension extracted from the name field. May contain
    * multiple concatenated extensions, such as &quot;tar.gz&quot;. This is
    * only available for files with binary content in Drive. This is
    * automatically updated when the name field changes, however it is not
    * cleared if the new name does not contain a valid extension.
    */
  var fullFileExtension: js.UndefOr[String] = js.native
  
  /**
    * Whether any users are granted file access directly on this file. This
    * field is only populated for Team Drive files.
    */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this file has a thumbnail. This does not indicate whether the
    * requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the file&#39;s head revision. This is currently only available
    * for files with binary content in Drive.
    */
  var headRevisionId: js.UndefOr[String] = js.native
  
  /**
    * A static, unauthenticated link to the file&#39;s icon.
    */
  var iconLink: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Additional metadata about image media, if available.
    */
  var imageMediaMetadata: js.UndefOr[CameraMake] = js.native
  
  /**
    * Whether the file was created or opened by the requesting app.
    */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#file&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The last user to modify the file.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The MD5 checksum for the content of the file. This is only applicable to
    * files with binary content in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /**
    * The MIME type of the file. Drive will attempt to automatically detect an
    * appropriate value from uploaded content if no value is provided. The
    * value cannot be changed unless a new revision is uploaded. If a file is
    * created with a Google Doc MIME type, the uploaded content will be
    * imported if possible. The supported import formats are published in the
    * About resource.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Whether the file has been modified by this user.
    */
  var modifiedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * The last time the file was modified by the user (RFC 3339 date-time).
    */
  var modifiedByMeTime: js.UndefOr[String] = js.native
  
  /**
    * The last time the file was modified by anyone (RFC 3339 date-time). Note
    * that setting modifiedTime will also update modifiedByMeTime for the user.
    */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the file. This is not necessarily unique within a folder.
    * Note that for immutable items such as the top level folders of Team
    * Drives, My Drive root folder, and Application Data folder the name is
    * constant.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The original filename of the uploaded content if available, or else the
    * original value of the name field. This is only available for files with
    * binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  
  /**
    * Whether the user owns the file. Not populated for Team Drive files.
    */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * The owners of the file. Currently, only certain legacy files may have
    * more than one owner. Not populated for Team Drive files.
    */
  var owners: js.UndefOr[js.Array[SchemaUser]] = js.native
  
  /**
    * The IDs of the parent folders which contain the file. If not specified as
    * part of a create request, the file will be placed directly in the
    * user&#39;s My Drive folder. If not specified as part of a copy request,
    * the file will inherit any discoverable parents of the source file. Update
    * requests must use the addParents and removeParents parameters to modify
    * the parents list.
    */
  var parents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of permission IDs for users with access to this file.
    */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The full list of permissions for the file. This is only available if the
    * requesting user can share the file. Not populated for Team Drive files.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  
  /**
    * A collection of arbitrary key-value pairs which are visible to all apps.
    * Entries with null values are cleared in update and copy requests.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The number of storage quota bytes used by the file. This includes the
    * head revision as well as previous revisions with keepForever enabled.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  
  /**
    * Whether the file has been shared. Not populated for Team Drive files.
    */
  var shared: js.UndefOr[Boolean] = js.native
  
  /**
    * The time at which the file was shared with the user, if applicable (RFC
    * 3339 date-time).
    */
  var sharedWithMeTime: js.UndefOr[String] = js.native
  
  /**
    * The user who shared the file with the requesting user, if applicable.
    */
  var sharingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The size of the file&#39;s content in bytes. This is only applicable to
    * files with binary content in Drive.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * The list of spaces which contain the file. The currently supported values
    * are &#39;drive&#39;, &#39;appDataFolder&#39; and &#39;photos&#39;.
    */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the user has starred the file.
    */
  var starred: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the Team Drive the file resides in.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  
  /**
    * A short-lived link to the file&#39;s thumbnail, if available. Typically
    * lasts on the order of hours. Only populated when the requesting app can
    * access the file&#39;s content.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  
  /**
    * The thumbnail version for use in thumbnail cache invalidation.
    */
  var thumbnailVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether the file has been trashed, either explicitly or from a trashed
    * parent folder. Only the owner may trash a file, and other users cannot
    * see files in the owner&#39;s trash.
    */
  var trashed: js.UndefOr[Boolean] = js.native
  
  /**
    * The time that the item was trashed (RFC 3339 date-time). Only populated
    * for Team Drive files.
    */
  var trashedTime: js.UndefOr[String] = js.native
  
  /**
    * If the file has been explicitly trashed, the user who trashed it. Only
    * populated for Team Drive files.
    */
  var trashingUser: js.UndefOr[SchemaUser] = js.native
  
  /**
    * A monotonically increasing version number for the file. This reflects
    * every change made to the file on the server, even those not visible to
    * the user.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * Additional metadata about video media. This may not be available
    * immediately upon upload.
    */
  var videoMediaMetadata: js.UndefOr[DurationMillis] = js.native
  
  /**
    * Whether the file has been viewed by this user.
    */
  var viewedByMe: js.UndefOr[Boolean] = js.native
  
  /**
    * The last time the file was viewed by the user (RFC 3339 date-time).
    */
  var viewedByMeTime: js.UndefOr[String] = js.native
  
  /**
    * Deprecated - use copyRequiresWriterPermission instead.
    */
  var viewersCanCopyContent: js.UndefOr[Boolean] = js.native
  
  /**
    * A link for downloading the content of the file in a browser. This is only
    * available for files with binary content in Drive.
    */
  var webContentLink: js.UndefOr[String] = js.native
  
  /**
    * A link for opening the file in a relevant Google editor or viewer in a
    * browser.
    */
  var webViewLink: js.UndefOr[String] = js.native
  
  /**
    * Whether users with only writer permission can modify the file&#39;s
    * permissions. Not populated for Team Drive files.
    */
  var writersCanShare: js.UndefOr[Boolean] = js.native
}
object SchemaFile {
  
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  @scala.inline
  implicit class SchemaFileMutableBuilder[Self <: SchemaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppProperties(value: StringDictionary[String]): Self = StObject.set(x, "appProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPropertiesUndefined: Self = StObject.set(x, "appProperties", js.undefined)
    
    @scala.inline
    def setCapabilities(value: CanChangeCopyRequiresWriterPermission): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setContentHints(value: IndexableText): Self = StObject.set(x, "contentHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHintsUndefined: Self = StObject.set(x, "contentHints", js.undefined)
    
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExplicitlyTrashed(value: Boolean): Self = StObject.set(x, "explicitlyTrashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitlyTrashedUndefined: Self = StObject.set(x, "explicitlyTrashed", js.undefined)
    
    @scala.inline
    def setExportLinks(value: StringDictionary[String]): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    @scala.inline
    def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    @scala.inline
    def setFolderColorRgb(value: String): Self = StObject.set(x, "folderColorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderColorRgbUndefined: Self = StObject.set(x, "folderColorRgb", js.undefined)
    
    @scala.inline
    def setFullFileExtension(value: String): Self = StObject.set(x, "fullFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullFileExtensionUndefined: Self = StObject.set(x, "fullFileExtension", js.undefined)
    
    @scala.inline
    def setHasAugmentedPermissions(value: Boolean): Self = StObject.set(x, "hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAugmentedPermissionsUndefined: Self = StObject.set(x, "hasAugmentedPermissions", js.undefined)
    
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
    
    @scala.inline
    def setHeadRevisionId(value: String): Self = StObject.set(x, "headRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadRevisionIdUndefined: Self = StObject.set(x, "headRevisionId", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageMediaMetadata(value: CameraMake): Self = StObject.set(x, "imageMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMediaMetadataUndefined: Self = StObject.set(x, "imageMediaMetadata", js.undefined)
    
    @scala.inline
    def setIsAppAuthorized(value: Boolean): Self = StObject.set(x, "isAppAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppAuthorizedUndefined: Self = StObject.set(x, "isAppAuthorized", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: SchemaUser): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setModifiedByMe(value: Boolean): Self = StObject.set(x, "modifiedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByMeTime(value: String): Self = StObject.set(x, "modifiedByMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByMeTimeUndefined: Self = StObject.set(x, "modifiedByMeTime", js.undefined)
    
    @scala.inline
    def setModifiedByMeUndefined: Self = StObject.set(x, "modifiedByMe", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    @scala.inline
    def setOwnedByMe(value: Boolean): Self = StObject.set(x, "ownedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedByMeUndefined: Self = StObject.set(x, "ownedByMe", js.undefined)
    
    @scala.inline
    def setOwners(value: js.Array[SchemaUser]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: SchemaUser*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setPermissionIds(value: js.Array[String]): Self = StObject.set(x, "permissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdsUndefined: Self = StObject.set(x, "permissionIds", js.undefined)
    
    @scala.inline
    def setPermissionIdsVarargs(value: String*): Self = StObject.set(x, "permissionIds", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSharedWithMeTime(value: String): Self = StObject.set(x, "sharedWithMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithMeTimeUndefined: Self = StObject.set(x, "sharedWithMeTime", js.undefined)
    
    @scala.inline
    def setSharingUser(value: SchemaUser): Self = StObject.set(x, "sharingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingUserUndefined: Self = StObject.set(x, "sharingUser", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    @scala.inline
    def setSpacesVarargs(value: String*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    @scala.inline
    def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    
    @scala.inline
    def setThumbnailVersion(value: String): Self = StObject.set(x, "thumbnailVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailVersionUndefined: Self = StObject.set(x, "thumbnailVersion", js.undefined)
    
    @scala.inline
    def setTrashed(value: Boolean): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashedTime(value: String): Self = StObject.set(x, "trashedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashedTimeUndefined: Self = StObject.set(x, "trashedTime", js.undefined)
    
    @scala.inline
    def setTrashedUndefined: Self = StObject.set(x, "trashed", js.undefined)
    
    @scala.inline
    def setTrashingUser(value: SchemaUser): Self = StObject.set(x, "trashingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashingUserUndefined: Self = StObject.set(x, "trashingUser", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVideoMediaMetadata(value: DurationMillis): Self = StObject.set(x, "videoMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMediaMetadataUndefined: Self = StObject.set(x, "videoMediaMetadata", js.undefined)
    
    @scala.inline
    def setViewedByMe(value: Boolean): Self = StObject.set(x, "viewedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewedByMeTime(value: String): Self = StObject.set(x, "viewedByMeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewedByMeTimeUndefined: Self = StObject.set(x, "viewedByMeTime", js.undefined)
    
    @scala.inline
    def setViewedByMeUndefined: Self = StObject.set(x, "viewedByMe", js.undefined)
    
    @scala.inline
    def setViewersCanCopyContent(value: Boolean): Self = StObject.set(x, "viewersCanCopyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewersCanCopyContentUndefined: Self = StObject.set(x, "viewersCanCopyContent", js.undefined)
    
    @scala.inline
    def setWebContentLink(value: String): Self = StObject.set(x, "webContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentLinkUndefined: Self = StObject.set(x, "webContentLink", js.undefined)
    
    @scala.inline
    def setWebViewLink(value: String): Self = StObject.set(x, "webViewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebViewLinkUndefined: Self = StObject.set(x, "webViewLink", js.undefined)
    
    @scala.inline
    def setWritersCanShare(value: Boolean): Self = StObject.set(x, "writersCanShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritersCanShareUndefined: Self = StObject.set(x, "writersCanShare", js.undefined)
  }
}
