package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogEntriesRequest extends js.Object {
  /**
    * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters. Only log entries that match the filter are returned. An empty
    * filter matches all log entries in the resources listed in resource_names. Referencing a parent resource that is not listed in resource_names will cause
    * the filter to return no results. The maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. How the results should be sorted. Presently, the only permitted values are "timestamp asc" (default) and "timestamp desc". The first option
    * returns entries in order of increasing values of LogEntry.timestamp (oldest first), and the second option returns entries in order of decreasing
    * timestamps (newest first). Entries with equal timestamps are returned in order of their insert_id values.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of next_page_token in the response
    * indicates that more results might be available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. If present, then retrieve the next batch of results from the preceding call to this method. page_token must be the value of next_page_token
    * from the previous response. The values of other method parameters should be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use resource_names instead. One or more project identifiers or project numbers from which to retrieve log entries. Example:
    * "my-project-1A". If present, these project identifiers are converted to resource name format and added to the list of resources in resource_names.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. Names of one or more parent resources from which to retrieve log entries:
    * "projects/[PROJECT_ID]"
    * "organizations/[ORGANIZATION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]"
    * "folders/[FOLDER_ID]"
    * Projects listed in the project_ids field are added to this list.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object ListLogEntriesRequest {
  @scala.inline
  def apply(): ListLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogEntriesRequest]
  }
  @scala.inline
  implicit class ListLogEntriesRequestOps[Self <: ListLogEntriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNames")(js.undefined)
        ret
    }
  }
  
}

