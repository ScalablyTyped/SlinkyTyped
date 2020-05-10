package typingsSlinky.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisapprovalReasons extends js.Object {
  /** All known contexts/restrictions. */
  var contexts: js.UndefOr[js.Array[AnonAuctionType]] = js.native
  /**
    * The reasons for disapproval within this restriction, if any. Note that not all disapproval reasons may be categorized, so it is possible for the
    * creative to have a status of DISAPPROVED or CONDITIONALLY_APPROVED with an empty list for disapproval_reasons. In this case, please reach out to your
    * TAM to help debug the issue.
    */
  var disapprovalReasons: js.UndefOr[js.Array[AnonDetails]] = js.native
  /** Why the creative is ineligible to serve in this context (e.g., it has been explicitly disapproved or is pending review). */
  var reason: js.UndefOr[String] = js.native
}

object AnonDisapprovalReasons {
  @scala.inline
  def apply(): AnonDisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisapprovalReasons]
  }
  @scala.inline
  implicit class AnonDisapprovalReasonsOps[Self <: AnonDisapprovalReasons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[AnonAuctionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withDisapprovalReasons(value: js.Array[AnonDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisapprovalReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

