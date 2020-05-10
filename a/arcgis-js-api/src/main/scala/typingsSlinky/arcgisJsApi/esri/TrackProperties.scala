package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.native
  /**
    * Indicates whether the widget will automatically navigate the view to the user's position when a geolocation result is found. Set to `false` to disable this behavior, leaving full control to the developer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#goToLocationEnabled)
    *
    * @default true
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The graphic used to show the user's location in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#event-track) event. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`. For 2D views the value should be within the [effectiveMinScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) and [effectiveMaxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#scale)
    *
    * @default null
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface). Set to `false` to disable this behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#useHeadingEnabled)
    *
    * @default true
    */
  var useHeadingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TrackViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#viewModel)
    */
  var viewModel: js.UndefOr[TrackViewModelProperties] = js.native
}

object TrackProperties {
  @scala.inline
  def apply(): TrackProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackProperties]
  }
  @scala.inline
  implicit class TrackPropertiesOps[Self <: TrackProperties] (val x: Self) extends AnyVal {
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
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
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
    def withUseHeadingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHeadingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHeadingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHeadingEnabled")(js.undefined)
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
    @scala.inline
    def withViewModel(value: TrackViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

