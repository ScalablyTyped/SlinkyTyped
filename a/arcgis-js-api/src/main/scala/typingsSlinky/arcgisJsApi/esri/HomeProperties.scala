package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [HomeViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewModel)
    */
  var viewModel: js.UndefOr[HomeViewModelProperties] = js.native
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home. The initial value is determined a few different ways:
    *   * If no [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is provided, the value is `null`.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready, but the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is not defined, the  initial value of the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is determined when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) became ready.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready and the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is defined by the user, the initial viewpoint value is the user-defined [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
}

object HomeProperties {
  @scala.inline
  def apply(): HomeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeProperties]
  }
  @scala.inline
  implicit class HomePropertiesOps[Self <: HomeProperties] (val x: Self) extends AnyVal {
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
    def withViewModel(value: HomeViewModelProperties): Self = {
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
    @scala.inline
    def withViewpoint(value: ViewpointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpoint")(js.undefined)
        ret
    }
  }
  
}

