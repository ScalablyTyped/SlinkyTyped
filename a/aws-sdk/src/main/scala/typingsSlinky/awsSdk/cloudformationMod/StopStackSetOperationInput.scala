package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopStackSetOperationInput extends js.Object {
  /**
    * The ID of the stack operation. 
    */
  var OperationId: ClientRequestToken = js.native
  /**
    * The name or unique ID of the stack set that you want to stop the operation for.
    */
  var StackSetName: typingsSlinky.awsSdk.cloudformationMod.StackSetName = js.native
}

object StopStackSetOperationInput {
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): StopStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStackSetOperationInput]
  }
  @scala.inline
  implicit class StopStackSetOperationInputOps[Self <: StopStackSetOperationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackSetName(value: StackSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

