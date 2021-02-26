package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyComplianceDetail extends StObject {
  
  /**
    * Indicates if over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  
  /**
    * A timestamp that indicates when the returned information should be considered out of date.
    */
  var ExpiredAt: js.UndefOr[js.Date] = js.native
  
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typingsSlinky.awsSdk.fmsMod.IssueInfoMap] = js.native
  
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyId] = js.native
  
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
  
  /**
    * An array of resources that aren't protected by the AWS WAF or Shield Advanced policy or that aren't in compliance with the security group policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.native
}
object PolicyComplianceDetail {
  
  @scala.inline
  def apply(): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
  
  @scala.inline
  implicit class PolicyComplianceDetailMutableBuilder[Self <: PolicyComplianceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationLimitExceeded(value: Boolean): Self = StObject.set(x, "EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationLimitExceededUndefined: Self = StObject.set(x, "EvaluationLimitExceeded", js.undefined)
    
    @scala.inline
    def setExpiredAt(value: js.Date): Self = StObject.set(x, "ExpiredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredAtUndefined: Self = StObject.set(x, "ExpiredAt", js.undefined)
    
    @scala.inline
    def setIssueInfoMap(value: IssueInfoMap): Self = StObject.set(x, "IssueInfoMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueInfoMapUndefined: Self = StObject.set(x, "IssueInfoMap", js.undefined)
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountUndefined: Self = StObject.set(x, "MemberAccount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyOwner(value: AWSAccountId): Self = StObject.set(x, "PolicyOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyOwnerUndefined: Self = StObject.set(x, "PolicyOwner", js.undefined)
    
    @scala.inline
    def setViolators(value: ComplianceViolators): Self = StObject.set(x, "Violators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatorsUndefined: Self = StObject.set(x, "Violators", js.undefined)
    
    @scala.inline
    def setViolatorsVarargs(value: ComplianceViolator*): Self = StObject.set(x, "Violators", js.Array(value :_*))
  }
}
