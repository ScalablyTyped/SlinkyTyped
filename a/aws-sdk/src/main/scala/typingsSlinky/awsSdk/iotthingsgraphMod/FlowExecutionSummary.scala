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
  def apply(
    createdAt: js.Date = null,
    flowExecutionId: FlowExecutionId = null,
    flowTemplateId: Urn = null,
    status: FlowExecutionStatus = null,
    systemInstanceId: Urn = null,
    updatedAt: js.Date = null
  ): FlowExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (flowExecutionId != null) __obj.updateDynamic("flowExecutionId")(flowExecutionId.asInstanceOf[js.Any])
    if (flowTemplateId != null) __obj.updateDynamic("flowTemplateId")(flowTemplateId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (systemInstanceId != null) __obj.updateDynamic("systemInstanceId")(systemInstanceId.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowExecutionSummary]
  }
}

