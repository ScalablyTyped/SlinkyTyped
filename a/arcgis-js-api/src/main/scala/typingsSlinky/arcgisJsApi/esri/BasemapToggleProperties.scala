package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleProperties extends WidgetProperties {
  /**
    * The next basemap for toggling. One of the following values may be set to this property:
    *   * The [string ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) of any Esri basemap.
    *   * A custom [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) object. Since this property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting), the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) module does not need to be included in the `require()` function in most applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.native
  /**
    * Indicates if the title of the basemap is visible in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#titleVisible)
    *
    * @default false
    */
  var titleVisible: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This view provides the BasemapToggle widget with access to the initial [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) to toggle from via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BasemapToggleViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapToggleViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BasemapToggleVisibleElements] = js.native
}

object BasemapToggleProperties {
  @scala.inline
  def apply(): BasemapToggleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleProperties]
  }
  @scala.inline
  implicit class BasemapTogglePropertiesOps[Self <: BasemapToggleProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextBasemap(value: BasemapProperties | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBasemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextBasemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBasemap")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleVisible")(js.undefined)
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
    def withViewModel(value: BasemapToggleViewModelProperties): Self = {
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
    def withVisibleElements(value: BasemapToggleVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}

