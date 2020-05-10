package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnectFlow extends js.Object {
  /**
    * The unique ARN of the MediaConnect Flow being used as a source.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object MediaConnectFlow {
  @scala.inline
  def apply(): MediaConnectFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlow]
  }
  @scala.inline
  implicit class MediaConnectFlowOps[Self <: MediaConnectFlow] (val x: Self) extends AnyVal {
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

