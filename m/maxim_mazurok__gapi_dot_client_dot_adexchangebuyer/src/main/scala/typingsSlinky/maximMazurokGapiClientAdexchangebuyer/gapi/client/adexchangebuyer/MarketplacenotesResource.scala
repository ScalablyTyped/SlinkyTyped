package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.AltFields
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.PqlQuery
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplacenotesResource extends js.Object {
  
  /** Add notes to the proposal */
  def insert(request: AltFields): Request[AddOrderNotesResponse] = js.native
  def insert(request: QuotaUser, body: AddOrderNotesRequest): Request[AddOrderNotesResponse] = js.native
  
  /** Get all the notes associated with a proposal */
  def list(): Request[GetOrderNotesResponse] = js.native
  def list(request: PqlQuery): Request[GetOrderNotesResponse] = js.native
}
