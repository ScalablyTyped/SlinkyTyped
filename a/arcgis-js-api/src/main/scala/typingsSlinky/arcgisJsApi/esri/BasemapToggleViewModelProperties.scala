package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleViewModelProperties extends js.Object {
  /**
    * The next basemap for toggling. One of the following values may be set to this property:
    *   * The [string ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) of any Esri basemap.
    *   * A custom [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) object. Since this property may be [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting), the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) module does not need to be included in the `require()` function in most applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.native
  /**
    * The view from which the widget will operate. This view provides access to the initial [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) to toggle from via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object BasemapToggleViewModelProperties {
  @scala.inline
  def apply(): BasemapToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleViewModelProperties]
  }
  @scala.inline
  implicit class BasemapToggleViewModelPropertiesOps[Self <: BasemapToggleViewModelProperties] (val x: Self) extends AnyVal {
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

