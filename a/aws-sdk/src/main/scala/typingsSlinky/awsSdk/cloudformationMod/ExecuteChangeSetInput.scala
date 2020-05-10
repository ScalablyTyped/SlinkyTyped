package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteChangeSetInput extends js.Object {
  /**
    * The name or ARN of the change set that you want use to update the specified stack.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * A unique identifier for this ExecuteChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to execute a change set to update a stack with the same name. You might retry ExecuteChangeSet requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change set you want to execute.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

object ExecuteChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): ExecuteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteChangeSetInput]
  }
  @scala.inline
  implicit class ExecuteChangeSetInputOps[Self <: ExecuteChangeSetInput] (val x: Self) extends AnyVal {
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
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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

