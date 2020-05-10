package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetViewsResponse extends js.Object {
  var count: Double = js.native
  var uniques: Double = js.native
  var views: js.Array[ReposGetViewsResponseViewsItem] = js.native
}

object ReposGetViewsResponse {
  @scala.inline
  def apply(count: Double, uniques: Double, views: js.Array[ReposGetViewsResponseViewsItem]): ReposGetViewsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsResponse]
  }
  @scala.inline
  implicit class ReposGetViewsResponseOps[Self <: ReposGetViewsResponse] (val x: Self) extends AnyVal {
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
    def withUniques(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniques")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: js.Array[ReposGetViewsResponseViewsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

