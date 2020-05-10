package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixResponseElement extends js.Object {
  var distance: Distance = js.native
  var duration: Duration = js.native
  var duration_in_traffic: Duration = js.native
  var fare: TransitFare = js.native
  var status: DistanceMatrixElementStatus = js.native
}

object DistanceMatrixResponseElement {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    fare: TransitFare,
    status: DistanceMatrixElementStatus
  ): DistanceMatrixResponseElement = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
  @scala.inline
  implicit class DistanceMatrixResponseElementOps[Self <: DistanceMatrixResponseElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Distance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_in_traffic(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_traffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFare(value: TransitFare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DistanceMatrixElementStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

