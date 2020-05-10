package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalVisitNumPagesDetails extends js.Object {
  var comparisonType: js.UndefOr[String] = js.native
  var comparisonValue: js.UndefOr[String] = js.native
}

object GoalVisitNumPagesDetails {
  @scala.inline
  def apply(): GoalVisitNumPagesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalVisitNumPagesDetails]
  }
  @scala.inline
  implicit class GoalVisitNumPagesDetailsOps[Self <: GoalVisitNumPagesDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(js.undefined)
        ret
    }
  }
  
}

