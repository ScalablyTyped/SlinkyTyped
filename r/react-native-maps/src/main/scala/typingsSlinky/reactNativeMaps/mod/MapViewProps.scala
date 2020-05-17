package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaps.anon.Action
import typingsSlinky.reactNativeMaps.anon.ActionId
import typingsSlinky.reactNativeMaps.anon.Id
import typingsSlinky.reactNativeMaps.anon.Markers
import typingsSlinky.reactNativeMaps.anon.Name
import typingsSlinky.reactNativeMaps.anon.`0`
import typingsSlinky.reactNativeMaps.reactNativeMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewProps extends ViewProps {
  var cacheEnabled: js.UndefOr[Boolean] = js.native
  var camera: js.UndefOr[Camera] = js.native
  var compassOffset: js.UndefOr[Point] = js.native
  var customMapStyle: js.UndefOr[js.Array[MapStyleElement]] = js.native
  var customMapStyleString: js.UndefOr[String] = js.native
  var followsUserLocation: js.UndefOr[Boolean] = js.native
  var initialCamera: js.UndefOr[Camera] = js.native
  var initialRegion: js.UndefOr[Region] = js.native
  var kmlSrc: js.UndefOr[String] = js.native
  var legalLabelInsets: js.UndefOr[EdgeInsets] = js.native
  var liteMode: js.UndefOr[Boolean] = js.native
  var loadingBackgroundColor: js.UndefOr[String] = js.native
  var loadingEnabled: js.UndefOr[Boolean] = js.native
  var loadingIndicatorColor: js.UndefOr[String] = js.native
  var mapPadding: js.UndefOr[EdgePadding] = js.native
  var mapType: js.UndefOr[MapTypes] = js.native
  var maxDelta: js.UndefOr[Double] = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var minDelta: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var moveOnMarkerPress: js.UndefOr[Boolean] = js.native
  var onCalloutPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onKmlReady: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Markers], Unit]] = js.native
  var onLongPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMapReady: js.UndefOr[js.Function0[Unit]] = js.native
  var onMarkerDeselect: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, ActionId with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMarkerDrag: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMarkerDragEnd: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMarkerDragStart: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMarkerPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, Action with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onMarkerSelect: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, Id with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onPanDrag: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onPoiClick: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, Name with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var onRegionChange: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.native
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ Region, Unit]] = js.native
  var onUserLocationChange: js.UndefOr[js.Function1[/* event */ EventUserLocation, Unit]] = js.native
  var pitchEnabled: js.UndefOr[Boolean] = js.native
  var provider: js.UndefOr[google | Null] = js.native
  var region: js.UndefOr[Region] = js.native
  var rotateEnabled: js.UndefOr[Boolean] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var showsBuildings: js.UndefOr[Boolean] = js.native
  var showsCompass: js.UndefOr[Boolean] = js.native
  var showsIndoorLevelPicker: js.UndefOr[Boolean] = js.native
  var showsIndoors: js.UndefOr[Boolean] = js.native
  var showsMyLocationButton: js.UndefOr[Boolean] = js.native
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.native
  var showsScale: js.UndefOr[Boolean] = js.native
  var showsTraffic: js.UndefOr[Boolean] = js.native
  var showsUserLocation: js.UndefOr[Boolean] = js.native
  var toolbarEnabled: js.UndefOr[Boolean] = js.native
  var userLocationAnnotationTitle: js.UndefOr[String] = js.native
  var zoomControlEnabled: js.UndefOr[Boolean] = js.native
  var zoomEnabled: js.UndefOr[Boolean] = js.native
  var zoomTapEnabled: js.UndefOr[Boolean] = js.native
}

object MapViewProps {
  @scala.inline
  def apply(): MapViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewProps]
  }
  @scala.inline
  implicit class MapViewPropsOps[Self <: MapViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withCompassOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compassOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompassOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compassOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMapStyle(value: js.Array[MapStyleElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMapStyleString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyleString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMapStyleString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMapStyleString")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowsUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followsUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowsUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followsUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withKmlSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmlSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmlSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmlSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalLabelInsets(value: EdgeInsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalLabelInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalLabelInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalLabelInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicatorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicatorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPadding(value: EdgePadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withMapType(value: MapTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOnMarkerPress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMarkerPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOnMarkerPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMarkerPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCalloutPress(value: SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalloutPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCalloutPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalloutPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKmlReady(value: SyntheticEvent[NodeHandle, Markers] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKmlReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKmlReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKmlReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMapReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMapReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMapReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerDeselect(
      value: SyntheticEvent[NodeHandle, ActionId with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerDrag(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerDragEnd(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerDragStart(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerPress(
      value: SyntheticEvent[NodeHandle, Action with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerSelect(value: SyntheticEvent[NodeHandle, Id with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanDrag(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPanDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPoiClick(value: SyntheticEvent[NodeHandle, Name with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoiClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPoiClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoiClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegionChange(value: /* region */ Region => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegionChangeComplete(value: /* region */ Region => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegionChangeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegionChangeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegionChangeComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserLocationChange(value: /* event */ EventUserLocation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLocationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserLocationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLocationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: google): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(null)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsBuildings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsBuildings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsBuildings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsBuildings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsCompass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsCompass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsCompass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsCompass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsIndoorLevelPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsIndoorLevelPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsIndoorLevelPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsIndoorLevelPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsIndoors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsIndoors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsIndoors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsIndoors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsMyLocationButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsMyLocationButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsMyLocationButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsMyLocationButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsPointsOfInterest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPointsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsPointsOfInterest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPointsOfInterest")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsScale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocationAnnotationTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocationAnnotationTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocationAnnotationTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocationAnnotationTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomControlEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControlEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomTapEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomTapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTapEnabled")(js.undefined)
        ret
    }
  }
  
}

