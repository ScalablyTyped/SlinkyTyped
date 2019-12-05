package typingsSlinky.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
  
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}

