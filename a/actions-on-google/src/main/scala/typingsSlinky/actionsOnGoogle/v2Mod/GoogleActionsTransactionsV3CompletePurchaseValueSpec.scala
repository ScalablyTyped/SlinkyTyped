package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValueSpec extends js.Object {
  /**
    * An opaque string specified by developer, which would associate with the
    * purchase and is expected to return as part of purchase data.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * The product being purchased.
    */
  var skuId: js.UndefOr[GoogleActionsTransactionsV3SkuId] = js.native
}

object GoogleActionsTransactionsV3CompletePurchaseValueSpec {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3CompletePurchaseValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueSpecOps[Self <: GoogleActionsTransactionsV3CompletePurchaseValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: GoogleActionsTransactionsV3SkuId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
  }
  
}

