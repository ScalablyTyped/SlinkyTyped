package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGmail.anon.HistoryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryResource extends js.Object {
  
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing `historyId`). */
  def list(): Request[ListHistoryResponse] = js.native
  def list(request: HistoryTypes): Request[ListHistoryResponse] = js.native
}
