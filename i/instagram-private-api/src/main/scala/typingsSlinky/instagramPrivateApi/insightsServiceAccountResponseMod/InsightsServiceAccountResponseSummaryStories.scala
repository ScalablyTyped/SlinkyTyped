package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseSummaryStories extends js.Object {
  var count: Double = js.native
  var edges: js.Array[_] = js.native
}

object InsightsServiceAccountResponseSummaryStories {
  @scala.inline
  def apply(count: Double, edges: js.Array[_]): InsightsServiceAccountResponseSummaryStories = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseSummaryStories]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseSummaryStoriesOps[Self <: InsightsServiceAccountResponseSummaryStories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

