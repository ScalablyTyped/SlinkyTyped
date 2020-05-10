package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadResponse extends js.Object {
  /** Retrieved ad groups in SDF format. */
  var adGroups: js.UndefOr[String] = js.native
  /** Retrieved ads in SDF format. */
  var ads: js.UndefOr[String] = js.native
  /** Retrieved insertion orders in SDF format. */
  var insertionOrders: js.UndefOr[String] = js.native
  /** Retrieved line items in SDF format. */
  var lineItems: js.UndefOr[String] = js.native
}

object DownloadResponse {
  @scala.inline
  def apply(): DownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadResponse]
  }
  @scala.inline
  implicit class DownloadResponseOps[Self <: DownloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ads")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertionOrders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionOrders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionOrders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionOrders")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
  }
  
}

