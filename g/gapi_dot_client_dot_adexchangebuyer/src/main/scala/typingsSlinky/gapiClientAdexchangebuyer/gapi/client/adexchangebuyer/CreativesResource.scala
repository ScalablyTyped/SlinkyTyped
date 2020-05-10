package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonBuyerCreativeId
import typingsSlinky.gapiClientAdexchangebuyer.AnonDealsStatusFilter
import typingsSlinky.gapiClientAdexchangebuyer.AnonFields
import typingsSlinky.gapiClientAdexchangebuyer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: AnonBuyerCreativeId): Request_[Unit] = js.native
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: AnonKey): Request_[Creative] = js.native
  /** Submit a new creative. */
  def insert(request: AnonFields): Request_[Creative] = js.native
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: AnonDealsStatusFilter): Request_[CreativesList] = js.native
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: AnonKey): Request_[CreativeDealIds] = js.native
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: AnonBuyerCreativeId): Request_[Unit] = js.native
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: AnonBuyerCreativeId => Request_[Unit],
    get: AnonKey => Request_[Creative],
    insert: AnonFields => Request_[Creative],
    list: AnonDealsStatusFilter => Request_[CreativesList],
    listDeals: AnonKey => Request_[CreativeDealIds],
    removeDeal: AnonBuyerCreativeId => Request_[Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
    __obj.asInstanceOf[CreativesResource]
  }
  @scala.inline
  implicit class CreativesResourceOps[Self <: CreativesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDeal(value: AnonBuyerCreativeId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Creative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Creative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonDealsStatusFilter => Request_[CreativesList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDeals(value: AnonKey => Request_[CreativeDealIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDeal(value: AnonBuyerCreativeId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDeal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

