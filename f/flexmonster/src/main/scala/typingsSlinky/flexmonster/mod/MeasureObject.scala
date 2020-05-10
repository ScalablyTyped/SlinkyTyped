package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureObject extends js.Object {
  var aggregation: js.UndefOr[String] = js.native
  var uniqueName: String = js.native
}

object MeasureObject {
  @scala.inline
  def apply(uniqueName: String): MeasureObject = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureObject]
  }
  @scala.inline
  implicit class MeasureObjectOps[Self <: MeasureObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(js.undefined)
        ret
    }
  }
  
}

