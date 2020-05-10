package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var CopyTags: js.UndefOr[typingsSlinky.awsSdk.dlmMod.CopyTags] = js.native
  /**
    * The creation rule.
    */
  var CreateRule: js.UndefOr[typingsSlinky.awsSdk.dlmMod.CreateRule] = js.native
  /**
    * The rule for cross-Region snapshot copies.
    */
  var CrossRegionCopyRules: js.UndefOr[typingsSlinky.awsSdk.dlmMod.CrossRegionCopyRules] = js.native
  /**
    * The rule for enabling fast snapshot restore.
    */
  var FastRestoreRule: js.UndefOr[typingsSlinky.awsSdk.dlmMod.FastRestoreRule] = js.native
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[ScheduleName] = js.native
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[typingsSlinky.awsSdk.dlmMod.RetainRule] = js.native
  /**
    * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddList] = js.native
  /**
    * A collection of key/value pairs with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following formats: $(instance-id) or $(timestamp). Variable tags are only valid for EBS Snapshot Management – Instance policies.
    */
  var VariableTags: js.UndefOr[VariableTagsList] = js.native
}

object Schedule {
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyTags(value: CopyTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTags")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateRule(value: CreateRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateRule")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossRegionCopyRules(value: CrossRegionCopyRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossRegionCopyRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossRegionCopyRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossRegionCopyRules")(js.undefined)
        ret
    }
    @scala.inline
    def withFastRestoreRule(value: FastRestoreRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastRestoreRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastRestoreRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastRestoreRule")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ScheduleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainRule(value: RetainRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainRule")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsToAdd(value: TagsToAddList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableTags(value: VariableTagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariableTags")(js.undefined)
        ret
    }
  }
  
}

