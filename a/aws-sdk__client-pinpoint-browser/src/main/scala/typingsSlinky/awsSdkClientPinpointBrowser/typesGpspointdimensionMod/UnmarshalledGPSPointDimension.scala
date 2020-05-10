package typingsSlinky.awsSdkClientPinpointBrowser.typesGpspointdimensionMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.UnmarshalledGPSCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGPSPointDimension extends GPSPointDimension {
  /**
    * Coordinate to measure distance from.
    */
  @JSName("Coordinates")
  var Coordinates_UnmarshalledGPSPointDimension: js.UndefOr[UnmarshalledGPSCoordinates] = js.native
}

object UnmarshalledGPSPointDimension {
  @scala.inline
  def apply(): UnmarshalledGPSPointDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGPSPointDimension]
  }
  @scala.inline
  implicit class UnmarshalledGPSPointDimensionOps[Self <: UnmarshalledGPSPointDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: UnmarshalledGPSCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coordinates")(js.undefined)
        ret
    }
  }
  
}

