package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancersRequest extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetLoadBalancers request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GetLoadBalancersRequest {
  
  @scala.inline
  def apply(): GetLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancersRequest]
  }
  
  @scala.inline
  implicit class GetLoadBalancersRequestMutableBuilder[Self <: GetLoadBalancersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
