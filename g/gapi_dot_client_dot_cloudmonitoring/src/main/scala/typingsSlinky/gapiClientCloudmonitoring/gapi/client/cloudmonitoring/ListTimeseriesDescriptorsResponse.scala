package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTimeseriesDescriptorsResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesDescriptorsResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, set this
    * value to the pageToken query parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The oldest timestamp of the interval of this query, as an RFC 3339 string. */
  var oldest: js.UndefOr[String] = js.native
  
  /** The returned time series descriptors. */
  var timeseries: js.UndefOr[js.Array[TimeseriesDescriptor]] = js.native
  
  /** The youngest timestamp of the interval of this query, as an RFC 3339 string. */
  var youngest: js.UndefOr[String] = js.native
}
object ListTimeseriesDescriptorsResponse {
  
  @scala.inline
  def apply(): ListTimeseriesDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTimeseriesDescriptorsResponse]
  }
  
  @scala.inline
  implicit class ListTimeseriesDescriptorsResponseOps[Self <: ListTimeseriesDescriptorsResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setOldest(value: String): Self = this.set("oldest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldest: Self = this.set("oldest", js.undefined)
    
    @scala.inline
    def setTimeseriesVarargs(value: TimeseriesDescriptor*): Self = this.set("timeseries", js.Array(value :_*))
    
    @scala.inline
    def setTimeseries(value: js.Array[TimeseriesDescriptor]): Self = this.set("timeseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeseries: Self = this.set("timeseries", js.undefined)
    
    @scala.inline
    def setYoungest(value: String): Self = this.set("youngest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoungest: Self = this.set("youngest", js.undefined)
  }
}
