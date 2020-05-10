package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuctionContext extends js.Object {
  /** The auction types this restriction applies to. */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.native
}

object AuctionContext {
  @scala.inline
  def apply(): AuctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionContext]
  }
  @scala.inline
  implicit class AuctionContextOps[Self <: AuctionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuctionTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuctionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionTypes")(js.undefined)
        ret
    }
  }
  
}

