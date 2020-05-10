package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.plotlyJsStrings.angular
import typingsSlinky.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
@js.native
trait PartialGauge extends js.Object {
  var axis: js.UndefOr[PartialAxisAutorange] = js.native
  var bar: js.UndefOr[PartialGaugeBar] = js.native
  var bgcolor: js.UndefOr[Color] = js.native
  var bordercolor: js.UndefOr[Color] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var shape: js.UndefOr[angular | bullet] = js.native
  var steps: js.UndefOr[js.Array[AnonColor]] = js.native
  var threshold: js.UndefOr[PartialThreshold] = js.native
}

object PartialGauge {
  @scala.inline
  def apply(): PartialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGauge]
  }
  @scala.inline
  implicit class PartialGaugeOps[Self <: PartialGauge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: PartialAxisAutorange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBar(value: PartialGaugeBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: Color): Self = {
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
    def withBordercolor(value: Color): Self = {
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
    def withShape(value: angular | bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[AnonColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: PartialThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

