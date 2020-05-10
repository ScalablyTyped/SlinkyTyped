package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRemediationExceptionsResponse extends js.Object {
  /**
    * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.native
}

object DeleteRemediationExceptionsResponse {
  @scala.inline
  def apply(): DeleteRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
  }
  @scala.inline
  implicit class DeleteRemediationExceptionsResponseOps[Self <: DeleteRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedBatches(value: FailedDeleteRemediationExceptionsBatches): Self = {
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

