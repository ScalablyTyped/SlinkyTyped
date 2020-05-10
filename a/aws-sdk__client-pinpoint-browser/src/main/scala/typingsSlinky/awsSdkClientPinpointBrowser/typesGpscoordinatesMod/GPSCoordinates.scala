package typingsSlinky.awsSdkClientPinpointBrowser.typesGpscoordinatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSCoordinates extends js.Object {
  /**
    * Latitude
    */
  var Latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude
    */
  var Longitude: js.UndefOr[Double] = js.native
}

object GPSCoordinates {
  @scala.inline
  def apply(): GPSCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPSCoordinates]
  }
  @scala.inline
  implicit class GPSCoordinatesOps[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Longitude")(js.undefined)
        ret
    }
  }
  
}

