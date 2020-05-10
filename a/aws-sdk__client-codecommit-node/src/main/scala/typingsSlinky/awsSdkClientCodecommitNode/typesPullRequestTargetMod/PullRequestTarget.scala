package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestTargetMod

import typingsSlinky.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestTarget extends js.Object {
  /**
    * <p>The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.</p>
    */
  var destinationCommit: js.UndefOr[String] = js.native
  /**
    * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. </p>
    */
  var destinationReference: js.UndefOr[String] = js.native
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.native
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * <p>The name of the repository that contains the pull request source and destination branches.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.</p>
    */
  var sourceCommit: js.UndefOr[String] = js.native
  /**
    * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
    */
  var sourceReference: js.UndefOr[String] = js.native
}

object PullRequestTarget {
  @scala.inline
  def apply(): PullRequestTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestTarget]
  }
  @scala.inline
  implicit class PullRequestTargetOps[Self <: PullRequestTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationReference")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeMetadata(value: MergeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMetadata")(js.undefined)
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
    @scala.inline
    def withSourceCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(js.undefined)
        ret
    }
  }
  
}

