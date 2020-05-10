package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClientDrive.AnonAperture
import typingsSlinky.gapiClientDrive.AnonCanAddChildren
import typingsSlinky.gapiClientDrive.AnonDurationMillis
import typingsSlinky.gapiClientDrive.AnonIndexableText
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * A collection of arbitrary key-value pairs which are private to the requesting app.
    * Entries with null values are cleared in update and copy requests.
    */
  var appProperties: js.UndefOr[Record[String, String]] = js.native
  /** Capabilities the current user has on this file. Each capability corresponds to a fine-grained action that a user may take. */
  var capabilities: js.UndefOr[AnonCanAddChildren] = js.native
  /** Additional information about the content of the file. These fields are never populated in responses. */
  var contentHints: js.UndefOr[AnonIndexableText] = js.native
  /** The time at which the file was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.native
  /** A short description of the file. */
  var description: js.UndefOr[String] = js.native
  /** Whether the file has been explicitly trashed, as opposed to recursively trashed from a parent folder. */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  /** The final component of fullFileExtension. This is only available for files with binary content in Drive. */
  var fileExtension: js.UndefOr[String] = js.native
  /**
    * The color for a folder as an RGB hex string. The supported colors are published in the folderColorPalette field of the About resource.
    * If an unsupported color is specified, the closest color in the palette will be used instead.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  /**
    * The full file extension extracted from the name field. May contain multiple concatenated extensions, such as "tar.gz". This is only available for files
    * with binary content in Drive.
    * This is automatically updated when the name field changes, however it is not cleared if the new name does not contain a valid extension.
    */
  var fullFileExtension: js.UndefOr[String] = js.native
  /** Whether any users are granted file access directly on this file. This field is only populated for Team Drive files. */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  /**
    * Whether this file has a thumbnail. This does not indicate whether the requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  /** The ID of the file's head revision. This is currently only available for files with binary content in Drive. */
  var headRevisionId: js.UndefOr[String] = js.native
  /** A static, unauthenticated link to the file's icon. */
  var iconLink: js.UndefOr[String] = js.native
  /** The ID of the file. */
  var id: js.UndefOr[String] = js.native
  /** Additional metadata about image media, if available. */
  var imageMediaMetadata: js.UndefOr[AnonAperture] = js.native
  /** Whether the file was created or opened by the requesting app. */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "drive#file". */
  var kind: js.UndefOr[String] = js.native
  /** The last user to modify the file. */
  var lastModifyingUser: js.UndefOr[User] = js.native
  /** The MD5 checksum for the content of the file. This is only applicable to files with binary content in Drive. */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the file.
    * Drive will attempt to automatically detect an appropriate value from uploaded content if no value is provided. The value cannot be changed unless a new
    * revision is uploaded.
    * If a file is created with a Google Doc MIME type, the uploaded content will be imported if possible. The supported import formats are published in the
    * About resource.
    */
  var mimeType: js.UndefOr[String] = js.native
  /** Whether the file has been modified by this user. */
  var modifiedByMe: js.UndefOr[Boolean] = js.native
  /** The last time the file was modified by the user (RFC 3339 date-time). */
  var modifiedByMeTime: js.UndefOr[String] = js.native
  /**
    * The last time the file was modified by anyone (RFC 3339 date-time).
    * Note that setting modifiedTime will also update modifiedByMeTime for the user.
    */
  var modifiedTime: js.UndefOr[String] = js.native
  /**
    * The name of the file. This is not necessarily unique within a folder. Note that for immutable items such as the top level folders of Team Drives, My
    * Drive root folder, and Application Data folder the name is constant.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The original filename of the uploaded content if available, or else the original value of the name field. This is only available for files with binary
    * content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /** Whether the user owns the file. Not populated for Team Drive files. */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  /** The owners of the file. Currently, only certain legacy files may have more than one owner. Not populated for Team Drive files. */
  var owners: js.UndefOr[js.Array[User]] = js.native
  /**
    * The IDs of the parent folders which contain the file.
    * If not specified as part of a create request, the file will be placed directly in the user's My Drive folder. If not specified as part of a copy
    * request, the file will inherit any discoverable parents of the source file. Update requests must use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[String]] = js.native
  /** List of permission IDs for users with access to this file. */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  /** The full list of permissions for the file. This is only available if the requesting user can share the file. Not populated for Team Drive files. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
  /**
    * A collection of arbitrary key-value pairs which are visible to all apps.
    * Entries with null values are cleared in update and copy requests.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /** The number of storage quota bytes used by the file. This includes the head revision as well as previous revisions with keepForever enabled. */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  /** Whether the file has been shared. Not populated for Team Drive files. */
  var shared: js.UndefOr[Boolean] = js.native
  /** The time at which the file was shared with the user, if applicable (RFC 3339 date-time). */
  var sharedWithMeTime: js.UndefOr[String] = js.native
  /** The user who shared the file with the requesting user, if applicable. */
  var sharingUser: js.UndefOr[User] = js.native
  /** The size of the file's content in bytes. This is only applicable to files with binary content in Drive. */
  var size: js.UndefOr[String] = js.native
  /** The list of spaces which contain the file. The currently supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  /** Whether the user has starred the file. */
  var starred: js.UndefOr[Boolean] = js.native
  /** ID of the Team Drive the file resides in. */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * A short-lived link to the file's thumbnail, if available. Typically lasts on the order of hours. Only populated when the requesting app can access the
    * file's content.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  /** The thumbnail version for use in thumbnail cache invalidation. */
  var thumbnailVersion: js.UndefOr[String] = js.native
  /**
    * Whether the file has been trashed, either explicitly or from a trashed parent folder. Only the owner may trash a file, and other users cannot see files
    * in the owner's trash.
    */
  var trashed: js.UndefOr[Boolean] = js.native
  /** The time that the item was trashed (RFC 3339 date-time). Only populated for Team Drive files. */
  var trashedTime: js.UndefOr[String] = js.native
  /** If the file has been explicitly trashed, the user who trashed it. Only populated for Team Drive files. */
  var trashingUser: js.UndefOr[User] = js.native
  /** A monotonically increasing version number for the file. This reflects every change made to the file on the server, even those not visible to the user. */
  var version: js.UndefOr[String] = js.native
  /** Additional metadata about video media. This may not be available immediately upon upload. */
  var videoMediaMetadata: js.UndefOr[AnonDurationMillis] = js.native
  /** Whether the file has been viewed by this user. */
  var viewedByMe: js.UndefOr[Boolean] = js.native
  /** The last time the file was viewed by the user (RFC 3339 date-time). */
  var viewedByMeTime: js.UndefOr[String] = js.native
  /** Whether users with only reader or commenter permission can copy the file's content. This affects copy, download, and print operations. */
  var viewersCanCopyContent: js.UndefOr[Boolean] = js.native
  /** A link for downloading the content of the file in a browser. This is only available for files with binary content in Drive. */
  var webContentLink: js.UndefOr[String] = js.native
  /** A link for opening the file in a relevant Google editor or viewer in a browser. */
  var webViewLink: js.UndefOr[String] = js.native
  /** Whether users with only writer permission can modify the file's permissions. Not populated for Team Drive files. */
  var writersCanShare: js.UndefOr[Boolean] = js.native
}

object File {
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppProperties(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: AnonCanAddChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHints(value: AnonIndexableText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHints")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitlyTrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitlyTrashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitlyTrashed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitlyTrashed")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withFolderColorRgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderColorRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderColorRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderColorRgb")(js.undefined)
        ret
    }
    @scala.inline
    def withFullFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullFileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullFileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAugmentedPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAugmentedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAugmentedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAugmentedPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withHasThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRevisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMediaMetadata(value: AnonAperture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMediaMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMediaMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAppAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAppAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifyingUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifyingUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUser")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5Checksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Checksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedByMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedByMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMe")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedByMeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedByMeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnedByMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedByMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnedByMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedByMe")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withParents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaBytesUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaBytesUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedWithMeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithMeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedWithMeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithMeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashed")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashingUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashingUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashingUser")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoMediaMetadata(value: AnonDurationMillis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoMediaMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMediaMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withViewedByMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedByMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewedByMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedByMe")(js.undefined)
        ret
    }
    @scala.inline
    def withViewedByMeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedByMeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewedByMeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewedByMeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withViewersCanCopyContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewersCanCopyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewersCanCopyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewersCanCopyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withWebContentLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webContentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebContentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webContentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWebViewLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webViewLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebViewLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webViewLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWritersCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writersCanShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritersCanShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writersCanShare")(js.undefined)
        ret
    }
  }
  
}

