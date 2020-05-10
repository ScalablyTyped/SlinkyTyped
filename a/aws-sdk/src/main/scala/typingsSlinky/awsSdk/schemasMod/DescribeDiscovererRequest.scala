package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDiscovererRequest extends js.Object {
  var DiscovererId: string = js.native
}

object DescribeDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: string): DescribeDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDiscovererRequest]
  }
  @scala.inline
  implicit class DescribeDiscovererRequestOps[Self <: DescribeDiscovererRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovererId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

