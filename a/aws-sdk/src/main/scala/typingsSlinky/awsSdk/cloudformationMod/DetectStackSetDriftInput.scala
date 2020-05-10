package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackSetDriftInput extends js.Object {
  /**
    *  The ID of the stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * The name of the stack set on which to perform the drift detection operation.
    */
  var StackSetName: StackSetNameOrId = js.native
}

object DetectStackSetDriftInput {
  @scala.inline
  def apply(StackSetName: StackSetNameOrId): DetectStackSetDriftInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftInput]
  }
  @scala.inline
  implicit class DetectStackSetDriftInputOps[Self <: DetectStackSetDriftInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetName(value: StackSetNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationId(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationPreferences(value: StackSetOperationPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(js.undefined)
        ret
    }
  }
  
}

