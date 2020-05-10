package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3SkuId extends js.Object {
  /**
    * The identifier of the product SKU used for registration in the developer
    * console.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the android package under which the sku was registered.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The type of SKU.
    */
  var skuType: js.UndefOr[GoogleActionsTransactionsV3SkuIdSkuType] = js.native
}

object GoogleActionsTransactionsV3SkuId {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3SkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3SkuId]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3SkuIdOps[Self <: GoogleActionsTransactionsV3SkuId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuType(value: GoogleActionsTransactionsV3SkuIdSkuType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuType")(js.undefined)
        ret
    }
  }
  
}

