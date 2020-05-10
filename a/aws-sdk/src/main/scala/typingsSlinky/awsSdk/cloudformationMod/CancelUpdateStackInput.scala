package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelUpdateStackInput extends js.Object {
  /**
    * A unique identifier for this CancelUpdateStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same name. You might retry CancelUpdateStack requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
}

object CancelUpdateStackInput {
  @scala.inline
  def apply(StackName: StackName): CancelUpdateStackInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelUpdateStackInput]
  }
  @scala.inline
  implicit class CancelUpdateStackInputOps[Self <: CancelUpdateStackInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
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
  }
  
}

