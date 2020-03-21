package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: AnonPrettyPrint): Request_[Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: AnonPrettyPrint => Request_[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
  
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}

