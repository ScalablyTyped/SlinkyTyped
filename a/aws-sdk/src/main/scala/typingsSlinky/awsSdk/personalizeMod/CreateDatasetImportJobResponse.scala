package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobResponse extends js.Object {
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetImportJobResponse {
  @scala.inline
  def apply(): CreateDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetImportJobResponse]
  }
  @scala.inline
  implicit class CreateDatasetImportJobResponseOps[Self <: CreateDatasetImportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetImportJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetImportJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetImportJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetImportJobArn")(js.undefined)
        ret
    }
  }
  
}

