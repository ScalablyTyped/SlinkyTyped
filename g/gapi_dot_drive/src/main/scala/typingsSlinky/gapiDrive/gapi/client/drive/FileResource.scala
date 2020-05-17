package typingsSlinky.gapiDrive.gapi.client.drive

import typingsSlinky.gapiDrive.anon.Aperture
import typingsSlinky.gapiDrive.anon.CanAddChildren
import typingsSlinky.gapiDrive.anon.DisplayName
import typingsSlinky.gapiDrive.anon.DurationMillis
import typingsSlinky.gapiDrive.anon.Hidden
import typingsSlinky.gapiDrive.anon.Image
import typingsSlinky.gapiDrive.anon.Text
import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersignfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileResource extends js.Object {
  var alternateLink: String = js.native
  var appDataContents: Boolean = js.native
  var canComment: Boolean = js.native
  var canReadRevisions: Boolean = js.native
  var capabilities: CanAddChildren = js.native
  var copyable: Boolean = js.native
  var createdDate: js.Date = js.native
  // openWithLinks
  var defaultOpenWithLink: String = js.native
  var description: String = js.native
  var downloadUrl: String = js.native
  var editable: Boolean = js.native
  var embedLink: String = js.native
  var etag: String = js.native
  var explicitlyTrashed: Boolean = js.native
  var fileExtension: String = js.native
  var fileSize: Double = js.native
  var folderColorRgb: String = js.native
  var fullFileExtension: String = js.native
  var hasAugmentedPermissions: Boolean = js.native
  var hasThumbnail: Boolean = js.native
  var headRevisionId: String = js.native
  var iconLink: String = js.native
  var id: String = js.native
  var imageMediaMetadata: Aperture = js.native
  // exportLinks
  var indexableText: Text = js.native
  var isAppAuthorized: Boolean = js.native
  var kind: driveNumbersignfile = js.native
  var labels: Hidden = js.native
  var lastModifyingUser: DisplayName = js.native
  var lastModifyingUserName: String = js.native
  var lastViewedByMeDate: js.Date = js.native
  var markedViewedByMeDate: js.Date = js.native
  var md5Checksum: String = js.native
  var mimeType: String = js.native
  var modifiedByMeDate: js.Date = js.native
  var modifiedDate: js.Date = js.native
  var originalFilename: String = js.native
  var ownedByMe: Boolean = js.native
  var ownerNames: js.Array[String] = js.native
  var owners: js.Array[DisplayName] = js.native
  var parents: js.Array[ParentResource] = js.native
  var permissions: js.Array[PermissionResource] = js.native
  var properties: js.Array[PropertiesResource] = js.native
  var quotaBytesUsed: Double = js.native
  var selfLink: String = js.native
  var shareable: Boolean = js.native
  var shared: Boolean = js.native
  var sharedWithMeDate: js.Date = js.native
  var sharingUser: DisplayName = js.native
  var spaces: js.Array[String] = js.native
  var teamDriveId: String = js.native
  var thumbnail: Image = js.native
  var thumbnailLink: String = js.native
  var title: String = js.native
  var trashedDate: js.Date = js.native
  var trashingUser: DisplayName = js.native
  var userPermission: PermissionResource = js.native
  var version: Double = js.native
  var videoMediaMetadata: DurationMillis = js.native
  var webContentLink: String = js.native
  var webViewLink: String = js.native
  var writersCanShare: Boolean = js.native
}

object FileResource {
  @scala.inline
  def apply(
    alternateLink: String,
    appDataContents: Boolean,
    canComment: Boolean,
    canReadRevisions: Boolean,
    capabilities: CanAddChildren,
    copyable: Boolean,
    createdDate: js.Date,
    defaultOpenWithLink: String,
    description: String,
    downloadUrl: String,
    editable: Boolean,
    embedLink: String,
    etag: String,
    explicitlyTrashed: Boolean,
    fileExtension: String,
    fileSize: Double,
    folderColorRgb: String,
    fullFileExtension: String,
    hasAugmentedPermissions: Boolean,
    hasThumbnail: Boolean,
    headRevisionId: String,
    iconLink: String,
    id: String,
    imageMediaMetadata: Aperture,
    indexableText: Text,
    isAppAuthorized: Boolean,
    kind: driveNumbersignfile,
    labels: Hidden,
    lastModifyingUser: DisplayName,
    lastModifyingUserName: String,
    lastViewedByMeDate: js.Date,
    markedViewedByMeDate: js.Date,
    md5Checksum: String,
    mimeType: String,
    modifiedByMeDate: js.Date,
    modifiedDate: js.Date,
    originalFilename: String,
    ownedByMe: Boolean,
    ownerNames: js.Array[String],
    owners: js.Array[DisplayName],
    parents: js.Array[ParentResource],
    permissions: js.Array[PermissionResource],
    properties: js.Array[PropertiesResource],
    quotaBytesUsed: Double,
    selfLink: String,
    shareable: Boolean,
    shared: Boolean,
    sharedWithMeDate: js.Date,
    sharingUser: DisplayName,
    spaces: js.Array[String],
    teamDriveId: String,
    thumbnail: Image,
    thumbnailLink: String,
    title: String,
    trashedDate: js.Date,
    trashingUser: DisplayName,
    userPermission: PermissionResource,
    version: Double,
    videoMediaMetadata: DurationMillis,
    webContentLink: String,
    webViewLink: String,
    writersCanShare: Boolean
  ): FileResource = {
    val __obj = js.Dynamic.literal(alternateLink = alternateLink.asInstanceOf[js.Any], appDataContents = appDataContents.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], copyable = copyable.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], defaultOpenWithLink = defaultOpenWithLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], embedLink = embedLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], explicitlyTrashed = explicitlyTrashed.asInstanceOf[js.Any], fileExtension = fileExtension.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], folderColorRgb = folderColorRgb.asInstanceOf[js.Any], fullFileExtension = fullFileExtension.asInstanceOf[js.Any], hasAugmentedPermissions = hasAugmentedPermissions.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], headRevisionId = headRevisionId.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageMediaMetadata = imageMediaMetadata.asInstanceOf[js.Any], indexableText = indexableText.asInstanceOf[js.Any], isAppAuthorized = isAppAuthorized.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastModifyingUser = lastModifyingUser.asInstanceOf[js.Any], lastModifyingUserName = lastModifyingUserName.asInstanceOf[js.Any], lastViewedByMeDate = lastViewedByMeDate.asInstanceOf[js.Any], markedViewedByMeDate = markedViewedByMeDate.asInstanceOf[js.Any], md5Checksum = md5Checksum.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedByMeDate = modifiedByMeDate.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], ownedByMe = ownedByMe.asInstanceOf[js.Any], ownerNames = ownerNames.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quotaBytesUsed = quotaBytesUsed.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], shareable = shareable.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], sharedWithMeDate = sharedWithMeDate.asInstanceOf[js.Any], sharingUser = sharingUser.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], teamDriveId = teamDriveId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], thumbnailLink = thumbnailLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trashedDate = trashedDate.asInstanceOf[js.Any], trashingUser = trashingUser.asInstanceOf[js.Any], userPermission = userPermission.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], videoMediaMetadata = videoMediaMetadata.asInstanceOf[js.Any], webContentLink = webContentLink.asInstanceOf[js.Any], webViewLink = webViewLink.asInstanceOf[js.Any], writersCanShare = writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResource]
  }
  @scala.inline
  implicit class FileResourceOps[Self <: FileResource] (val x: Self) extends AnyVal {
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
    def withAppDataContents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDataContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanReadRevisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: CanAddChildren): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOpenWithLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenWithLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplicitlyTrashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitlyTrashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderColorRgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderColorRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullFileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAugmentedPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAugmentedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageMediaMetadata(value: Aperture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexableText(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexableText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAppAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersignfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: Hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifyingUser(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifyingUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyingUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastViewedByMeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastViewedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkedViewedByMeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markedViewedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5Checksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedByMeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedByMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnedByMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedByMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[DisplayName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[ParentResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[PermissionResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[PropertiesResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotaBytesUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaBytesUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedWithMeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithMeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharingUser(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrashedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrashingUser(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trashingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPermission(value: PermissionResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoMediaMetadata(value: DurationMillis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebContentLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webContentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebViewLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webViewLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritersCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writersCanShare")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

