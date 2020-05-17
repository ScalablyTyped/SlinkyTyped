package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseNodesItem extends js.Object {
  var __typename: js.UndefOr[String] = js.native
  var data_points: js.UndefOr[js.Array[InsightsServiceAccountResponseDataPointsItem]] = js.native
  var delta: js.UndefOr[Null] = js.native
  var graph_name: js.UndefOr[String] = js.native
  var organic: js.UndefOr[InsightsServiceAccountResponseOrganic] = js.native
  var total: js.UndefOr[Double] = js.native
}

object InsightsServiceAccountResponseNodesItem {
  @scala.inline
  def apply(): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseNodesItemOps[Self <: InsightsServiceAccountResponseNodesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__typename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__typename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__typename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__typename")(js.undefined)
        ret
    }
    @scala.inline
    def withData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_points: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_points")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph_name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganic(value: InsightsServiceAccountResponseOrganic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

