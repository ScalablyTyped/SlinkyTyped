package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived
    * queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user A has
    * permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service
    * account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in
    * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy
    * states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then
    * user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default
    * is false.
    */
  var analyzeServiceAccountImpersonation: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified,
    * the identity in the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  var expandGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include
    * resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP
    * folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the
    * result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization resource
    * cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results will include
    * all users who have permission P on that project or any lower resource. Default is false.
    */
  var expandResources: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is
    * specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  var expandRoles: js.UndefOr[Boolean] = js.native
  
  /** Optional. If true, the result will output group identity edges, starting from the binding's group members, to any expanded identities. Default is false. */
  var outputGroupEdges: js.UndefOr[Boolean] = js.native
  
  /** Optional. If true, the result will output resource edges, starting from the policy attached resource, to any expanded resources. Default is false. */
  var outputResourceEdges: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnalyzeServiceAccountImpersonation(value: Boolean): Self = this.set("analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzeServiceAccountImpersonation: Self = this.set("analyzeServiceAccountImpersonation", js.undefined)
    
    @scala.inline
    def setExpandGroups(value: Boolean): Self = this.set("expandGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandGroups: Self = this.set("expandGroups", js.undefined)
    
    @scala.inline
    def setExpandResources(value: Boolean): Self = this.set("expandResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandResources: Self = this.set("expandResources", js.undefined)
    
    @scala.inline
    def setExpandRoles(value: Boolean): Self = this.set("expandRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandRoles: Self = this.set("expandRoles", js.undefined)
    
    @scala.inline
    def setOutputGroupEdges(value: Boolean): Self = this.set("outputGroupEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputGroupEdges: Self = this.set("outputGroupEdges", js.undefined)
    
    @scala.inline
    def setOutputResourceEdges(value: Boolean): Self = this.set("outputResourceEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputResourceEdges: Self = this.set("outputResourceEdges", js.undefined)
  }
}
