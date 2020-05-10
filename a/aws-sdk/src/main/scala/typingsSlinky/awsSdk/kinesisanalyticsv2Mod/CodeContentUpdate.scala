package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeContentUpdate extends js.Object {
  /**
    * Describes an update to the location of code for an application.
    */
  var S3ContentLocationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.S3ContentLocationUpdate] = js.native
  /**
    * Describes an update to the text code for an application.
    */
  var TextContentUpdate: js.UndefOr[TextContent] = js.native
  /**
    * Describes an update to the zipped code for an application.
    */
  var ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.native
}

object CodeContentUpdate {
  @scala.inline
  def apply(): CodeContentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentUpdate]
  }
  @scala.inline
  implicit class CodeContentUpdateOps[Self <: CodeContentUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3ContentLocationUpdate(value: S3ContentLocationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ContentLocationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ContentLocationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ContentLocationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContentUpdate(value: TextContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextContentUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContentUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextContentUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withZipFileContentUpdateUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContentUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFileContentUpdate(value: ZipFileContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContentUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFileContentUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContentUpdate")(js.undefined)
        ret
    }
  }
  
}

