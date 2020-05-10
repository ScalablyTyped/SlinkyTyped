package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunFilter extends js.Object {
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
    */
  var completionTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  /**
    * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
    */
  var startTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
    */
  var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
    */
  var states: js.UndefOr[AssessmentRunStateList] = js.native
}

object AssessmentRunFilter {
  @scala.inline
  def apply(): AssessmentRunFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentRunFilter]
  }
  @scala.inline
  implicit class AssessmentRunFilterOps[Self <: AssessmentRunFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionTimeRange(value: TimestampRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationRange(value: DurationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationRange")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePattern(value: NamePattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesPackageArns(value: FilterRulesPackageArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesPackageArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeRange(value: TimestampRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeTimeRange(value: TimestampRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: AssessmentRunStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
  }
  
}

