package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Action
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLogsResource extends js.Object {
  
  /** Gets one change log by ID. */
  def get(): Request[ChangeLog] = js.native
  def get(request: Alt): Request[ChangeLog] = js.native
  
  /** Retrieves a list of change logs. This method supports paging. */
  def list(): Request[ChangeLogsListResponse] = js.native
  def list(request: Action): Request[ChangeLogsListResponse] = js.native
}
