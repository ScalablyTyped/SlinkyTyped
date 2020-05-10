package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowExecutionSummary extends js.Object {
  /**
    * The date and time when the flow execution summary was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.native
  /**
    * The ID of the flow.
    */
  var flowTemplateId: js.UndefOr[Urn] = js.native
  /**
    * The current status of the flow execution.
    */
  var status: js.UndefOr[FlowExecutionStatus] = js.native
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: js.UndefOr[Urn] = js.native
  /**
    * The date and time when the flow execution summary was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}

object FlowExecutionSummary {
  @scala.inline
  def apply(): FlowExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionSummary]
  }
  @scala.inline
  implicit class FlowExecutionSummaryOps[Self <: FlowExecutionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowExecutionId(value: FlowExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowTemplateId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: FlowExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemInstanceId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
  }
  
}

