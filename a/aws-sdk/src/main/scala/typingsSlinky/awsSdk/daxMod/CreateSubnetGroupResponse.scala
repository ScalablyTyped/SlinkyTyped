package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubnetGroupResponse extends js.Object {
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[typingsSlinky.awsSdk.daxMod.SubnetGroup] = js.native
}

object CreateSubnetGroupResponse {
  @scala.inline
  def apply(): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
  @scala.inline
  implicit class CreateSubnetGroupResponseOps[Self <: CreateSubnetGroupResponse] (val x: Self) extends AnyVal {
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

