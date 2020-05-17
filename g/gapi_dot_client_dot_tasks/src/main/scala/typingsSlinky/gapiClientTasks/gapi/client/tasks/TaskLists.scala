package typingsSlinky.gapiClientTasks.gapi.client.tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskLists extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** Collection of task lists. */
  var items: js.UndefOr[js.Array[TaskList]] = js.native
  /** Type of the resource. This is always "tasks#taskLists". */
  var kind: js.UndefOr[String] = js.native
  /** Token that can be used to request the next page of this result. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object TaskLists {
  @scala.inline
  def apply(): TaskLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskLists]
  }
  @scala.inline
  implicit class TaskListsOps[Self <: TaskLists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[TaskList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

