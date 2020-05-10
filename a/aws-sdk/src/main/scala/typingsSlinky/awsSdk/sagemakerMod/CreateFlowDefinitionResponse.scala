package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowDefinitionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the flow definition you create.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
}

object CreateFlowDefinitionResponse {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn): CreateFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionResponse]
  }
  @scala.inline
  implicit class CreateFlowDefinitionResponseOps[Self <: CreateFlowDefinitionResponse] (val x: Self) extends AnyVal {
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
  }
  
}

