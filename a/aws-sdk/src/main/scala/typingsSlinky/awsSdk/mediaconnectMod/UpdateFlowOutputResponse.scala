package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[string] = js.native
  var Output: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Output] = js.native
}

object UpdateFlowOutputResponse {
  @scala.inline
  def apply(): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
  @scala.inline
  implicit class UpdateFlowOutputResponseOps[Self <: UpdateFlowOutputResponse] (val x: Self) extends AnyVal {
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
    def withOutput(value: Output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(js.undefined)
        ret
    }
  }
  
}

