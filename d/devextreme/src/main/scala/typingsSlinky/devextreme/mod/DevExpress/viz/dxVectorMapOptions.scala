package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonBorderColorColor
import typingsSlinky.devextreme.AnonBorderWidth
import typingsSlinky.devextreme.AnonCenter
import typingsSlinky.devextreme.AnonComponentDxVectorMap
import typingsSlinky.devextreme.AnonComponentElementEventJQueryEvent
import typingsSlinky.devextreme.AnonMargin
import typingsSlinky.devextreme.AnonZoomFactor
import typingsSlinky.devextreme.devextremeStrings.equirectangular
import typingsSlinky.devextreme.devextremeStrings.lambert
import typingsSlinky.devextreme.devextremeStrings.mercator
import typingsSlinky.devextreme.devextremeStrings.miller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxVectorMapOptions extends BaseWidgetOptions[dxVectorMap] {
  /** Specifies the options for the map background. */
  var background: js.UndefOr[AnonBorderColorColor] = js.native
  /** Specifies the positioning of a map in geographical coordinates. */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the geographical coordinates of the center for a map. */
  var center: js.UndefOr[js.Array[Double]] = js.native
  /** Configures the control bar. */
  var controlBar: js.UndefOr[AnonMargin] = js.native
  /** Specifies options for VectorMap widget layers. */
  var layers: js.UndefOr[js.Array[AnonBorderWidth] | AnonBorderWidth] = js.native
  /** Configures map legends. */
  var legends: js.UndefOr[js.Array[dxVectorMapLegends]] = js.native
  /** Specifies a map's maximum zoom factor. */
  var maxZoomFactor: js.UndefOr[Double] = js.native
  /** A function that is executed each time the center coordinates are changed. */
  var onCenterChanged: js.UndefOr[js.Function1[/* e */ AnonCenter, _]] = js.native
  /** A function that is executed when any location on the map is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String] = js.native
  /** A function that is executed when a layer element is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.native
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.native
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxVectorMap, _]] = js.native
  /** A function that is executed each time the zoom factor is changed. */
  var onZoomFactorChanged: js.UndefOr[js.Function1[/* e */ AnonZoomFactor, _]] = js.native
  /** Disables the panning capability. */
  var panningEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the map projection. */
  var projection: js.UndefOr[
    equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any
  ] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxVectorMapOptions: js.UndefOr[dxVectorMapTooltip] = js.native
  /** Specifies whether the map should respond to touch gestures. */
  var touchEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the map should respond when a user rolls the mouse wheel. */
  var wheelEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies a number that is used to zoom a map initially. */
  var zoomFactor: js.UndefOr[Double] = js.native
  /** Disables the zooming capability. */
  var zoomingEnabled: js.UndefOr[Boolean] = js.native
}

object dxVectorMapOptions {
  @scala.inline
  def apply(): dxVectorMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapOptions]
  }
  @scala.inline
  implicit class dxVectorMapOptionsOps[Self <: dxVectorMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: AnonBorderColorColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Array[Double]): Self = {
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
    def withControlBar(value: AnonMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlBar")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[AnonBorderWidth] | AnonBorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[dxVectorMapLegends]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCenterChanged(value: /* e */ AnonCenter => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCenterChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCenterChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCenterChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* e */ AnonComponentElementEventJQueryEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: (js.Function1[/* e */ AnonComponentElementEventJQueryEvent, _]) | String): Self = {
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
    def withOnSelectionChanged(value: /* e */ AnonComponentDxVectorMap => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipHidden(value: /* e */ AnonComponentDxVectorMap => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShown(value: /* e */ AnonComponentDxVectorMap => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomFactorChanged(value: /* e */ AnonZoomFactor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomFactorChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomFactorChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomFactorChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPanningEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanningEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: equirectangular | lambert | mercator | miller | VectorMapProjectionConfig | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxVectorMapTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingEnabled")(js.undefined)
        ret
    }
  }
  
}

