package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrdersResponse extends js.Object {
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** List of Orders that match the request criteria. */
  var orders: js.UndefOr[js.Array[Order]] = js.native
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListOrdersResponse {
  @scala.inline
  def apply(): ListOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrdersResponse]
  }
  @scala.inline
  implicit class ListOrdersResponseOps[Self <: ListOrdersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOrders(value: js.Array[Order]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orders")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
  }
  
}

