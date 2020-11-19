package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointsResponse extends js.Object {
  
  /**
    * Displays a list of endpoint properties being retrieved by the service in response to the request.
    */
  var EndpointPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EndpointPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListEndpointsResponse {
  
  @scala.inline
  def apply(): ListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListEndpointsResponseOps[Self <: ListEndpointsResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointPropertiesListVarargs(value: EndpointProperties*): Self = this.set("EndpointPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setEndpointPropertiesList(value: EndpointPropertiesList): Self = this.set("EndpointPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPropertiesList: Self = this.set("EndpointPropertiesList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
