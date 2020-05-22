package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExportAgentResponse. */
trait IExportAgentResponse extends js.Object {
  /** ExportAgentResponse agentContent */
  var agentContent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** ExportAgentResponse agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
}

object IExportAgentResponse {
  @scala.inline
  def apply(
    agentContent: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    agentUri: js.UndefOr[Null | String] = js.undefined
  ): IExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentContent)) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (!js.isUndefined(agentUri)) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportAgentResponse]
  }
}

