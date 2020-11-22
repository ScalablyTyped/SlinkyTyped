package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TailLogEntriesRequest extends js.Object {
  
  /**
    * Optional. The amount of time to buffer log entries at the server before being returned to prevent out of order results due to late arriving log entries. Valid values are between
    * 0-60000 milliseconds. Defaults to 2000 milliseconds.
    */
  var bufferWindow: js.UndefOr[String] = js.native
  
  /**
    * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters (https://cloud.google.com/logging/docs/view/advanced_filters). Only log entries that match the
    * filter are returned. An empty filter matches all log entries in the resources listed in resource_names. Referencing a parent resource that is not in resource_names will cause the
    * filter to return no results. The maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Required. Name of a parent resource from which to retrieve log entries: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]"
    * "folders/[FOLDER_ID]" May alternatively be one or more views: "projects/PROJECT_ID/locations/LOCATION_ID/buckets/BUCKET_ID/views/VIEW_ID"
    * "organization/ORGANIZATION_ID/locations/LOCATION_ID/buckets/BUCKET_ID/views/VIEW_ID" "billingAccounts/BILLING_ACCOUNT_ID/locations/LOCATION_ID/buckets/BUCKET_ID/views/VIEW_ID"
    * "folders/FOLDER_ID/locations/LOCATION_ID/buckets/BUCKET_ID/views/VIEW_ID"
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}
object TailLogEntriesRequest {
  
  @scala.inline
  def apply(): TailLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TailLogEntriesRequest]
  }
  
  @scala.inline
  implicit class TailLogEntriesRequestOps[Self <: TailLogEntriesRequest] (val x: Self) extends AnyVal {
    
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
    def setBufferWindow(value: String): Self = this.set("bufferWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferWindow: Self = this.set("bufferWindow", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
  }
}
