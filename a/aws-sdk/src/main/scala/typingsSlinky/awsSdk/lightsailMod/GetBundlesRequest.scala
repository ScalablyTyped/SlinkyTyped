package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBundlesRequest extends js.Object {
  
  /**
    * A Boolean value that indicates whether to include inactive bundle results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBundles request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GetBundlesRequest {
  
  @scala.inline
  def apply(): GetBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBundlesRequest]
  }
  
  @scala.inline
  implicit class GetBundlesRequestOps[Self <: GetBundlesRequest] (val x: Self) extends AnyVal {
    
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
    def setIncludeInactive(value: Boolean): Self = this.set("includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInactive: Self = this.set("includeInactive", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
