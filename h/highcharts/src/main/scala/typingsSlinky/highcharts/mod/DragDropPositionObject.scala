package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropPositionObject extends js.Object {
  /**
    * Chart x position
    */
  var chartX: Double = js.native
  /**
    * Chart y position
    */
  var chartY: Double = js.native
  /**
    * Drag and drop guide box.
    */
  var guideBox: js.UndefOr[BBoxObject] = js.native
  /**
    * Updated point data.
    */
  var points: Dictionary[Dictionary[Double]] = js.native
  /**
    * Delta of previous x position.
    */
  var prevdX: js.UndefOr[Double] = js.native
  /**
    * Delta of previous y position.
    */
  var prevdY: js.UndefOr[Double] = js.native
}

object DragDropPositionObject {
  @scala.inline
  def apply(chartX: Double, chartY: Double, points: Dictionary[Dictionary[Double]]): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
  @scala.inline
  implicit class DragDropPositionObjectOps[Self <: DragDropPositionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Dictionary[Dictionary[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuideBox(value: BBoxObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuideBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideBox")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevdX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevdX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevdX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevdX")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevdY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevdY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevdY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevdY")(js.undefined)
        ret
    }
  }
  
}

