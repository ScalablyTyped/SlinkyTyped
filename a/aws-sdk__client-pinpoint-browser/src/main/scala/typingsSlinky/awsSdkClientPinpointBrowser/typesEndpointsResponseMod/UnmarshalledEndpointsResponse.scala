package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointsResponse extends EndpointsResponse {
  /**
    * The list of endpoints.
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointsResponse: js.UndefOr[js.Array[UnmarshalledEndpointResponse]] = js.native
}

object UnmarshalledEndpointsResponse {
  @scala.inline
  def apply(): UnmarshalledEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointsResponse]
  }
  @scala.inline
  implicit class UnmarshalledEndpointsResponseOps[Self <: UnmarshalledEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledEndpointResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}

