package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckRequest extends js.Object {
  /** The operation to be checked. */
  var operation: js.UndefOr[Operation] = js.native
  /** Requests the project settings to be returned as part of the check response. */
  var requestProjectSettings: js.UndefOr[Boolean] = js.native
  /**
    * Specifies which version of service configuration should be used to process
    * the request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.native
}

object CheckRequest {
  @scala.inline
  def apply(): CheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckRequest]
  }
  @scala.inline
  implicit class CheckRequestOps[Self <: CheckRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: Operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestProjectSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProjectSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProjectSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProjectSettings")(js.undefined)
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
    @scala.inline
    def withSkipActivationCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipActivationCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipActivationCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipActivationCheck")(js.undefined)
        ret
    }
  }
  
}

