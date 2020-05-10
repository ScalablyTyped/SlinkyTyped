package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResponse extends js.Object {
  /**
    * Indicate the decision of the check.
    *
    * If no check errors are present, the service should process the operation.
    * Otherwise the service should use the list of errors to determine the
    * appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[CheckError]] = js.native
  /** Feedback data returned from the server during processing a Check request. */
  var checkInfo: js.UndefOr[CheckInfo] = js.native
  /**
    * The same operation_id value used in the CheckRequest.
    * Used for logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /** Quota information for the check request associated with this response. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.native
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object CheckResponse {
  @scala.inline
  def apply(): CheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResponse]
  }
  @scala.inline
  implicit class CheckResponseOps[Self <: CheckResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckErrors(value: js.Array[CheckError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckInfo(value: CheckInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaInfo(value: QuotaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(js.undefined)
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

