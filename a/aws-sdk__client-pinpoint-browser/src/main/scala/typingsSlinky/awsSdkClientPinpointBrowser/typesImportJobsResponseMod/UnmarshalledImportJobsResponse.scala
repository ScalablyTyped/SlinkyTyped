package typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledImportJobsResponse extends ImportJobsResponse {
  /**
    * A list of import jobs for the application.
    */
  @JSName("Item")
  var Item_UnmarshalledImportJobsResponse: js.UndefOr[js.Array[UnmarshalledImportJobResponse]] = js.native
}

object UnmarshalledImportJobsResponse {
  @scala.inline
  def apply(): UnmarshalledImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledImportJobsResponse]
  }
  @scala.inline
  implicit class UnmarshalledImportJobsResponseOps[Self <: UnmarshalledImportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledImportJobResponse]): Self = {
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

