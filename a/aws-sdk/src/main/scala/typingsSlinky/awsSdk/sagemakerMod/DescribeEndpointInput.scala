package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointInput extends js.Object {
  /**
    * The name of the endpoint.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
}

object DescribeEndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName): DescribeEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInput]
  }
  @scala.inline
  implicit class DescribeEndpointInputOps[Self <: DescribeEndpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

