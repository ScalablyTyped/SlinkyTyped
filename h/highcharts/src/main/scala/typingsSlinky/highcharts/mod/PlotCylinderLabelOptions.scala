package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotCylinderLabelOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
    * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
    */
  var boxesToAvoid: js.UndefOr[js.Array[LabelIntersectBoxObject]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
    * graph if necessary, and draw a connector line to the graph. Setting this
    * option to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the whole plot
    * area. Visually, it may also result in a more cluttered chart, though more
    * of the series will be labeled.
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) If the label is closer than this to a
    * neighbour graph, draw a connector.
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Enable the series label per series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
    * series. By default it is drawn on the area. Set it to `false` to draw it
    * next to the graph instead.
    */
  var onArea: js.UndefOr[Boolean | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Styles for the series label. The color
    * defaults to the series color, or a contrast color if `onArea`.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object PlotCylinderLabelOptions {
  @scala.inline
  def apply(): PlotCylinderLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCylinderLabelOptions]
  }
  @scala.inline
  implicit class PlotCylinderLabelOptionsOps[Self <: PlotCylinderLabelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxesToAvoid(value: js.Array[LabelIntersectBoxObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxesToAvoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxesToAvoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxesToAvoid")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorNeighbourDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorNeighbourDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorNeighbourDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorNeighbourDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(null)
        ret
    }
    @scala.inline
    def withMinFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFontSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(null)
        ret
    }
    @scala.inline
    def withOnArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArea")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAreaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArea")(null)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

