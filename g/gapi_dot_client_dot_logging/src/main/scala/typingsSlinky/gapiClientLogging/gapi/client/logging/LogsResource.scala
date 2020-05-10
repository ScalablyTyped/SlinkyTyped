package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLogging.AnonBearertoken
import typingsSlinky.gapiClientLogging.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsResource extends js.Object {
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: AnonFields): Request_[js.Object] = js.native
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: AnonBearertoken): Request_[ListLogsResponse] = js.native
}

object LogsResource {
  @scala.inline
  def apply(delete: AnonFields => Request_[js.Object], list: AnonBearertoken => Request_[ListLogsResponse]): LogsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LogsResource]
  }
  @scala.inline
  implicit class LogsResourceOps[Self <: LogsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListLogsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

