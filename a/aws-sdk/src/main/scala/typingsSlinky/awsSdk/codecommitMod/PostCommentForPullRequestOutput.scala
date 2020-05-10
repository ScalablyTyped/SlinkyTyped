package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForPullRequestOutput extends js.Object {
  /**
    * In the directionality of the pull request, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * The full commit ID of the commit in the destination branch where the pull request is merged.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  /**
    * In the directionality of the pull request, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  /**
    * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * The location of the change where you posted your comment.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * The name of the repository where you posted a comment on a pull request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PostCommentForPullRequestOutput {
  @scala.inline
  def apply(): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
  @scala.inline
  implicit class PostCommentForPullRequestOutputOps[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBlobId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBlobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlobId")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlobId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBlobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlobId")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestId(value: PullRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
  }
  
}

