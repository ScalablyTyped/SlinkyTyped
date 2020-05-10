package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLogging.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntriesResource extends js.Object {
  /** Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways to export log entries, see Exporting Logs. */
  def list(request: AnonPrettyPrint): Request_[ListLogEntriesResponse] = js.native
  /**
    * Log entry resourcesWrites log entries to Stackdriver Logging. This API method is the only way to send log entries to Stackdriver Logging. This method
    * is used, directly or indirectly, by the Stackdriver Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
    */
  def write(request: AnonPrettyPrint): Request_[js.Object] = js.native
}

object EntriesResource {
  @scala.inline
  def apply(
    list: AnonPrettyPrint => Request_[ListLogEntriesResponse],
    write: AnonPrettyPrint => Request_[js.Object]
  ): EntriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EntriesResource]
  }
  @scala.inline
  implicit class EntriesResourceOps[Self <: EntriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[ListLogEntriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: AnonPrettyPrint => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

