package typingsSlinky.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A revision of a file.
  */
@js.native
trait SchemaRevision extends js.Object {
  /**
    * Short term download URL for the file. This will only be populated on
    * files with content stored in Drive.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * The ETag of the revision.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The size of the revision in bytes. This will only be populated on files
    * with content stored in Drive.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#revision.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  /**
    * Name of the last user to modify this revision.
    */
  var lastModifyingUserName: js.UndefOr[String] = js.native
  /**
    * An MD5 checksum for the content of this revision. This will only be
    * populated on files with content stored in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Last time this revision was modified (formatted RFC 3339 timestamp).
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * The original filename when this revision was created. This will only be
    * populated on files with content stored in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /**
    * Whether this revision is pinned to prevent automatic purging. This will
    * only be populated and can only be modified on files with content stored
    * in Drive which are not Google Docs. Revisions can also be pinned when
    * they are created through the drive.files.insert/update/copy by using the
    * pinned query parameter.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only populated and can only be modified for Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.native
  /**
    * Whether this revision is published. This is only populated and can only
    * be modified for Google Docs.
    */
  var published: js.UndefOr[Boolean] = js.native
  /**
    * A link to the published revision.
    */
  var publishedLink: js.UndefOr[String] = js.native
  /**
    * Whether this revision is published outside the domain. This is only
    * populated and can only be modified for Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  /**
    * A link back to this revision.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaRevision {
  @scala.inline
  def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  @scala.inline
  implicit class SchemaRevisionOps[Self <: SchemaRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedOutsideDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedOutsideDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedOutsideDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedOutsideDomain")(js.undefined)
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
  }
  
}

