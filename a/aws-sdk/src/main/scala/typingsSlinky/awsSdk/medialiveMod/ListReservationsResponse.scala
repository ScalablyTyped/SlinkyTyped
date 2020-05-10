package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReservationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of reservations
    */
  var Reservations: js.UndefOr[listOfReservation] = js.native
}

object ListReservationsResponse {
  @scala.inline
  def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  @scala.inline
  implicit class ListReservationsResponseOps[Self <: ListReservationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReservations(value: listOfReservation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reservations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reservations")(js.undefined)
        ret
    }
  }
  
}

