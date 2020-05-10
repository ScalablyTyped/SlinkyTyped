package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupQueryOutput extends js.Object {
  /**
    * The resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupQuery] = js.native
}

object UpdateGroupQueryOutput {
  @scala.inline
  def apply(): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
  @scala.inline
  implicit class UpdateGroupQueryOutputOps[Self <: UpdateGroupQueryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupQuery(value: GroupQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupQuery")(js.undefined)
        ret
    }
  }
  
}

