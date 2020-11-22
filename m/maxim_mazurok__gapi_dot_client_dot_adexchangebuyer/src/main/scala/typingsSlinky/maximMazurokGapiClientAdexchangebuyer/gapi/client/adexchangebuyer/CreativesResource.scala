package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.BuyerCreativeId
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.DealsStatusFilter
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.Fields
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends js.Object {
  
  /** Add a deal id association for the creative. */
  def addDeal(): Request[Unit] = js.native
  def addDeal(request: BuyerCreativeId): Request[Unit] = js.native
  
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(): Request[Creative] = js.native
  def get(request: Oauthtoken): Request[Creative] = js.native
  
  def insert(request: Fields, body: Creative): Request[Creative] = js.native
  /** Submit a new creative. */
  def insert(request: PrettyPrint): Request[Creative] = js.native
  
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(): Request[CreativesList] = js.native
  def list(request: DealsStatusFilter): Request[CreativesList] = js.native
  
  /** Lists the external deal ids associated with the creative. */
  def listDeals(): Request[CreativeDealIds] = js.native
  def listDeals(request: Oauthtoken): Request[CreativeDealIds] = js.native
  
  /** Remove a deal id associated with the creative. */
  def removeDeal(): Request[Unit] = js.native
  def removeDeal(request: BuyerCreativeId): Request[Unit] = js.native
}
