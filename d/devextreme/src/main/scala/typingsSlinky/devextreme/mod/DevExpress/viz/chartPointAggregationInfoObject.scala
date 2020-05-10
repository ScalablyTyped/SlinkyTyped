package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartPointAggregationInfoObject extends js.Object {
  /** Contains the length of the aggregation interval in axis units (numbers or dates). If the interval is set in pixels (using the aggregationGroupWidth option), it will be converted to axis units. */
  var aggregationInterval: js.UndefOr[js.Any] = js.native
  /** Contains data objects that were aggregated into this point. */
  var data: js.UndefOr[js.Array[_]] = js.native
  /** Contains the end value of the interval to which the point belongs. */
  var intervalEnd: js.UndefOr[js.Any] = js.native
  /** Contains the start value of the interval to which the point belongs. */
  var intervalStart: js.UndefOr[js.Any] = js.native
}

object chartPointAggregationInfoObject {
  @scala.inline
  def apply(): chartPointAggregationInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[chartPointAggregationInfoObject]
  }
  @scala.inline
  implicit class chartPointAggregationInfoObjectOps[Self <: chartPointAggregationInfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationInterval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalStart")(js.undefined)
        ret
    }
  }
  
}

