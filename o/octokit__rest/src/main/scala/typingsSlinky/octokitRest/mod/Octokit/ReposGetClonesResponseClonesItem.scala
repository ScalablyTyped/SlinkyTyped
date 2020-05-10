package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetClonesResponseClonesItem extends js.Object {
  var count: Double = js.native
  var timestamp: String = js.native
  var uniques: Double = js.native
}

object ReposGetClonesResponseClonesItem {
  @scala.inline
  def apply(count: Double, timestamp: String, uniques: Double): ReposGetClonesResponseClonesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponseClonesItem]
  }
  @scala.inline
  implicit class ReposGetClonesResponseClonesItemOps[Self <: ReposGetClonesResponseClonesItem] (val x: Self) extends AnyVal {
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
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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

