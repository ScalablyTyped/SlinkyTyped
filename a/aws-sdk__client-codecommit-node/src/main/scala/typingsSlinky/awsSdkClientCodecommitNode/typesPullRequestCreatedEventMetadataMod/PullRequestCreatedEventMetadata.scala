package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestCreatedEventMetadata extends js.Object {
  /**
    * <p>The commit ID of the tip of the branch specified as the destination branch when the pull request was created.</p>
    */
  var destinationCommitId: js.UndefOr[String] = js.native
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.native
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
  /**
    * <p>The commit ID on the source branch used when the pull request was created.</p>
    */
  var sourceCommitId: js.UndefOr[String] = js.native
}

object PullRequestCreatedEventMetadata {
  @scala.inline
  def apply(): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestCreatedEventMetadataOps[Self <: PullRequestCreatedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(js.undefined)
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
    @scala.inline
    def withSourceCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(js.undefined)
        ret
    }
  }
  
}

