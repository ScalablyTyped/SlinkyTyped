package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExportAgentResponse. */
trait IExportAgentResponse extends js.Object {
  /** ExportAgentResponse agentContent */
  var agentContent: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
  /** ExportAgentResponse agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
}

object IExportAgentResponse {
  @scala.inline
  def apply(agentContent: scala.scalajs.js.typedarray.Uint8Array = null, agentUri: String = null): IExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (agentContent != null) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (agentUri != null) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportAgentResponse]
  }
}

