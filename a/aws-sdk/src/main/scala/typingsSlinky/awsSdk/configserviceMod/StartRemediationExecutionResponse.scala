package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRemediationExecutionResponse extends js.Object {
  /**
    * For resources that have failed to start execution, the API returns a resource key object.
    */
  var FailedItems: js.UndefOr[ResourceKeys] = js.native
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}

object StartRemediationExecutionResponse {
  @scala.inline
  def apply(): StartRemediationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRemediationExecutionResponse]
  }
  @scala.inline
  implicit class StartRemediationExecutionResponseOps[Self <: StartRemediationExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: ResourceKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(js.undefined)
        ret
    }
  }
  
}

