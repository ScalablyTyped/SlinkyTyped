package typingsSlinky.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueParams extends js.Object {
  var assigned_to_id: js.UndefOr[Double] = js.native
  var category_id: js.UndefOr[Double] = js.native
  var description: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var parent_issue_id: js.UndefOr[Double] = js.native
  var priority_id: js.UndefOr[Double] = js.native
  var project_id: js.UndefOr[Double] = js.native
  var status_id: js.UndefOr[Double] = js.native
  var subject: js.UndefOr[String] = js.native
  var tracker_id: js.UndefOr[Double] = js.native
  var uploads: js.UndefOr[js.Array[UploadRecord]] = js.native
}

object IssueParams {
  @scala.inline
  def apply(): IssueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueParams]
  }
  @scala.inline
  implicit class IssueParamsOps[Self <: IssueParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigned_to_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_to_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigned_to_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_to_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withParent_issue_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_issue_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent_issue_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_issue_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProject_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTracker_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracker_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker_id")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: js.Array[UploadRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(js.undefined)
        ret
    }
  }
  
}

