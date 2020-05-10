package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to delete.
    */
  var DatasetImportJobArn: Arn = js.native
}

object DeleteDatasetImportJobRequest {
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DeleteDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetImportJobRequest]
  }
  @scala.inline
  implicit class DeleteDatasetImportJobRequestOps[Self <: DeleteDatasetImportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetImportJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

