package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrivingOptions extends js.Object {
  var departureTime: js.Date = js.native
  var trafficModel: js.UndefOr[TrafficModel] = js.native
}

object DrivingOptions {
  @scala.inline
  def apply(departureTime: js.Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  @scala.inline
  implicit class DrivingOptionsOps[Self <: DrivingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepartureTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficModel(value: TrafficModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficModel")(js.undefined)
        ret
    }
  }
  
}

