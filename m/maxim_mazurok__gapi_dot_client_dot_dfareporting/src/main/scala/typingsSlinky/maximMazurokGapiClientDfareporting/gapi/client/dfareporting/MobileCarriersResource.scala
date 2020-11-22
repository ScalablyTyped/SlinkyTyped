package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileCarriersResource extends js.Object {
  
  /** Gets one mobile carrier by ID. */
  def get(): Request[MobileCarrier] = js.native
  def get(request: Alt): Request[MobileCarrier] = js.native
  
  /** Retrieves a list of mobile carriers. */
  def list(): Request[MobileCarriersListResponse] = js.native
  def list(request: Callback): Request[MobileCarriersListResponse] = js.native
}
