package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainInfos extends js.Object {
  
  /**
    * A list of DomainInfo structures.
    */
  var domainInfos: DomainInfoList = js.native
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
}
object DomainInfos {
  
  @scala.inline
  def apply(domainInfos: DomainInfoList): DomainInfos = {
    val __obj = js.Dynamic.literal(domainInfos = domainInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInfos]
  }
  
  @scala.inline
  implicit class DomainInfosOps[Self <: DomainInfos] (val x: Self) extends AnyVal {
    
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
    def setDomainInfosVarargs(value: DomainInfo*): Self = this.set("domainInfos", js.Array(value :_*))
    
    @scala.inline
    def setDomainInfos(value: DomainInfoList): Self = this.set("domainInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
