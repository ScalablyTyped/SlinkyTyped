package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubnetGroupResponse extends js.Object {
  /**
    * The subnet group that has been modified.
    */
  var SubnetGroup: js.UndefOr[typingsSlinky.awsSdk.daxMod.SubnetGroup] = js.native
}

object UpdateSubnetGroupResponse {
  @scala.inline
  def apply(): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
  @scala.inline
  implicit class UpdateSubnetGroupResponseOps[Self <: UpdateSubnetGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetGroup(value: SubnetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroup")(js.undefined)
        ret
    }
  }
  
}

