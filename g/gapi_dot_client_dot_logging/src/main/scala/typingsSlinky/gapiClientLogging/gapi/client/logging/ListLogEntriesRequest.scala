package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setProjectIdsVarargs(value: String*): Self = this.set("projectIds", js.Array(value :_*))
    
    @scala.inline
    def setProjectIds(value: js.Array[String]): Self = this.set("projectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectIds: Self = this.set("projectIds", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
  }
}
