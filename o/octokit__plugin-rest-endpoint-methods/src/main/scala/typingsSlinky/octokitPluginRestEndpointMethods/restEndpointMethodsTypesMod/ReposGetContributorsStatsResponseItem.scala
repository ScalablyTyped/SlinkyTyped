package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetContributorsStatsResponseItem extends js.Object {
  var author: ReposGetContributorsStatsResponseItemAuthor = js.native
  var total: Double = js.native
  var weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem] = js.native
}

object ReposGetContributorsStatsResponseItem {
  @scala.inline
  def apply(
    author: ReposGetContributorsStatsResponseItemAuthor,
    total: Double,
    weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]
  ): ReposGetContributorsStatsResponseItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetContributorsStatsResponseItem]
  }
  @scala.inline
  implicit class ReposGetContributorsStatsResponseItemOps[Self <: ReposGetContributorsStatsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposGetContributorsStatsResponseItemAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeks(value: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

