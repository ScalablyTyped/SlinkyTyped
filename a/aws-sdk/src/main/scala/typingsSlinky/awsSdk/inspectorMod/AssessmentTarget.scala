package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTarget extends js.Object {
  /**
    * The ARN that specifies the Amazon Inspector assessment target.
    */
  var arn: Arn = js.native
  /**
    * The time at which the assessment target is created.
    */
  var createdAt: js.Date = js.native
  /**
    * The name of the Amazon Inspector assessment target.
    */
  var name: AssessmentTargetName = js.native
  /**
    * The ARN that specifies the resource group that is associated with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which UpdateAssessmentTarget is called.
    */
  var updatedAt: js.Date = js.native
}

object AssessmentTarget {
  @scala.inline
  def apply(arn: Arn, createdAt: js.Date, name: AssessmentTargetName, updatedAt: js.Date): AssessmentTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTarget]
  }
  @scala.inline
  implicit class AssessmentTargetOps[Self <: AssessmentTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AssessmentTargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupArn")(js.undefined)
        ret
    }
  }
  
}

