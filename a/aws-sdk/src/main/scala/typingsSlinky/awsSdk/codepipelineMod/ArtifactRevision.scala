package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactRevision extends js.Object {
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The name of an artifact. This name might be system-generated, such as "MyApp", or defined by the user when an action is created.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  /**
    * An additional identifier for a revision, such as a commit date or, for artifacts stored in Amazon S3 buckets, the ETag value.
    */
  var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.native
  /**
    * The revision ID of the artifact.
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

object ArtifactRevision {
  @scala.inline
  def apply(): ArtifactRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRevision]
  }
  @scala.inline
  implicit class ArtifactRevisionOps[Self <: ArtifactRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ArtifactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionChangeIdentifier(value: RevisionChangeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionChangeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionChangeIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionChangeIdentifier")(js.undefined)
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

