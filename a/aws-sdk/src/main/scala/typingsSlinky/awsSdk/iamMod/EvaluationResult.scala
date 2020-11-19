package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationResult extends js.Object {
  
  /**
    * The name of the API operation tested on the indicated resource.
    */
  var EvalActionName: ActionNameType = js.native
  
  /**
    * The result of the simulation.
    */
  var EvalDecision: PolicyEvaluationDecisionType = js.native
  
  /**
    * Additional details about the results of the cross-account evaluation decision. This parameter is populated for only cross-account simulations. It contains a brief summary of how each policy type contributes to the final evaluation decision. If the simulation evaluates policies within the same account and includes a resource ARN, then the parameter is present but the response is empty. If the simulation evaluates policies within the same account and specifies all resources (*), then the parameter is not returned. When you make a cross-account request, AWS evaluates the request in the trusting account and the trusted account. The request is allowed only if both evaluations return true. For more information about how policies are evaluated, see Evaluating Policies Within a Single Account. If an AWS Organizations SCP included in the evaluation denies access, the simulation ends. In this case, policy evaluation does not proceed any further and this parameter is not returned.
    */
  var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.native
  
  /**
    * The ARN of the resource that the indicated API operation was tested on.
    */
  var EvalResourceName: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * A list of the statements in the input policies that determine the result for this scenario. Remember that even if multiple statements allow the operation on the resource, if only one statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
    */
  var MatchedStatements: js.UndefOr[StatementListType] = js.native
  
  /**
    * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when the resource in a simulation is "*", either explicitly, or when the ResourceArns parameter blank. If you include a list of resources, then any missing context values are instead included under the ResourceSpecificResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
    */
  var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.native
  
  /**
    * A structure that details how Organizations and its service control policies affect the results of the simulation. Only applies if the simulated user's account is part of an organization.
    */
  var OrganizationsDecisionDetail: js.UndefOr[typingsSlinky.awsSdk.iamMod.OrganizationsDecisionDetail] = js.native
  
  /**
    * Contains information about the effect that a permissions boundary has on a policy simulation when the boundary is applied to an IAM entity.
    */
  var PermissionsBoundaryDecisionDetail: js.UndefOr[typingsSlinky.awsSdk.iamMod.PermissionsBoundaryDecisionDetail] = js.native
  
  /**
    * The individual results of the simulation of the API operation specified in EvalActionName on each resource.
    */
  var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.native
}
object EvaluationResult {
  
  @scala.inline
  def apply(EvalActionName: ActionNameType, EvalDecision: PolicyEvaluationDecisionType): EvaluationResult = {
    val __obj = js.Dynamic.literal(EvalActionName = EvalActionName.asInstanceOf[js.Any], EvalDecision = EvalDecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvalActionName(value: ActionNameType): Self = this.set("EvalActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalDecision(value: PolicyEvaluationDecisionType): Self = this.set("EvalDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalDecisionDetails(value: EvalDecisionDetailsType): Self = this.set("EvalDecisionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalDecisionDetails: Self = this.set("EvalDecisionDetails", js.undefined)
    
    @scala.inline
    def setEvalResourceName(value: ResourceNameType): Self = this.set("EvalResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalResourceName: Self = this.set("EvalResourceName", js.undefined)
    
    @scala.inline
    def setMatchedStatementsVarargs(value: Statement*): Self = this.set("MatchedStatements", js.Array(value :_*))
    
    @scala.inline
    def setMatchedStatements(value: StatementListType): Self = this.set("MatchedStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedStatements: Self = this.set("MatchedStatements", js.undefined)
    
    @scala.inline
    def setMissingContextValuesVarargs(value: ContextKeyNameType*): Self = this.set("MissingContextValues", js.Array(value :_*))
    
    @scala.inline
    def setMissingContextValues(value: ContextKeyNamesResultListType): Self = this.set("MissingContextValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingContextValues: Self = this.set("MissingContextValues", js.undefined)
    
    @scala.inline
    def setOrganizationsDecisionDetail(value: OrganizationsDecisionDetail): Self = this.set("OrganizationsDecisionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationsDecisionDetail: Self = this.set("OrganizationsDecisionDetail", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryDecisionDetail(value: PermissionsBoundaryDecisionDetail): Self = this.set("PermissionsBoundaryDecisionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundaryDecisionDetail: Self = this.set("PermissionsBoundaryDecisionDetail", js.undefined)
    
    @scala.inline
    def setResourceSpecificResultsVarargs(value: ResourceSpecificResult*): Self = this.set("ResourceSpecificResults", js.Array(value :_*))
    
    @scala.inline
    def setResourceSpecificResults(value: ResourceSpecificResultListType): Self = this.set("ResourceSpecificResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSpecificResults: Self = this.set("ResourceSpecificResults", js.undefined)
  }
}
