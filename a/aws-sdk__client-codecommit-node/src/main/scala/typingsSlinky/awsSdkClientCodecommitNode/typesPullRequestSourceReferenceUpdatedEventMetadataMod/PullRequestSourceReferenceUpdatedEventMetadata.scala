package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
  /**
    * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.native
  /**
    * <p>The name of the repository where the pull request was updated.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object PullRequestSourceReferenceUpdatedEventMetadata {
  @scala.inline
  def apply(): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestSourceReferenceUpdatedEventMetadataOps[Self <: PullRequestSourceReferenceUpdatedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

