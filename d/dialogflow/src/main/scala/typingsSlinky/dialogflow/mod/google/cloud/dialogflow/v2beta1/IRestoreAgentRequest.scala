package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RestoreAgentRequest. */
@js.native
trait IRestoreAgentRequest extends js.Object {
  /** RestoreAgentRequest agentContent */
  var agentContent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** RestoreAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.native
  /** RestoreAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}

object IRestoreAgentRequest {
  @scala.inline
  def apply(): IRestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreAgentRequest]
  }
  @scala.inline
  implicit class IRestoreAgentRequestOps[Self <: IRestoreAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentContent(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentContent")(null)
        ret
    }
    @scala.inline
    def withAgentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUri")(null)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

