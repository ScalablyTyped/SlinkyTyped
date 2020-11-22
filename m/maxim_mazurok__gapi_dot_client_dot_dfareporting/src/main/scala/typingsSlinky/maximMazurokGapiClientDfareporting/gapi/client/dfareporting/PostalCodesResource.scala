package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostalCodesResource extends js.Object {
  
  /** Gets one postal code by ID. */
  def get(): Request[PostalCode] = js.native
  def get(request: Code): Request[PostalCode] = js.native
  
  /** Retrieves a list of postal codes. */
  def list(): Request[PostalCodesListResponse] = js.native
  def list(request: Callback): Request[PostalCodesListResponse] = js.native
}
