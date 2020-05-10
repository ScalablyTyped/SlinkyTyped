package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnectFlowRequest extends js.Object {
  /**
    * The ARN of the MediaConnect Flow that you want to use as a source.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object MediaConnectFlowRequest {
  @scala.inline
  def apply(): MediaConnectFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlowRequest]
  }
  @scala.inline
  implicit class MediaConnectFlowRequestOps[Self <: MediaConnectFlowRequest] (val x: Self) extends AnyVal {
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
  }
  
}

