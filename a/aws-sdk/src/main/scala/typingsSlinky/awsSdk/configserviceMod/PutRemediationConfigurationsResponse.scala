package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a list of failed remediation batch objects.
    */
  var FailedBatches: js.UndefOr[FailedRemediationBatches] = js.native
}

object PutRemediationConfigurationsResponse {
  @scala.inline
  def apply(): PutRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRemediationConfigurationsResponse]
  }
  @scala.inline
  implicit class PutRemediationConfigurationsResponseOps[Self <: PutRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedBatches(value: FailedRemediationBatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedBatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedBatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedBatches")(js.undefined)
        ret
    }
  }
  
}

