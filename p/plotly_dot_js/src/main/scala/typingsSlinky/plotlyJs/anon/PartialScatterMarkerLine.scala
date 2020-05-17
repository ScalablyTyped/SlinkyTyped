package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.ColorScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ScatterMarkerLine> */
@js.native
trait PartialScatterMarkerLine extends js.Object {
  var autocolorscale: js.UndefOr[Boolean] = js.native
  var cauto: js.UndefOr[Boolean] = js.native
  var cmax: js.UndefOr[Double] = js.native
  var cmin: js.UndefOr[Double] = js.native
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  var colorscale: js.UndefOr[ColorScale] = js.native
  var reversescale: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PartialScatterMarkerLine {
  @scala.inline
  def apply(): PartialScatterMarkerLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterMarkerLine]
  }
  @scala.inline
  implicit class PartialScatterMarkerLineOps[Self <: PartialScatterMarkerLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocolorscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocolorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocolorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocolorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withCauto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCauto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(js.undefined)
        ret
    }
    @scala.inline
    def withCmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(js.undefined)
        ret
    }
    @scala.inline
    def withCmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: typingsSlinky.plotlyJs.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorscale(value: ColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withReversescale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversescale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

