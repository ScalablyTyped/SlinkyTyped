package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectsRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
}

object DescribeInterconnectsRequest {
  @scala.inline
  def apply(): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
  @scala.inline
  implicit class DescribeInterconnectsRequestOps[Self <: DescribeInterconnectsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnectId(value: InterconnectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(js.undefined)
        ret
    }
  }
  
}

