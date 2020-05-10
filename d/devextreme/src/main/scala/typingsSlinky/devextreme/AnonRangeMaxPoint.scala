package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangeMaxPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[Double] = js.native
  var rangeMinPoint: js.UndefOr[Double] = js.native
}

object AnonRangeMaxPoint {
  @scala.inline
  def apply(): AnonRangeMaxPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRangeMaxPoint]
  }
  @scala.inline
  implicit class AnonRangeMaxPointOps[Self <: AnonRangeMaxPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeMaxPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMaxPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMaxPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMaxPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMinPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMinPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMinPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMinPoint")(js.undefined)
        ret
    }
  }
  
}

