package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointResponse extends js.Object {
  var EndpointResponse: typingsSlinky.awsSdk.pinpointMod.EndpointResponse = js.native
}

object GetEndpointResponse {
  @scala.inline
  def apply(EndpointResponse: EndpointResponse): GetEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResponse]
  }
  @scala.inline
  implicit class GetEndpointResponseOps[Self <: GetEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointResponse(value: EndpointResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

