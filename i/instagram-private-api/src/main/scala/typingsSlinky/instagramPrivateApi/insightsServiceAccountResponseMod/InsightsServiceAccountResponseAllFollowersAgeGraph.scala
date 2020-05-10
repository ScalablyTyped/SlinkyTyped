package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseAllFollowersAgeGraph extends js.Object {
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = js.native
}

object InsightsServiceAccountResponseAllFollowersAgeGraph {
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]): InsightsServiceAccountResponseAllFollowersAgeGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAllFollowersAgeGraph]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseAllFollowersAgeGraphOps[Self <: InsightsServiceAccountResponseAllFollowersAgeGraph] (val x: Self) extends AnyVal {
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
  }
  
}

