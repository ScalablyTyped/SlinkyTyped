package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the output you removed.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the output that was removed.
    */
  var OutputArn: js.UndefOr[string] = js.native
}

object RemoveFlowOutputResponse {
  @scala.inline
  def apply(): RemoveFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowOutputResponse]
  }
  @scala.inline
  implicit class RemoveFlowOutputResponseOps[Self <: RemoveFlowOutputResponse] (val x: Self) extends AnyVal {
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
    def withOutputArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArn")(js.undefined)
        ret
    }
  }
  
}

