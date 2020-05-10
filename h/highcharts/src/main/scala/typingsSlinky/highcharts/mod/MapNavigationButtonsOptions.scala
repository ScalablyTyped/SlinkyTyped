package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapNavigationButtonsOptions extends js.Object {
  /**
    * (Highmaps) Options for the zoom in button. Properties for the zoom in and
    * zoom out buttons are inherited from mapNavigation.buttonOptions, while
    * individual options can be overridden. By default, the `onclick`, `text`
    * and `y` options are individual.
    */
  var zoomIn: js.UndefOr[MapNavigationButtonsZoomInOptions] = js.native
  /**
    * (Highmaps) Options for the zoom out button. Properties for the zoom in
    * and zoom out buttons are inherited from mapNavigation.buttonOptions,
    * while individual options can be overridden. By default, the `onclick`,
    * `text` and `y` options are individual.
    */
  var zoomOut: js.UndefOr[MapNavigationButtonsZoomOutOptions] = js.native
}

object MapNavigationButtonsOptions {
  @scala.inline
  def apply(): MapNavigationButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationButtonsOptions]
  }
  @scala.inline
  implicit class MapNavigationButtonsOptionsOps[Self <: MapNavigationButtonsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZoomIn(value: MapNavigationButtonsZoomInOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOut(value: MapNavigationButtonsZoomOutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.undefined)
        ret
    }
  }
  
}

