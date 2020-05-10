package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionCommitmentsUpdateReservationsRequest extends js.Object {
  /**
    * List of reservations for the capacity move of VMs with accelerators and
    * local ssds.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.native
}

object SchemaRegionCommitmentsUpdateReservationsRequest {
  @scala.inline
  def apply(): SchemaRegionCommitmentsUpdateReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionCommitmentsUpdateReservationsRequest]
  }
  @scala.inline
  implicit class SchemaRegionCommitmentsUpdateReservationsRequestOps[Self <: SchemaRegionCommitmentsUpdateReservationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservations(value: js.Array[SchemaReservation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservations")(js.undefined)
        ret
    }
  }
  
}

