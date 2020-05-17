package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayPosition extends js.Object {
  var Address: AdditionalData = js.native
  var DisplayPosition: Longitude = js.native
  var LocationId: String = js.native
  var LocationType: String = js.native
  var MapView: BottomRight = js.native
  var NavigationPosition: js.Array[Longitude] = js.native
}

object DisplayPosition {
  @scala.inline
  def apply(
    Address: AdditionalData,
    DisplayPosition: Longitude,
    LocationId: String,
    LocationType: String,
    MapView: BottomRight,
    NavigationPosition: js.Array[Longitude]
  ): DisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayPosition]
  }
  @scala.inline
  implicit class DisplayPositionOps[Self <: DisplayPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: AdditionalData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayPosition(value: Longitude): Self = {
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
    def withMapView(value: BottomRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationPosition(value: js.Array[Longitude]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

