package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionRevision extends js.Object {
  /**
    * The date and time when the most recent version of the action was created, in timestamp format.
    */
  var created: js.Date = js.native
  /**
    * The unique identifier of the change that set the state to this revision (for example, a deployment ID or timestamp).
    */
  var revisionChangeId: RevisionChangeIdentifier = js.native
  /**
    * The system-generated unique ID that identifies the revision number of the action.
    */
  var revisionId: Revision = js.native
}

object ActionRevision {
  @scala.inline
  def apply(created: js.Date, revisionChangeId: RevisionChangeIdentifier, revisionId: Revision): ActionRevision = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], revisionChangeId = revisionChangeId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRevision]
  }
  @scala.inline
  implicit class ActionRevisionOps[Self <: ActionRevision] (val x: Self) extends AnyVal {
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
    def withRevisionChangeId(value: RevisionChangeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionChangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: Revision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

