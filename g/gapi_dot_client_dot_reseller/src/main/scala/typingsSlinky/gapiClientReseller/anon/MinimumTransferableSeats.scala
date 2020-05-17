package typingsSlinky.gapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumTransferableSeats extends js.Object {
  /**
    * When inserting a subscription, this is the minimum number of seats listed in the transfer order for this product. For example, if the customer has 20
    * users, the reseller cannot place a transfer order of 15 seats. The minimum is 20 seats.
    */
  var minimumTransferableSeats: js.UndefOr[Double] = js.native
  /** The time when transfer token or intent to transfer will expire. The time is in milliseconds using UNIX Epoch format. */
  var transferabilityExpirationTime: js.UndefOr[String] = js.native
}

object MinimumTransferableSeats {
  @scala.inline
  def apply(): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
  @scala.inline
  implicit class MinimumTransferableSeatsOps[Self <: MinimumTransferableSeats] (val x: Self) extends AnyVal {
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

