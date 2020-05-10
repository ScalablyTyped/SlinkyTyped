package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReservationsScopedList extends js.Object {
  /**
    * A list of reservations contained in this scope.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.native
  /**
    * Informational warning which replaces the list of reservations when the
    * list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaReservationsScopedList {
  @scala.inline
  def apply(): SchemaReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsScopedList]
  }
  @scala.inline
  implicit class SchemaReservationsScopedListOps[Self <: SchemaReservationsScopedList] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

