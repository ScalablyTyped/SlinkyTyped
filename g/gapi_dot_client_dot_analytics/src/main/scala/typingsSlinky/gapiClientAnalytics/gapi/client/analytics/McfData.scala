package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.AnonAccountId
import typingsSlinky.gapiClientAnalytics.AnonColumnType
import typingsSlinky.gapiClientAnalytics.AnonConversionPathValue
import typingsSlinky.gapiClientAnalytics.AnonDimensions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[AnonColumnType]] = js.native
  /** Determines if the Analytics data contains sampled data. */
  var containsSampledData: js.UndefOr[Boolean] = js.native
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.native
  /**
    * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value
    * of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** Link to next page for this Analytics data query. */
  var nextLink: js.UndefOr[String] = js.native
  /** Link to previous page for this Analytics data query. */
  var previousLink: js.UndefOr[String] = js.native
  /** Information for the view (profile), for which the Analytics data was requested. */
  var profileInfo: js.UndefOr[AnonAccountId] = js.native
  /** Analytics data request query parameters. */
  var query: js.UndefOr[AnonDimensions] = js.native
  /**
    * Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
    * specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[AnonConversionPathValue]]] = js.native
  /** The number of samples used to calculate the result. */
  var sampleSize: js.UndefOr[String] = js.native
  /** Total size of the sample space from which the samples were selected. */
  var sampleSpace: js.UndefOr[String] = js.native
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.native
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as
    * the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[Record[String, String]] = js.native
}

object McfData {
  @scala.inline
  def apply(): McfData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfData]
  }
  @scala.inline
  implicit class McfDataOps[Self <: McfData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHeaders(value: js.Array[AnonColumnType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsSampledData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsSampledData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsSampledData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsSampledData")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(js.undefined)
        ret
    }
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
    def withNextLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLink")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLink")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileInfo(value: AnonAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: AnonDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[AnonConversionPathValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsForAllResults(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsForAllResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsForAllResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsForAllResults")(js.undefined)
        ret
    }
  }
  
}

