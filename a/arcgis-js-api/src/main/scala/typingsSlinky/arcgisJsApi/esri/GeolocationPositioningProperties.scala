package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationPositioningProperties extends js.Object {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.native
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    *
    * @default true
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * The scale to set on the view when navigating to the position of the geolocated result. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    *
    * @default null
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object GeolocationPositioningProperties {
  @scala.inline
  def apply(): GeolocationPositioningProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationPositioningProperties]
  }
  @scala.inline
  implicit class GeolocationPositioningPropertiesOps[Self <: GeolocationPositioningProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeolocationOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeolocationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToLocationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLocationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoToLocationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLocationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphic(value: GraphicProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphic")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

