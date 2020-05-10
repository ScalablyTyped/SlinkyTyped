package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisPlotLinePathOptionsObject extends js.Object {
  /**
    * Used in Highstock. When `true`, plot paths (crosshair, plotLines,
    * gridLines) will be rendered on all axes when defined on the first axis.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, the function will return null when it falls outside the axis
    * bounds. If `true`, the function will return a path aligned to the plot
    * area sides if it falls outside. If `pass`, it will return a path outside.
    */
  var force: js.UndefOr[Boolean | String] = js.native
  /**
    * Line width used for calculation crisp line coordinates. Defaults to 1.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * Use old coordinates (for resizing and rescaling). If not set, defaults to
    * `false`.
    */
  var old: js.UndefOr[Boolean] = js.native
  /**
    * Used in Polar axes. Reverse the positions for concatenation of polygonal
    * plot bands
    */
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * If given, return the plot line path of a pixel position on the axis.
    */
  var translatedValue: js.UndefOr[Double] = js.native
  /**
    * Axis value.
    */
  var value: js.UndefOr[Double] = js.native
}

object AxisPlotLinePathOptionsObject {
  @scala.inline
  def apply(): AxisPlotLinePathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPlotLinePathOptionsObject]
  }
  @scala.inline
  implicit class AxisPlotLinePathOptionsObjectOps[Self <: AxisPlotLinePathOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcrossPanes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossPanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcrossPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossPanes")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslatedValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslatedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

