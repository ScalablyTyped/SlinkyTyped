package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avg extends js.Object {
  var avg: js.UndefOr[String] = js.native
  var avgOtherColumn: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  var max: js.UndefOr[String] = js.native
  var maxOtherColumn: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
  var minOtherColumn: js.UndefOr[String] = js.native
  var sum: js.UndefOr[String] = js.native
  var sumOtherColumn: js.UndefOr[String] = js.native
}

object Avg {
  @scala.inline
  def apply(): Avg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avg]
  }
  @scala.inline
  implicit class AvgOps[Self <: Avg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(js.undefined)
        ret
    }
    @scala.inline
    def withAvgOtherColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgOtherColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgOtherColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgOtherColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOtherColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOtherColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOtherColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOtherColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOtherColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOtherColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOtherColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOtherColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withSumOtherColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOtherColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumOtherColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumOtherColumn")(js.undefined)
        ret
    }
  }
  
}

