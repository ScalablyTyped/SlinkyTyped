package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseTotalCountGraph extends js.Object {
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = js.native
  var graph_name: String = js.native
}

object InsightsServiceAccountResponseTotalCountGraph {
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], graph_name: String): InsightsServiceAccountResponseTotalCountGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], graph_name = graph_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTotalCountGraph]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseTotalCountGraphOps[Self <: InsightsServiceAccountResponseTotalCountGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

