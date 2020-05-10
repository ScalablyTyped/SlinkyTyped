package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionTransferInfo extends js.Object {
  var minimumTransferableSeats: js.UndefOr[Double] = js.native
  var transferabilityExpirationTime: js.UndefOr[String] = js.native
}

object SubscriptionTransferInfo {
  @scala.inline
  def apply(): SubscriptionTransferInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionTransferInfo]
  }
  @scala.inline
  implicit class SubscriptionTransferInfoOps[Self <: SubscriptionTransferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumTransferableSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTransferableSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumTransferableSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTransferableSeats")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferabilityExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferabilityExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferabilityExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferabilityExpirationTime")(js.undefined)
        ret
    }
  }
  
}

