package typingsSlinky.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maps extends js.Object {
  var Animation: js.Any = js.native
  var ControlPosition: js.Any = js.native
  var DirectionsStatus: js.Any = js.native
  var DirectionsTravelMode: js.Any = js.native
  var DirectionsUnitSystem: js.Any = js.native
  var DistanceMatrixElementStatus: js.Any = js.native
  var DistanceMatrixStatus: js.Any = js.native
  var ElevationStatus: js.Any = js.native
  var GeocoderLocationType: js.Any = js.native
  var GeocoderStatus: js.Any = js.native
  var KmlLayerStats: js.Any = js.native
  var MapTypeControlStyle: js.Any = js.native
  var MapTypeId: js.Any = js.native
  var MaxZoomStatus: js.Any = js.native
  var NavigationControlStyle: js.Any = js.native
  var ScaleControlStyle: js.Any = js.native
  var StreetViewStatus: js.Any = js.native
  var StrokePosition: js.Any = js.native
  var SymbolPath: js.Any = js.native
  var TransitMode: js.Any = js.native
  var TransitRoutePreference: js.Any = js.native
  var TravelMode: js.Any = js.native
  var UnitSystem: js.Any = js.native
  var ZoomControlStyle: js.Any = js.native
}

object Maps {
  @scala.inline
  def apply(
    Animation: js.Any,
    ControlPosition: js.Any,
    DirectionsStatus: js.Any,
    DirectionsTravelMode: js.Any,
    DirectionsUnitSystem: js.Any,
    DistanceMatrixElementStatus: js.Any,
    DistanceMatrixStatus: js.Any,
    ElevationStatus: js.Any,
    GeocoderLocationType: js.Any,
    GeocoderStatus: js.Any,
    KmlLayerStats: js.Any,
    MapTypeControlStyle: js.Any,
    MapTypeId: js.Any,
    MaxZoomStatus: js.Any,
    NavigationControlStyle: js.Any,
    ScaleControlStyle: js.Any,
    StreetViewStatus: js.Any,
    StrokePosition: js.Any,
    SymbolPath: js.Any,
    TransitMode: js.Any,
    TransitRoutePreference: js.Any,
    TravelMode: js.Any,
    UnitSystem: js.Any,
    ZoomControlStyle: js.Any
  ): Maps = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], ControlPosition = ControlPosition.asInstanceOf[js.Any], DirectionsStatus = DirectionsStatus.asInstanceOf[js.Any], DirectionsTravelMode = DirectionsTravelMode.asInstanceOf[js.Any], DirectionsUnitSystem = DirectionsUnitSystem.asInstanceOf[js.Any], DistanceMatrixElementStatus = DistanceMatrixElementStatus.asInstanceOf[js.Any], DistanceMatrixStatus = DistanceMatrixStatus.asInstanceOf[js.Any], ElevationStatus = ElevationStatus.asInstanceOf[js.Any], GeocoderLocationType = GeocoderLocationType.asInstanceOf[js.Any], GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], KmlLayerStats = KmlLayerStats.asInstanceOf[js.Any], MapTypeControlStyle = MapTypeControlStyle.asInstanceOf[js.Any], MapTypeId = MapTypeId.asInstanceOf[js.Any], MaxZoomStatus = MaxZoomStatus.asInstanceOf[js.Any], NavigationControlStyle = NavigationControlStyle.asInstanceOf[js.Any], ScaleControlStyle = ScaleControlStyle.asInstanceOf[js.Any], StreetViewStatus = StreetViewStatus.asInstanceOf[js.Any], StrokePosition = StrokePosition.asInstanceOf[js.Any], SymbolPath = SymbolPath.asInstanceOf[js.Any], TransitMode = TransitMode.asInstanceOf[js.Any], TransitRoutePreference = TransitRoutePreference.asInstanceOf[js.Any], TravelMode = TravelMode.asInstanceOf[js.Any], UnitSystem = UnitSystem.asInstanceOf[js.Any], ZoomControlStyle = ZoomControlStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maps]
  }
  @scala.inline
  implicit class MapsOps[Self <: Maps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionsStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionsTravelMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionsTravelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionsUnitSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionsUnitSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceMatrixElementStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceMatrixElementStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceMatrixStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceMatrixStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevationStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElevationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeocoderLocationType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeocoderLocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeocoderStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeocoderStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmlLayerStats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmlLayerStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapTypeControlStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapTypeControlStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapTypeId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoomStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxZoomStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationControlStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationControlStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleControlStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleControlStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetViewStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreetViewStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokePosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrokePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SymbolPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitRoutePreference(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitRoutePreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTravelMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TravelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnitSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomControlStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoomControlStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

