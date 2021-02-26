package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeReviewSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The time, in milliseconds since the epoch, when the code review was created. 
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.native
  
  /**
    *  The time, in milliseconds since the epoch, when the code review was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.native
  
  /**
    *  The statistics from the code review. 
    */
  var MetricsSummary: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.MetricsSummary] = js.native
  
  /**
    *  The name of the code review. 
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Name] = js.native
  
  /**
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Owner] = js.native
  
  /**
    *  The provider type of the repository association. 
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ProviderType] = js.native
  
  /**
    *  The pull request ID for the code review. 
    */
  var PullRequestId: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.PullRequestId] = js.native
  
  /**
    *  The name of the repository. 
    */
  var RepositoryName: js.UndefOr[Name] = js.native
  
  /**
    *  The state of the code review.  The valid code review states are:    Completed: The code review is complete.     Pending: The code review started and has not completed or failed.     Failed: The code review failed.     Deleting: The code review is being deleted.   
    */
  var State: js.UndefOr[JobState] = js.native
  
  /**
    *  The type of the code review. 
    */
  var Type: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.Type] = js.native
}
object CodeReviewSummary {
  
  @scala.inline
  def apply(): CodeReviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeReviewSummary]
  }
  
  @scala.inline
  implicit class CodeReviewSummaryMutableBuilder[Self <: CodeReviewSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeReviewArnUndefined: Self = StObject.set(x, "CodeReviewArn", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimeStamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    @scala.inline
    def setMetricsSummary(value: MetricsSummary): Self = StObject.set(x, "MetricsSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsSummaryUndefined: Self = StObject.set(x, "MetricsSummary", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "PullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "PullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: Name): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    @scala.inline
    def setState(value: JobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
