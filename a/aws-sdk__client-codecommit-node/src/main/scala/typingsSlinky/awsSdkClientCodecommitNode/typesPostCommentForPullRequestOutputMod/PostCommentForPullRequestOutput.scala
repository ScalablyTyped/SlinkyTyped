package typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForPullRequestOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit in the destination branch where the pull request will be merged.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.native
  /**
    * <p>The location of the change where you posted your comment.</p>
    */
  var location: js.UndefOr[UnmarshalledLocation] = js.native
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  /**
    * <p>The name of the repository where you posted a comment on a pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object PostCommentForPullRequestOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
  @scala.inline
  implicit class PostCommentForPullRequestOutputOps[Self <: PostCommentForPullRequestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withComment(value: UnmarshalledComment): Self = {
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
    def withLocation(value: UnmarshalledLocation): Self = {
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

