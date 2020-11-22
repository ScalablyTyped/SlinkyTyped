package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetrosResource extends js.Object {
  
  /** Retrieves a list of metros. */
  def list(): Request[MetrosListResponse] = js.native
  def list(request: Callback): Request[MetrosListResponse] = js.native
}
