package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGroupOutput extends js.Object {
  /**
    * A full description of the deleted resource group.
    */
  var Group: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.Group] = js.native
}

object DeleteGroupOutput {
  @scala.inline
  def apply(): DeleteGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGroupOutput]
  }
  @scala.inline
  implicit class DeleteGroupOutputOps[Self <: DeleteGroupOutput] (val x: Self) extends AnyVal {
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

