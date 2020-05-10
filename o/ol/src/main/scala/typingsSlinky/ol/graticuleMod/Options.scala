package typingsSlinky.ol.graticuleMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var className: js.UndefOr[String] = js.native
  var extent: js.UndefOr[Extent] = js.native
  var intervals: js.UndefOr[js.Array[Double]] = js.native
  var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
  var latLabelPosition: js.UndefOr[Double] = js.native
  var latLabelStyle: js.UndefOr[typingsSlinky.ol.textMod.default] = js.native
  var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
  var lonLabelPosition: js.UndefOr[Double] = js.native
  var lonLabelStyle: js.UndefOr[typingsSlinky.ol.textMod.default] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var showLabels: js.UndefOr[Boolean] = js.native
  var strokeStyle: js.UndefOr[typingsSlinky.ol.strokeMod.default] = js.native
  var targetSize: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervals")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLabelFormatter(value: /* p0 */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLatLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLabelPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLabelStyle(value: typingsSlinky.ol.textMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLonLabelFormatter(value: /* p0 */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLonLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLonLabelPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLonLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLonLabelStyle(value: typingsSlinky.ol.textMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLonLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lonLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: typingsSlinky.ol.strokeMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

