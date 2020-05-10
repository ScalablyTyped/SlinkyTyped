package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonBing
import typingsSlinky.devextreme.AnonColor
import typingsSlinky.devextreme.AnonIconSrc
import typingsSlinky.devextreme.AnonJQueryEventLocation
import typingsSlinky.devextreme.AnonModelOptions
import typingsSlinky.devextreme.AnonOptions
import typingsSlinky.devextreme.AnonOriginalMap
import typingsSlinky.devextreme.AnonOriginalRoute
import typingsSlinky.devextreme.devextremeStrings.bing
import typingsSlinky.devextreme.devextremeStrings.google
import typingsSlinky.devextreme.devextremeStrings.googleStatic
import typingsSlinky.devextreme.devextremeStrings.hybrid
import typingsSlinky.devextreme.devextremeStrings.roadmap
import typingsSlinky.devextreme.devextremeStrings.satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMapOptions extends WidgetOptions[dxMap] {
  /** Specifies whether the widget automatically adjusts center and zoom option values when adding a new marker or route, or if a new widget contains markers or routes by default. */
  var autoAdjust: js.UndefOr[Boolean] = js.native
  /** An object, a string, or an array specifying which part of the map is displayed at the widget's center using coordinates. The widget can change this value if autoAdjust is enabled. */
  var center: js.UndefOr[js.Any | String | js.Array[Double]] = js.native
  /** Specifies whether or not map widget controls are available. */
  var controls: js.UndefOr[Boolean] = js.native
  /** A key used to authenticate the application within the required map provider. */
  var key: js.UndefOr[String | AnonBing] = js.native
  /** A URL pointing to the custom icon to be used for map markers. */
  var markerIconSrc: js.UndefOr[String] = js.native
  /** An array of markers displayed on a map. */
  var markers: js.UndefOr[js.Array[AnonIconSrc]] = js.native
  /** A function that is executed when any location on the map is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventLocation, _]) | String] = js.native
  /** A function that is executed when a marker is created on the map. */
  var onMarkerAdded: js.UndefOr[js.Function1[/* e */ AnonOptions, _]] = js.native
  /** A function that is executed when a marker is removed from the map. */
  var onMarkerRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.native
  /** A function that is executed when the map is ready. */
  var onReady: js.UndefOr[js.Function1[/* e */ AnonOriginalMap, _]] = js.native
  /** A function that is executed when a route is created on the map. */
  var onRouteAdded: js.UndefOr[js.Function1[/* e */ AnonOriginalRoute, _]] = js.native
  /** A function that is executed when a route is removed from the map. */
  var onRouteRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.native
  /** The name of the current map data provider. */
  var provider: js.UndefOr[bing | google | googleStatic] = js.native
  /** An array of routes shown on the map. */
  var routes: js.UndefOr[js.Array[AnonColor]] = js.native
  /** The type of a map to display. */
  var `type`: js.UndefOr[hybrid | roadmap | satellite] = js.native
  /** The map's zoom level. The widget can change this value if autoAdjust is enabled. */
  var zoom: js.UndefOr[Double] = js.native
}

object dxMapOptions {
  @scala.inline
  def apply(): dxMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMapOptions]
  }
  @scala.inline
  implicit class dxMapOptionsOps[Self <: dxMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAdjust(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Any | String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | AnonBing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerIconSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerIconSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerIconSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerIconSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[AnonIconSrc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* e */ AnonJQueryEventLocation => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: (js.Function1[/* e */ AnonJQueryEventLocation, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerAdded(value: /* e */ AnonOptions => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMarkerRemoved(value: /* e */ AnonModelOptions => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMarkerRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMarkerRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* e */ AnonOriginalMap => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRouteAdded(value: /* e */ AnonOriginalRoute => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRouteAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRouteRemoved(value: /* e */ AnonModelOptions => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRouteRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRouteRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: bing | google | googleStatic): Self = {
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
    def withRoutes(value: js.Array[AnonColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: hybrid | roadmap | satellite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

