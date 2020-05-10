package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayPosition extends js.Object {
  var Address: AnonAdditionalData = js.native
  var DisplayPosition: AnonLongitude = js.native
  var LocationId: String = js.native
  var LocationType: String = js.native
  var MapView: AnonBottomRight = js.native
  var NavigationPosition: js.Array[AnonLongitude] = js.native
}

object AnonDisplayPosition {
  @scala.inline
  def apply(
    Address: AnonAdditionalData,
    DisplayPosition: AnonLongitude,
    LocationId: String,
    LocationType: String,
    MapView: AnonBottomRight,
    NavigationPosition: js.Array[AnonLongitude]
  ): AnonDisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayPosition]
  }
  @scala.inline
  implicit class AnonDisplayPositionOps[Self <: AnonDisplayPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: AnonAdditionalData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayPosition(value: AnonLongitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapView(value: AnonBottomRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationPosition(value: js.Array[AnonLongitude]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

