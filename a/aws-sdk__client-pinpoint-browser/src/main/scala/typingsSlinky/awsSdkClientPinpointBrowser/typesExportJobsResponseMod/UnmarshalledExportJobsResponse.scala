package typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledExportJobsResponse extends ExportJobsResponse {
  /**
    * A list of export jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledExportJobsResponse: js.UndefOr[js.Array[UnmarshalledExportJobResponse]] = js.native
}

object UnmarshalledExportJobsResponse {
  @scala.inline
  def apply(): UnmarshalledExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledExportJobsResponse]
  }
  @scala.inline
  implicit class UnmarshalledExportJobsResponseOps[Self <: UnmarshalledExportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledExportJobResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}

