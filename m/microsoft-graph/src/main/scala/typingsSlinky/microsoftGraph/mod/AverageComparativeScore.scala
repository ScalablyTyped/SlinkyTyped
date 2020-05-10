package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AverageComparativeScore extends js.Object {
  // Average score within specified basis.
  var averageScore: js.UndefOr[Double] = js.native
  // Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
  var basis: js.UndefOr[String] = js.native
}

object AverageComparativeScore {
  @scala.inline
  def apply(): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AverageComparativeScore]
  }
  @scala.inline
  implicit class AverageComparativeScoreOps[Self <: AverageComparativeScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageScore")(js.undefined)
        ret
    }
    @scala.inline
    def withBasis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basis")(js.undefined)
        ret
    }
  }
  
}

