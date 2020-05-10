package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowRequest extends js.Object {
  /**
    * The flow that you want to update.
    */
  var FlowArn: string = js.native
  var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.native
}

object UpdateFlowRequest {
  @scala.inline
  def apply(FlowArn: string): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  @scala.inline
  implicit class UpdateFlowRequestOps[Self <: UpdateFlowRequest] (val x: Self) extends AnyVal {
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
    def withSourceFailoverConfig(value: UpdateFailoverConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFailoverConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFailoverConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFailoverConfig")(js.undefined)
        ret
    }
  }
  
}

