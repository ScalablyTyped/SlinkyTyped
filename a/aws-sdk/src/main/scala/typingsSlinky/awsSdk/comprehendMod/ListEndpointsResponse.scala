package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withEndpointPropertiesList(value: EndpointPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointPropertiesList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

