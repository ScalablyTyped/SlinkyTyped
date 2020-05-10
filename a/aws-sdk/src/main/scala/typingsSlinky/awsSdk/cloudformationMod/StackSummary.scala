package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSummary extends js.Object {
  /**
    * The time the stack was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[js.Date] = js.native
  /**
    * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.native
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.native
  /**
    * Unique stack identifier.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
  /**
    * The current status of the stack.
    */
  var StackStatus: typingsSlinky.awsSdk.cloudformationMod.StackStatus = js.native
  /**
    * Success/Failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackStatusReason] = js.native
  /**
    * The template description of the template used to create the stack.
    */
  var TemplateDescription: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateDescription] = js.native
}

object StackSummary {
  @scala.inline
  def apply(CreationTime: js.Date, StackName: StackName, StackStatus: StackStatus): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
  @scala.inline
  implicit class StackSummaryOps[Self <: StackSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackStatus(value: StackStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftInformation(value: StackDriftInformationSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
        ret
    }
    @scala.inline
    def withRootId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackStatusReason(value: StackStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateDescription(value: TemplateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateDescription")(js.undefined)
        ret
    }
  }
  
}

