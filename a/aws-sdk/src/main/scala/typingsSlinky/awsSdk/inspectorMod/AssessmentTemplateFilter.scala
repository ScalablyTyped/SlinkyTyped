package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateFilter extends js.Object {
  /**
    * For a record to match a filter, the value specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentTemplate data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTemplateName property of the AssessmentTemplate data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  /**
    * For a record to match a filter, the values that are specified for this data type property must be contained in the list of values of the rulesPackageArns property of the AssessmentTemplate data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
}

object AssessmentTemplateFilter {
  @scala.inline
  def apply(): AssessmentTemplateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTemplateFilter]
  }
  @scala.inline
  implicit class AssessmentTemplateFilterOps[Self <: AssessmentTemplateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

