package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationResult extends StObject {
  
  /**
    * Describes an AWS account's compliance with the AWS Firewall Manager policy.
    */
  var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.native
  
  /**
    * Indicates that over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of resources that are noncompliant with the specified policy. For AWS WAF and Shield Advanced policies, a resource is considered noncompliant if it is not associated with the policy. For security group policies, a resource is considered noncompliant if it doesn't comply with the rules of the policy and remediation is disabled or not possible.
    */
  var ViolatorCount: js.UndefOr[ResourceCount] = js.native
}
object EvaluationResult {
  
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit class EvaluationResultMutableBuilder[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceStatus(value: PolicyComplianceStatusType): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    @scala.inline
    def setEvaluationLimitExceeded(value: Boolean): Self = StObject.set(x, "EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationLimitExceededUndefined: Self = StObject.set(x, "EvaluationLimitExceeded", js.undefined)
    
    @scala.inline
    def setViolatorCount(value: ResourceCount): Self = StObject.set(x, "ViolatorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatorCountUndefined: Self = StObject.set(x, "ViolatorCount", js.undefined)
  }
}
