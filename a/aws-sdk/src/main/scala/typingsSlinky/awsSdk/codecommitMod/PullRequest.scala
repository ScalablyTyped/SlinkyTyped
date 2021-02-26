package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequest extends StObject {
  
  /**
    * The approval rules applied to the pull request.
    */
  var approvalRules: js.UndefOr[ApprovalRulesList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the pull request.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The date and time the pull request was originally created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The day and time of the last user or system activity on the pull request, in timestamp format.
    */
  var lastActivityDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  
  /**
    * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  
  /**
    * The targets of the pull request, including the source branch and destination branch for the pull request.
    */
  var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.native
  
  /**
    * The system-generated revision ID for the pull request.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  
  /**
    * The user-defined title of the pull request. This title is displayed in the list of pull requests to other repository users.
    */
  var title: js.UndefOr[Title] = js.native
}
object PullRequest {
  
  @scala.inline
  def apply(): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequest]
  }
  
  @scala.inline
  implicit class PullRequestMutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRules(value: ApprovalRulesList): Self = StObject.set(x, "approvalRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRulesUndefined: Self = StObject.set(x, "approvalRules", js.undefined)
    
    @scala.inline
    def setApprovalRulesVarargs(value: ApprovalRule*): Self = StObject.set(x, "approvalRules", js.Array(value :_*))
    
    @scala.inline
    def setAuthorArn(value: Arn): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastActivityDate(value: js.Date): Self = StObject.set(x, "lastActivityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActivityDateUndefined: Self = StObject.set(x, "lastActivityDate", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    @scala.inline
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
    
    @scala.inline
    def setPullRequestTargets(value: PullRequestTargetList): Self = StObject.set(x, "pullRequestTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestTargetsUndefined: Self = StObject.set(x, "pullRequestTargets", js.undefined)
    
    @scala.inline
    def setPullRequestTargetsVarargs(value: PullRequestTarget*): Self = StObject.set(x, "pullRequestTargets", js.Array(value :_*))
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
