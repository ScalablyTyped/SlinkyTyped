package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CohortGroup extends js.Object {
  var cohorts: js.UndefOr[js.Array[Cohort]] = js.native
  var lifetimeValue: js.UndefOr[Boolean] = js.native
}

object CohortGroup {
  @scala.inline
  def apply(): CohortGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortGroup]
  }
  @scala.inline
  implicit class CohortGroupOps[Self <: CohortGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCohorts(value: js.Array[Cohort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cohorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCohorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cohorts")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetimeValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeValue")(js.undefined)
        ret
    }
  }
  
}

