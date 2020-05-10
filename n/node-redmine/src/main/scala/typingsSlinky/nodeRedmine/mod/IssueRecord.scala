package typingsSlinky.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueRecord extends js.Object {
  var assigned_to: IssueRecordField = js.native
  var author: IssueRecordField = js.native
  var closed_on: String | Null = js.native
  var created_at: String = js.native
  var description: String = js.native
  var done_ratio: Double = js.native
  var due_date: String | Null = js.native
  var id: Double = js.native
  var is_private: Boolean = js.native
  var parent: js.UndefOr[IssueRecordField] = js.native
  var priority: IssueRecordField = js.native
  var project: IssueRecordField = js.native
  var start_date: String | Null = js.native
  var status: IssueRecordField = js.native
  var subject: String = js.native
  var total_estimated_hours: Double | Null = js.native
  var tracker: IssueRecordField = js.native
  var updated_at: String | Null = js.native
}

object IssueRecord {
  @scala.inline
  def apply(
    assigned_to: IssueRecordField,
    author: IssueRecordField,
    created_at: String,
    description: String,
    done_ratio: Double,
    id: Double,
    is_private: Boolean,
    priority: IssueRecordField,
    project: IssueRecordField,
    status: IssueRecordField,
    subject: String,
    tracker: IssueRecordField
  ): IssueRecord = {
    val __obj = js.Dynamic.literal(assigned_to = assigned_to.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], done_ratio = done_ratio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRecord]
  }
  @scala.inline
  implicit class IssueRecordOps[Self <: IssueRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigned_to(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracker(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed_onNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_on")(null)
        ret
    }
    @scala.inline
    def withDue_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDue_dateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(null)
        ret
    }
    @scala.inline
    def withParent(value: IssueRecordField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_dateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(null)
        ret
    }
    @scala.inline
    def withTotal_estimated_hours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_estimated_hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_estimated_hoursNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_estimated_hours")(null)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(null)
        ret
    }
  }
  
}

