package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartLegendItem extends BaseLegendItem {
  /** The argument of the point(s) that the legend item represents. */
  var argument: js.UndefOr[String | js.Date | Double] = js.native
  /** The zero-based index of the legend item used to identify the item among other legend items with the same argument. */
  var argumentIndex: js.UndefOr[Double] = js.native
  /** An array of points that the legend item represents. Can contain more than one point only in a multi-series PieChart. */
  var points: js.UndefOr[js.Array[piePointObject]] = js.native
  /** The text that the legend item displays. */
  @JSName("text")
  var text_PieChartLegendItem: js.UndefOr[js.Any] = js.native
}

object PieChartLegendItem {
  @scala.inline
  def apply(): PieChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartLegendItem]
  }
  @scala.inline
  implicit class PieChartLegendItemOps[Self <: PieChartLegendItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgument(value: String | js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[piePointObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
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
  }
  
}

