package typingsSlinky.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.native
  var fileId: String = js.native
  var ocr: js.UndefOr[Boolean] = js.native
  var ocrLanguage: js.UndefOr[String] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[FileResource] = js.native
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  var timedTextLanguage: js.UndefOr[String] = js.native
  var timedTextTrackName: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object CopyParameters {
  @scala.inline
  def apply(fileId: String): CopyParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyParameters]
  }
  @scala.inline
  implicit class CopyParametersOps[Self <: CopyParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
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
    def withResource(value: FileResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
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
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

