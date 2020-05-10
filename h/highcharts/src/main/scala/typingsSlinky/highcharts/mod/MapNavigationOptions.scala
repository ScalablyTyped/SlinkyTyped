package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapNavigationOptions extends js.Object {
  /**
    * (Highmaps) General options for the map navigation buttons. Individual
    * options can be given from the mapNavigation.buttons option set.
    */
  var buttonOptions: js.UndefOr[MapNavigationButtonOptions] = js.native
  /**
    * (Highmaps) The individual buttons for the map navigation. This usually
    * includes the zoom in and zoom out buttons. Properties for each button is
    * inherited from mapNavigation.buttonOptions, while individual options can
    * be overridden. But default, the `onclick`, `text` and `y` options are
    * individual.
    */
  var buttons: js.UndefOr[MapNavigationButtonsOptions] = js.native
  /**
    * (Highmaps) Whether to enable navigation buttons. By default it inherits
    * the enabled setting.
    */
  var enableButtons: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Enables zooming in on an area on double clicking in the map.
    * By default it inherits the enabled setting.
    */
  var enableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Whether to zoom in on an area when that area is double
    * clicked.
    */
  var enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
    * enabled setting.
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
    * covers the viewport, this prevents the user from using multitouch and
    * touchdrag on the web page, so you should make sure the user is not
    * trapped inside the chart. By default it inherits the enabled setting.
    */
  var enableTouchZoom: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Whether to enable map navigation. The default is not to enable
    * navigation, as many choropleth maps are simple and don't need it.
    * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
    * the default behaviour of these interactions in the website, and the
    * implementer should be aware of this.
    *
    * Individual interactions can be enabled separately, namely buttons,
    * multitouch zoom, double click zoom, double click zoom to element and
    * mousewheel zoom.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
    * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
    */
  var mouseWheelSensitivity: js.UndefOr[Double] = js.native
}

object MapNavigationOptions {
  @scala.inline
  def apply(): MapNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationOptions]
  }
  @scala.inline
  implicit class MapNavigationOptionsOps[Self <: MapNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonOptions(value: MapNavigationButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: MapNavigationButtonsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDoubleClickZoomTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoubleClickZoomTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDoubleClickZoomTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDoubleClickZoomTo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSensitivity")(js.undefined)
        ret
    }
  }
  
}

