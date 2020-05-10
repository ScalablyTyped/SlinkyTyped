package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockServiceLinkedRoleResponse extends js.Object {
  var CanBeDeleted: js.UndefOr[boolean] = js.native
  var ReasonOfFailure: js.UndefOr[stringMin1Max1600] = js.native
  var RelatedResources: js.UndefOr[listOfDiscovererSummary] = js.native
}

object LockServiceLinkedRoleResponse {
  @scala.inline
  def apply(): LockServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockServiceLinkedRoleResponse]
  }
  @scala.inline
  implicit class LockServiceLinkedRoleResponseOps[Self <: LockServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanBeDeleted(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanBeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonOfFailure(value: stringMin1Max1600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonOfFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonOfFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonOfFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedResources(value: listOfDiscovererSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedResources")(js.undefined)
        ret
    }
  }
  
}

