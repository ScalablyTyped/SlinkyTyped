package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Dash
import typingsSlinky.plotlyJs.plotlyJsStrings.hv
import typingsSlinky.plotlyJs.plotlyJsStrings.hvh
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.spline
import typingsSlinky.plotlyJs.plotlyJsStrings.vh
import typingsSlinky.plotlyJs.plotlyJsStrings.vhv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ScatterLine> */
@js.native
trait PartialScatterLine extends js.Object {
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  var dash: js.UndefOr[Dash] = js.native
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.native
  var simplify: js.UndefOr[Boolean] = js.native
  var smoothing: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialScatterLine {
  @scala.inline
  def apply(): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterLine]
  }
  @scala.inline
  implicit class PartialScatterLineOps[Self <: PartialScatterLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDash(value: Dash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: linear | spline | hv | vh | hvh | vhv): Self = {
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
    def withSimplify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

