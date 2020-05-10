package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var alternateLink: js.UndefOr[String] = js.native
  var appDataContents: js.UndefOr[Boolean] = js.native
  var canComment: js.UndefOr[Boolean] = js.native
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  var capabilities: js.UndefOr[FileCapabilities] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var createdDate: js.UndefOr[String] = js.native
  var defaultOpenWithLink: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var downloadUrl: js.UndefOr[String] = js.native
  var driveId: js.UndefOr[String] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var embedLink: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  var exportLinks: js.UndefOr[js.Object] = js.native
  var fileExtension: js.UndefOr[String] = js.native
  var fileSize: js.UndefOr[String] = js.native
  var folderColorRgb: js.UndefOr[String] = js.native
  var fullFileExtension: js.UndefOr[String] = js.native
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  var headRevisionId: js.UndefOr[String] = js.native
  var iconLink: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var imageMediaMetadata: js.UndefOr[FileImageMediaMetadata] = js.native
  var indexableText: js.UndefOr[FileIndexableText] = js.native
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[FileLabels] = js.native
  var lastModifyingUser: js.UndefOr[User] = js.native
  var lastModifyingUserName: js.UndefOr[String] = js.native
  var lastViewedByMeDate: js.UndefOr[String] = js.native
  var markedViewedByMeDate: js.UndefOr[String] = js.native
  var md5Checksum: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var modifiedByMeDate: js.UndefOr[String] = js.native
  var modifiedDate: js.UndefOr[String] = js.native
  var openWithLinks: js.UndefOr[js.Object] = js.native
  var originalFilename: js.UndefOr[String] = js.native
  var ownedByMe: js.UndefOr[Boolean] = js.native
  var ownerNames: js.UndefOr[js.Array[String]] = js.native
  var owners: js.UndefOr[js.Array[User]] = js.native
  var parents: js.UndefOr[js.Array[ParentReference]] = js.native
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
  var properties: js.UndefOr[js.Array[Property]] = js.native
  var quotaBytesUsed: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var shareable: js.UndefOr[Boolean] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var sharedWithMeDate: js.UndefOr[String] = js.native
  var sharingUser: js.UndefOr[User] = js.native
  var spaces: js.UndefOr[js.Array[String]] = js.native
  var teamDriveId: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[FileThumbnail] = js.native
  var thumbnailLink: js.UndefOr[String] = js.native
  var thumbnailVersion: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var trashedDate: js.UndefOr[String] = js.native
  var trashingUser: js.UndefOr[User] = js.native
  var userPermission: js.UndefOr[Permission] = js.native
  var version: js.UndefOr[String] = js.native
  var videoMediaMetadata: js.UndefOr[FileVideoMediaMetadata] = js.native
  var webContentLink: js.UndefOr[String] = js.native
  var webViewLink: js.UndefOr[String] = js.native
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
    def withAlternateLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAppDataContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDataContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDataContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDataContents")(js.undefined)
        ret
    }
    @scala.inline
    def withCanComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(js.undefined)
        ret
    }
    @scala.inline
    def withCanReadRevisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanReadRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: FileCapabilities): Self = {
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
    def withCopyRequiresWriterPermission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRequiresWriterPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyRequiresWriterPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRequiresWriterPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyable")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpenWithLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenWithLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpenWithLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenWithLink")(js.undefined)
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
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withExportLinks(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportLinks")(js.undefined)
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
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
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
    def withImageMediaMetadata(value: FileImageMediaMetadata): Self = {
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
    def withIndexableText(value: FileIndexableText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexableText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexableText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexableText")(js.undefined)
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
    def withLabels(value: FileLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
    def withLastModifyingUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifyingUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastViewedByMeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViewedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastViewedByMeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViewedByMeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkedViewedByMeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markedViewedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkedViewedByMeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markedViewedByMeDate")(js.undefined)
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
    def withModifiedByMeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedByMeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenWithLinks(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWithLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenWithLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWithLinks")(js.undefined)
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
    def withOwnerNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerNames")(js.undefined)
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
    def withParents(value: js.Array[ParentReference]): Self = {
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
    def withProperties(value: js.Array[Property]): Self = {
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
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withShareable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareable")(js.undefined)
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
    def withSharedWithMeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedWithMeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithMeDate")(js.undefined)
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
    def withThumbnail(value: FileThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrashedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrashedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashedDate")(js.undefined)
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
    def withUserPermission(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermission")(js.undefined)
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
    def withVideoMediaMetadata(value: FileVideoMediaMetadata): Self = {
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

