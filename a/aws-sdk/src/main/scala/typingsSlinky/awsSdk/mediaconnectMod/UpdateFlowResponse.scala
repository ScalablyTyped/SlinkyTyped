package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowResponse extends js.Object {
  var Flow: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Flow] = js.native
}

object UpdateFlowResponse {
  @scala.inline
  def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  @scala.inline
  implicit class UpdateFlowResponseOps[Self <: UpdateFlowResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlow(value: Flow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flow")(js.undefined)
        ret
    }
  }
  
}

