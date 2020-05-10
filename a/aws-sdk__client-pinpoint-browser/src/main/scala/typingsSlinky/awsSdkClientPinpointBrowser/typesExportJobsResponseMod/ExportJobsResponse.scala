package typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod.ExportJobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobsResponse extends js.Object {
  /**
    * A list of export jobs for the application.
    */
  var Item: js.UndefOr[js.Array[ExportJobResponse] | js.Iterable[ExportJobResponse]] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ExportJobsResponse {
  @scala.inline
  def apply(): ExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJobsResponse]
  }
  @scala.inline
  implicit class ExportJobsResponseOps[Self <: ExportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIterable(value: js.Iterable[ExportJobResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Array[ExportJobResponse] | js.Iterable[ExportJobResponse]): Self = {
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
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

