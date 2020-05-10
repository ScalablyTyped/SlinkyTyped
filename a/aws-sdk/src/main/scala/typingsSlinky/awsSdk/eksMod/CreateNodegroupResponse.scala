package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodegroupResponse extends js.Object {
  /**
    * The full description of your new node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}

object CreateNodegroupResponse {
  @scala.inline
  def apply(): CreateNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodegroupResponse]
  }
  @scala.inline
  implicit class CreateNodegroupResponseOps[Self <: CreateNodegroupResponse] (val x: Self) extends AnyVal {
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

