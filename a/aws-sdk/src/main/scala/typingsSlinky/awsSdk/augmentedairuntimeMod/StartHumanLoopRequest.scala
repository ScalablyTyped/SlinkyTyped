package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopRequest extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * An object containing information about the human loop.
    */
  var HumanLoopInput: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopInput = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object StartHumanLoopRequest {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopInput: HumanLoopInput, HumanLoopName: HumanLoopName): StartHumanLoopRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopRequest]
  }
  @scala.inline
  implicit class StartHumanLoopRequestOps[Self <: StartHumanLoopRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionArn(value: FlowDefinitionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopInput(value: HumanLoopInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataAttributes(value: HumanLoopDataAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAttributes")(js.undefined)
        ret
    }
  }
  
}

