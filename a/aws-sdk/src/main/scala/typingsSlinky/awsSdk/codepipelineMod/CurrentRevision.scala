package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRevision extends js.Object {
  /**
    * The change identifier for the current revision.
    */
  var changeIdentifier: RevisionChangeIdentifier = js.native
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The revision ID of the current version of an artifact.
    */
  var revision: Revision = js.native
  /**
    * The summary of the most recent revision of the artifact.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
}

object CurrentRevision {
  @scala.inline
  def apply(changeIdentifier: RevisionChangeIdentifier, revision: Revision): CurrentRevision = {
    val __obj = js.Dynamic.literal(changeIdentifier = changeIdentifier.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRevision]
  }
  @scala.inline
  implicit class CurrentRevisionOps[Self <: CurrentRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeIdentifier(value: RevisionChangeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Revision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

