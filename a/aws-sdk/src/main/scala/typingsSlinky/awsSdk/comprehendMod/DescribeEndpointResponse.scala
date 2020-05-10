package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointResponse extends js.Object {
  /**
    * Describes information associated with the specific endpoint.
    */
  var EndpointProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EndpointProperties] = js.native
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
    def withEndpointProperties(value: EndpointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointProperties")(js.undefined)
        ret
    }
  }
  
}

