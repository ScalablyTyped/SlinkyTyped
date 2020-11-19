package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThreatIntelSetsResponse extends js.Object {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: typingsSlinky.awsSdk.guarddutyMod.ThreatIntelSetIds = js.native
}
object ListThreatIntelSetsResponse {
  
  @scala.inline
  def apply(ThreatIntelSetIds: ThreatIntelSetIds): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
  
  @scala.inline
  implicit class ListThreatIntelSetsResponseOps[Self <: ListThreatIntelSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThreatIntelSetIdsVarargs(value: String*): Self = this.set("ThreatIntelSetIds", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelSetIds(value: ThreatIntelSetIds): Self = this.set("ThreatIntelSetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
