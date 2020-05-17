package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSlider> */
@js.native
trait PartialRangeSlider extends js.Object {
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object PartialRangeSlider {
  @scala.inline
  def apply(): PartialRangeSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSlider]
  }
  @scala.inline
  implicit class PartialRangeSliderOps[Self <: PartialRangeSlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBordercolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordercolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Tuple2[Datum, Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
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
  }
  
}

