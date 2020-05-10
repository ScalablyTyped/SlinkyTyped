package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowSourcesResponse extends js.Object {
  /**
    * The ARN of the flow that these sources were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added sources.
    */
  var Sources: js.UndefOr[listOfSource] = js.native
}

object AddFlowSourcesResponse {
  @scala.inline
  def apply(): AddFlowSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowSourcesResponse]
  }
  @scala.inline
  implicit class AddFlowSourcesResponseOps[Self <: AddFlowSourcesResponse] (val x: Self) extends AnyVal {
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
    def withSources(value: listOfSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(js.undefined)
        ret
    }
  }
  
}

