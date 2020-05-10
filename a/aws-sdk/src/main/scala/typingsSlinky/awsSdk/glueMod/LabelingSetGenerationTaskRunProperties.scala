package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingSetGenerationTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.native
}

object LabelingSetGenerationTaskRunProperties {
  @scala.inline
  def apply(): LabelingSetGenerationTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingSetGenerationTaskRunProperties]
  }
  @scala.inline
  implicit class LabelingSetGenerationTaskRunPropertiesOps[Self <: LabelingSetGenerationTaskRunProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputS3Path(value: UriString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Path")(js.undefined)
        ret
    }
  }
  
}

