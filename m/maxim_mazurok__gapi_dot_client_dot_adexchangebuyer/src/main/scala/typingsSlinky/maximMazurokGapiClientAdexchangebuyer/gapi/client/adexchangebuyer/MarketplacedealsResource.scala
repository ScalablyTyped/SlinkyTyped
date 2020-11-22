package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.PqlQuery
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.ProposalId
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.Resource
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplacedealsResource extends js.Object {
  
  /** Delete the specified deals from the proposal */
  def delete(request: ProposalId): Request[DeleteOrderDealsResponse] = js.native
  def delete(request: QuotaUser, body: DeleteOrderDealsRequest): Request[DeleteOrderDealsResponse] = js.native
  
  def insert(request: QuotaUser, body: AddOrderDealsRequest): Request[AddOrderDealsResponse] = js.native
  /** Add new deals for the specified proposal */
  def insert(request: Resource): Request[AddOrderDealsResponse] = js.native
  
  /** List all the deals for a given proposal */
  def list(): Request[GetOrderDealsResponse] = js.native
  def list(request: PqlQuery): Request[GetOrderDealsResponse] = js.native
  
  def update(request: QuotaUser, body: EditAllOrderDealsRequest): Request[EditAllOrderDealsResponse] = js.native
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: UserIp): Request[EditAllOrderDealsResponse] = js.native
}
