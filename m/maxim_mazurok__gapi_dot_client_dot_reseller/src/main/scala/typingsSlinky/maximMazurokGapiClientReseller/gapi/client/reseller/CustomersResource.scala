package typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientReseller.anon.CustomerAuthToken
import typingsSlinky.maximMazurokGapiClientReseller.anon.CustomerId
import typingsSlinky.maximMazurokGapiClientReseller.anon.Key
import typingsSlinky.maximMazurokGapiClientReseller.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomersResource extends js.Object {
  
  /** Get a customer account. */
  def get(): Request[Customer] = js.native
  def get(request: CustomerId): Request[Customer] = js.native
  
  /** Order a new customer's account. */
  def insert(request: CustomerAuthToken): Request[Customer] = js.native
  def insert(request: Key, body: Customer): Request[Customer] = js.native
  
  def patch(request: CustomerId, body: Customer): Request[Customer] = js.native
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[Customer] = js.native
  
  def update(request: CustomerId, body: Customer): Request[Customer] = js.native
  /** Update a customer account's settings. */
  def update(request: Oauthtoken): Request[Customer] = js.native
}
