package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListScanRuns` method.
  */
@js.native
trait SchemaListScanRunsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[SchemaScanRun]] = js.native
}

object SchemaListScanRunsResponse {
  @scala.inline
  def apply(): SchemaListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanRunsResponse]
  }
  @scala.inline
  implicit class SchemaListScanRunsResponseOps[Self <: SchemaListScanRunsResponse] (val x: Self) extends AnyVal {
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
    def withScanRuns(value: js.Array[SchemaScanRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanRuns")(js.undefined)
        ret
    }
  }
  
}

