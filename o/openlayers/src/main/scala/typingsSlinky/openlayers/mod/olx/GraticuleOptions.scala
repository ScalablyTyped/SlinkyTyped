package typingsSlinky.openlayers.mod.olx

import typingsSlinky.openlayers.mod.Map
import typingsSlinky.openlayers.mod.style.Stroke
import typingsSlinky.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleOptions extends js.Object {
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
  var latLabelPosition: js.UndefOr[Double] = js.native
  var latLabelStyle: js.UndefOr[Text] = js.native
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ Double, String]] = js.native
  var lonLabelPosition: js.UndefOr[Double] = js.native
  var lonLabelStyle: js.UndefOr[Text] = js.native
  var map: js.UndefOr[Map] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var showLabels: js.UndefOr[Boolean] = js.native
  var strokeStyle: js.UndefOr[Stroke] = js.native
  var targetSize: js.UndefOr[Double] = js.native
}

object GraticuleOptions {
  @scala.inline
  def apply(): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleOptions]
  }
  @scala.inline
  implicit class GraticuleOptionsOps[Self <: GraticuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatLabelFormatter(value: /* lat */ Double => String): Self = {
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
    def withLatLabelStyle(value: Text): Self = {
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
    def withLonLabelFormatter(value: /* lon */ Double => String): Self = {
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
    def withLonLabelStyle(value: Text): Self = {
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
    def withMap(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
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
    def withStrokeStyle(value: Stroke): Self = {
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
  }
  
}

