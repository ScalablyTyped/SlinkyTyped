package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIPSetsResponse extends js.Object {
  
  /**
    * Array of IPSets. This may not be the full list of IPSets that you have defined. See the Limit specification for this request.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.NextMarker] = js.native
}
object ListIPSetsResponse {
  
  @scala.inline
  def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  @scala.inline
  implicit class ListIPSetsResponseOps[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setIPSetsVarargs(value: IPSetSummary*): Self = this.set("IPSets", js.Array(value :_*))
    
    @scala.inline
    def setIPSets(value: IPSetSummaries): Self = this.set("IPSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPSets: Self = this.set("IPSets", js.undefined)
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
