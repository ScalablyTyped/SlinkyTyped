package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSqladmin.AnonAlt
import typingsSlinky.gapiClientSqladmin.AnonFields
import typingsSlinky.gapiClientSqladmin.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: AnonAlt): Request_[Operation] = js.native
  /** Retrieves a resource containing information about a backup run. */
  def get(request: AnonAlt): Request_[BackupRun] = js.native
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: AnonFields): Request_[Operation] = js.native
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: AnonInstance): Request_[BackupRunsListResponse] = js.native
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Operation],
    get: AnonAlt => Request_[BackupRun],
    insert: AnonFields => Request_[Operation],
    list: AnonInstance => Request_[BackupRunsListResponse]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BackupRunsResource]
  }
  @scala.inline
  implicit class BackupRunsResourceOps[Self <: BackupRunsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[BackupRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonInstance => Request_[BackupRunsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

