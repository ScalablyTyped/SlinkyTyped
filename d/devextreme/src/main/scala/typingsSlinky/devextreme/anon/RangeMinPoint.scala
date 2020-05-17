package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeMinPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[String] = js.native
  var rangeMinPoint: js.UndefOr[String] = js.native
}

object RangeMinPoint {
  @scala.inline
  def apply(): RangeMinPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeMinPoint]
  }
  @scala.inline
  implicit class RangeMinPointOps[Self <: RangeMinPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeMaxPoint(value: String): Self = {
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
    def withRangeMinPoint(value: String): Self = {
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

