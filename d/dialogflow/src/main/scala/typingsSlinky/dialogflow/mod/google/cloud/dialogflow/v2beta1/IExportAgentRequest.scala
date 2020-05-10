package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExportAgentRequest. */
@js.native
trait IExportAgentRequest extends js.Object {
  /** ExportAgentRequest agentUri */
  var agentUri: js.UndefOr[String | Null] = js.native
  /** ExportAgentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}

object IExportAgentRequest {
  @scala.inline
  def apply(): IExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExportAgentRequest]
  }
  @scala.inline
  implicit class IExportAgentRequestOps[Self <: IExportAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

