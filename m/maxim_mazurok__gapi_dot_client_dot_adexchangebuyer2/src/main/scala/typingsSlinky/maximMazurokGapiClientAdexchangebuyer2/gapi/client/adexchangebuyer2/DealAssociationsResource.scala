package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.CreativeId
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.PageToken
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealAssociationsResource extends StObject {
  
  /** Associate an existing deal with a creative. */
  def add(request: CreativeId): Request[js.Object] = js.native
  def add(request: QuotaUser, body: AddDealAssociationRequest): Request[js.Object] = js.native
  
  /** List all creative-deal associations. */
  def list(): Request[ListDealAssociationsResponse] = js.native
  def list(request: PageToken): Request[ListDealAssociationsResponse] = js.native
  
  def remove(request: QuotaUser, body: RemoveDealAssociationRequest): Request[js.Object] = js.native
  /** Remove the association between a deal and a creative. */
  def remove(request: Resource): Request[js.Object] = js.native
}
