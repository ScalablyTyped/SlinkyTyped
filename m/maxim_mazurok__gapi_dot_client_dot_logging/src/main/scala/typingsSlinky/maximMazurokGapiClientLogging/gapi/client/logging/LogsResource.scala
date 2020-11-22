package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientLogging.anon.LogName
import typingsSlinky.maximMazurokGapiClientLogging.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogsResource extends js.Object {
  
  /**
    * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries written shortly before the delete operation might not be deleted. Entries received
    * after the delete operation with a timestamp before the operation will be deleted.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: LogName): Request[js.Object] = js.native
  
  /** Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have entries are listed. */
  def list(): Request[ListLogsResponse] = js.native
  def list(request: PageSize): Request[ListLogsResponse] = js.native
}
