package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebACLsResponse extends js.Object {
  
  /**
    * If you have more WebACL objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more WebACL objects, submit another ListWebACLs request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
  
  /**
    * An array of WebACLSummary objects.
    */
  var WebACLs: js.UndefOr[WebACLSummaries] = js.native
}
object ListWebACLsResponse {
  
  @scala.inline
  def apply(): ListWebACLsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsResponse]
  }
  
  @scala.inline
  implicit class ListWebACLsResponseOps[Self <: ListWebACLsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    
    @scala.inline
    def setWebACLsVarargs(value: WebACLSummary*): Self = this.set("WebACLs", js.Array(value :_*))
    
    @scala.inline
    def setWebACLs(value: WebACLSummaries): Self = this.set("WebACLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebACLs: Self = this.set("WebACLs", js.undefined)
  }
}
