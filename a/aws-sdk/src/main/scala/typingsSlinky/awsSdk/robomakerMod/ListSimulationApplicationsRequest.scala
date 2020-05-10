package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationApplicationsRequest extends js.Object {
  /**
    * Optional list of filters to limit results. The filter name name is supported. When filtering, you must use the complete value of the filtered item. You can use up to three filters.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * When this parameter is used, ListSimulationApplications only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListSimulationApplications request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListSimulationApplications returns up to 100 results and a nextToken value if applicable. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListSimulationApplications request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The version qualifier of the simulation application.
    */
  var versionQualifier: js.UndefOr[VersionQualifier] = js.native
}

object ListSimulationApplicationsRequest {
  @scala.inline
  def apply(): ListSimulationApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationApplicationsRequest]
  }
  @scala.inline
  implicit class ListSimulationApplicationsRequestOps[Self <: ListSimulationApplicationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionQualifier(value: VersionQualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionQualifier")(js.undefined)
        ret
    }
  }
  
}

