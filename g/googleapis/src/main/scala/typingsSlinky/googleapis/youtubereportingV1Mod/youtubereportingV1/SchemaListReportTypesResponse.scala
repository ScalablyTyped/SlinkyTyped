package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReportTypes.
  */
@js.native
trait SchemaListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportTypesRequest.page_token field in the subsequent call to
    * `ListReportTypes` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reportTypes: js.UndefOr[js.Array[SchemaReportType]] = js.native
}

object SchemaListReportTypesResponse {
  @scala.inline
  def apply(): SchemaListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportTypesResponse]
  }
  @scala.inline
  implicit class SchemaListReportTypesResponseOps[Self <: SchemaListReportTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReportTypes(value: js.Array[SchemaReportType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTypes")(js.undefined)
        ret
    }
  }
  
}

