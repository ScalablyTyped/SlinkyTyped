package typingsSlinky.googleapis.tasksV1Mod.tasksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTasksList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Upper bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMin: js.UndefOr[String] = js.native
  /**
    * Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMin: js.UndefOr[String] = js.native
  /**
    * Maximum number of task lists returned on one page. Optional. The default
    * is 20 (max allowed: 100).
    */
  var maxResults: js.UndefOr[String] = js.native
  /**
    * Token specifying the result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether completed tasks are returned in the result.
    * Optional. The default is True.
    */
  var showCompleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether deleted tasks are returned in the result.
    * Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether hidden tasks are returned in the result.
    * Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp)
    * to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.native
}

object ParamsResourceTasksList {
  @scala.inline
  def apply(): ParamsResourceTasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksList]
  }
  @scala.inline
  implicit class ParamsResourceTasksListOps[Self <: ParamsResourceTasksList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedMax")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedMin")(js.undefined)
        ret
    }
    @scala.inline
    def withDueMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDueMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueMin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTasklist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasklist")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedMin")(js.undefined)
        ret
    }
  }
  
}

