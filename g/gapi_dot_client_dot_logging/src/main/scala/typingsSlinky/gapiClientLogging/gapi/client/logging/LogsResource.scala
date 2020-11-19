package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientLogging.anon.Bearertoken
import typingsSlinky.gapiClientLogging.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogsResource extends js.Object {
  
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not
    * be deleted.
    */
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(request: Bearertoken): Request[ListLogsResponse] = js.native
}
object LogsResource {
  
  @scala.inline
  def apply(delete: Fields => Request[js.Object], list: Bearertoken => Request[ListLogsResponse]): LogsResource = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelete(value: Fields => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Bearertoken => Request[ListLogsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
