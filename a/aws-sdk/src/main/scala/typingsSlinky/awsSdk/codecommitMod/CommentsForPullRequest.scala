package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsForPullRequest extends StObject {
  
  /**
    * The full blob ID of the file on which you want to comment on the source commit.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit that was the tip of the source branch at the time the comment was made. 
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The full blob ID of the file on which you want to comment on the destination commit.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit is superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * An array of comment objects. Each comment object contains information about a comment on the pull request.
    */
  var comments: js.UndefOr[Comments] = js.native
  
  /**
    * Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is BEFORE (destination branch) or AFTER (source branch).
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object CommentsForPullRequest {
  
  @scala.inline
  def apply(): CommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForPullRequest]
  }
  
  @scala.inline
  implicit class CommentsForPullRequestMutableBuilder[Self <: CommentsForPullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBlobId(value: ObjectId): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: ObjectId): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    @scala.inline
    def setComments(value: Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "pullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
