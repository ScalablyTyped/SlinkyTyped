package typingsSlinky.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonAperture
import typingsSlinky.googleapis.AnonCanAddChildren
import typingsSlinky.googleapis.AnonDurationMillis
import typingsSlinky.googleapis.AnonHidden
import typingsSlinky.googleapis.AnonMimeType
import typingsSlinky.googleapis.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a file.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * A link for opening the file in a relevant Google editor or viewer.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Whether this file is in the Application Data folder.
    */
  var appDataContents: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canComment.
    */
  var canComment: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canReadRevisions.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  /**
    * Capabilities the current user has on this file. Each capability
    * corresponds to a fine-grained action that a user may take.
    */
  var capabilities: js.UndefOr[AnonCanAddChildren] = js.native
  /**
    * Whether the options to copy, print, or download this file, should be
    * disabled for readers and commenters.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: use capabilities/canCopy.
    */
  var copyable: js.UndefOr[Boolean] = js.native
  /**
    * Create time for this file (formatted RFC 3339 timestamp).
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * A link to open this file with the user&#39;s default app for this file.
    * Only populated when the drive.apps.readonly scope is used.
    */
  var defaultOpenWithLink: js.UndefOr[String] = js.native
  /**
    * A short description of the file.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Short lived download URL for the file. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * Deprecated: use capabilities/canEdit.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * A link for embedding the file.
    */
  var embedLink: js.UndefOr[String] = js.native
  /**
    * ETag of the file.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Whether this file has been explicitly trashed, as opposed to recursively
    * trashed.
    */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The final component of fullFileExtension with trailing text that does not
    * appear to be part of the extension removed. This field is only populated
    * for files with content stored in Drive; it is not populated for Google
    * Docs or shortcut files.
    */
  var fileExtension: js.UndefOr[String] = js.native
  /**
    * The size of the file in bytes. This field is only populated for files
    * with content stored in Drive; it is not populated for Google Docs or
    * shortcut files.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * Folder color as an RGB hex string if the file is a folder. The list of
    * supported colors is available in the folderColorPalette field of the
    * About resource. If an unsupported color is specified, it will be changed
    * to the closest color in the palette. Not populated for Team Drive files.
    */
  var folderColorRgb: js.UndefOr[String] = js.native
  /**
    * The full file extension; extracted from the title. May contain multiple
    * concatenated extensions, such as &quot;tar.gz&quot;. Removing an
    * extension from the title does not clear this field; however, changing the
    * extension on the title does update this field. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
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
    * The ID of the file&#39;s head revision. This field is only populated for
    * files with content stored in Drive; it is not populated for Google Docs
    * or shortcut files.
    */
  var headRevisionId: js.UndefOr[String] = js.native
  /**
    * A link to the file&#39;s icon.
    */
  var iconLink: js.UndefOr[String] = js.native
  /**
    * The ID of the file.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Metadata about image media. This will only be present for image types,
    * and its contents will depend on what can be parsed from the image
    * content.
    */
  var imageMediaMetadata: js.UndefOr[AnonAperture] = js.native
  /**
    * Indexable text attributes for the file (can only be written)
    */
  var indexableText: js.UndefOr[AnonText] = js.native
  /**
    * Whether the file was created or opened by the requesting app.
    */
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * The type of file. This is always drive#file.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A group of labels for the file.
    */
  var labels: js.UndefOr[AnonHidden] = js.native
  /**
    * The last user to modify this file.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  /**
    * Name of the last user to modify this file.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  /**
    * Last time this file was viewed by the user (formatted RFC 3339
    * timestamp).
    */
  var lastViewedByMeDate: js.UndefOr[String] = js.native
  /**
    * Deprecated.
    */
  var markedViewedByMeDate: js.UndefOr[String] = js.native
  /**
    * An MD5 checksum for the content of this file. This field is only
    * populated for files with content stored in Drive; it is not populated for
    * Google Docs or shortcut files.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the file. This is only mutable on update when uploading
    * new content. This field can be left blank, and the mimetype will be
    * determined from the uploaded content&#39;s MIME type.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Last time this file was modified by the user (formatted RFC 3339
    * timestamp). Note that setting modifiedDate will also update the
    * modifiedByMe date for the user which set the date.
    */
  var modifiedByMeDate: js.UndefOr[String] = js.native
  /**
    * Last time this file was modified by anyone (formatted RFC 3339
    * timestamp). This is only mutable on update when the setModifiedDate
    * parameter is set.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * A map of the id of each of the user&#39;s apps to a link to open this
    * file with that app. Only populated when the drive.apps.readonly scope is
    * used.
    */
  var openWithLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The original filename of the uploaded content if available, or else the
    * original value of the title field. This is only available for files with
    * binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /**
    * Whether the file is owned by the current user. Not populated for Team
    * Drive files.
    */
  var ownedByMe: js.UndefOr[Boolean] = js.native
  /**
    * Name(s) of the owner(s) of this file. Not populated for Team Drive files.
    */
  var ownerNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The owner(s) of this file. Not populated for Team Drive files.
    */
  var owners: js.UndefOr[js.Array[SchemaUser]] = js.native
  /**
    * Collection of parent folders which contain this file. If not specified as
    * part of an insert request, the file will be placed directly in the
    * user&#39;s My Drive folder. If not specified as part of a copy request,
    * the file will inherit any discoverable parents of the source file. Update
    * requests can also use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[SchemaParentReference]] = js.native
  /**
    * List of permission IDs for users with access to this file.
    */
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of permissions for users with access to this file. Not populated
    * for Team Drive files.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * The list of properties.
    */
  var properties: js.UndefOr[js.Array[SchemaProperty]] = js.native
  /**
    * The number of quota bytes used by this file.
    */
  var quotaBytesUsed: js.UndefOr[String] = js.native
  /**
    * A link back to this file.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Deprecated: use capabilities/canShare.
    */
  var shareable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the file has been shared. Not populated for Team Drive files.
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * Time at which this file was shared with the user (formatted RFC 3339
    * timestamp).
    */
  var sharedWithMeDate: js.UndefOr[String] = js.native
  /**
    * User that shared the item with the current user, if available.
    */
  var sharingUser: js.UndefOr[SchemaUser] = js.native
  /**
    * The list of spaces which contain the file. Supported values are
    * &#39;drive&#39;, &#39;appDataFolder&#39; and &#39;photos&#39;.
    */
  var spaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the Team Drive the file resides in.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * A thumbnail for the file. This will only be used if Drive cannot generate
    * a standard thumbnail.
    */
  var thumbnail: js.UndefOr[AnonMimeType] = js.native
  /**
    * A short-lived link to the file&#39;s thumbnail. Typically lasts on the
    * order of hours. Only populated when the requesting app can access the
    * file&#39;s content.
    */
  var thumbnailLink: js.UndefOr[String] = js.native
  /**
    * The thumbnail version for use in thumbnail cache invalidation.
    */
  var thumbnailVersion: js.UndefOr[String] = js.native
  /**
    * The title of this file. Note that for immutable items such as the top
    * level folders of Team Drives, My Drive root folder, and Application Data
    * folder the title is constant.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time that the item was trashed (formatted RFC 3339 timestamp). Only
    * populated for Team Drive files.
    */
  var trashedDate: js.UndefOr[String] = js.native
  /**
    * If the file has been explicitly trashed, the user who trashed it. Only
    * populated for Team Drive files.
    */
  var trashingUser: js.UndefOr[SchemaUser] = js.native
  /**
    * The permissions for the authenticated user on this file.
    */
  var userPermission: js.UndefOr[SchemaPermission] = js.native
  /**
    * A monotonically increasing version number for the file. This reflects
    * every change made to the file on the server, even those not visible to
    * the requesting user.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Metadata about video media. This will only be present for video types.
    */
  var videoMediaMetadata: js.UndefOr[AnonDurationMillis] = js.native
  /**
    * A link for downloading the content of the file in a browser using cookie
    * based authentication. In cases where the content is shared publicly, the
    * content can be downloaded without any credentials.
    */
  var webContentLink: js.UndefOr[String] = js.native
  /**
    * A link only available on public folders for viewing their static web
    * assets (HTML, CSS, JS, etc) via Google Drive&#39;s Website Hosting.
    */
  var webViewLink: js.UndefOr[String] = js.native
  /**
    * Whether writers can share the document with other users. Not populated
    * for Team Drive files.
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
  implicit class SchemaFileOps[Self <: SchemaFile] (val x: Self) extends AnyVal {
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
    def withExportLinks(value: StringDictionary[String]): Self = {
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
    def withIndexableText(value: AnonText): Self = {
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
    def withLabels(value: AnonHidden): Self = {
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
    def withLastModifyingUser(value: SchemaUser): Self = {
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
    def withOpenWithLinks(value: StringDictionary[String]): Self = {
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
    def withOwners(value: js.Array[SchemaUser]): Self = {
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
    def withParents(value: js.Array[SchemaParentReference]): Self = {
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
    def withPermissions(value: js.Array[SchemaPermission]): Self = {
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
    def withProperties(value: js.Array[SchemaProperty]): Self = {
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
    def withSharingUser(value: SchemaUser): Self = {
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
    def withThumbnail(value: AnonMimeType): Self = {
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
    def withTrashingUser(value: SchemaUser): Self = {
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
    def withUserPermission(value: SchemaPermission): Self = {
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

