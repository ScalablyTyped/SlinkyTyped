package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoidedPurchasesListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.native
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
  var voidedPurchases: js.UndefOr[js.Array[VoidedPurchase]] = js.native
}

object VoidedPurchasesListResponse {
  @scala.inline
  def apply(): VoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoidedPurchasesListResponse]
  }
  @scala.inline
  implicit class VoidedPurchasesListResponseOps[Self <: VoidedPurchasesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageInfo(value: PageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenPagination(value: TokenPagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withVoidedPurchases(value: js.Array[VoidedPurchase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidedPurchases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoidedPurchases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidedPurchases")(js.undefined)
        ret
    }
  }
  
}

