package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetTopReferrersResponseItem extends js.Object {
  var count: Double = js.native
  var referrer: String = js.native
  var uniques: Double = js.native
}

object ReposGetTopReferrersResponseItem {
  @scala.inline
  def apply(count: Double, referrer: String, uniques: Double): ReposGetTopReferrersResponseItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetTopReferrersResponseItem]
  }
  @scala.inline
  implicit class ReposGetTopReferrersResponseItemOps[Self <: ReposGetTopReferrersResponseItem] (val x: Self) extends AnyVal {
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
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniques(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniques")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

