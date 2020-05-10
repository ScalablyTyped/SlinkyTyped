package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointResponseMod.EndpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointsResponse extends js.Object {
  /**
    * The list of endpoints.
    */
  var Item: js.UndefOr[js.Array[EndpointResponse] | js.Iterable[EndpointResponse]] = js.native
}

object EndpointsResponse {
  @scala.inline
  def apply(): EndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsResponse]
  }
  @scala.inline
  implicit class EndpointsResponseOps[Self <: EndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIterable(value: js.Iterable[EndpointResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Array[EndpointResponse] | js.Iterable[EndpointResponse]): Self = {
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

