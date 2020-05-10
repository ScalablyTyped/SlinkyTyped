package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSPointDimension extends js.Object {
  /**
    * The GPS coordinates to measure distance from.
    */
  var Coordinates: GPSCoordinates = js.native
  /**
    * The range, in kilometers, from the GPS coordinates.
    */
  var RangeInKilometers: js.UndefOr[double] = js.native
}

object GPSPointDimension {
  @scala.inline
  def apply(Coordinates: GPSCoordinates): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
  @scala.inline
  implicit class GPSPointDimensionOps[Self <: GPSPointDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: GPSCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeInKilometers(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeInKilometers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeInKilometers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeInKilometers")(js.undefined)
        ret
    }
  }
  
}

