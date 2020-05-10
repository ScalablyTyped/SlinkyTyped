package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImportJobResponse extends js.Object {
  var ImportJobResponse: typingsSlinky.awsSdk.pinpointMod.ImportJobResponse = js.native
}

object GetImportJobResponse {
  @scala.inline
  def apply(ImportJobResponse: ImportJobResponse): GetImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobResponse]
  }
  @scala.inline
  implicit class GetImportJobResponseOps[Self <: GetImportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportJobResponse(value: ImportJobResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportJobResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

