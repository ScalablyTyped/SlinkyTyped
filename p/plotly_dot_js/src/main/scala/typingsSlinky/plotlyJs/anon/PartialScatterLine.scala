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
trait PartialScatterLine extends js.Object {
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.undefined
  var dash: js.UndefOr[Dash] = js.undefined
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.undefined
  var simplify: js.UndefOr[Boolean] = js.undefined
  var smoothing: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialScatterLine {
  @scala.inline
  def apply(
    color: typingsSlinky.plotlyJs.mod.Color = null,
    dash: Dash = null,
    shape: linear | spline | hv | vh | hvh | vhv = null,
    simplify: js.UndefOr[Boolean] = js.undefined,
    smoothing: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(simplify)) __obj.updateDynamic("simplify")(simplify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScatterLine]
  }
}

