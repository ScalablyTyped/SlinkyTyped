package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeContent extends js.Object {
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var S3ContentLocation: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.S3ContentLocation] = js.native
  /**
    * The text-format code for a Java-based Kinesis Data Analytics application.
    */
  var TextContent: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
  /**
    * The zip-format code for a Java-based Kinesis Data Analytics application.
    */
  var ZipFileContent: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ZipFileContent] = js.native
}

object CodeContent {
  @scala.inline
  def apply(): CodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContent]
  }
  @scala.inline
  implicit class CodeContentOps[Self <: CodeContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3ContentLocation(value: S3ContentLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ContentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ContentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ContentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContent(value: TextContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextContent")(js.undefined)
        ret
    }
    @scala.inline
    def withZipFileContentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFileContent(value: ZipFileContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFileContent")(js.undefined)
        ret
    }
  }
  
}

