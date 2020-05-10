package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetContentResponse extends js.Object {
  /**
    * The version ID of the data set contents which are being created.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}

object CreateDatasetContentResponse {
  @scala.inline
  def apply(): CreateDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetContentResponse]
  }
  @scala.inline
  implicit class CreateDatasetContentResponseOps[Self <: CreateDatasetContentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionId(value: DatasetContentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

