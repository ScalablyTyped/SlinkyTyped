package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.PrivateAuctionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceprivateauctionResource extends js.Object {
  
  def updateproposal(request: FieldsKey, body: UpdatePrivateAuctionProposalRequest): Request[Unit] = js.native
  /** Update a given private auction proposal */
  def updateproposal(request: PrivateAuctionId): Request[Unit] = js.native
}
