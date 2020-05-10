package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service.
    */
  var virtualService: VirtualServiceData = js.native
}

object DescribeVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): DescribeVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceOutput]
  }
  @scala.inline
  implicit class DescribeVirtualServiceOutputOps[Self <: DescribeVirtualServiceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualService(value: VirtualServiceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

