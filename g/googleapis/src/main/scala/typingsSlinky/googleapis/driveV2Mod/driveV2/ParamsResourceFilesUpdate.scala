package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesUpdate extends StandardParameters {
  /**
    * Comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * This parameter is deprecated and has no function.
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the file to update.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[AnonBody] = js.native
  /**
    * Determines the behavior in which modifiedDate is updated. This overrides
    * setModifiedDate.
    */
  var modifiedDateBehavior: js.UndefOr[String] = js.native
  /**
    * Whether a blob upload should create a new revision. If false, the blob
    * data in the current head revision is replaced. If true or not set, a new
    * blob is created as head revision, and previous unpinned revisions are
    * preserved for a short period of time. Pinned revisions are stored
    * indefinitely, using additional storage quota, up to a maximum of 200
    * revisions. For details on how revisions are retained, see the Drive Help
    * Center.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
  /**
    * Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    */
  var ocr: js.UndefOr[Boolean] = js.native
  /**
    * If ocr is true, hints at the language to use. Valid values are BCP 47
    * codes.
    */
  var ocrLanguage: js.UndefOr[String] = js.native
  /**
    * Whether to pin the new revision. A file can have a maximum of 200 pinned
    * revisions.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.native
  /**
    * Whether to set the modified date using the value supplied in the request
    * body. Setting this field to true is equivalent to
    * modifiedDateBehavior=fromBodyOrNow, and false is equivalent to
    * modifiedDateBehavior=now. To prevent any changes to the modified date set
    * modifiedDateBehavior=noChange.
    */
  var setModifiedDate: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * The language of the timed text.
    */
  var timedTextLanguage: js.UndefOr[String] = js.native
  /**
    * The timed text track name.
    */
  var timedTextTrackName: js.UndefOr[String] = js.native
  /**
    * Whether to update the view date after successfully updating the file.
    */
  var updateViewedDate: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}

object ParamsResourceFilesUpdate {
  @scala.inline
  def apply(): ParamsResourceFilesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesUpdate]
  }
  @scala.inline
  implicit class ParamsResourceFilesUpdateOps[Self <: ParamsResourceFilesUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddParents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParents")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withFileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDateBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDateBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedDateBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDateBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withNewRevision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withOcr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOcr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocr")(js.undefined)
        ret
    }
    @scala.inline
    def withOcrLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocrLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOcrLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocrLanguage")(js.undefined)
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
    def withRemoveParents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeParents")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModifiedDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsTeamDrives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTeamDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsTeamDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTeamDrives")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedTextLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedTextLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedTextLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedTextLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedTextTrackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedTextTrackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedTextTrackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedTextTrackName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateViewedDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViewedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateViewedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViewedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContentAsIndexableText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentAsIndexableText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContentAsIndexableText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentAsIndexableText")(js.undefined)
        ret
    }
  }
  
}

