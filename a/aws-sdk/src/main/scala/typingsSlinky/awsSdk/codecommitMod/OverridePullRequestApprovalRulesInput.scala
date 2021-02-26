package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverridePullRequestApprovalRulesInput extends StObject {
  
  /**
    * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
    */
  var overrideStatus: OverrideStatus = js.native
  
  /**
    * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get this information, use GetPullRequest.
    */
  var pullRequestId: PullRequestId = js.native
  
  /**
    * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
    */
  var revisionId: RevisionId = js.native
}
object OverridePullRequestApprovalRulesInput {
  
  @scala.inline
  def apply(overrideStatus: OverrideStatus, pullRequestId: PullRequestId, revisionId: RevisionId): OverridePullRequestApprovalRulesInput = {
    val __obj = js.Dynamic.literal(overrideStatus = overrideStatus.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverridePullRequestApprovalRulesInput]
  }
  
  @scala.inline
  implicit class OverridePullRequestApprovalRulesInputMutableBuilder[Self <: OverridePullRequestApprovalRulesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrideStatus(value: OverrideStatus): Self = StObject.set(x, "overrideStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
