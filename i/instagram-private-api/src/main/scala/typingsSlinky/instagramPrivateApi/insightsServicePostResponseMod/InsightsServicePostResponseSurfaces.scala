package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseSurfaces extends js.Object {
  var nodes: js.Array[InsightsServicePostResponseNodesItem] = js.native
}

object InsightsServicePostResponseSurfaces {
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem]): InsightsServicePostResponseSurfaces = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseSurfaces]
  }
  @scala.inline
  implicit class InsightsServicePostResponseSurfacesOps[Self <: InsightsServicePostResponseSurfaces] (val x: Self) extends AnyVal {
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
  }
  
}

