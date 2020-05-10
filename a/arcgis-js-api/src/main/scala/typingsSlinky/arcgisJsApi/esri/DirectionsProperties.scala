package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    *
    * @default 50
    */
  var maxStops: js.UndefOr[Double] = js.native
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: js.UndefOr[String] = js.native
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html). Note that the default `searchProperties` differ slightly from the [Search widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    *
    * @default null
    */
  var searchProperties: js.UndefOr[DirectionsSearchProperties] = js.native
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsStopSymbols] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectionsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectionsViewModelProperties] = js.native
}

object DirectionsProperties {
  @scala.inline
  def apply(): DirectionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsProperties]
  }
  @scala.inline
  implicit class DirectionsPropertiesOps[Self <: DirectionsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMaxStops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStops")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteSymbol(value: SimpleLineSymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchProperties(value: DirectionsSearchProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStopSymbols(value: DirectionsStopSymbols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSymbols")(js.undefined)
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
    def withViewModel(value: DirectionsViewModelProperties): Self = {
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

