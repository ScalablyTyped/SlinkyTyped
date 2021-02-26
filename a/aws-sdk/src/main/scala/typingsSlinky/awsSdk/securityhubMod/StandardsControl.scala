package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardsControl extends StObject {
  
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
  implicit class StandardsControlMutableBuilder[Self <: StandardsControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlId(value: NonEmptyString): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
    
    @scala.inline
    def setControlStatus(value: ControlStatus): Self = StObject.set(x, "ControlStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlStatusUndefined: Self = StObject.set(x, "ControlStatus", js.undefined)
    
    @scala.inline
    def setControlStatusUpdatedAt(value: js.Date): Self = StObject.set(x, "ControlStatusUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlStatusUpdatedAtUndefined: Self = StObject.set(x, "ControlStatusUpdatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisabledReason(value: NonEmptyString): Self = StObject.set(x, "DisabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReasonUndefined: Self = StObject.set(x, "DisabledReason", js.undefined)
    
    @scala.inline
    def setRelatedRequirements(value: RelatedRequirementsList): Self = StObject.set(x, "RelatedRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedRequirementsUndefined: Self = StObject.set(x, "RelatedRequirements", js.undefined)
    
    @scala.inline
    def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = StObject.set(x, "RelatedRequirements", js.Array(value :_*))
    
    @scala.inline
    def setRemediationUrl(value: NonEmptyString): Self = StObject.set(x, "RemediationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationUrlUndefined: Self = StObject.set(x, "RemediationUrl", js.undefined)
    
    @scala.inline
    def setSeverityRating(value: SeverityRating): Self = StObject.set(x, "SeverityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityRatingUndefined: Self = StObject.set(x, "SeverityRating", js.undefined)
    
    @scala.inline
    def setStandardsControlArn(value: NonEmptyString): Self = StObject.set(x, "StandardsControlArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsControlArnUndefined: Self = StObject.set(x, "StandardsControlArn", js.undefined)
    
    @scala.inline
    def setTitle(value: NonEmptyString): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
