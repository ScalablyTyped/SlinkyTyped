package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsControl extends js.Object {
  /**
    * The identifier of the security standard control.
    */
  var ControlId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The current status of the security standard control. Indicates whether the control is enabled or disabled. Security Hub does not check against disabled controls.
    */
  var ControlStatus: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * The date and time that the status of the security standard control was most recently updated.
    */
  var ControlStatusUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The longer description of the security standard control. Provides information about what the control is checking for.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The reason provided for the most recent change in status for the control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The list of requirements that are related to this control.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.native
  /**
    * A link to remediation information for the control in the Security Hub user documentation.
    */
  var RemediationUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The severity of findings generated from this security standard control. The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue is detected.
    */
  var SeverityRating: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.SeverityRating] = js.native
  /**
    * The ARN of the security standard control.
    */
  var StandardsControlArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The title of the security standard control.
    */
  var Title: js.UndefOr[NonEmptyString] = js.native
}

object StandardsControl {
  @scala.inline
  def apply(): StandardsControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardsControl]
  }
  @scala.inline
  implicit class StandardsControlOps[Self <: StandardsControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlId")(js.undefined)
        ret
    }
    @scala.inline
    def withControlStatus(value: ControlStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withControlStatusUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatusUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlStatusUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlStatusUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledReason(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisabledReason")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedRequirements(value: RelatedRequirementsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedRequirements")(js.undefined)
        ret
    }
    @scala.inline
    def withRemediationUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityRating(value: SeverityRating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityRating")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardsControlArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsControlArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardsControlArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsControlArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

