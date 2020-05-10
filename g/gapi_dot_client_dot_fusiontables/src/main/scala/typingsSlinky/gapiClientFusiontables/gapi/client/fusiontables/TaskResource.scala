package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFusiontables.AnonPageToken
import typingsSlinky.gapiClientFusiontables.AnonTableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: AnonTableId): Request_[Unit] = js.native
  /** Retrieves a specific task by its ID. */
  def get(request: AnonTableId): Request_[Task] = js.native
  /** Retrieves a list of tasks. */
  def list(request: AnonPageToken): Request_[TaskList] = js.native
}

object TaskResource {
  @scala.inline
  def apply(
    delete: AnonTableId => Request_[Unit],
    get: AnonTableId => Request_[Task],
    list: AnonPageToken => Request_[TaskList]
  ): TaskResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TaskResource]
  }
  @scala.inline
  implicit class TaskResourceOps[Self <: TaskResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonTableId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonTableId => Request_[Task]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[TaskList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

