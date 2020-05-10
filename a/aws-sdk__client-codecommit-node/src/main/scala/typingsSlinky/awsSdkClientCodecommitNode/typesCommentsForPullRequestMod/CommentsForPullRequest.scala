package typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod

import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withAfterBlobId(value: String): Self = {
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
    def withAfterCommitId(value: String): Self = {
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
    def withBeforeBlobId(value: String): Self = {
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
    def withBeforeCommitId(value: String): Self = {
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
    def withCommentsIterable(value: js.Iterable[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[Comment] | js.Iterable[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
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
    def withPullRequestId(value: String): Self = {
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
    def withRepositoryName(value: String): Self = {
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

