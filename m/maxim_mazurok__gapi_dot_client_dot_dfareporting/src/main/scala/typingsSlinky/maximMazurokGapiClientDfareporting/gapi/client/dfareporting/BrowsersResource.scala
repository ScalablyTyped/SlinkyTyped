package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowsersResource extends js.Object {
  
  /** Retrieves a list of browsers. */
  def list(): Request[BrowsersListResponse] = js.native
  def list(request: Callback): Request[BrowsersListResponse] = js.native
}
