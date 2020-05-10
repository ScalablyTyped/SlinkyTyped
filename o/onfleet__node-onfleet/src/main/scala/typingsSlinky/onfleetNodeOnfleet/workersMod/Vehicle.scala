package typingsSlinky.onfleetNodeOnfleet.workersMod

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.BICYCLE
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.CAR
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.MOTORCYCLE
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TRUCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vehicle extends js.Object {
  var color: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var licensePlate: js.UndefOr[String] = js.native
  var `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK = js.native
}

object Vehicle {
  @scala.inline
  def apply(`type`: BICYCLE | CAR | MOTORCYCLE | TRUCK): Vehicle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vehicle]
  }
  @scala.inline
  implicit class VehicleOps[Self <: Vehicle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensePlate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensePlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensePlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensePlate")(js.undefined)
        ret
    }
  }
  
}

