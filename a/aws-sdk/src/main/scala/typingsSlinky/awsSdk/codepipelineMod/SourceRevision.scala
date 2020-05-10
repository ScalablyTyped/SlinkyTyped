package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRevision extends js.Object {
  /**
    * The name of the action that processed the revision to the source artifact.
    */
  var actionName: ActionName = js.native
  /**
    * The system-generated unique ID that identifies the revision number of the artifact.
    */
  var revisionId: js.UndefOr[Revision] = js.native
  /**
    * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
  /**
    * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
}

object SourceRevision {
  @scala.inline
  def apply(actionName: ActionName): SourceRevision = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRevision]
  }
  @scala.inline
  implicit class SourceRevisionOps[Self <: SourceRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: Revision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionSummary(value: RevisionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionUrl")(js.undefined)
        ret
    }
  }
  
}

