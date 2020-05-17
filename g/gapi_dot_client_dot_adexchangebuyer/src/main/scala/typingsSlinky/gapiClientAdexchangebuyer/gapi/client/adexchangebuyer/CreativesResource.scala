package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.BuyerCreativeId
import typingsSlinky.gapiClientAdexchangebuyer.anon.DealsStatusFilter
import typingsSlinky.gapiClientAdexchangebuyer.anon.Fields
import typingsSlinky.gapiClientAdexchangebuyer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: BuyerCreativeId): Request[Unit] = js.native
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: Key): Request[Creative] = js.native
  /** Submit a new creative. */
  def insert(request: Fields): Request[Creative] = js.native
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: DealsStatusFilter): Request[CreativesList] = js.native
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: Key): Request[CreativeDealIds] = js.native
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: BuyerCreativeId): Request[Unit] = js.native
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: BuyerCreativeId => Request[Unit],
    get: Key => Request[Creative],
    insert: Fields => Request[Creative],
    list: DealsStatusFilter => Request[CreativesList],
    listDeals: Key => Request[CreativeDealIds],
    removeDeal: BuyerCreativeId => Request[Unit]
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
    def withAddDeal(value: BuyerCreativeId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Creative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Creative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: DealsStatusFilter => Request[CreativesList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDeals(value: Key => Request[CreativeDealIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDeal(value: BuyerCreativeId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDeal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

