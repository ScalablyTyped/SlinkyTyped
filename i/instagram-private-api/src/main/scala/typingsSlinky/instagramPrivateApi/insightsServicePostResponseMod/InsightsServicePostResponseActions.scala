package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseActions extends js.Object {
  var nodes: js.Array[InsightsServicePostResponseNodesItem] = js.native
  var value: Double = js.native
}

object InsightsServicePostResponseActions {
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem], value: Double): InsightsServicePostResponseActions = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseActions]
  }
  @scala.inline
  implicit class InsightsServicePostResponseActionsOps[Self <: InsightsServicePostResponseActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

