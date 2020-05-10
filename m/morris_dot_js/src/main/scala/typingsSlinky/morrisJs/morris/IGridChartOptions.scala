package typingsSlinky.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridChartOptions extends IChartOptions {
  /** Set to false to disable drawing the x and y axes. */
  var axes: js.UndefOr[Boolean] = js.native
  /** The data to plot. This is an array of objects, containing x and y attributes as described by the xkey and ykeys options. */
  var data: js.Array[_] = js.native
  /**  Set to false to disable drawing the horizontal grid lines. */
  var grid: js.UndefOr[Boolean] = js.native
  /** Set the line color of the grid. (default: #aaa) */
  var gridLineColor: js.UndefOr[String] = js.native
  /** Set the stroke of the grid. (default: 0.5)*/
  var gridStrokeWidth: js.UndefOr[Double] = js.native
  /**  Set the color of the axis labels (default: #888). */
  var gridTextColor: js.UndefOr[String] = js.native
  /** Set the font family of the axis labels (default: sans-serif). */
  var gridTextFamily: js.UndefOr[String] = js.native
  /** Set the point size of the axis labels (default: 12). */
  var gridTextSize: js.UndefOr[Double] = js.native
  /** Set the font weight of the axis labels (default: normal). */
  var gridTextWeight: js.UndefOr[String] = js.native
  /**  Set the visibility of the hover legend (see documentation). */
  var hideHover: js.UndefOr[Boolean | AutoAlways] = js.native
  /** A list of strings containing labels for the data series to be plotted (corresponding to the values in the ykeys option). */
  var labels: js.Array[String] = js.native
  /** A string containing the name of the attribute that contains X labels. */
  var xkey: String = js.native
  /** A list of strings containing names of attributes that contain Y values (one for each series of data to be plotted). */
  var ykeys: js.Array[String] = js.native
}

object IGridChartOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): IGridChartOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridChartOptions]
  }
  @scala.inline
  implicit class IGridChartOptionsOps[Self <: IGridChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYkeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ykeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTextFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTextFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTextWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTextWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTextWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHover(value: Boolean | AutoAlways): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHover")(js.undefined)
        ret
    }
  }
  
}

