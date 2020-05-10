package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupOutput extends js.Object {
  /**
    * The full description of the resource group after it has been updated.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Group] = js.native
}

object UpdateGroupOutput {
  @scala.inline
  def apply(): UpdateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupOutput]
  }
  @scala.inline
  implicit class UpdateGroupOutputOps[Self <: UpdateGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.undefined)
        ret
    }
  }
  
}

