package typingsSlinky.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMinRanking extends js.Object {
  var minRanking: Double = js.native
}

object AnonMinRanking {
  @scala.inline
  def apply(minRanking: Double): AnonMinRanking = {
    val __obj = js.Dynamic.literal(minRanking = minRanking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinRanking]
  }
  @scala.inline
  implicit class AnonMinRankingOps[Self <: AnonMinRanking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinRanking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRanking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

