package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfData extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[McfDataColumnHeaders]] = js.native
  var containsSampledData: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var itemsPerPage: js.UndefOr[Double] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextLink: js.UndefOr[String] = js.native
  var previousLink: js.UndefOr[String] = js.native
  var profileInfo: js.UndefOr[McfDataProfileInfo] = js.native
  var query: js.UndefOr[McfDataQuery] = js.native
  var rows: js.UndefOr[js.Array[js.Array[McfDataRows]]] = js.native
  var sampleSize: js.UndefOr[String] = js.native
  var sampleSpace: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var totalResults: js.UndefOr[Double] = js.native
  var totalsForAllResults: js.UndefOr[js.Object] = js.native
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
    def withColumnHeaders(value: js.Array[McfDataColumnHeaders]): Self = {
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
    def withProfileInfo(value: McfDataProfileInfo): Self = {
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
    def withQuery(value: McfDataQuery): Self = {
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
    def withRows(value: js.Array[js.Array[McfDataRows]]): Self = {
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
    def withTotalsForAllResults(value: js.Object): Self = {
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

