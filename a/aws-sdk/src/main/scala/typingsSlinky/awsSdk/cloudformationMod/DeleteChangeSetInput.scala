package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * If you specified the name of a change set to delete, specify the stack name or ID (ARN) that is associated with it.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

object DeleteChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): DeleteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChangeSetInput]
  }
  @scala.inline
  implicit class DeleteChangeSetInputOps[Self <: DeleteChangeSetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetName(value: ChangeSetNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: StackNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(js.undefined)
        ret
    }
  }
  
}

