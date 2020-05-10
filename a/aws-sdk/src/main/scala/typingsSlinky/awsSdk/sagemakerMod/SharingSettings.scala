package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingSettings extends js.Object {
  /**
    * The notebook output option.
    */
  var NotebookOutputOption: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookOutputOption] = js.native
  /**
    * The AWS Key Management Service encryption key ID.
    */
  var S3KmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The Amazon S3 output path.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
}

object SharingSettings {
  @scala.inline
  def apply(): SharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingSettings]
  }
  @scala.inline
  implicit class SharingSettingsOps[Self <: SharingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookOutputOption(value: NotebookOutputOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookOutputOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookOutputOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookOutputOption")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3OutputPath(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(js.undefined)
        ret
    }
  }
  
}

