package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetCommitActivityStatsResponseItem extends js.Object {
  var days: js.Array[Double] = js.native
  var total: Double = js.native
  var week: Double = js.native
}

object ReposGetCommitActivityStatsResponseItem {
  @scala.inline
  def apply(days: js.Array[Double], total: Double, week: Double): ReposGetCommitActivityStatsResponseItem = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitActivityStatsResponseItem]
  }
  @scala.inline
  implicit class ReposGetCommitActivityStatsResponseItemOps[Self <: ReposGetCommitActivityStatsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

