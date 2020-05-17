package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: PrettyPrint): Request[Unit] = js.native
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: PrettyPrint => Request[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
  @scala.inline
  implicit class MarketplaceprivateauctionResourceOps[Self <: MarketplaceprivateauctionResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateproposal(value: PrettyPrint => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateproposal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

