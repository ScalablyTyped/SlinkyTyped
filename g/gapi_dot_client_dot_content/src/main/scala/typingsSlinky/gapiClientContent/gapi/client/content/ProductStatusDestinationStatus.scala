package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductStatusDestinationStatus extends js.Object {
  /** The destination's approval status. */
  var approvalStatus: js.UndefOr[String] = js.native
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.native
  /** Whether the destination is required, excluded, selected by default or should be validated. */
  var intention: js.UndefOr[String] = js.native
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
  @scala.inline
  implicit class ProductStatusDestinationStatusOps[Self <: ProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withIntention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(js.undefined)
        ret
    }
  }
  
}

