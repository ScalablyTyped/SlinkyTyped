package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportJobResponse extends js.Object {
  var ExportJobResponse: typingsSlinky.awsSdk.pinpointMod.ExportJobResponse = js.native
}

object CreateExportJobResponse {
  @scala.inline
  def apply(ExportJobResponse: ExportJobResponse): CreateExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobResponse]
  }
  @scala.inline
  implicit class CreateExportJobResponseOps[Self <: CreateExportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportJobResponse(value: ExportJobResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportJobResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

