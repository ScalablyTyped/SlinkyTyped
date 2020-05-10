package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserEndpointsResponse extends js.Object {
  var EndpointsResponse: typingsSlinky.awsSdk.pinpointMod.EndpointsResponse = js.native
}

object DeleteUserEndpointsResponse {
  @scala.inline
  def apply(EndpointsResponse: EndpointsResponse): DeleteUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserEndpointsResponse]
  }
  @scala.inline
  implicit class DeleteUserEndpointsResponseOps[Self <: DeleteUserEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointsResponse(value: EndpointsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

