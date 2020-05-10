package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a cohort. A cohort is a group of users who share a common
  * characteristic. For example, all users with the same acquisition date
  * belong to the same cohort.
  */
@js.native
trait SchemaCohort extends js.Object {
  /**
    * This is used for `FIRST_VISIT_DATE` cohort, the cohort selects users
    * whose first visit date is between start date and end date defined in the
    * DateRange. The date ranges should be aligned for cohort requests. If the
    * request contains `ga:cohortNthDay` it should be exactly one day long, if
    * `ga:cohortNthWeek` it should be aligned to the week boundary (starting at
    * Sunday and ending Saturday), and for `ga:cohortNthMonth` the date range
    * should be aligned to the month (starting at the first and ending on the
    * last day of the month). For LTV requests there are no such restrictions.
    * You do not need to supply a date range for the
    * `reportsRequest.dateRanges` field.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  /**
    * A unique name for the cohort. If not defined name will be auto-generated
    * with values cohort_[1234...].
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of the cohort. The only supported type as of now is
    * `FIRST_VISIT_DATE`. If this field is unspecified the cohort is treated as
    * `FIRST_VISIT_DATE` type cohort.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCohort {
  @scala.inline
  def apply(): SchemaCohort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCohort]
  }
  @scala.inline
  implicit class SchemaCohortOps[Self <: SchemaCohort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateRange(value: SchemaDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

