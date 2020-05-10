package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowOutputsResponse extends js.Object {
  /**
    * The ARN of the flow that these outputs were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added outputs.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.native
}

object AddFlowOutputsResponse {
  @scala.inline
  def apply(): AddFlowOutputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowOutputsResponse]
  }
  @scala.inline
  implicit class AddFlowOutputsResponseOps[Self <: AddFlowOutputsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: listOfOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
  }
  
}

