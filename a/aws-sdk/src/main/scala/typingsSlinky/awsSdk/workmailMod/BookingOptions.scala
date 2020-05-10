package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookingOptions extends js.Object {
  /**
    * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
    */
  var AutoAcceptRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any conflicting requests.
    */
  var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any recurring requests.
    */
  var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.native
}

object BookingOptions {
  @scala.inline
  def apply(): BookingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingOptions]
  }
  @scala.inline
  implicit class BookingOptionsOps[Self <: BookingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAcceptRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAcceptRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAcceptRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDeclineConflictingRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeclineConflictingRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeclineConflictingRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeclineConflictingRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDeclineRecurringRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeclineRecurringRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeclineRecurringRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeclineRecurringRequests")(js.undefined)
        ret
    }
  }
  
}

