package typingsSlinky.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxRanking extends js.Object {
  var maxRanking: Double = js.native
}

object AnonMaxRanking {
  @scala.inline
  def apply(maxRanking: Double): AnonMaxRanking = {
    val __obj = js.Dynamic.literal(maxRanking = maxRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxRanking]
  }
  @scala.inline
  implicit class AnonMaxRankingOps[Self <: AnonMaxRanking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRanking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRanking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

