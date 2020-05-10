package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReconciliationRequest extends js.Object {
  /** Operation that describes the quota reconciliation. */
  var reconciliationOperation: js.UndefOr[QuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object StartReconciliationRequest {
  @scala.inline
  def apply(): StartReconciliationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReconciliationRequest]
  }
  @scala.inline
  implicit class StartReconciliationRequestOps[Self <: StartReconciliationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconciliationOperation(value: QuotaOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliationOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconciliationOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliationOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(js.undefined)
        ret
    }
  }
  
}

