package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPoint extends js.Object {
  /** Options for customizing the border of a point. This is applicable only for column type series and accumulation type series.
    */
  var border: js.UndefOr[SeriesPointsBorder] = js.native
  /** Close value of the point. Close value is applicable only for financial type series.
    * @Default {null}
    */
  var close: js.UndefOr[Double] = js.native
  /** Background color of the point. This is applicable only for column type series and accumulation type series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** High value of the point. High value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var high: js.UndefOr[Double] = js.native
  /** Low value of the point. Low value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var low: js.UndefOr[Double] = js.native
  /** Options for displaying and customizing marker for a data point. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[SeriesPointsMarker] = js.native
  /** Open value of the point. This is applicable only for financial type series.
    * @Default {null}
    */
  var open: js.UndefOr[Double] = js.native
  /** To show/hide the intermediate summary from the last intermediate point.
    * @Default {false}
    */
  var showIntermediateSum: js.UndefOr[Boolean] = js.native
  /** To show/hide the total summary of the waterfall series.
    * @Default {false}
    */
  var showTotalSum: js.UndefOr[Boolean] = js.native
  /** Size of a bubble in the bubble series. This is applicable only for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[Double] = js.native
  /** Datalabel text for the point.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  /** X value of the point.
    * @Default {null}
    */
  var x: js.UndefOr[Double] = js.native
  /** Y value of the point.
    * @Default {null}
    */
  var y: js.UndefOr[Double] = js.native
}

object SeriesPoint {
  @scala.inline
  def apply(): SeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPoint]
  }
  @scala.inline
  implicit class SeriesPointOps[Self <: SeriesPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: SeriesPointsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: SeriesPointsMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIntermediateSum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIntermediateSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIntermediateSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIntermediateSum")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotalSum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotalSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSum")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleOnLegend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

