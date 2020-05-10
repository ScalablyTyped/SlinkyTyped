package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowDefinitionRequest extends js.Object {
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionName = js.native
}

object DescribeFlowDefinitionRequest {
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DescribeFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionRequest]
  }
  @scala.inline
  implicit class DescribeFlowDefinitionRequestOps[Self <: DescribeFlowDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionName(value: FlowDefinitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

