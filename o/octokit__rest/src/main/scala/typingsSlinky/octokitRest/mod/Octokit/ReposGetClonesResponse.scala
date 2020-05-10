package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetClonesResponse extends js.Object {
  var clones: js.Array[ReposGetClonesResponseClonesItem] = js.native
  var count: Double = js.native
  var uniques: Double = js.native
}

object ReposGetClonesResponse {
  @scala.inline
  def apply(clones: js.Array[ReposGetClonesResponseClonesItem], count: Double, uniques: Double): ReposGetClonesResponse = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponse]
  }
  @scala.inline
  implicit class ReposGetClonesResponseOps[Self <: ReposGetClonesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClones(value: js.Array[ReposGetClonesResponseClonesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clones")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

