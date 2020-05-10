package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SetAgentRequest. */
@js.native
trait ISetAgentRequest extends js.Object {
  /** SetAgentRequest agent */
  var agent: js.UndefOr[IAgent | Null] = js.native
  /** SetAgentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object ISetAgentRequest {
  @scala.inline
  def apply(): ISetAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetAgentRequest]
  }
  @scala.inline
  implicit class ISetAgentRequestOps[Self <: ISetAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: IAgent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(null)
        ret
    }
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

