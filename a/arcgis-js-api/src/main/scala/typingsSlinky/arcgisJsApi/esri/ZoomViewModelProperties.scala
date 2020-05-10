package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomViewModelProperties extends js.Object {
  /**
    * Indicates if the view can zoom in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
    */
  var canZoomIn: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the view can zoom out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
    */
  var canZoomOut: js.UndefOr[Boolean] = js.native
  /**
    * The view from which to operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object ZoomViewModelProperties {
  @scala.inline
  def apply(): ZoomViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomViewModelProperties]
  }
  @scala.inline
  implicit class ZoomViewModelPropertiesOps[Self <: ZoomViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanZoomIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canZoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canZoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withCanZoomOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canZoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canZoomOut")(js.undefined)
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

