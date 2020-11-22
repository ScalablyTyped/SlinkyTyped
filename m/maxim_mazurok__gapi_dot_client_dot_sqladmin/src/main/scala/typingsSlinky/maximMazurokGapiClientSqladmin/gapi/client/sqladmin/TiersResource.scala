package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiersResource extends js.Object {
  
  /** Lists all available machine types (tiers) for Cloud SQL, for example, db-n1-standard-1. For related information, see Pricing. */
  def list(): Request[TiersListResponse] = js.native
  def list(request: Uploadprotocol): Request[TiersListResponse] = js.native
}
