package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedDeleteRemediationExceptionsBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.native
  /**
    * Returns a failure message for delete remediation exception. For example, AWS Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}

object FailedDeleteRemediationExceptionsBatch {
  @scala.inline
  def apply(): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
  @scala.inline
  implicit class FailedDeleteRemediationExceptionsBatchOps[Self <: FailedDeleteRemediationExceptionsBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: RemediationExceptionResourceKeys): Self = {
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

