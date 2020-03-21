package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Font
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.grouped
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.v
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Legend> */
trait PartialLegendBgcolor extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[Partial[Font]] = js.undefined
  var orientation: js.UndefOr[v | h] = js.undefined
  var tracegroupgap: js.UndefOr[Double] = js.undefined
  var traceorder: js.UndefOr[grouped | normal | reversed] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}

object PartialLegendBgcolor {
  @scala.inline
  def apply(
    bgcolor: String = null,
    bordercolor: String = null,
    borderwidth: Int | Double = null,
    font: Partial[Font] = null,
    orientation: v | h = null,
    tracegroupgap: Int | Double = null,
    traceorder: grouped | normal | reversed = null,
    x: Int | Double = null,
    xanchor: auto | left | center | right = null,
    y: Int | Double = null,
    yanchor: auto | top | middle | bottom = null
  ): PartialLegendBgcolor = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (borderwidth != null) __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (tracegroupgap != null) __obj.updateDynamic("tracegroupgap")(tracegroupgap.asInstanceOf[js.Any])
    if (traceorder != null) __obj.updateDynamic("traceorder")(traceorder.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLegendBgcolor]
  }
}

