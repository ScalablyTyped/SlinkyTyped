package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetParticipationStatsResponse extends js.Object {
  var all: js.Array[Double] = js.native
  var owner: js.Array[Double] = js.native
}

object ReposGetParticipationStatsResponse {
  @scala.inline
  def apply(all: js.Array[Double], owner: js.Array[Double]): ReposGetParticipationStatsResponse = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetParticipationStatsResponse]
  }
  @scala.inline
  implicit class ReposGetParticipationStatsResponseOps[Self <: ReposGetParticipationStatsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

