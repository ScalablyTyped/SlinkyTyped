package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsReservationReservationItemExtension extends js.Object {
  /**
    * Confirmation code for this reservation.
    */
  var confirmationCode: js.UndefOr[String] = js.native
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Location of the service/event.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * The number of people.
    */
  var partySize: js.UndefOr[Double] = js.native
  /**
    * Time when the service/event is scheduled to occur.
    * Can be a time range, a date, or an exact date time.
    */
  var reservationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * Staff facilitators who will be servicing the reservation.
    * Ex. The hairstylist.
    */
  var staffFacilitators: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]] = js.native
  /**
    * Required: Reservation status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus] = js.native
  /**
    * Type of reservation.
    * May be unset if none of the type options is applicable.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType] = js.native
  /**
    * Time range that is acceptable to the user.
    */
  var userAcceptableTimeRange: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsReservationReservationItemExtension {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsReservationReservationItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionOps[Self <: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPartySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partySize")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationTime(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStaffFacilitators(value: js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staffFacilitators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaffFacilitators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staffFacilitators")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAcceptableTimeRange(value: GoogleActionsOrdersV3Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAcceptableTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAcceptableTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAcceptableTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleStatusLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleStatusLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStatusLabel")(js.undefined)
        ret
    }
  }
  
}

