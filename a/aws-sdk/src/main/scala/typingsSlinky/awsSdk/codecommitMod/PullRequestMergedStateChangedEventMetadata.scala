package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * The name of the branch that the pull request is merged into.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * Information about the merge state change event.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestMergedStateChangedEventMetadataOps[Self <: PullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationReference(value: ReferenceName): Self = {
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

