package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentLocation extends js.Object {
  /**
    * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
    */
  var Country: js.UndefOr[SetDimension] = js.native
  /**
    * The GPS location and range for the segment.
    */
  var GPSPoint: js.UndefOr[GPSPointDimension] = js.native
}

object SegmentLocation {
  @scala.inline
  def apply(): SegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentLocation]
  }
  @scala.inline
  implicit class SegmentLocationOps[Self <: SegmentLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: SetDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withGPSPoint(value: GPSPointDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGPSPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPSPoint")(js.undefined)
        ret
    }
  }
  
}

