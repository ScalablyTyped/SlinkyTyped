package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
  
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
}
object GetCompatibleElasticsearchVersionsRequest {
  
  @scala.inline
  def apply(): GetCompatibleElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
  }
  
  @scala.inline
  implicit class GetCompatibleElasticsearchVersionsRequestOps[Self <: GetCompatibleElasticsearchVersionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
  }
}
