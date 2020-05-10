package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseAccountActionsGraph extends js.Object {
  var total_count_graph: InsightsServiceAccountResponseTotalCountGraph = js.native
}

object InsightsServiceAccountResponseAccountActionsGraph {
  @scala.inline
  def apply(total_count_graph: InsightsServiceAccountResponseTotalCountGraph): InsightsServiceAccountResponseAccountActionsGraph = {
    val __obj = js.Dynamic.literal(total_count_graph = total_count_graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountActionsGraph]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountActionsGraphOps[Self <: InsightsServiceAccountResponseAccountActionsGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotal_count_graph(value: InsightsServiceAccountResponseTotalCountGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count_graph")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

