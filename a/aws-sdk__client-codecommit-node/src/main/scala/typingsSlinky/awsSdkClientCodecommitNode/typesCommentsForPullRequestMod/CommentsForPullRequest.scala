package typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod

import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsForPullRequest extends js.Object {
  
  /**
    * <p>The full blob ID of the file on which you want to comment on the source commit.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  
  /**
    * <p>he full commit ID of the commit that was the tip of the source branch at the time the comment was made. </p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  
  /**
    * <p>The full blob ID of the file on which you want to comment on the destination commit.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  
  /**
    * <p>The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit will be superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
    */
  var comments: js.UndefOr[js.Array[Comment] | js.Iterable[Comment]] = js.native
  
  /**
    * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * <p>The system-generated ID of the pull request.</p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the repository that contains the pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}
object CommentsForPullRequest {
  
  @scala.inline
  def apply(): CommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForPullRequest]
  }
  
  @scala.inline
  implicit class CommentsForPullRequestOps[Self <: CommentsForPullRequest] (val x: Self) extends AnyVal {
    
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
    def setAfterBlobId(value: String): Self = this.set("afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlobId: Self = this.set("afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: String): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: String): Self = this.set("beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlobId: Self = this.set("beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: String): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setCommentsIterable(value: js.Iterable[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[Comment] | js.Iterable[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: String): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
