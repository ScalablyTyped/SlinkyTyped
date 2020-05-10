package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckRefreshStatus extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  /**
    * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
    */
  var millisUntilNextRefreshable: Long = js.native
  /**
    * The status of the Trusted Advisor check for which a refresh has been requested:     none: The check is not refreshed or the non-success status exceeds the timeout    enqueued: The check refresh requests has entered the refresh queue    processing: The check refresh request is picked up by the rule processing engine    success: The check is successfully refreshed    abandoned: The check refresh has failed  
    */
  var status: String = js.native
}

object TrustedAdvisorCheckRefreshStatus {
  @scala.inline
  def apply(checkId: String, millisUntilNextRefreshable: Long, status: String): TrustedAdvisorCheckRefreshStatus = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any], millisUntilNextRefreshable = millisUntilNextRefreshable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckRefreshStatus]
  }
  @scala.inline
  implicit class TrustedAdvisorCheckRefreshStatusOps[Self <: TrustedAdvisorCheckRefreshStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillisUntilNextRefreshable(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisUntilNextRefreshable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

