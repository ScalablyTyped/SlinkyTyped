package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedRemediationExceptionBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptions] = js.native
  /**
    * Returns a failure message. For example, the auto-remediation has failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}

object FailedRemediationExceptionBatch {
  @scala.inline
  def apply(): FailedRemediationExceptionBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRemediationExceptionBatch]
  }
  @scala.inline
  implicit class FailedRemediationExceptionBatchOps[Self <: FailedRemediationExceptionBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: RemediationExceptions): Self = {
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

