package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigsRequest extends js.Object {
  
  /**
    * Maximum number of Configs returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * Next token returned in the request of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListConfigsRequest {
  
  @scala.inline
  def apply(): ListConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsRequest]
  }
  
  @scala.inline
  implicit class ListConfigsRequestOps[Self <: ListConfigsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
