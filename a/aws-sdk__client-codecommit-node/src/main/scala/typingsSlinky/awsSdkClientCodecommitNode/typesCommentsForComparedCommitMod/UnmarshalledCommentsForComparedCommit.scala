package typingsSlinky.awsSdkClientCodecommitNode.typesCommentsForComparedCommitMod

import typingsSlinky.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCommentsForComparedCommit extends CommentsForComparedCommit {
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the comparison between commits.</p>
    */
  @JSName("comments")
  var comments_UnmarshalledCommentsForComparedCommit: js.UndefOr[js.Array[UnmarshalledComment]] = js.native
  /**
    * <p>Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.</p>
    */
  @JSName("location")
  var location_UnmarshalledCommentsForComparedCommit: js.UndefOr[UnmarshalledLocation] = js.native
}

object UnmarshalledCommentsForComparedCommit {
  @scala.inline
  def apply(): UnmarshalledCommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCommentsForComparedCommit]
  }
  @scala.inline
  implicit class UnmarshalledCommentsForComparedCommitOps[Self <: UnmarshalledCommentsForComparedCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: js.Array[UnmarshalledComment]): Self = {
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
  }
  
}

