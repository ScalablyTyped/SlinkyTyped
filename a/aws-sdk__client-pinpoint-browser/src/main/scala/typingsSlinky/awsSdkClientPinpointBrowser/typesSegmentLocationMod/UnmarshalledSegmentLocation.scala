package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentLocationMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.UnmarshalledGPSPointDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentLocation extends SegmentLocation {
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  @JSName("Country")
  var Country_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledSetDimension] = js.native
  /**
    * The GPS Point dimension.
    */
  @JSName("GPSPoint")
  var GPSPoint_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledGPSPointDimension] = js.native
}

object UnmarshalledSegmentLocation {
  @scala.inline
  def apply(): UnmarshalledSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentLocation]
  }
  @scala.inline
  implicit class UnmarshalledSegmentLocationOps[Self <: UnmarshalledSegmentLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: UnmarshalledSetDimension): Self = {
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
    def withGPSPoint(value: UnmarshalledGPSPointDimension): Self = {
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

