package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkGroupInput extends js.Object {
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
    */
  var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The unique name of the workgroup to delete.
    */
  var WorkGroup: WorkGroupName = js.native
}

object DeleteWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName): DeleteWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkGroupInput]
  }
  @scala.inline
  implicit class DeleteWorkGroupInputOps[Self <: DeleteWorkGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkGroup(value: WorkGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursiveDeleteOption(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecursiveDeleteOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveDeleteOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecursiveDeleteOption")(js.undefined)
        ret
    }
  }
  
}

