package typingsSlinky.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForComparedCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>In the directionality you established, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.native
  /**
    * <p>In the directionality you established, the full commit ID of the 'after' commit.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>In the directionality you established, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.native
  /**
    * <p>In the directionality you established, the full commit ID of the 'before' commit.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.native
  /**
    * <p>The location of the comment in the comparison between the two commits.</p>
    */
  var location: js.UndefOr[UnmarshalledLocation] = js.native
  /**
    * <p>The name of the repository where you posted a comment on the comparison between commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object PostCommentForComparedCommitOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
  @scala.inline
  implicit class PostCommentForComparedCommitOutputOps[Self <: PostCommentForComparedCommitOutput] (val x: Self) extends AnyVal {
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

