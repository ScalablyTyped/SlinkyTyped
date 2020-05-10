package typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod

import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.Comment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsForComparedCommit extends js.Object {
  /**
    * <p>The full blob ID of the commit used to establish the 'after' of the comparison.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit used to establish the 'after' of the comparison.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The full blob ID of the commit used to establish the 'before' of the comparison.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit used to establish the 'before' of the comparison.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
    */
  var comments: js.UndefOr[js.Array[Comment] | js.Iterable[Comment]] = js.native
  /**
    * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * <p>The name of the repository that contains the compared commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object CommentsForComparedCommit {
  @scala.inline
  def apply(): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
  @scala.inline
  implicit class CommentsForComparedCommitOps[Self <: CommentsForComparedCommit] (val x: Self) extends AnyVal {
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

