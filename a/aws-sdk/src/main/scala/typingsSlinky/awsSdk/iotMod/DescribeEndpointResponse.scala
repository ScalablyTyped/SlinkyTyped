package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointResponse extends js.Object {
  /**
    * The endpoint. The format of the endpoint is as follows: identifier.iot.region.amazonaws.com.
    */
  var endpointAddress: js.UndefOr[EndpointAddress] = js.native
}

object DescribeEndpointResponse {
  @scala.inline
  def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  @scala.inline
  implicit class DescribeEndpointResponseOps[Self <: DescribeEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointAddress(value: EndpointAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointAddress")(js.undefined)
        ret
    }
  }
  
}

