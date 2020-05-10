package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeContentDescription extends js.Object {
  /**
    * The checksum that can be used to validate zip-format code.
    */
  var CodeMD5: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeMD5] = js.native
  /**
    * The size in bytes of the application code. Can be used to validate zip-format code.
    */
  var CodeSize: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CodeSize] = js.native
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
    */
  var S3ApplicationCodeLocationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.S3ApplicationCodeLocationDescription] = js.native
  /**
    * The text-format code
    */
  var TextContent: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
}

object CodeContentDescription {
  @scala.inline
  def apply(): CodeContentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentDescription]
  }
  @scala.inline
  implicit class CodeContentDescriptionOps[Self <: CodeContentDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeMD5(value: CodeMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSize(value: CodeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ApplicationCodeLocationDescription(value: S3ApplicationCodeLocationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ApplicationCodeLocationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ApplicationCodeLocationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ApplicationCodeLocationDescription")(js.undefined)
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
  }
  
}

