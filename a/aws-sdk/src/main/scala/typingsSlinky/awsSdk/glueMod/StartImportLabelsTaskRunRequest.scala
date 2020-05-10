package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportLabelsTaskRunRequest extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
    */
  var InputS3Path: UriString = js.native
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object StartImportLabelsTaskRunRequest {
  @scala.inline
  def apply(InputS3Path: UriString, TransformId: HashString): StartImportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(InputS3Path = InputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
  }
  @scala.inline
  implicit class StartImportLabelsTaskRunRequestOps[Self <: StartImportLabelsTaskRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputS3Path(value: UriString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputS3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceAllLabels(value: ReplaceBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceAllLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceAllLabels")(js.undefined)
        ret
    }
  }
  
}

