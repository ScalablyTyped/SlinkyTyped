package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceSharesResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the resource shares.
    */
  var resourceShares: js.UndefOr[ResourceShareList] = js.native
}
object GetResourceSharesResponse {
  
  @scala.inline
  def apply(): GetResourceSharesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceSharesResponse]
  }
  
  @scala.inline
  implicit class GetResourceSharesResponseOps[Self <: GetResourceSharesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceSharesVarargs(value: ResourceShare*): Self = this.set("resourceShares", js.Array(value :_*))
    
    @scala.inline
    def setResourceShares(value: ResourceShareList): Self = this.set("resourceShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShares: Self = this.set("resourceShares", js.undefined)
  }
}
