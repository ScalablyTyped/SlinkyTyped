package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowSourceResponse extends js.Object {
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Source] = js.native
}

object UpdateFlowSourceResponse {
  @scala.inline
  def apply(): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
  @scala.inline
  implicit class UpdateFlowSourceResponseOps[Self <: UpdateFlowSourceResponse] (val x: Self) extends AnyVal {
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
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
  }
  
}

