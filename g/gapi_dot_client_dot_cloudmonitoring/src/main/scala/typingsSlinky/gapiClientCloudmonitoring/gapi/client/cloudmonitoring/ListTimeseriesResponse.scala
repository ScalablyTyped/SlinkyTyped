package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTimeseriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesResponse". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, set the
    * pageToken query parameter to this value. All of the points of a time series will be returned before returning any point of the subsequent time series.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The oldest timestamp of the interval of this query as an RFC 3339 string. */
  var oldest: js.UndefOr[String] = js.native
  /** The returned time series. */
  var timeseries: js.UndefOr[js.Array[Timeseries]] = js.native
  /** The youngest timestamp of the interval of this query as an RFC 3339 string. */
  var youngest: js.UndefOr[String] = js.native
}

object ListTimeseriesResponse {
  @scala.inline
  def apply(): ListTimeseriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTimeseriesResponse]
  }
  @scala.inline
  implicit class ListTimeseriesResponseOps[Self <: ListTimeseriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
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
    def withOldest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldest")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeseries(value: js.Array[Timeseries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeseries")(js.undefined)
        ret
    }
    @scala.inline
    def withYoungest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youngest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoungest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youngest")(js.undefined)
        ret
    }
  }
  
}

