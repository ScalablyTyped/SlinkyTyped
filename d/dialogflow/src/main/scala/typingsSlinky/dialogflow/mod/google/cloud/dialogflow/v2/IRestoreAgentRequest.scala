package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RestoreAgentRequest. */
trait IRestoreAgentRequest extends js.Object {
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IRestoreAgentRequest {
  @scala.inline
  def apply(
    agentContent: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    agentUri: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agentContent)) __obj.updateDynamic("agentContent")(agentContent.asInstanceOf[js.Any])
    if (!js.isUndefined(agentUri)) __obj.updateDynamic("agentUri")(agentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
}

