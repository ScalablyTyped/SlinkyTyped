package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMerchantOrderReturn extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var orderReturnId: js.UndefOr[String] = js.native
  var returnItems: js.UndefOr[js.Array[SchemaMerchantOrderReturnItem]] = js.native
  var returnShipments: js.UndefOr[js.Array[SchemaReturnShipment]] = js.native
}

object SchemaMerchantOrderReturn {
  @scala.inline
  def apply(): SchemaMerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturn]
  }
  @scala.inline
  implicit class SchemaMerchantOrderReturnOps[Self <: SchemaMerchantOrderReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderReturnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderReturnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderReturnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderReturnId")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnItems(value: js.Array[SchemaMerchantOrderReturnItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnItems")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnShipments(value: js.Array[SchemaReturnShipment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnShipments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnShipments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnShipments")(js.undefined)
        ret
    }
  }
  
}

