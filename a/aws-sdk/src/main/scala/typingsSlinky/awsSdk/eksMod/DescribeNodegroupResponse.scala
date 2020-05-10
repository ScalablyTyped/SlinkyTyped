package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodegroupResponse extends js.Object {
  /**
    * The full description of your node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}

object DescribeNodegroupResponse {
  @scala.inline
  def apply(): DescribeNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodegroupResponse]
  }
  @scala.inline
  implicit class DescribeNodegroupResponseOps[Self <: DescribeNodegroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodegroup(value: Nodegroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodegroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroup")(js.undefined)
        ret
    }
  }
  
}

